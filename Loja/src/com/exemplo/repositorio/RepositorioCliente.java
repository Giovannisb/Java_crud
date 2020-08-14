package com.exemplo.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.exemplo.entidade.Cliente;

public class RepositorioCliente {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	
	
	public RepositorioCliente() {
		emf = Persistence.createEntityManagerFactory("mohr");
		em = emf.createEntityManager();
	}
	
	public Cliente obterPorId(int id) {
		em.getTransaction().begin();
		Cliente cliente = em.find(Cliente.class, id);
		em.getTransaction().commit();
		emf.close();
		return cliente;
	}
	
	public void salvar(Cliente cliente) {
		em.getTransaction().begin();
		em.merge(cliente);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void remover(Cliente c) {
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction().commit();
		emf.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> listarTodos(){
		em.getTransaction().begin();
		Query consulta = em.createQuery("select cliente from Cliente cliente");
		List<Cliente> clientes = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return clientes;
	}
	
}
