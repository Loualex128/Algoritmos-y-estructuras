package ListaEntrelazada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Principal extends JFrame implements ActionListener {

    JButton buttonEliminar, buttonAgregar, buttonSeleccionar, buttonOrdenMayor, buttonOrdenMenor;
    JLabel labelBienvenida, labelAgregar, labelPosicion, labelOrdenar;
    JTextField fieldAgregar,fieldPosicion;
    JScrollPane scrollAgregar, scrollEliminar, scrollSeleccionar;

    public Principal(){
        setLayout(null);
        setSize(550, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(0, 255, 255));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        labelBienvenida = new JLabel("Lista entrelazada");
        labelBienvenida.setFont(new Font("Andale mono", 1, 38));
        labelBienvenida.setBounds(80,20,800,30);
        add(labelBienvenida);

        labelAgregar = new JLabel("Escriba el numero que desee agregar:");
        labelAgregar.setBounds(20,70,280,30);
        add(labelAgregar);

        labelPosicion = new JLabel("Posicion del nodo en la lista");
        labelPosicion.setBounds(60,120,280,30);
        add(labelPosicion);

        labelOrdenar = new JLabel("Ordenar Nodos de forma");
        labelOrdenar.setBounds(340,120,250,30);
        add(labelOrdenar);

        buttonAgregar = new JButton("Agregar");
        buttonAgregar.setBounds(360,70,100,30);
        buttonAgregar.addActionListener(this);
        add(buttonAgregar);

        buttonEliminar = new JButton("Eliminar Nodo");
        buttonEliminar.setBounds(20,200,130,30);
        buttonEliminar.setMargin(new Insets(0,0,0,0));
        buttonEliminar.addActionListener(this);
        add(buttonEliminar);

        buttonSeleccionar = new JButton("Seleccionar Nodo");
        buttonSeleccionar.setBounds(170,200,130,30);
        buttonSeleccionar.setMargin(new Insets(0,0,0,0));
        buttonSeleccionar.addActionListener(this);
        add(buttonSeleccionar);

        buttonOrdenMayor = new JButton("Ascendente");
        buttonOrdenMayor.setBounds(370, 160, 100,30);
        buttonOrdenMayor.setMargin(new Insets(0,0,0,0));
        buttonOrdenMayor.addActionListener(this);
        add(buttonOrdenMayor);

        buttonOrdenMenor = new JButton("Descendente");
        buttonOrdenMenor.setBounds(370,200,100,30);
        buttonOrdenMenor.setMargin(new Insets(0,0,0,0));
        buttonOrdenMenor.addActionListener(this);
        add(buttonOrdenMenor);

        fieldAgregar = new JTextField();
        fieldAgregar.setBounds(295,70,50,30);
        fieldAgregar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent k) {
                int key = k.getKeyChar();
                boolean validarNumero = key >= 48 && key <= 57;
                if (!validarNumero) k.consume();
                if (fieldAgregar.getText().trim().length() == 3) k.consume();
            }
        });
        add(fieldAgregar);

        fieldPosicion = new JTextField();
        fieldPosicion.setBounds(135,160,50,30);
        fieldPosicion.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent k) {
                int key = k.getKeyChar();
                boolean validarNumero = key >= 48 && key <= 57;
                if (!validarNumero) k.consume();
                if (fieldPosicion.getText().trim().length() == 2) k.consume();
            }
        });
        add(fieldPosicion);

    }



    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    public static void main(String[] args){
        Principal frame = new Principal();
        frame.setVisible(true);
    }
}
