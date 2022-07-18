import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame implements ActionListener {

    JLabel labelWelcome, labelDatos, labelN, labelM, labelPrimo, labelFibonacci, labelPotencia,
            labelSuma, labelFactorial;
    JTextField fieldN, fieldM;
    JTextArea areaPrimo, areaFibonacci, areaPotencia, areaSuma, areaFactorial;
    JButton buttonCalculate, buttonClear;
    public Principal(){
        setLayout(null);
        setSize(400, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        labelWelcome = new JLabel("Bienvenido!");
        labelWelcome.setBounds(20,20,300, 30);
        labelWelcome.setFont(new Font("Andale mono", 1, 24));
        add(labelWelcome);

        labelDatos = new JLabel("Introduce el valor de");
        labelDatos.setBounds(20,120,200,30);
        add(labelDatos);

        labelN = new JLabel("N");
        labelN.setBounds(170,120,100,30);
        add(labelN);

        labelM = new JLabel("y M");
        labelM.setBounds(210,120,50, 30);
        add(labelM);

        labelPrimo = new JLabel("¿M es un nùmero primo?");
        labelPrimo.setBounds(20,160,200,30);
        add(labelPrimo);
        
    }

    public static void main(String[] args){
        Principal frame = new Principal();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
