package model;

public class Restaurantes 
{
	private int Id;
	private String nome;
	private String morada;
	private String contacto;
	private String especialidade;
	
	
	public Restaurantes(String nome, String morada, String contacto, String especialidade)
	{
		super();
		this.nome = nome;
		this.morada = morada;
		this.contacto = contacto;
		this.especialidade = especialidade;
	}

	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMorada() {
		return morada;
	}


	public void setMorada(String morada) {
		this.morada = morada;
	}


	public String getContacto() {
		return contacto;
	}


	public void setContacto(String contacto) {
		this.contacto = contacto;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
	
}
