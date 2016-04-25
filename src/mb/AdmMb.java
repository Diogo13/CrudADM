package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ComponentSystemEvent;
import model.AdmRN;
import entity.Adm;

@ManagedBean
public class AdmMb {
	private Adm adm;
	private AdmRN admRN;
	private Long editarId;// EDITAR POR ID
	private List<Adm> listaAdms;// LISTAR ADMS

	@PostConstruct
	public void depoisDeConstruir() {
		adm = new Adm();
		admRN = new AdmRN();
	}

	// GET ADM
	public Adm getAdm() {
		return adm;
	}

	// SET ADM
	public void setAdm(Adm adm) {
		this.adm = adm;
	}

	// GET EDITAR ADM
	public Long getEditarId() {
		return editarId;
	}

	// SET EDITAR ADM
	public void setEditarId(Long editarId) {
		this.editarId = editarId;
	}

	// LISTAR ADM
	public List<Adm> getListaAdms() {
		if (listaAdms == null) {
			listaAdms = AdmRN.listarAdms();
		}
		return listaAdms;
	}

	// SET LISTAR ADM
	public void setListaAdm(List<Adm> listaAdms) {
		this.listaAdms = listaAdms;
	}

	// CARREGAR UM ADM
	public void carregarAdm(ComponentSystemEvent event) {
		if (editarId == null) {
			return;
		}

		adm = admRN.buscarPorId(editarId);
	}

	// METODO EXCLUIR ADM
	public String excluir(String id) {
		Long idExcluir = Long.parseLong(id);
		admRN.excluir(idExcluir);
		listaAdms = null;
		return "";
	}

	// SALVAR ADM
	public String salvar() {
		admRN.salvar(adm);
		listaAdms = null;
		return "";
	}

}
