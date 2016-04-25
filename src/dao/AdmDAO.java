package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import commons.JpaUtilAdm;
import entity.Adm;

public class AdmDAO {
	// SALVAR ADM NO BANCO DE DADOS
	public void salvar(Adm adm) {
		getEM().merge(adm);
	}

	// FAZER A BUSCA POR ID DO ADM NO BANCO
	public Adm buscarPorId(Long id) {
		return getEM().find(Adm.class, id);

	}

	// LISTAR TODOS OS MEMBROS
	public List<Adm> listarAdms() {
		Query query = getEM().createQuery("From Adm", Adm.class);
		return query.getResultList();

	}

	// EXCLUIR UM USUARIO DO BANCO
	public void excluir(Long id) {
		Adm adm = getEM().getReference(Adm.class, id);
		getEM().remove(adm);
	}

	private EntityManager getEM() {
		EntityManager em = JpaUtilAdm.getEntityManager();
		return em;
	}

}
