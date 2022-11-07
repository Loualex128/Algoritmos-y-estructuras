package Project;

//import Nodo.InterfazNodo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {



    public Principal() {
        initComponents();
        setLocationRelativeTo(null);

    }


    //VARIABLES
    int n;
    int matriz[][] = new int [n][n];
    String matrizshow = "";

    double prom;

    double dp=1;
    double ds;
    String a="";
    String b="";
    double pt;
    String r ="";
    int maxi,mini;

    //Arrays
    ArrayList<Integer> enteros = new ArrayList();
    ArrayList<Integer> MultipliPrin = new ArrayList();
    ArrayList<Integer> PromSec = new ArrayList();
    ArrayList<Integer> Positivo = new ArrayList();


    // MODULO A DESARROLLAR
    public int[][] generarMatriz(int n){


        int matriz[][] =new int [n][n];

        //LLENANDO MATRIZ
        for (int i=0;i<matriz.length;i++){

            matrizshow += "\n\n";

            for(int j=0;j<matriz[i].length;j++){

                matriz[i][j]=(int) (Math.random()*(1801)+-900);


                if(i==j){ //Diagonal principal - producto e invertido

                    MultipliPrin.add(matriz[i][j]);


                    dp = matriz[i][j]*dp;
                    a = " " + dp;


                    //ProductoDP.setText(String.valueOf(MultipliPrin));
                    ProductoDP.setText(String.valueOf(a));

                    //elementos.setText(String.valueOf(a)); //imprimir producto

                    r = a;
                    //invertir ressultado producto e immprimir
                    StringBuilder rv = new StringBuilder(r);
                    r = rv.reverse().toString();
                    invertidoDP.setText(String.valueOf(r));
                }

                if(i+j == matriz.length-1){ //diagonal Secundaria - suma y promedio

                    PromSec.add(matriz[i][j]);
                    ds = (ds + matriz[i][j]);
                    b = " " + ds/n;


                    //promedio.setText(String.valueOf(PromSec));

                    promedio.setText(String.valueOf(b));
                }

                enteros.add(matriz[i][j]); //guardar elementos en array y ordenarlos
                Collections.sort(enteros);

                matrizshow += "  " + matriz[i][j]; //mostrar matriz


            } //Fin del desarrollo de la matriz


            int f = 0;
            int k = enteros.size();

            for (int x = 1; x < k; x++) { //Guardar los enteros positivos en array

                if (enteros.get(x) >= f) {

                    int p = enteros.get(x);
                    Positivo.add(p);
                }
            }

            //Evitar que los elementos se repitan
            Set<Integer> hashSet = new HashSet<Integer>(Positivo);
            Positivo.clear();
            Positivo.addAll(hashSet);


            //Hallar el mayor y el menor del array
            int v = Positivo.size();
            int mini = Positivo.get(0);
            int maxi = Positivo.get(0);

            for (int y = 1; y<v; y++) {

                if (Positivo.get(y)>maxi) {
                    maxi  =  Positivo.get(y);
                }

                if (Positivo.get(y)<mini) {
                    mini = Positivo.get(y);
                }
            }

            //PONTENCIA DEL MAX ELEVADO AL MIN POSITIVO

            pt = Math.pow(maxi, mini);
            potencia.setText(String.valueOf(maxi+" a la "+mini+" = "+ pt));
        }

        return matriz;

    }
    public void Clean()  {

        matriz = null;
        //Limpiar arrays
        enteros.clear();
        MultipliPrin.clear();
        PromSec.clear();
        Positivo.clear();

        //Limpiar cajas de texxto
        matriz_lugar.setText(String.valueOf(""));
        elementos.setText(String.valueOf(""));
        potencia.setText(String.valueOf(""));
        promedio.setText(String.valueOf(""));
        elementos.setText(String.valueOf(""));
        invertidoDP.setText(String.valueOf(""));
        ProductoDP.setText(String.valueOf(""));
        texto.setText(String.valueOf(""));

        //Limpiar valiables
        a="";
        b="";
        r = "";
        pt=0;
        n = 0;
        matrizshow="";
        dp = 1;
        ds = 0;
        maxi=0;
        mini =0;


    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Proyecto1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        matriz_lugar = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        elementos = new javax.swing.JTextField();
        borrar = new javax.swing.JButton();
        iniciar = new javax.swing.JButton();
        texto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ProductoDP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        invertidoDP = new javax.swing.JTextField();
        promedio = new javax.swing.JTextField();
        potencia = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        respuesta1 = new javax.swing.JTextField();
        txtn = new javax.swing.JTextField();
        respuesta2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        respuesta3 = new javax.swing.JTextField();
        txtm = new javax.swing.JTextField();
        respuesta4 = new javax.swing.JTextField();
        inicio = new javax.swing.JButton();
        respuesta5 = new javax.swing.JTextField();
        reiniciar = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txmenormayor = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txmayormenor = new javax.swing.JList<>();
        mayorMenor = new javax.swing.JButton();
        menorMayor = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaSC = new javax.swing.JList<>();
        borrar_nodo = new javax.swing.JButton();
        texto3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        boton_agregar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        texto1 = new javax.swing.JTextField();
        texto2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Algoritmos y Estructuras");

        javax.swing.GroupLayout Proyecto1Layout = new javax.swing.GroupLayout(Proyecto1);
        Proyecto1.setLayout(Proyecto1Layout);
        Proyecto1Layout.setHorizontalGroup(
                Proyecto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Proyecto1Layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(210, Short.MAX_VALUE))
        );
        Proyecto1Layout.setVerticalGroup(
                Proyecto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Proyecto1Layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(jLabel1)
                                .addContainerGap(303, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("HOME", Proyecto1);

        matriz_lugar.setColumns(20);
        matriz_lugar.setRows(5);
        jScrollPane2.setViewportView(matriz_lugar);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("Elementos en vector de menor a mayor");

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        iniciar.setText("iniciar");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoActionPerformed(evt);
            }
        });

        jLabel3.setText("Matriz Aleatoria NxN (1~99): ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setText("Multiplicacion de la Diagonal Project.Principal");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setText("Resultado Invertido del producto de la Diago. P");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setText("Promedio de la suma de la Diago. Secundaria");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText("Potencia del elemento Mayor al menor positivo");

        invertidoDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invertidoDPActionPerformed(evt);
            }
        });

        promedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promedioActionPerformed(evt);
            }
        });

        potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(iniciar)
                                                .addGap(18, 18, 18)
                                                .addComponent(borrar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel4)
                                        .addComponent(elementos, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(ProductoDP, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(invertidoDP, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(594, 594, 594))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(elementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(ProductoDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(invertidoDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(promedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(potencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(iniciar)
                                                        .addComponent(borrar))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(201, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PROYECTO 1", jPanel2);

        jLabel9.setText("3) Potencia de N^M");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Operaciones con 2  numeros:");

        jLabel10.setText("4) Suma de los digitos del valor de NxM");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("Ingrese numeros del 1 al 99:");

        jLabel12.setText("5) Factorial de N:");

        jLabel13.setText("Variable N:");

        respuesta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuesta1ActionPerformed(evt);
            }
        });

        txtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnActionPerformed(evt);
            }
        });

        respuesta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuesta2ActionPerformed(evt);
            }
        });

        jLabel14.setText("Variable M:");

        respuesta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuesta3ActionPerformed(evt);
            }
        });

        txtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmActionPerformed(evt);
            }
        });

        respuesta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuesta4ActionPerformed(evt);
            }
        });

        inicio.setText("iniciar");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        respuesta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuesta5ActionPerformed(evt);
            }
        });

        reiniciar.setText("reiniciar");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });

        jLabel15.setText(" 1) N es un número primo:");

        jLabel16.setText("2) Serie de Fibonacci de NxM:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(182, 182, 182)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(inicio)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(reiniciar))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING))
                                                                .addGap(26, 26, 26)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(124, 124, 124)
                                                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(respuesta1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(respuesta2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jLabel9)
                                                        .addComponent(respuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(52, 52, 52)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(respuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel12)
                                                        .addComponent(respuesta5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel8)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addComponent(jLabel13)
                                                                .addGap(14, 14, 14)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel14)
                                                                        .addComponent(txtm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(17, 17, 17)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(inicio)
                                                        .addComponent(reiniciar))))
                                .addGap(82, 82, 82)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(respuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel16)
                                                .addGap(12, 12, 12)
                                                .addComponent(respuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(12, 12, 12)
                                                .addComponent(respuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(respuesta5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(respuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PROYECTO 2", jPanel3);

        jScrollPane1.setViewportView(txmenormayor);

        jScrollPane3.setViewportView(txmayormenor);

        mayorMenor.setText("ordenar");
        mayorMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayorMenorActionPerformed(evt);
            }
        });

        menorMayor.setText("ordenar");
        menorMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menorMayorActionPerformed(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Lista ordenada de menor a mayor:");

        Buscar.setText("buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(listaSC);

        borrar_nodo.setText("borrar");
        borrar_nodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar_nodoActionPerformed(evt);
            }
        });

        texto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto3ActionPerformed(evt);
            }
        });

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Elemento:");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Obtener elemento por su posicion y borrar:");

        boton_agregar.setText("agregar");
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("lista:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Ingrese uno por uno los elementos de la lista:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Operaciones con listas ");

        texto1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Posición:");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Lista ordenada de mayor a menor:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(Buscar))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(menorMayor)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(171, 171, 171)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(mayorMenor)))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton_agregar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel22)
                                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(33, 33, 33)
                                                                .addComponent(borrar_nodo)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel21)
                                .addGap(17, 17, 17)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(borrar_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(boton_agregar)
                                                                        .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel19)
                                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(5, 5, 5))
                                                                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(texto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(7, 7, 7)))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(menorMayor)
                                        .addComponent(mayorMenor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(113, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PROYECTO 3", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        Clean();
        iniciar.setEnabled(true); //habilita texto y boton enter
        texto.setEnabled(true);
        borrar.setEnabled(false);//deshabilitar boton borrar


    }//GEN-LAST:event_borrarActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        int n2 = Integer.parseInt(texto.getText()); //dimensión de la matriz

        iniciar.setEnabled(false); //inhabilitar campo de texto y boton de entrada
        texto.setEnabled(false);
        borrar.setEnabled(true);//habilitar botón de borrar

        if (0<n2 && n2<10) { //validando campo de texto

            int matriz[][] = new int [n2][n2];

            //matriz = this.generarMatriz(n); //ejecución del programa

            generarMatriz(n2);

            matriz_lugar.setText(String.valueOf(matrizshow));
            elementos.setText(String.valueOf(enteros));

        }
        else {
            matriz_lugar.setText(String.valueOf("Numero entre 1 y 9"));

        }
    }//GEN-LAST:event_iniciarActionPerformed

    private void invertidoDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invertidoDPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invertidoDPActionPerformed

    private void promedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promedioActionPerformed

    private void potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_potenciaActionPerformed

    private void respuesta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuesta1ActionPerformed

    }//GEN-LAST:event_respuesta1ActionPerformed

    private void txtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnActionPerformed

    private void respuesta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuesta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuesta2ActionPerformed

    private void respuesta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuesta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuesta3ActionPerformed

    private void txtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmActionPerformed

    private void respuesta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuesta4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuesta4ActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed

        String dato1 = txtn.getText();
        String dato2 = txtm.getText();
        int n1 = Integer.parseInt(dato1);
        int m = Integer.parseInt(dato2);

        if(n1>=1 && n1<=99){
            if(m>=1 && m<=99){

                txtn.setEnabled(false);
                txtm.setEnabled(false);
                inicio.setEnabled(false);
                boolean s = operaciones.numeroPrimo(n1,2);
                if (s==true){
                    respuesta1.setText(dato1 + " es un numero primo");
                }
                else{
                    respuesta1.setText(dato1 + " no es un numero primo");
                }
                int i=0;
                respuesta2.setText(operaciones.mostrarFib(n1*m, i));

                String pot = Integer.toString((int) operaciones.potencia(n1,m));
                respuesta3.setText("N^M = " + pot);

                String suma = Integer.toString((int) operaciones.sumaDigitos(n1*m));
                respuesta4.setText(suma);

                String fact = Integer.toString((int) operaciones.factorial(n1));
                respuesta5.setText(fact);

            }
            else{
                error.setText("introduzca un valor entre 1 y 99");
            }
        }
        else{
            error.setText("introduzca un valor entre 1 y 99");
        }
    }//GEN-LAST:event_inicioActionPerformed

    private void respuesta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuesta5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuesta5ActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed

        txtn.setEnabled(true);
        txtm.setEnabled(true);
        inicio.setEnabled(true);
        txtn.setText("");
        txtm.setText("");
        respuesta1.setText("");
        respuesta2.setText("");
        respuesta3.setText("");
        respuesta4.setText("");
        respuesta5.setText("");
    }//GEN-LAST:event_reiniciarActionPerformed

    private void textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoActionPerformed

    private void mayorMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayorMenorActionPerformed
        actualizar3();
        actualizar();
        actualizar3();

    }//GEN-LAST:event_mayorMenorActionPerformed

    private void menorMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menorMayorActionPerformed
        actualizar2();
        actualizar();
        actualizar3();

    }//GEN-LAST:event_menorMayorActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        int a;
        String dato2 = texto2.getText();
        int m = Integer.parseInt(dato2);
        a=obtener(m);
        texto3.setText(" " + a);

    }//GEN-LAST:event_BuscarActionPerformed

    private void borrar_nodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar_nodoActionPerformed
        String dato2 = texto2.getText();
        int m = Integer.parseInt(dato2);
        eliminarNodo(m);
        texto3.setText("");
        actualizar();
        actualizar2();
        actualizar3();

    }//GEN-LAST:event_borrar_nodoActionPerformed

    private void texto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto3ActionPerformed

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed

        String dato1 = texto1.getText();
        int n = Integer.parseInt(dato1);
        insertarFinal(n);
        /*       Nodo k = new Nodo(n);
        if(cabeza==null){
            cabeza=k;
        }else{
            Nodo q = cabeza;
            while(q.siguiente!=null){
                q=q.siguiente;
            }
            q.siguiente=k;
        }*/actualizar();
        actualizar2();
        actualizar3();

    }//GEN-LAST:event_boton_agregarActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);

            }
        });
    }
    Nodo cabeza=null;
    int longitud=0;

    public class Nodo{
        public int x;
        public Nodo siguiente=null;

        public Nodo(int x){
            this.x=x;
        }
    }
    int cont=0;
    public  void insertarFinal(int x){
        Nodo nodo = new Nodo(x);


        if(cabeza==null){
            cabeza=nodo;
            cont++;
        }else{
            Nodo puntero = cabeza;
            while(puntero.siguiente!=null){
                puntero=puntero.siguiente;
            }
            puntero.siguiente=nodo;
        }
        longitud++;
    }
    public int obtener(int n){
        if(cabeza==null){
            return 0;
        } else{
            Nodo puntero=cabeza;
            int contador=0;
            while(contador<n && puntero.siguiente !=null){
                puntero=puntero.siguiente;
                contador++;

            }
            if(contador!=n){
                return 0;
            }else{
                return puntero.x;
            }

        }

    }
    public void eliminarNodo(int n){
        if(cabeza!=null){
            cont--;
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente;
            primer.siguiente=null;
            longitud--;
        }else if(n<longitud){
            Nodo puntero = cabeza;
            int contador = 0;
            while(contador<(n-1)){
                puntero=puntero.siguiente;
                contador++;
            }
            Nodo temp= puntero.siguiente;
            puntero.siguiente=temp.siguiente;
            temp.siguiente=null;
            longitud--;
        }
    }
    public void ordenar(){
        int aux;
        if(cabeza!=null){
            if(cabeza.siguiente!=null){
                Nodo anterior=cabeza;
                Nodo proximo=cabeza.siguiente;
                while(proximo!=null){
                    if(anterior.x>proximo.x){
                        aux=proximo.x;
                        proximo.x=anterior.x;
                        anterior.x=aux;
                        if(proximo==cabeza.siguiente){
                            anterior=proximo;
                            proximo=proximo.siguiente;
                        }else{
                            anterior=cabeza;
                            proximo=cabeza.siguiente;
                        }
                    }else{
                        anterior=proximo;
                        proximo=proximo.siguiente;
                    }
                }
            }
        }

    }
    public void ordenar2(){
        int aux;
        if(cabeza!=null){
            if(cabeza.siguiente!=null){
                Nodo anterior=cabeza;
                Nodo proximo=cabeza.siguiente;
                while(anterior!=null){
                    if(anterior.x<proximo.x && cont >= 2){
                        aux=proximo.x;
                        proximo.x=anterior.x;
                        anterior.x=aux;
                        if(proximo==cabeza.siguiente){
                            anterior=proximo;
                            proximo=proximo.siguiente;
                        }else{
                            anterior=proximo;
                            proximo=proximo.siguiente;
                        }
                    }else{
                        anterior=proximo;
                        proximo=proximo.siguiente;
                    }

                }
            }

        }

    }
    public void actualizar(){
        DefaultListModel model =new DefaultListModel();
        Nodo q=cabeza;
        while(q!=null){
            model.addElement(q.x);
            q=q.siguiente;
        }
        listaSC.setModel(model);
    }
    public void actualizar2(){
        ordenar();
        DefaultListModel model =new DefaultListModel();
        Nodo q=cabeza;
        while(q!=null){
            model.addElement(q.x);
            q=q.siguiente;
        }
        txmenormayor.setModel(model);
    }
    public void actualizar3(){

        if(cont>=2){ordenar2();}
        DefaultListModel model =new DefaultListModel();
        Nodo q=cabeza;
        while(q!=null){
            model.addElement(q.x);
            q=q.siguiente;
        }
        txmayormenor.setModel(model);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField ProductoDP;
    private javax.swing.JPanel Proyecto1;
    private javax.swing.JButton borrar;
    private javax.swing.JButton borrar_nodo;
    private javax.swing.JButton boton_agregar;
    private javax.swing.JTextField elementos;
    private javax.swing.JLabel error;
    private javax.swing.JButton iniciar;
    private javax.swing.JButton inicio;
    private javax.swing.JTextField invertidoDP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> listaSC;
    private javax.swing.JTextArea matriz_lugar;
    private javax.swing.JButton mayorMenor;
    private javax.swing.JButton menorMayor;
    private javax.swing.JTextField potencia;
    private javax.swing.JTextField promedio;
    private javax.swing.JButton reiniciar;
    private javax.swing.JTextField respuesta1;
    private javax.swing.JTextField respuesta2;
    private javax.swing.JTextField respuesta3;
    private javax.swing.JTextField respuesta4;
    private javax.swing.JTextField respuesta5;
    private javax.swing.JTextField texto;
    private javax.swing.JTextField texto1;
    private javax.swing.JTextField texto2;
    private javax.swing.JTextField texto3;
    private javax.swing.JList<String> txmayormenor;
    private javax.swing.JList<String> txmenormayor;
    private javax.swing.JTextField txtm;
    private javax.swing.JTextField txtn;
    // End of variables declaration//GEN-END:variables
}