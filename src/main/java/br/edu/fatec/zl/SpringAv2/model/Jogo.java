package br.edu.fatec.zl.SpringAv2.model;

public class Jogo {
	private String timeA;
	private String timeB;
	private int golsA;
	private int golsB;
	private int rodada;
	private String data;
	public String getTimeA() {
		return timeA;
	}
	public void setTimeA(String timeA) {
		this.timeA = timeA;
	}
	public String getTimeB() {
		return timeB;
	}
	public void setTimeB(String timeB) {
		this.timeB = timeB;
	}
	public int getGolsA() {
		return golsA;
	}
	public void setGolsA(int golsA) {
		this.golsA = golsA;
	}
	public int getGolsB() {
		return golsB;
	}
	public void setGolsB(int golsB) {
		this.golsB = golsB;
	}
	public int getRodada() {
		return rodada;
	}
	public void setRodada(int rodada) {
		this.rodada = rodada;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Jogo [timeA=" + timeA + ", timeB=" + timeB + ", golsA=" + golsA + ", golsB=" + golsB + ", rodada="
				+ rodada + ", data=" + data + "]";
	}

}
