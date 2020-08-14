package com.exemplo.testes;

import java.util.List;

import com.exemplo.entidade.Cliente;
import com.exemplo.repositorio.RepositorioCliente;

public class Teste {

	public static void main(String[] args) {
		RepositorioCliente repositorioCliente = new RepositorioCliente();
		//**Criar cliente
//		Cliente cliente = new Cliente();	
//		cliente.setNome("Beltrano da Silva");
//		cliente.setIdade(26);
//		repositorioCliente.salvar(cliente);
		//**
		
		
		//**Listar clientes
//		List<Cliente> clientes = repositorioCliente.listarTodos();
//		for(Cliente cliente : clientes) {
//			System.out.println(cliente.getNome());
//		}
		//**
		
		
		//**Atualizar cliente
		Cliente cliente = repositorioCliente.obterPorId(2);
//		cliente.setNome("Beltrano de Souza");
//		repositorioCliente.salvar(cliente);
//		System.out.println(cliente.getNome());
		//**
		
		
		//**Deletar cliente
		repositorioCliente.remover(cliente);
		//**
	}

}
