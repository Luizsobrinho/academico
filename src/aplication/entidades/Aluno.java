package aplication.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Integer matricula;
	private String nome;
	private Date date;
	private double mgp; // mediad geral ponderada

	private Curso curso;

	public Aluno() {

	}

	public Aluno(Integer matricula, String nome, Date date, double mgp, Curso curso) {
		this.matricula = matricula;
		this.nome = nome;
		this.date = date;
		this.mgp = mgp;
		this.curso = curso;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getMgp() {
		return mgp;
	}

	public void setMgp(double mgp) {
		this.mgp = mgp;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(sdf.format(date) + "\n");
		return sb.toString();
	}
}
