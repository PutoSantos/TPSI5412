package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;

public class GereCliente 
{
	ArrayList<Cliente> arCliente = new ArrayList<>();
	
	public GereCliente()
	{
		arCliente = new ArrayList<>();
		addCliente(null, null, null, null);
	}
	
	public void addCliente(String nome, String morada, String email, String telefone)
	{
		
		Scanner sc = new Scanner(System.in);
		
		Cliente cli = new Cliente(nome, morada, email, telefone);
		
		int id = arCliente.size();
		
		cli.setId(id);
		
		arCliente.add(cli);
		
		System.out.println("Introduza o nome do cliente: ");
			nome = sc.nextLine();
		System.out.println("Introduza a morada do cliente: ");
			morada = sc.nextLine();
		System.out.println("Introduza o email do cliente: ");
			email = sc.nextLine();
		System.out.println("Introduza o telefone do cliente: ");
			telefone = sc.nextLine();
	}
	
	public void mostraCliente()
	{
		for(int i=0; i<arCliente.size(); i++)
		{
			System.out.println(arCliente.get(i).getNome());
			System.out.println(arCliente.get(i).getMorada());
			System.out.println(arCliente.get(i).getEmail());
			System.out.println(arCliente.get(i).getTelefone());
		}
	}
}
