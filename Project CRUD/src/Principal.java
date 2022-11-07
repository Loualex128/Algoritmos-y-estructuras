import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal extends JFrame implements ActionListener {

    JButton botonPrueba, btnAgregar, btnGuardar, btnBorrar, btnEditar;
    JTextField fieldNombre, fieldApellido, fieldCedula, fieldNacimiento, fieldTelefono;
    JLabel img, labelNombre, labelApellido, labelCedula, labelNacimiento, labelTelefono, labelTabla;
    JTable table;
    Image img1 = new ImageIcon("assets/gatito.jpeg").getImage();
    ImageIcon img2 = new ImageIcon(img1.getScaledInstance(200,200,Image.SCALE_SMOOTH));
    JPanel panel;


    Connection con;

    public Principal(){
        setLayout(null);
        setTitle("Gatitos");
        setSize(800,630);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        //Imagen
        img = new JLabel();
        img.setBounds(45,20,200,200);
        img.setIcon(img2);
        add(img);

        //Labels
        labelTabla = new JLabel("Tabla de Datos");
        labelTabla.setBounds(430,20,400,30);
        labelTabla.setFont(new Font("Arial",Font.BOLD,28));
        add(labelTabla);

        labelNombre = new JLabel("Nombre:");
        labelNombre.setBounds(20,290,100,30);
        add(labelNombre);

        labelApellido = new JLabel("Apellido:");
        labelApellido.setBounds(20,330,100,30);
        add(labelApellido);

        labelCedula = new JLabel("Cedula:");
        labelCedula.setBounds(20,370, 100,30);
        add(labelCedula);

        labelNacimiento = new JLabel("Nacimiento:");
        labelNacimiento.setBounds(20,410,200,30);
        add(labelNacimiento);

        labelTelefono = new JLabel("Telefono:");
        labelTelefono.setBounds(20,450,100,30);
        add(labelTelefono);

        //TextFields
        fieldNombre = new JTextField();
        fieldNombre.setBounds(120,290,150,30);
        fieldNombre.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent k) {
                int key = k.getKeyChar();
                boolean validarLetra = (key >= 65 && key <= 90) || (key >= 97 && key <= 122) || (key >=164 && key <= 165);
                if (!validarLetra) k.consume();
                if (fieldCedula.getText().trim().length() == 1) k.consume();
            }
        });
        add(fieldNombre);

        fieldApellido = new JTextField();
        fieldApellido.setBounds(120,330,150,30);
        fieldApellido.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent k) {
                int key = k.getKeyChar();
                boolean validarLetra = (key >= 65 && key <= 90) || (key >= 97 && key <= 122) || (key >=164 && key <= 165);
                if (!validarLetra) k.consume();
                if (fieldCedula.getText().trim().length() == 1) k.consume();
            }
        });
        add(fieldApellido);

        fieldCedula = new JTextField();
        fieldCedula.setBounds(120,370,150,30);
        fieldCedula.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent k) {
                int key = k.getKeyChar();
                boolean validarNumero = key >= 48 && key <= 57;
                if (!validarNumero) k.consume();
                if (fieldCedula.getText().trim().length() == 11) k.consume();
            }
        });
        add(fieldCedula);

        fieldNacimiento = new JTextField();
        fieldNacimiento.setBounds(120,410,150,30);
        add(fieldNacimiento);

        fieldTelefono = new JTextField();
        fieldTelefono.setBounds(120,450,150,30);
        fieldTelefono.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent k) {
                int key = k.getKeyChar();
                boolean validarNumero = key >= 48 && key <= 57;
                if (!validarNumero) k.consume();
                if (fieldTelefono.getText().trim().length() == 20) k.consume();
            }
        });
        add(fieldTelefono);

        //Botones
        btnAgregar = new JButton("Agregar Imagen");
        btnAgregar.setBounds(70,230,150,30);
        btnAgregar.addActionListener(this);
        add(btnAgregar);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(35,500,100,30);
        btnGuardar.addActionListener(this);
        add(btnGuardar);

        btnEditar = new JButton("Editar");
        btnEditar.setBounds(155,500,100,30);
        add(btnEditar);

        btnBorrar = new JButton("Eliminar Registro");
        btnBorrar.setBounds(35,540,220,30);
        add(btnBorrar);

        /*botonPrueba = new JButton("Probar base de datos");
        botonPrueba.setBounds(20,500,500,30);
        botonPrueba.addActionListener(this);
        add(botonPrueba);*/

        //Tabla de Base de Datos
        panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        String[] header = {"id","Nombre", "Apellido", "Cedula","Fecha de nacimiento", "Telefono"};
        DefaultTableModel model = new DefaultTableModel(header, 60);
        table = new JTable(model);
        panel.setBounds(310,60,468,510);
        panel.setBorder(null);
        panel.add(new JScrollPane(table));
        add(panel);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        /*if(e.getSource() == botonPrueba){
            connect();
        }*/

        if (e.getSource() == btnGuardar){

            SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
            try
            {
                Date fecha = (Date) formateador.parse(fieldNacimiento.getText());
            }
            catch (ParseException s)
            {
                // Error, la cadena de texto no se puede convertir en fecha.
            }
            String nacimiento = String.valueOf(formateador);

            String nombre = fieldNombre.getText();
            String apellido = fieldApellido.getText();
            String cedula = fieldCedula.getText();
            String telefono = fieldTelefono.getText();

            try{
                Connection con = Conexion.connect();
                PreparedStatement ps = con.prepareStatement("INSERT INTO Informacion(Nombre,Apellido,Cedula,Fecha de Nacimiento, Telefono) VALUES (?,?,?,?,?)");
                ps.setString(1,nombre);
                ps.setString(2,apellido);
                ps.setString(3,cedula);
                ps.setString(4,nacimiento);
                ps.setString(5,telefono);
                System.out.println("Ejecutado");
            } catch (SQLException p){
                JOptionPane.showMessageDialog(null, p.toString());
            }
        }
    }

    public static void main (String[] args){
        Principal frame = new Principal();
        frame.setVisible(true);
    }
}
