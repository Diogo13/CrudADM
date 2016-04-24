package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ComponentSystemEvent;

import model.AdmRN;
import entity.Adm;

@ManagedBean
public class AdmMB {
	private Adm adm;
	private AdmRN admRN;
	private Long editarId;
	private List<Adm> listaAdm;

	@PostConstruct
	public void Construtor() {
		adm = new Adm();
		admRN = new AdmRN();

	}

	public Adm getAdm() {
		return adm;
	}

	public void setAdm(Adm adm) {
		this.adm = adm;

	}

	public Long getEditarId() {
		return editarId;

	}

	public void setEditarId(Long editarId) {
		this.editarId = editarId;
	}

	public List<Adm> getListaAdm() {
		if (listaAdm == null) {
			listaAdm = admRN.listaAdm();

		}
		return listaAdm;
	}

	public void setListaAdm(List<Adm> listarAdm) {
		this.listaAdm = listarAdm;
	}

	public void carregarAdm(ComponentSystemEvent event) {
		if (editarId == null) {
			return;
		}
		adm = admRN.buscarPorId(editarId);
	}

	public String excluir(String id) {
		Long idExcluir = Long.parseLong(id);
		admRN.excluir(idExcluir);
		listaAdm = null;
		return "";

	}

	public String salvar() {
		admRN.salvar(adm);
		listaAdm = null;
		return "";
	}
}
