package aplication.entidades;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private Integer codigo;
	private String nome;
	private Integer totalCreditos;

	List<Professor> professores = new ArrayList<>();

	public void addProfessor(Professor professor) {
		professores.add(professor);
	}

	public void removeProfessor(Professor professor) {
		professores.remove(professor);
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTotalCreditos() {
		return totalCreditos;
	}

	public void setTotalCreditos(Integer totalCreditos) {
		this.totalCreditos = totalCreditos;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

}
