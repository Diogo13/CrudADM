package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import commons.JpaUtilAdm;
import entity.Adm;

// SALVAR ADM
public class AdmDAO {
	public void salvar(Adm adm) {
		getEM().merge(adm);
	}

	// FAZER A BUSCAR POR ID
	public Adm buscarPorId(Long id) {
		return getEM().find(Adm.class, id);

	}

	// LISTAR TODOS OS ADMS
	public List<Adm> listarAdm() {
		Query query = getEM().createQuery("Adm", Adm.class);
		return query.getResultList();
	}

	// DELETAR POR ID
	public void deletar(Long id) {
		Adm adm = getEM().getReference(Adm.class, id);
		getEM().remove(adm);
	}

	private EntityManager getEM() {
		EntityManager em = JpaUtilAdm.getEntityManager();
		return em;
	}
}
