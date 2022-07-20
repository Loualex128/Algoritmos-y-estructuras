import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class Principal extends JFrame implements ActionListener {

    JLabel labelWelcome, labelDatos, labelN, labelM, labelPrimo, labelFibonacci, labelPotencia,
            labelSuma, labelFactorial;
    JTextField fieldN, fieldM;
    JTextArea areaPrimo, areaFibonacci, areaPotencia, areaSuma, areaFactorial;
    JScrollPane scrollPrimo, scrollFibonacci, scrollPotencia, scrollSuma, scrollFactorial;
    JButton buttonCalculate, buttonClear;
    int M = 0, N = 0;
    String strPrimo = "", strFibonacci = "0, ", strPotencia = "", strFactorial = "";
    int divisor = 1, multiplicador = 1, aux = 1, contador = 0;
    int num1 = 0, num2 = 1, result = 0;
    int potencia = 0;
    BigInteger BigFactorial = BigInteger.ZERO;
    BigInteger BigPotencia = BigInteger.ZERO;

    public Principal(){
        setLayout(null);
        setSize(455, 470);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        labelWelcome = new JLabel("Bienvenido!");
        labelWelcome.setBounds(20,45,300, 30);
        labelWelcome.setFont(new Font("Andale mono", 1, 38));
        add(labelWelcome);

        labelDatos = new JLabel("Introduce el valor de");
        labelDatos.setBounds(20,120,200,30);
        add(labelDatos);

        labelN = new JLabel("N");
        labelN.setBounds(170,120,100,30);
        add(labelN);

        labelM = new JLabel("y M");
        labelM.setBounds(220,120,50, 30);
        add(labelM);

        labelPrimo = new JLabel("¿M es un nùmero primo?");
        labelPrimo.setBounds(20,160,200,30);
        add(labelPrimo);

        labelFibonacci = new JLabel("Sucesion de Fibonacci");
        labelFibonacci.setBounds(20,200,200,30);
        add(labelFibonacci);

        labelPotencia = new JLabel("Potencia de la matriz");
        labelPotencia.setBounds(20,240,200,30);
        add(labelPotencia);

        labelSuma = new JLabel("La suma de la sucesion es");
        labelSuma.setBounds(20,280,200,30);
        add(labelSuma);

        labelFactorial = new JLabel("Factorial de la sucesion");
        labelFactorial.setBounds(20,320,200,30);
        add(labelFactorial);

        fieldN = new JTextField();
        fieldN.setBounds(185,120,30,30);
        add(fieldN);

        fieldM = new JTextField();
        fieldM.setBounds(250,120,30,30);
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
                strPrimo = "El numero " + M + ", es un numero primo";
            } else {
                strPrimo = "El numero " + M + ", no es un numero primo";
            }
        }
        contador = 0;
        divisor = 1;
    }

    public void  SecuenciaFibonacci(){

        if ((num1 + num2) < N){
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
            aux *= N;
            contador++;
            PotenciaNxM();
        } else {
            BigPotencia = BigPotencia.add(BigInteger.valueOf(aux));
            strPotencia = "" + BigPotencia;
            aux = 1;
            contador = 0;
            BigPotencia = BigInteger.ZERO;
        }
    }

    public void CalcularFactorial(){
        if(contador < N){
           aux *= multiplicador;
           contador++;
           multiplicador++;
           CalcularFactorial();
        } else {
            BigFactorial = BigFactorial.add(BigInteger.valueOf(aux));
            strFactorial = "" + BigFactorial;
            contador = 0;
            multiplicador = 1;
            aux = 1;
            BigFactorial = BigInteger.ZERO;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonCalculate){
            N = Integer.parseInt(fieldN.getText());
            M = Integer.parseInt(fieldM.getText());
            CalcularPrimo();
            SecuenciaFibonacci();
            PotenciaNxM();
            CalcularFactorial();
            areaPrimo.setText(strPrimo);
            areaFibonacci.setText(strFibonacci);
            areaPotencia.setText(strPotencia);
            areaFactorial.setText(strFactorial);

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
            fieldN.setEnabled(true);
            fieldM.setEnabled(true);
        }
    }
}
