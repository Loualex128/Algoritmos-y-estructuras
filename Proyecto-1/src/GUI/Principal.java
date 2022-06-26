package GUI;

import Methods.Algoritmos;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame implements ActionListener {

    int N;
    JTextField fieldN;
    JTextArea areaOrderedElements, areaDiagonalPrincipal, areaDiagonalInvertida,
              areaDiagonalSecundaria, areaPotencia;
    JScrollPane scrollOrder, scrollDiagonalPrin, scrollDiagonalInv, scrollDiagonalSec, scrollPotencia;
    JTextArea areaMatriz;
    JButton buttonClear, buttonCalculate;
    JLabel labelOrderedElements, labelDiagonalPrincipal, labelDiagonalInvertida,
            labelDiagonalSecundaria, labelPotencia, labelN, labelWelcome;
    Algoritmos metodo;
    public Principal(){
        setLayout(null);
        setSize(1200,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);


        labelWelcome = new JLabel("Bienvenido a Matriz Calculator!");
        labelWelcome.setBounds(200,20,300,30);
        add(labelWelcome);

        labelN = new JLabel("Numero de filas y columnas de la matriz: ");
        labelN.setBounds(20,50,400,30);
        add(labelN);

        labelOrderedElements = new JLabel("Elementos ordenados de mayor a menor:");
        labelOrderedElements.setBounds(340,100,300,30);
        add(labelOrderedElements);

        labelDiagonalPrincipal = new JLabel("Multiplicacion de la diagonal principal:");
        labelDiagonalPrincipal.setBounds(340,140,300,30);
        add(labelDiagonalPrincipal);

        labelDiagonalInvertida = new JLabel("Multiplicacion diagonal principal invertida:");
        labelDiagonalInvertida.setBounds(340,180,300,30);
        add(labelDiagonalInvertida);

        labelDiagonalSecundaria = new JLabel("Promedio de la suma de la diagonal secundaria:");
        labelDiagonalSecundaria.setBounds(340,220,400,30);
        add(labelDiagonalSecundaria);

        labelPotencia = new JLabel("Potencia del elemento mayor elevado al menor positivo:");
        labelPotencia.setBounds(340,260,400,30);
        add(labelPotencia);

        areaOrderedElements = new JTextArea();
        areaOrderedElements.setEditable(false);
        scrollOrder = new JScrollPane(areaOrderedElements);
        scrollOrder.setBounds(760,100,200,30);
        add(scrollOrder);

        areaDiagonalPrincipal = new JTextArea();
        areaDiagonalPrincipal.setEditable(false);
        scrollDiagonalPrin = new JScrollPane(areaDiagonalPrincipal);
        scrollDiagonalPrin.setBounds(760,140,200,30);
        add(scrollDiagonalPrin);

        areaDiagonalInvertida = new JTextArea();
        areaDiagonalInvertida.setEditable(false);
        scrollDiagonalInv = new JScrollPane(areaDiagonalInvertida);
        scrollDiagonalInv.setBounds(760,180,200,30);
        add(scrollDiagonalInv);

        areaDiagonalSecundaria = new JTextArea();
        areaDiagonalSecundaria.setEditable(false);
        scrollDiagonalSec = new JScrollPane(areaDiagonalSecundaria);
        scrollDiagonalSec.setBounds(760,220,200,30);
        add(scrollDiagonalSec);

        areaPotencia = new JTextArea();
        areaPotencia.setEditable(false);
        scrollPotencia = new JScrollPane(areaPotencia);
        scrollPotencia.setBounds(760,260,200,30);
        add(scrollPotencia);

        fieldN = new JTextField();
        fieldN.setBounds(320,50,150,30);
        add(fieldN);

        areaMatriz = new JTextArea();
        areaMatriz.setBounds(20, 100,300,300);
        add(areaMatriz);

        buttonCalculate = new JButton("Calcular!");
        buttonCalculate.setBounds(20,420,100,30);
        add(buttonCalculate);

        buttonClear = new JButton("Limpiar");
        buttonClear.setBounds(220,420,100,30);
        add(buttonClear);
    }

    public static void main (String[] args){
        Principal frame = new Principal();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        //areaMatriz.setText(metodo.crearMatriz(4));
    }
}