package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Restaurantes;

public class GereRestaurantes 
{
	ArrayList<Restaurantes> arRestaurantes;
	
	public GereRestaurantes()
	{
		arRestaurantes = new ArrayList<>();
		addRestaurante(null, null, null, null);
	}
	
	public void addRestaurante(String nome, String morada, String contacto, String especialidade)
	{
		Scanner sc = new Scanner(System.in);
		
		
		Restaurantes rest = new Restaurantes(nome, morada, contacto, especialidade);
		
		int idRest = arRestaurantes.size();
		
		rest.setId(idRest);
		
		arRestaurantes.add(rest);
		
		System.out.println("Introduza o nome do restaurante: ");
			nome = sc.nextLine();
		System.out.println("Introduza a morada do restaurante: ");
			morada = sc.nextLine();
		System.out.println("Introduza o contacto do restaurante: ");
			contacto = sc.nextLine();
		System.out.println("Introduza a especialidade do restaurante: ");
			especialidade = sc.nextLine();
			
	}
	
	public void mostraRestaurante()
	{
		for(int i=0; i<arRestaurantes.size(); i++)
		{
			System.out.println(arRestaurantes.get(i).getNome());
			System.out.println(arRestaurantes.get(i).getMorada());
			System.out.println(arRestaurantes.get(i).getContacto());
			System.out.println(arRestaurantes.get(i).getEspecialidade());
		}
	}
}
