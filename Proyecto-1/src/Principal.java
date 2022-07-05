import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Principal extends JFrame implements ActionListener {
    JTextField fieldN;
    JTextArea areaOrderedElements, areaDiagonalPrincipal, areaDiagonalInvertida,
            areaDiagonalSecundaria, areaPotencia;
    JScrollPane scrollOrder, scrollDiagonalPrin, scrollDiagonalInv, scrollDiagonalSec, scrollPotencia, scrollMatriz;
    JTextArea areaMatriz;
    JButton buttonClear, buttonCalculate;
    JLabel labelOrderedElements, labelDiagonalPrincipal, labelDiagonalInvertida,
            labelDiagonalSecundaria, labelPotencia, labelN, labelWelcome;
    public Principal(){
        setLayout(null);
        setSize(660,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(0, 225, 255));


        labelWelcome = new JLabel("¡Bienvenido a Calculadora de Matrices!");
        labelWelcome.setBounds(20,20,700,30);
        labelWelcome.setFont(new Font("Arial", Font.BOLD,28));
        add(labelWelcome);

        labelN = new JLabel("Numero de filas y columnas de la matriz ");
        labelN.setBounds(20,60,400,30);
        add(labelN);

        labelOrderedElements = new JLabel("Elementos ordenados de mayor a menor:");
        labelOrderedElements.setBounds(20,420,300,30);
        add(labelOrderedElements);

        labelDiagonalPrincipal = new JLabel("Multiplicacion de la diagonal principal:");
        labelDiagonalPrincipal.setBounds(20,460,300,30);
        add(labelDiagonalPrincipal);

        labelDiagonalInvertida = new JLabel("Multiplicacion diagonal principal invertida:");
        labelDiagonalInvertida.setBounds(20,500,300,30);
        add(labelDiagonalInvertida);

        labelDiagonalSecundaria = new JLabel("Promedio de la suma de la diagonal secundaria:");
        labelDiagonalSecundaria.setBounds(20,540,400,30);
        add(labelDiagonalSecundaria);

        labelPotencia = new JLabel("Potencia del elemento mayor elevado al menor positivo:");
        labelPotencia.setBounds(20,580,400,30);
        add(labelPotencia);

        areaOrderedElements = new JTextArea();
        areaOrderedElements.setEditable(false);
        scrollOrder = new JScrollPane(areaOrderedElements);
        scrollOrder.setBounds(420,420,200,30);
        add(scrollOrder);

        areaDiagonalPrincipal = new JTextArea();
        areaDiagonalPrincipal.setEditable(false);
        scrollDiagonalPrin = new JScrollPane(areaDiagonalPrincipal);
        scrollDiagonalPrin.setBounds(420,460,200,30);
        add(scrollDiagonalPrin);

        areaDiagonalInvertida = new JTextArea();
        areaDiagonalInvertida.setEditable(false);
        scrollDiagonalInv = new JScrollPane(areaDiagonalInvertida);
        scrollDiagonalInv.setBounds(420,500,200,30);
        add(scrollDiagonalInv);

        areaDiagonalSecundaria = new JTextArea();
        areaDiagonalSecundaria.setEditable(false);
        scrollDiagonalSec = new JScrollPane(areaDiagonalSecundaria);
        scrollDiagonalSec.setBounds(420,540,200,30);
        add(scrollDiagonalSec);

        areaPotencia = new JTextArea();
        areaPotencia.setEditable(false);
        scrollPotencia = new JScrollPane(areaPotencia);
        scrollPotencia.setBounds(420,580,200,30);
        add(scrollPotencia);

        fieldN = new JTextField();
        fieldN.setBounds(320,60,30,30);
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
        areaMatriz.setEditable(false);
        scrollMatriz = new JScrollPane(areaMatriz);
        scrollMatriz.setBounds(20, 100,600,300);
        add(scrollMatriz);

        buttonCalculate = new JButton("Calcular!");
        buttonCalculate.setBounds(225,620,100,30);
        buttonCalculate.addActionListener(this);
        add(buttonCalculate);

        buttonClear = new JButton("Limpiar");
        buttonClear.setBounds(330,620,100,30);
        buttonClear.addActionListener(this);
        add(buttonClear);
    }

    public static void main (String[] args){
        Principal frame = new Principal();
        frame.setVisible(true);
    }

    public static String eliminarNotaciónCientifica(BigInteger numero) {
        return new DecimalFormat("#.####################################").format(numero);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonCalculate){
            int n = Integer.parseInt(fieldN.getText());
            String matrizI = "\t     -------------------------\n\t      -----  Matriz  ----- \n\t     -------------------------\n";
            String elementosOrdenados = "";
            String diagonalPrincipal = "";
            String diagonaInvertida = "";
            String diagonalSecundaria = "";
            String stringPotencia = "";

            int matriz [][] = new int[n][n];
            int vectorElementos [] = new int[n*n];
            BigInteger pot;

            //Rellenar matriz
            for (int i = 0; i < matriz.length; i++){
                for (int j = 0; j < matriz.length; j++){
                    matriz[i][j] = (int) (Math.random()*999);
                }
            }

            //Copiar y convertir matriz a string
            for (int i = 0; i < matriz.length; i++){
                matrizI += "\n\n";
                for (int j = 0; j < matriz.length; j++){
                    matrizI += "\t" + matriz[i][j];
                }
            }

            //Ordenar elementos en el vector
            int cont = 0;
            for (int i = 0; i < matriz.length; i++){
                for (int j = 0; j < matriz.length; j++){
                    vectorElementos [cont] = matriz [i][j];
                    cont++;
                }
            }
            Arrays.sort(vectorElementos);
            for (int i = 0; i < vectorElementos.length; i++){
                elementosOrdenados += "" + vectorElementos[i] + ", ";
            }

            //Multiplicar diagonal principal
            int productoDiagonal = 1;
            for (int i = 0; i < matriz.length; i++){
                for (int j = 0; j < matriz.length; j++){
                    if (i == j){
                        productoDiagonal = productoDiagonal * matriz[i][j];
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
            double numMenor = vectorElementos[0];
            double numMayor = vectorElementos[vectorElementos.length - 1];
            int potencia = (int) (Math.pow(numMayor,numMenor));
            pot = BigInteger.valueOf(potencia);
            stringPotencia = "" + eliminarNotaciónCientifica(pot);

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

        //Limpiar campos y habilitar FieldN
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