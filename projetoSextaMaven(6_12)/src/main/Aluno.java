package main;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="aluno")
public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="aluno_id")
	private Long id;
	@Column(length = 50, unique=true)
	@NotBlank
	@Size(min=2, max=50)
	private String nome;
	@Column
	private String disciplina;
	@Column
	private Double nota1;
	@Column
	private Double nota2;
	@Column
	private String situacao;
	
	private Double media = 0d;
	
	public Aluno() {
	
	}
	
	public Aluno(Long id, String nome, String disciplina, Double nota1, Double nota2) {
		super();
		this.id = id;
		this.nome = nome;
		this.disciplina = disciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", disciplina=" + disciplina + ", nota1=" + nota1 + ", nota2="
				+ nota2 + ", situacao=" + situacao + "]";
	}
	
	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public void gerarMedia() {
		
		this.media = ((this.nota1 + this.nota2)/2);
	}
	
	public void gerarSituacao() {
		
		if(this.getMedia() >= 7){
			
			this.situacao = "aprovado";
			
		}else{
			
			this.situacao = "reprovado";
		}
	}
}
