package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Adm {
	@Id
	@GeneratedValue
	private Long id;// ID DO USUARIO
	private String tipoPessoas;// TIPO DE PESSOA EXEMPLO PROF/ALUNO/ADM
	private String nome;// NOME DO USUARIO
	private String dataNascimento;// DATA DE NASCIMENTO
	private String rg;// RG DO USUARIO
	private String cpf;// CPF DO USUARIO
	private String apelido;// APELIDO DO USUARIO
	private String email;// EMAIL DO USUARIO
	private String senha;// SENHA DO USUARIO
	private String dataCadastro;// DATA DE CADASTRO DO USUARIO
	private String numeroMatricula;// NUMERO DA MATRICULA
	// METODOS GET E SETS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoPessoas() {
		return tipoPessoas;
	}

	public void setTipoPessoas(String tipoPessoas) {
		this.tipoPessoas = tipoPessoas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

}
