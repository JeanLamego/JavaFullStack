package entity;

import java.io.Serializable;

import org.bson.types.ObjectId;

public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;

	private ObjectId _id;
	private Double codigo;
	private String nome;
	private String email;
	private String sexo;
	private Double salario;

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public Double getCodigo() {
		return codigo;
	}

	public void setCodigo(Double codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Aluno [_id=" + _id + ", codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", sexo=" + sexo
				+ ", salario=" + salario + "]";
	}

	public Aluno(ObjectId _id, Double codigo, String nome, String email, String sexo, Double salario) {
		super();
		this._id = _id;
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.salario = salario;
	}

	public Aluno(Double codigo, String nome, String email, String sexo, Double salario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.salario = salario;
	}

	public Aluno() {
	}
}
