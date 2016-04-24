package model;

import java.util.List;

import dao.AdmDAO;
import entity.Adm;

public class AdmRN {

	private AdmDAO dao;

	public AdmRN() {
		dao = new AdmDAO();
	}

	public List<Adm> listarAdm() {
		return dao.listarAdm();
	}

	public Adm buscarPorId(Long Id) {
		return dao.buscarPorId(Id);
	}

	public void excluir(Long id) {
		dao.deletar(id);

	}

	public void salvar(Adm adm) {
		dao.salvar(adm);

	}

}
