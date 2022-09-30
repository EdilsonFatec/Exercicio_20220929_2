package model;

import java.text.DecimalFormat;

public class Cliente {

	public String nome;
	public int qtde;
	public float valorPecas;

	public String toString() {
		String valor = new DecimalFormat("####.00").format(valorPecas);
		return "Cliente= "+nome+" qtde pecas= "+qtde+" valor= "+valor;
	}
}
