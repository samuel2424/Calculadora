/*
 * Programa: Chess
 * Autores: Samuel Elí Méndez Sánchez, Gamaliel Ríos Lira
 * Fecha: 03/11/2019
 * Descripción: Es un ajedrez virtual que permite jugar a dos personas
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chess extends JFrame implements ActionListener {

	private JButton begin,salir;
	private JPanel tablero;
	private String[] piezas1=	{"peon","peon","peon","peon","peon","peon","peon","peon","torre","caballo","alfil","reina","rey","alfil","caballo","torre"}

					, piezas2=	{"peon","peon","peon","peon","peon","peon","peon","peon","torre","caballo","alfil","reina","rey","alfil","caballo","torre"};
	private int[] columnas1 = {0,1,2,3,4,5,6,7,0,1,2,3,4,5,6,7}
				, columnas2 = {7,6,5,4,3,2,1,0,7,6,5,4,3,2,1,0}
				, filas1 = {6,6,6,6,6,6,6,6,7,7,7,7,7,7,7,7}
				, filas2 = {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0};
	
	public static void main(String[] args) {
		Chess juego = new Chess();
		juego.setSize(700, 600);
		juego.crearGUI();
		juego.setVisible(true);
	}
	
	private void crearGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container ventana = getContentPane();
		ventana.setLayout(new FlowLayout() );
		
		tablero = new JPanel();
		tablero.setPreferredSize(new Dimension(500, 500));
		tablero.setBackground(Color.white);
		ventana.add(tablero);

		begin = new JButton("Jugar");
		ventana.add(begin);
		begin.addActionListener(this);
		
		salir = new JButton("Salir");
		ventana.add(salir);
		salir.addActionListener(this);

	}

	private void drawImage(String[] piezas, int[] filas, int[] columnas, String id) {
		//Dibuja las piezas de un arreglo con sus respectivas posiciones
		ImageIcon pieza;
		for (int i=0; i<16; i++) {
			pieza = new ImageIcon("images/" + piezas[i] + id + ".png");
			pieza.paintIcon(this, tablero.getGraphics(), 58 + 50*filas[i], 55 + 50*columnas[i]);
		}
		return;
	}

	private void drawTablero(Graphics papel) {
		//Dibuja el tablero y dibuja las piezas
		for (int i=0; i<8; i++) {
			papel.setColor(Color.black);
			papel.drawString(Integer.toString(i+1),30,75+50*i);
			for (int j=0; j<8; j++) {
				if (j == 0) {
					papel.drawString(Character.toString((char)(71 + i)),72+50*i,37);
				}
				if ((i+j)%2 == 1)
					papel.setColor(Color.darkGray);
				else
					papel.setColor(Color.white);
				papel.fillRect(50 + 50*i,50 + 50*j, 50, 50);
			}

			drawImage(piezas1, columnas1, filas1, "_b");
			drawImage(piezas2, columnas2, filas2, "_w");
		}
		return;
	}
	
	public void actionPerformed(ActionEvent event) {
		Object origen = event.getSource();
		Graphics papel = tablero.getGraphics();
		papel.setColor(Color.lightGray);
		papel.fillRect(40,40,420,420);

		if (origen == begin) {
			drawTablero(papel);
		}
		
		if (origen == salir) {

			System.exit(0);
		}
		return;
	}
}