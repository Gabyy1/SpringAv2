package br.edu.fatec.zl.SpringAv2.persistence;

import java.sql.SQLException;
import java.util.List;

import br.edu.fatec.zl.SpringAv2.model.Jogo;


public interface IJogoDao {
	public List<Jogo> listaDatas() throws SQLException, ClassNotFoundException;
	public List<Jogo> listaJogos(String data) throws SQLException, ClassNotFoundException;
	public void atualizaJogos(Jogo jogo) throws SQLException, ClassNotFoundException;
	public void atualizaJogosAleatorio() throws SQLException, ClassNotFoundException;
	public List<Jogo> listaQuartas() throws SQLException, ClassNotFoundException;
}