package commons;

import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

@SuppressWarnings("unused")
public class JpaUtilAdm {
	private static final String ENTITY_MANAGER = "ENTITY_MANAGER";
	private static EntityManagerFactory EMF;

	// CRIA��O DO BANCO DE DADOS
	public static void init() {
		if (EMF == null) {
			EMF = Persistence.createEntityManagerFactory("bancoDeDados_adm");

		}
	}

	public static void destroy() {
		EMF.close();
	}

	public static EntityManager createEntityManager(ServletRequest req) {
		EntityManager em = EMF.createEntityManager();
		HttpServletRequest request = (HttpServletRequest) req;
		request.setAttribute(ENTITY_MANAGER, em);
		return em;
	}

	public static EntityManager getEntityManager() {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
		EntityManager entityManager = (EntityManager) request.getAttribute(ENTITY_MANAGER);
		return entityManager;

	}
}
