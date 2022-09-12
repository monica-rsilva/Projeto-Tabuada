package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import br.senai.sp.jandira.model.Tabuada;

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
		buttonCalcular.setBounds(63, 250, 130, 50);
		buttonCalcular.setBackground(corDoBotao);
		buttonCalcular.setForeground(new Color(41,171,171));
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(193, 250, 130, 50);
		buttonLimpar.setBackground(corDoBotao);
		buttonLimpar.setForeground(new Color(41,171,171));
		
		ImageIcon calculadoraimagem = new ImageIcon (getClass().getResource("calculadora_icon.png"));
		JLabel calculadora = new JLabel(calculadoraimagem);
		calculadora.setBounds(15,20,50,40);
		
		//Criar uma label
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("Tabuada 1.0");
		labelTitulo.setBounds(80, 10, 250, 30);
		labelTitulo.setForeground(new Color(45,45,45));
		labelTitulo.setFont(fonteDoTitulo);
		
		JTextArea label = new JTextArea ("Com a tabuada 1.0 os seus problemas acabaram. Calcule a tabuada que desejar em segundos!");
		label.setBounds(80, 40, 290, 60);
		label.setWrapStyleWord(true);
		label.setBackground(CorDoPainel);
		label.setEditable(false);
		label.setLineWrap(true);
		label.setFont(fonteDasLabels);
		label.setForeground(new Color(45,45,45));
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(83, 90, 100, 30);
		labelMultiplicando.setForeground(Color.WHITE);
		labelMultiplicando.setFont(fonteDasLabels);
		
		JTextField textMultiplicando = new JTextField ();
		textMultiplicando.setBounds(190, 90, 150, 30);
		
		JLabel labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo Multiplicador:");
		labelMinMultiplicador.setBounds(40, 140, 160, 30);
		labelMinMultiplicador.setForeground(Color.WHITE);
		labelMinMultiplicador.setFont(fonteDasLabels);
		
		JTextField textMinMultiplicador = new JTextField ();
		textMinMultiplicador.setBounds(190, 140, 150, 30);
		
		JLabel labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo Multiplicador:");
		labelMaxMultiplicador.setBounds(40, 190, 160, 30);
	    labelMaxMultiplicador.setForeground(Color.WHITE);
		labelMaxMultiplicador.setFont(fonteDasLabels);
		
		JTextField textMaxMultiplicador = new JTextField ();
		textMaxMultiplicador.setBounds(190, 190, 150, 30);
		
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setBounds(30, 300, 160, 60);
	    labelResultado.setForeground(Color.WHITE);
		labelResultado.setFont(fonteDasLabels);
		
		JList<String> lista = new JList<String>();
		JScrollPane scroll = new JScrollPane(lista);
		scroll.setBounds(30, 350, 314, 200);
		lista.setBackground(new Color(45,45,45));
		lista.setForeground(new Color(41,171,171));
		
		// Eventos de click
		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Tabuada tabuada = new Tabuada();
				tabuada.multiplicando = Integer.parseInt(textMultiplicando.getText());
				tabuada.minMultiplicador = Integer.parseInt(textMinMultiplicador.getText());
				tabuada.maxMultiplicador = Integer.parseInt(textMaxMultiplicador.getText());
				
				if(tabuada.maxMultiplicador<=tabuada.minMultiplicador) {
					JOptionPane.showMessageDialog(null, "Digite um valor menor do que o máximo multiplicador", "erro", JOptionPane.ERROR_MESSAGE);	
				} else { 
		
				String[] resultado = tabuada.getTabuada();
				lista.setListData(resultado);
				
				scroll.setVisible(true);
			   }
			}
			
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textMultiplicando.setText("");
				textMinMultiplicador.setText("");
				textMaxMultiplicador.setText("");
				textMultiplicando.requestFocus();
				
			}
		});
		
		
			textMultiplicando.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {

			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				textMultiplicando.setText(textMultiplicando.getText().replaceAll("[^0-9]", ""));
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
			
			}
		});
		
			textMinMultiplicador.addKeyListener(new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent e) {

				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					
					textMinMultiplicador.setText(textMinMultiplicador.getText().replaceAll("[^0-9]", ""));
					
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					
				}
			});
		
				textMaxMultiplicador.addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent e) {
						
						
					}
					
					@Override
					public void keyReleased(KeyEvent e) {
						textMaxMultiplicador.setText(textMaxMultiplicador.getText().replaceAll("[^0-9]", ""));
						
					}
					
					@Override
					public void keyPressed(KeyEvent e) {
						
					}
				});

		
		
		//Adicionar os componentes ao painel 
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(calculadora);
		painel.add(labelTitulo);
		painel.add(label);
		painel.add(labelMultiplicando);
		painel.add(textMultiplicando);
		painel.add(labelMinMultiplicador);
		painel.add(textMinMultiplicador);
		painel.add(labelMaxMultiplicador);
		painel.add(textMaxMultiplicador);
		painel.add(labelResultado);
		painel.add(scroll);
		
		tela.setVisible(true);
		
	}

}
