package GUI;

import Methods.Algoritmos;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Principal extends JFrame implements ActionListener {
    JTextField fieldN;
    JTextArea areaOrderedElements, areaDiagonalPrincipal, areaDiagonalInvertida,
            areaDiagonalSecundaria, areaPotencia;
    JScrollPane scrollOrder, scrollDiagonalPrin, scrollDiagonalInv, scrollDiagonalSec, scrollPotencia, scrollMatriz;
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
        fieldN.setBounds(320,50,30,30);
        fieldN.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent k) {
                int key = k.getKeyChar();
                boolean validarNumero = key >= 49 && key <= 57;
                if (!validarNumero) k.consume();
                if (fieldN.getText().trim().length() == 1) k.consume();
            }
        });
        add(fieldN);

        areaMatriz = new JTextArea();
        scrollMatriz = new JScrollPane(areaMatriz);
        scrollMatriz.setBounds(20, 100,300,300);
        add(scrollMatriz);

        buttonCalculate = new JButton("Calcular!");
        buttonCalculate.setBounds(20,420,100,30);
        buttonCalculate.addActionListener(this);
        add(buttonCalculate);

        buttonClear = new JButton("Limpiar");
        buttonClear.setBounds(220,420,100,30);
        buttonClear.addActionListener(this);
        add(buttonClear);
    }

    public static void main (String[] args){
        Principal frame = new Principal();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonCalculate){
            int n = Integer.parseInt(fieldN.getText());
            String matrizI = "     -------------------------\n      -----  Matriz  ----- \n     -------------------------\n";
            String elementosOrdenados = "";
            String diagonalPrincipal = "";
            String diagonaInvertida = "";
            String diagonalSecundaria = "";
            String stringPotencia = "";

            int matriz [][] = new int[n][n];
            int matrizClon [][] = new int[n][n];
            int vectorElementos [] = new int[n*n];

            //Rellenar matriz
            for (int i = 0; i < matriz.length; i++){
                for (int j = 0; j < matriz.length; j++){
                    matriz[i][j] = (int) (Math.random()*999);
                    matrizClon[i][j] = matriz[i][j];
                }
            }
            for (int i = 0; i < matriz.length; i++){
                matrizI += "\n\n";
                for (int j = 0; j < matriz.length; j++){
                    matrizClon[i][j] = matriz[i][j];
                    matrizI += "   " + matriz[i][j];
                }
            }

            //Ordenar Matriz
            for (int i = 0; i < matrizClon.length; i++){
                for (int j = 0; j < matrizClon.length; j++){
                    for (int x = 0; x < matrizClon.length; x++){
                        for (int y = 0; y < matrizClon.length; y++){
                            if (matrizClon[i][j] < matrizClon[x][y]){
                                int t = matriz[i][j];
                                matrizClon[i][j] = matrizClon[x][y];
                                matrizClon[x][y] = t;
                            }
                        }
                    }
                }
            }

            int cont = 0;
            for (int i = 0; i < matrizClon.length; i++){
                for (int j = 0; j < matrizClon.length; j++){
                    vectorElementos [cont] = matrizClon [i][j];
                    cont++;
                }
            }

            for (int i = 0; i < vectorElementos.length; i++){
                elementosOrdenados += "[" + vectorElementos[i] + "]";
            }

            //Multiplicar diagonal principal
            int productoDiagonal = matriz[0][0];
            for (int i = 0; i < matriz.length; i++){
                for (int j = 0; j < matriz.length; j++){
                    if (i == j){
                        productoDiagonal *= matriz[i][j];
                    }
                }
            }
            diagonalPrincipal = Integer.toString(productoDiagonal);

            //Invertir Resultado de la diagonal principal
            StringBuilder str = new StringBuilder(diagonalPrincipal);
            diagonaInvertida = str.reverse().toString();

            //Sumar diagonal secundaria
            int sumaDiagonalSec = 0;
            cont = 0;
            for (int i = 0; i < matriz.length; i++){
                for (int j = 0; j < matriz.length; j++){
                    if (i+j == matriz.length-1){
                        sumaDiagonalSec += matriz[i][j];
                        cont++;
                    }
                }
            }
            int promedioDiagonalSec = sumaDiagonalSec / cont;
            diagonalSecundaria = Integer.toString(promedioDiagonalSec);

            //Potencia
            double numMayor = matrizClon[0][0];
            double numMenor = matriz[n-1][n-1];
            int potencia = (int) (Math.pow(numMayor,numMenor));
            stringPotencia = Integer.toString(potencia);

            //Asignacion de resultados
            areaMatriz.setText(matrizI);
            areaOrderedElements.setText(elementosOrdenados);
            areaDiagonalPrincipal.setText(diagonalPrincipal);
            areaDiagonalInvertida.setText(diagonaInvertida);
            areaDiagonalSecundaria.setText(diagonalSecundaria);
            areaPotencia.setText(stringPotencia);

            //Deshabilitar campo de Texto N
            fieldN.setEnabled(false);

        }

        if (e.getSource() == buttonClear){
            fieldN.setText("");
            areaDiagonalPrincipal.setText("");
            areaDiagonalInvertida.setText("");
            areaMatriz.setText("");
            areaPotencia.setText("");
            areaDiagonalSecundaria.setText("");
            areaOrderedElements.setText("");
            fieldN.setEnabled(true);
        }
    }
}