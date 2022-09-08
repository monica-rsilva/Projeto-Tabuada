package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameTabuada {
	
	public String titulo;
	public int largura;
	public int altura;
	public Color CorDoPainel;
	public Font fonteDoTitulo;
	public Font fonteDasLabels;
	public Color corDoBotao;
	
	//criando uma tela 
	public void criarTela() {
		
		JFrame tela = new JFrame();
		
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tela.setLayout(null);
		
		//Obter instancia do container da janela
		Container painel = tela.getContentPane();
		painel.setBackground(CorDoPainel);
		
		//Criando botão 
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(65, 290, 130, 30);
		buttonCalcular.setBackground(corDoBotao);
		buttonCalcular.setForeground(new Color(41,171,171));
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(200, 290, 130, 30);
		buttonLimpar.setBackground(corDoBotao);
		buttonLimpar.setForeground(new Color(41,171,171));
		
		//Criar uma label
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("Tabuada 1.0");
		labelTitulo.setBounds(30, 10, 250, 30);
		labelTitulo.setForeground(new Color(41,171,171));
		labelTitulo.setFont(fonteDoTitulo);
		
		//JTextArea texto = new JTextArea (2,6);
		
		JLabel labeltexto = new JLabel();
		labeltexto.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule a tabuada que desejar em segundos!");
		labeltexto.setBounds(30, 35, 250, 60);
		labeltexto.setForeground(new Color(41,171,171));
		labeltexto.setFont(fonteDasLabels);
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(30, 90, 100, 30);
		labelMultiplicando.setForeground(Color.WHITE);
		labelMultiplicando.setFont(fonteDasLabels);
		
		JTextField textMultiplicando = new JTextField ();
		textMultiplicando.setBounds(190, 90, 150, 30);
		
		JLabel labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo Multiplicador:");
		labelMinMultiplicador.setBounds(30, 140, 160, 30);
		labelMinMultiplicador.setForeground(Color.WHITE);
		labelMinMultiplicador.setFont(fonteDasLabels);
		
		JTextField textMinMultiplicador = new JTextField ();
		textMinMultiplicador.setBounds(190, 140, 150, 30);
		
		JLabel labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo Multiplicador:");
		labelMaxMultiplicador.setBounds(30, 190, 160, 30);
	    labelMaxMultiplicador.setForeground(Color.WHITE);
		labelMaxMultiplicador.setFont(fonteDasLabels);
		
		JTextField textMaxMultiplicador = new JTextField ();
		textMaxMultiplicador.setBounds(190, 190, 150, 30);
		
		
		//Adicionar os componentes ao painel 
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelTitulo);
		painel.add(labeltexto);
		painel.add(labelMultiplicando);
		painel.add(textMultiplicando);
		painel.add(labelMinMultiplicador);
		painel.add(textMinMultiplicador);
		painel.add(labelMaxMultiplicador);
		painel.add(textMaxMultiplicador);
		
		
		tela.setVisible(true);
		
	}

}
