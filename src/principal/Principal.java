package principal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import entity.Adm;

public class Principal {
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("bancoDeDados_adm");
		// AdicionarADM
		// AlterarADM
		// ListarADM
		// BuscarADM
		// RemoverADMporId
		emf.close();

	}

	// ADICIONAR ADM NO BANCO DE DADOS
	private static void adicionarAdm() {
		Adm adm = new Adm();
		adm.setTipoPessoas("");
		adm.setNome("");
		adm.setDataNascimento("");
		adm.setRg("");
		adm.setCpf("");
		adm.setApelido("");
		adm.setEmail("");
		adm.setSenha("");
		adm.setDataCadastro("");
		adm.setNumeroMatricula("");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(adm);
		em.getTransaction().commit();
		em.close();

	}

	// ALTERAR ADM NO BANCO DE DADOS
	private static void alterarAdm() {
		Adm adm = new Adm();
		adm.setTipoPessoas("");
		adm.setNome("");
		adm.setDataNascimento("");
		adm.setRg("");
		adm.setCpf("");
		adm.setApelido("");
		adm.setEmail("");
		adm.setSenha("");
		adm.setDataCadastro("");
		adm.setNumeroMatricula("");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(adm);
		em.getTransaction().commit();
		em.close();

	}

	// LISTAR TODOS ADMS NO BANCO DE DADOS
	private static void listarAdm() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("ADM", Adm.class);
		List<Adm> aluno = query.getResultList();
		em.close();
	}

	// BUSCAR ADM NO BANDO DE DADOS
	private static void buscarAdm() {
		Long id = 2L;
		EntityManager em = emf.createEntityManager();
		Adm adm = em.find(Adm.class, id);
		em.close();

	}

	// REMOVER ADM DO BANDO DE DADOS
	private static void removerAdm() {
		Long id = 1L;
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Adm adm = em.getReference(Adm.class, id);
		em.remove(adm);
		em.getTransaction().commit();
		em.close();

	}
}
