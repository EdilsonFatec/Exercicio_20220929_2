package view;

import br.edu.fateczl.filaobj.Fila;
import model.Cliente;
import controller.OperacaoController;

public class Principal {

	public static void main(String[] args) throws Exception {
		String nome;
		int qtde;
		float valorPecas;

		Fila fila = new Fila();
		
		for (int i=0;i<20;i++) {
			nome = "Cliente"+(i+1);
			qtde = (int) (Math.random() * 30) + 20;
			valorPecas = (float) Math.random() * 95 + 5;
			Cliente cli = new Cliente();
			cli.nome = nome;
			cli.qtde = qtde;
			cli.valorPecas = valorPecas;
			fila.insert(cli);
		}
		OperacaoController c = new OperacaoController();
		c.caixa(fila);
	}

}
