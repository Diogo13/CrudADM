package model;

import java.util.List;

import dao.AdmDAO;
import entity.Adm;

public class AdmRN {

	private static AdmDAO dao;

	public AdmRN() {
		dao = new AdmDAO();
	}

	// SALVAR UM NOVO USUARIO
	public static void salvar(Adm adm) {
		dao.salvar(adm);

	}

	// FAZER A BUSCA DE TODOS OS MEMBROS
	public Adm buscarPorId(Long Id) {
		return dao.buscarPorId(Id);
	}

	// LISTAR TODOS OS MEMBROS NO BANCO
	public static List<Adm> listarAdms() {
		return dao.listarAdms();
	}

	// EXCLUIR ALGUM MEMBRO NO BANDO DE DADOS
	public void excluir(Long id) {
		dao.excluir(id);

	}

}
