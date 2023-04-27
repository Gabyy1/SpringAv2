package br.edu.fatec.zl.SpringAv2.persistence;

import java.sql.SQLException;
import java.util.List;

import br.edu.fatec.zl.SpringAv2.model.Jogo;


public interface IJogoDao {
	public String gerarJogos() throws SQLException, ClassNotFoundException;

	public List<Jogo> listarJogos(String data) throws SQLException, ClassNotFoundException;

}
