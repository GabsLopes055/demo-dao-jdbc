package model.entidades;

import java.io.Serializable;

public class Departamentos implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String nome;

	public Departamentos() {
	}

	public Departamentos(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamentos other = (Departamentos) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Departamentos: ID = " + id + " NOME = " + nome;
	}

}
