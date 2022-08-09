import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigInteger;

public class Principal extends JFrame implements ActionListener {

    JLabel labelWelcome, labelDatos, labelM, labelPrimo, labelFibonacci, labelPotencia,
            labelSuma, labelFactorial;
    JTextField fieldN, fieldM;
    JTextArea areaPrimo, areaFibonacci, areaPotencia, areaSuma, areaFactorial;
    JScrollPane scrollPrimo, scrollFibonacci, scrollPotencia, scrollSuma, scrollFactorial;
    JButton buttonCalculate, buttonClear;
    int M = 0, N = 0;
    String strPrimo = "", strFibonacci = "0, ", strPotencia = "", strFactorial = "",strSumaDigitos = "";
    int divisor = 1, multiplicador = 1, aux = 1, contador = 0, resultNxM = 0;
    int num1 = 0, num2 = 1, result = 0;
    BigInteger BigFactorial = BigInteger.ONE;
    BigInteger BigPotencia = BigInteger.ONE;

    public Principal(){
        setLayout(null);
        getContentPane().setBackground(new Color(106, 225, 149));
        setSize(455, 470);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        labelWelcome = new JLabel("Recursividad!");
        labelWelcome.setBounds(20,40,300, 30);
        labelWelcome.setFont(new Font("Andale mono", 1, 38));
        add(labelWelcome);

        labelDatos = new JLabel("Introduce el valor de N");
        labelDatos.setBounds(20,100,200,30);
        add(labelDatos);

        labelM = new JLabel("y M");
        labelM.setBounds(220,100,50, 30);
        add(labelM);

        labelPrimo = new JLabel("¿M es un nùmero primo?");
        labelPrimo.setBounds(20,160,200,30);
        add(labelPrimo);

        labelFibonacci = new JLabel("Fibonacci hasta NxM");
        labelFibonacci.setBounds(20,200,200,30);
        add(labelFibonacci);

        labelPotencia = new JLabel("Potencia de N elevado a M");
        labelPotencia.setBounds(20,240,200,30);
        add(labelPotencia);

        labelSuma = new JLabel("Suma de los digitos de NxM");
        labelSuma.setBounds(20,280,200,30);
        add(labelSuma);

        labelFactorial = new JLabel("Factorial del numero N");
        labelFactorial.setBounds(20,320,200,30);
        add(labelFactorial);

        fieldN = new JTextField();
        fieldN.setBounds(185,100,30,30);
        fieldN.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent k) {
                int key = k.getKeyChar();
                boolean validarNumero = key >= 48 && key <= 57;
                if (!validarNumero) k.consume();
                if (fieldN.getText().trim().length() == 2) k.consume();
            }
        });
        add(fieldN);

        fieldM = new JTextField();
        fieldM.setBounds(250,100,30,30);
        fieldM.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent k) {
                int key = k.getKeyChar();
                boolean validarNumero = key >= 48 && key <= 57;
                if (!validarNumero) k.consume();
                if (fieldM.getText().trim().length() == 2) k.consume();
            }
        });
        add(fieldM);

        areaPrimo = new JTextArea();
        areaPrimo.setEditable(false);
        scrollPrimo = new JScrollPane(areaPrimo);
        scrollPrimo.setBounds(240,160,200,30);
        add(scrollPrimo);

        areaFibonacci = new JTextArea();
        areaFibonacci.setEditable(false);
        scrollFibonacci = new JScrollPane(areaFibonacci);
        scrollFibonacci.setBounds(240,200,200,30);
        add(scrollFibonacci);

        areaPotencia = new JTextArea();
        areaPotencia.setEditable(false);
        scrollPotencia = new JScrollPane(areaPotencia);
        scrollPotencia.setBounds(240,240,200,30);
        add(scrollPotencia);

        areaSuma = new JTextArea();
        areaSuma.setEditable(false);
        scrollSuma = new JScrollPane(areaSuma);
        scrollSuma.setBounds(240,280,200,30);
        add(scrollSuma);

        areaFactorial = new JTextArea();
        areaFactorial.setEditable(false);
        scrollFactorial = new JScrollPane(areaFactorial);
        scrollFactorial.setBounds(240,320,200,30);
        add(scrollFactorial);

        buttonCalculate = new JButton("Calcular");
        buttonCalculate.setBounds(120,380,100,30);
        buttonCalculate.addActionListener(this);
        add(buttonCalculate);

        buttonClear = new JButton("Limpiar");
        buttonClear.setBounds(240,380,100,30);
        buttonClear.addActionListener(this);
        add(buttonClear);
    }

    public static void main(String[] args){
        Principal frame = new Principal();
        frame.setVisible(true);
    }

    public void CalcularPrimo() {
        if (divisor <= M){
            if((M % divisor) == 0){
                contador++;
                divisor++;
                CalcularPrimo();
            } else {
                divisor++;
                CalcularPrimo();
            }
        } else {
            if (contador == 2){
                strPrimo = M + " es un numero primo";
            } else {
                strPrimo = M + " no es un numero primo";
            }
        }
        contador = 0;
        divisor = 1;
    }

    public void  SecuenciaFibonacci(){

        if ((num1 + num2) < resultNxM){
            result = num1 + num2;
            strFibonacci += result + ", ";
            num1 = num2;
            num2 = result;
            SecuenciaFibonacci();
        } else {
            num1 = 0;
            num2 = 1;
            result = 0;
        }
    }

    public void PotenciaNxM(){
        if (contador < M){
            BigPotencia = BigPotencia.multiply(BigInteger.valueOf(N));
            aux *= N;
            contador++;
            PotenciaNxM();
        } else {
            strPotencia = "" + BigPotencia;
            aux = 1;
            contador = 0;
            BigPotencia = BigInteger.ONE;
        }
    }

    public void SumarDigitos(){
        if (resultNxM > 0){
            result += resultNxM % 10;
            resultNxM = resultNxM / 10;
            SumarDigitos();
        } else {
            strSumaDigitos = "" + result;
            result = 0;
            resultNxM = N * M;
        }
    }

    public void CalcularFactorial(){
        if(contador < N){
           BigFactorial = BigFactorial.multiply(BigInteger.valueOf(multiplicador));
           contador++;
           multiplicador++;
           CalcularFactorial();
        } else {
            strFactorial = "" + BigFactorial;
            contador = 0;
            multiplicador = 1;
            aux = 1;
            BigFactorial = BigInteger.ONE;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonCalculate){
            N = Integer.parseInt(fieldN.getText());
            M = Integer.parseInt(fieldM.getText());
            resultNxM = N * M;
            CalcularPrimo();
            SecuenciaFibonacci();
            PotenciaNxM();
            SumarDigitos();
            CalcularFactorial();
            areaPrimo.setText(strPrimo);
            areaFibonacci.setText(strFibonacci);
            areaPotencia.setText(strPotencia);
            areaSuma.setText(strSumaDigitos);
            areaFactorial.setText(strFactorial);
            buttonCalculate.setEnabled(false);
            fieldN.setEnabled(false);
            fieldM.setEnabled(false);
        }

        if(e.getSource() == buttonClear){
            fieldN.setText("");
            fieldM.setText("");
            areaPrimo.setText("");
            areaFibonacci.setText("");
            areaPotencia.setText("");
            areaSuma.setText("");
            areaFactorial.setText("");
            buttonCalculate.setEnabled(true);
            fieldN.setEnabled(true);
            fieldM.setEnabled(true);
        }
    }
}
