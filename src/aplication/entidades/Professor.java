package aplication.entidades;

public class Professor {

	private Integer idtProf; // identificação do professor
	private Integer matricula;
	private String nome;

	public Professor() {

	}

	public Professor(Integer idtProf, Integer matricula, String nome) {
		this.idtProf = idtProf;
		this.matricula = matricula;
		this.nome = nome;
	}

	public Integer getIdtProf() {
		return idtProf;
	}

	public void setIdtProf(Integer idtProf) {
		this.idtProf = idtProf;
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

}
