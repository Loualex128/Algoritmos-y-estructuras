import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame implements ActionListener {

    JLabel labelWelcome, labelDatos, labelN, labelM, labelPrimo, labelFibonacci, labelPotencia,
            labelSuma, labelFactorial;
    JTextField fieldN, fieldM;
    JTextArea areaPrimo, areaFibonacci, areaPotencia, areaSuma, areaFactorial;
    JScrollPane scrollPrimo, scrollFibonacci, scrollPotencia, scrollSuma, scrollFactorial;
    JButton buttonCalculate, buttonClear;
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
        add(buttonCalculate);

        buttonClear = new JButton("Limpiar");
        buttonClear.setBounds(240,380,100,30);
        add(buttonClear);
    }

    public static void main(String[] args){
        Principal frame = new Principal();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonCalculate){

            fieldN.setEnabled(false);
            fieldM.setEnabled(false);
        }

        if(e.getSource() == buttonClear){
            fieldN.setText("");
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
