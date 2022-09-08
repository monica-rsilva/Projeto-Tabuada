package br.senai.sp.jandira.model;

	public class Tabuada {
	
	public int multiplicando,
	minMultiplicador,
	maxMultiplicador,
	produto = 0;
		
	public String[] getTabuada(){

		int tamanho = maxMultiplicador - minMultiplicador + 1;
		String tabuada[] = new String[tamanho];

		int contador = 0;

		while (contador < tamanho) {

			int produto = multiplicando * minMultiplicador;
			//2x8=16
			String resultado =multiplicando + " x " + minMultiplicador + " = " + produto;
			tabuada[contador] = resultado;
			contador++;
			minMultiplicador++;

		}

		return tabuada;
		
		

	}	
	
}
