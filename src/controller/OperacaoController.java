package controller;

import java.text.DecimalFormat;

import br.edu.fateczl.filaobj.Fila;
import model.Cliente;

public class OperacaoController {

	public OperacaoController() {
		super();
	}
	
	public void caixa(Fila fila) throws Exception {
		
		while (!fila.isEmpty()) { 
			Cliente cli = new Cliente();
			cli = (Cliente) fila.remove();
			String valor = new DecimalFormat("####.00").format(cli.valorPecas*cli.qtde);
			System.out.println("Cliente = "+cli.nome+"  -  Valor da compra = "+valor);
		}
	}
}
