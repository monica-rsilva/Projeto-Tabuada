package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;
import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {

	public static void main(String[] args) {
		

		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.largura = 400;
		tela.altura = 600;
	    tela.CorDoPainel = new Color(100,100,100);
	    tela.fonteDoTitulo = new Font ("CALIBRI", Font.BOLD, 30);
		tela.fonteDasLabels = new Font ("arial", Font.BOLD, 14);
		tela.corDoBotao = new Color(45,45,45);
	    tela.criarTela();
	    
	    
	   
	    
	}

}
