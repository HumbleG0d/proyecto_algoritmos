package Ventanas;

import Clases.DatosGraficos;
import Clases.PintanrDibujos;
import Clases.AlgoritmoDijkstra;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;


public class Inicio extends javax.swing.JFrame {

  private int Numerotope = 0;//Numero de nodos 

  DatosGraficos arboles = new DatosGraficos();

  public static void PintarFiguras(int tope, DatosGraficos arboles) {//pinta lo q esta antes en el panel 
    for (int j = 0; j < tope; j++) {
      for (int k = 0; k < tope; k++) {
        if (arboles.getmAdyacencia(j, k) == 1) {
          PintanrDibujos.pinta_Linea(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
        }
      }
    }
    for (int j = 0; j < tope; j++) {
      PintanrDibujos.pinta_Circulo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getNombre(j));
    }

  }

  public Inicio() {
    initComponents();
    EleccionDestino.setEnabled(false);
    EleccionOrigen.setEnabled(false);
    BuscarCamino.setEnabled(false);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    MostrarCaminos = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    colorOrigen = new javax.swing.JLabel();
    txtColorOrigen = new javax.swing.JLabel();
    colorDestino = new javax.swing.JLabel();
    txtColorDestino = new javax.swing.JLabel();
    colorNodoVisitado = new javax.swing.JLabel();
    txtColorNodoRecorrido = new javax.swing.JLabel();
    BotonSalir = new javax.swing.JButton();
    ImgMapa = new javax.swing.JLabel();
    EleccionDestino = new javax.swing.JComboBox<>();
    BuscarCamino = new javax.swing.JButton();
    EleccionOrigen = new javax.swing.JComboBox<>();
    jScrollPane1 = new javax.swing.JScrollPane();
    txtKMAcumulados = new javax.swing.JTextArea();
    txtDestino = new javax.swing.JLabel();
    kmRecorridos = new javax.swing.JLabel();
    txtOrigen = new javax.swing.JLabel();
    kmRecorridos1 = new javax.swing.JLabel();
    LateralSuperior = new javax.swing.JLabel();
    LateralSuperior1 = new javax.swing.JLabel();
    LateralSuperior2 = new javax.swing.JLabel();
    kmRecorridos2 = new javax.swing.JLabel();
    Fondo = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(255, 102, 102));
    setUndecorated(true);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    MostrarCaminos.setBackground(new java.awt.Color(255, 255, 204));
    MostrarCaminos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    MostrarCaminos.setForeground(new java.awt.Color(0, 0, 204));
    MostrarCaminos.setText("Mostrar Caminos");
    MostrarCaminos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        MostrarCaminosActionPerformed(evt);
      }
    });
    getContentPane().add(MostrarCaminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 220, 50));

    jPanel1.setBackground(new java.awt.Color(255, 102, 102));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    colorOrigen.setBackground(new java.awt.Color(255, 0, 0));
    colorOrigen.setOpaque(true);
    jPanel1.add(colorOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, 20, 20));

    txtColorOrigen.setBackground(new java.awt.Color(255, 255, 102));
    txtColorOrigen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    txtColorOrigen.setForeground(new java.awt.Color(51, 0, 204));
    txtColorOrigen.setText("Origen--------------->");
    txtColorOrigen.setOpaque(true);
    jPanel1.add(txtColorOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 160, 40));

    colorDestino.setBackground(new java.awt.Color(51, 255, 51));
    colorDestino.setOpaque(true);
    jPanel1.add(colorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 20, 20));

    txtColorDestino.setBackground(new java.awt.Color(255, 255, 102));
    txtColorDestino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    txtColorDestino.setForeground(new java.awt.Color(51, 0, 204));
    txtColorDestino.setText("Destino-------------->");
    txtColorDestino.setOpaque(true);
    jPanel1.add(txtColorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 160, 30));

    colorNodoVisitado.setBackground(new java.awt.Color(0, 51, 255));
    colorNodoVisitado.setOpaque(true);
    jPanel1.add(colorNodoVisitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 20, 20));

    txtColorNodoRecorrido.setBackground(new java.awt.Color(255, 255, 102));
    txtColorNodoRecorrido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    txtColorNodoRecorrido.setForeground(new java.awt.Color(51, 0, 204));
    txtColorNodoRecorrido.setText("Nodo Recorrido ---->");
    txtColorNodoRecorrido.setOpaque(true);
    jPanel1.add(txtColorNodoRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 160, 40));

    BotonSalir.setBackground(new java.awt.Color(255, 51, 51));
    BotonSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
    BotonSalir.setText("X");
    BotonSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BotonSalirActionPerformed(evt);
      }
    });
    jPanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 50, 50));

    ImgMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de pantalla 2023-11-29 145649.png"))); // NOI18N
    jPanel1.add(ImgMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -20, 560, 960));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 850, 980));

    EleccionDestino.setBackground(new java.awt.Color(0, 153, 51));
    EleccionDestino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    EleccionDestino.setForeground(new java.awt.Color(0, 0, 153));
    EleccionDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puerta 6", "Puerta 5", "Puerta 3" }));
    EleccionDestino.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        EleccionDestinoActionPerformed(evt);
      }
    });
    getContentPane().add(EleccionDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 460, 50));

    BuscarCamino.setBackground(new java.awt.Color(0, 153, 51));
    BuscarCamino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    BuscarCamino.setForeground(new java.awt.Color(51, 0, 204));
    BuscarCamino.setText("Buscar Camino mas corto");
    BuscarCamino.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BuscarCaminoActionPerformed(evt);
      }
    });
    getContentPane().add(BuscarCamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 300, 60));

    EleccionOrigen.setBackground(new java.awt.Color(0, 153, 51));
    EleccionOrigen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    EleccionOrigen.setForeground(new java.awt.Color(0, 0, 153));
    EleccionOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CiberSecUNI", "FIIS", "Sistemas UNI", "CTIC", "FIEE", "FC", "Estadio UNI", "Centro Medico", "FIEECS", "FIGMM", "CFT", "FIC", "FAUA", "INFAUA", "CEPS", "Teatro UNI", "FIA", "Lab FIM", "FIM" }));
    EleccionOrigen.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        EleccionOrigenActionPerformed(evt);
      }
    });
    getContentPane().add(EleccionOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 460, 50));

    txtKMAcumulados.setColumns(20);
    txtKMAcumulados.setRows(5);
    jScrollPane1.setViewportView(txtKMAcumulados);

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 510, 70));

    txtDestino.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    txtDestino.setForeground(new java.awt.Color(255, 255, 255));
    txtDestino.setText("Selecciona el destino:");
    getContentPane().add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 280, 40));

    kmRecorridos.setBackground(new java.awt.Color(255, 102, 102));
    kmRecorridos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    kmRecorridos.setForeground(new java.awt.Color(0, 0, 153));
    kmRecorridos.setOpaque(true);
    getContentPane().add(kmRecorridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 390, 40));

    txtOrigen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    txtOrigen.setForeground(new java.awt.Color(255, 255, 255));
    txtOrigen.setText("Selecciona el origen:");
    getContentPane().add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 300, 40));

    kmRecorridos1.setBackground(new java.awt.Color(255, 102, 102));
    kmRecorridos1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    kmRecorridos1.setForeground(new java.awt.Color(0, 0, 153));
    kmRecorridos1.setOpaque(true);
    getContentPane().add(kmRecorridos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 140, 40));

    LateralSuperior.setBackground(new java.awt.Color(255, 102, 102));
    LateralSuperior.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    LateralSuperior.setForeground(new java.awt.Color(0, 0, 153));
    LateralSuperior.setOpaque(true);
    getContentPane().add(LateralSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 730));

    LateralSuperior1.setBackground(new java.awt.Color(255, 102, 102));
    LateralSuperior1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    LateralSuperior1.setForeground(new java.awt.Color(0, 0, 153));
    LateralSuperior1.setOpaque(true);
    getContentPane().add(LateralSuperior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, 510, 280));

    LateralSuperior2.setBackground(new java.awt.Color(255, 102, 102));
    LateralSuperior2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    LateralSuperior2.setForeground(new java.awt.Color(0, 0, 153));
    LateralSuperior2.setText("                            Bienvenido al sistema");
    LateralSuperior2.setOpaque(true);
    getContentPane().add(LateralSuperior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 530, 30));

    kmRecorridos2.setBackground(new java.awt.Color(255, 102, 102));
    kmRecorridos2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    kmRecorridos2.setForeground(new java.awt.Color(0, 0, 153));
    kmRecorridos2.setText("                         Metros recorridos:");
    kmRecorridos2.setOpaque(true);
    getContentPane().add(kmRecorridos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 510, 30));

    Fondo.setBackground(new java.awt.Color(255, 102, 102));
    Fondo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    Fondo.setOpaque(true);
    getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 730));

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void MostrarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCaminosActionPerformed
      //jMenuItem2.setEnabled(false);
      EleccionOrigen.setEnabled(true);
      MostrarCaminos.setEnabled(false);
      MostrarCaminos.setVisible(false);
      txtKMAcumulados.setEnabled(false);

      jPanel1.paint(jPanel1.getGraphics());

      int Matriz[][] = {
        {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0}
      };

      double coe[][] = {
        {0, 117, 180, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {117, 0, 75, 131, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {180, 75, 0, 72, 91, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 131, 72, 0, 86, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 91, 86, 0, 109, 127, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 109, 0, 174, 214, 207, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 127, 174, 0, 78, 160, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 214, 78, 0, 97, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 207, 160, 97, 0, 111, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 111, 0, 88, 0, 0, 188, 256, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 88, 0, 0, 0, 184, 260, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 141, 140, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 141, 0, 182, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 188, 184, 140, 182, 0, 177, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 256, 260, 0, 0, 177, 0, 51, 138, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 51, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 138, 0, 0, 62, 155, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 62, 0, 140, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 155, 140, 0, 233, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 233, 0, 164, 146},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 164, 0, 76},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 146, 76, 0}
      };

      //*
      int xx1[] = {50, 100, 135, 194, 177, 244, 100, 80, 138, 208, 274, 364, 424, 274, 140, 158, 178, 210, 300, 350, 440, 470, 400};
      int yy1[] = {10, 20, 60, 48, 122, 180, 180, 240, 300, 370, 365, 435, 485, 510, 578, 615, 680, 715, 640, 830, 740, 800, 400};
      String nom[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22"};

      for (int j = 0; j < 22; j++) {
        arboles.setCordeX(j, xx1[j]);
        arboles.setCordeY(j, yy1[j]);
        arboles.setNombre(j, nom[j]);

      }
      for (int j = 0; j < 22; j++) {
        for (int k = 0; k < 22; k++) {
          arboles.setmAdyacencia(j, k, Matriz[j][k]);
          arboles.setmCoeficiente(j, k, coe[j][k]);
        }
      }
      Numerotope = 22;
      PintarFiguras(Numerotope, arboles);
    }//GEN-LAST:event_MostrarCaminosActionPerformed

    private void EleccionDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionDestinoActionPerformed
      BuscarCamino.setEnabled(true);
    }//GEN-LAST:event_EleccionDestinoActionPerformed

    private void EleccionOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionOrigenActionPerformed
      EleccionDestino.setEnabled(true);
    }//GEN-LAST:event_EleccionOrigenActionPerformed

    private void BuscarCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCaminoActionPerformed
      int origen = 0, destino = 0;
      String nombreOrigen, nombreDestino;
      nombreOrigen = (String) EleccionOrigen.getSelectedItem();
      nombreDestino = (String) EleccionDestino.getSelectedItem();

      if ("Puerta 6".equals(nombreOrigen)) {
        origen = 0;
      }
      if ("CiberSecUNI".equals(nombreOrigen)) {
        origen = 1;
      }
      if ("Sistemas UNI".equals(nombreOrigen)) {
        origen = 2;
      }
      if ("FIIS".equals(nombreOrigen)) {
        origen = 3;
      }
      if ("CTIC".equals(nombreOrigen)) {
        origen = 4;
      }
      if ("FIEE".equals(nombreOrigen)) {
        origen = 5;
      }
      if ("FC".equals(nombreOrigen)) {
        origen = 6;
      }
      if ("Puerta 5".equals(nombreOrigen)) {
        origen = 7;
      }
      if ("Estadio UNI".equals(nombreOrigen)) {
        origen = 8;
      }
      if ("Centro Medico".equals(nombreOrigen)) {
        origen = 9;
      }
      if ("FIEECS".equals(nombreOrigen)) {
        origen = 10;
      }
      if ("FIGMM".equals(nombreOrigen)) {
        origen = 11;
      }
      if ("CFT".equals(nombreOrigen)) {
        origen = 12;
      }
      if ("FIC".equals(nombreOrigen)) {
        origen = 13;
      }
      if ("FAUA".equals(nombreOrigen)) {
        origen = 14;
      }
      if ("INFAUA".equals(nombreOrigen)) {
        origen = 15;
      }
      if ("CEPS".equals(nombreOrigen)) {
        origen = 16;
      }
      if ("Teatro UNI".equals(nombreOrigen)) {
        origen = 17;
      }
      if ("FIA".equals(nombreOrigen)) {
        origen = 18;
      }
      if ("Puerta 3".equals(nombreOrigen)) {
        origen = 19;
      }
      if ("Lab FIM".equals(nombreOrigen)) {
        origen = 20;
      }
      if ("FIM".equals(nombreOrigen)) {
        origen = 21;
      }

      if ("Puerta 6".equals(nombreDestino)) {
        destino = 0;
      }
      if ("CiberSecUNI".equals(nombreDestino)) {
        destino = 1;
      }
      if ("Sistemas UNI".equals(nombreDestino)) {
        destino = 2;
      }
      if ("FIIS".equals(nombreDestino)) {
        destino = 3;
      }
      if ("CTIC".equals(nombreDestino)) {
        destino = 4;
      }
      if ("FIEE".equals(nombreDestino)) {
        destino = 5;
      }
      if ("FC".equals(nombreDestino)) {
        destino = 6;
      }
      if ("Puerta 5".equals(nombreDestino)) {
        destino = 7;
      }
      if ("Estadio UNI".equals(nombreDestino)) {
        destino = 8;
      }
      if ("Centro Medico".equals(nombreDestino)) {
        destino = 9;
      }
      if ("FIEECS".equals(nombreDestino)) {
        destino = 10;
      }
      if ("FIGMM".equals(nombreDestino)) {
        destino = 11;
      }
      if ("CFT".equals(nombreDestino)) {
        destino = 12;
      }
      if ("FIC".equals(nombreDestino)) {
        destino = 13;
      }
      if ("FAUA".equals(nombreDestino)) {
        destino = 14;
      }
      if ("INFAUA".equals(nombreDestino)) {
        destino = 15;
      }
      if ("CEPS".equals(nombreDestino)) {
        destino = 16;
      }
      if ("Teatro UNI".equals(nombreDestino)) {
        destino = 17;
      }
      if ("FIA".equals(nombreDestino)) {
        destino = 18;
      }
      if ("Puerta 3".equals(nombreDestino)) {
        destino = 19;
      }
      if ("Lab FIM".equals(nombreDestino)) {
        destino = 20;
      }
      if ("FIM".equals(nombreDestino)) {
        destino = 21;
      }

      if (origen == destino) {
        Font fuente = new Font("Arial", Font.BOLD, 18);
        txtKMAcumulados.setFont(fuente);
        JOptionPane.showMessageDialog(null, "Estas en:" + nombreOrigen);
        txtKMAcumulados.setText("Intenta de nuevo!!");
        txtKMAcumulados.setEnabled(false);
        txtKMAcumulados.setForeground(Color.RED);

      } else {
        AlgoritmoDijkstra Dijkstra = new AlgoritmoDijkstra(arboles, Numerotope, origen, destino);
        Dijkstra.dijkstra();

        Font fuente = new Font("Arial", Font.BOLD, 18);
        txtKMAcumulados.setFont(fuente);
        txtKMAcumulados.setText("Camino encontrado");
        txtKMAcumulados.setForeground(Color.BLUE);
        txtKMAcumulados.setEnabled(false);

        kmRecorridos.setText(Dijkstra.getAcumulado() + "m");
      }


    }//GEN-LAST:event_BuscarCaminoActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
      System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSalirActionPerformed

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
      java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new Inicio().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton BotonSalir;
  private javax.swing.JButton BuscarCamino;
  private javax.swing.JComboBox<String> EleccionDestino;
  private javax.swing.JComboBox<String> EleccionOrigen;
  private javax.swing.JLabel Fondo;
  private javax.swing.JLabel ImgMapa;
  private javax.swing.JLabel LateralSuperior;
  private javax.swing.JLabel LateralSuperior1;
  private javax.swing.JLabel LateralSuperior2;
  private javax.swing.JButton MostrarCaminos;
  private javax.swing.JLabel colorDestino;
  private javax.swing.JLabel colorNodoVisitado;
  private javax.swing.JLabel colorOrigen;
  public static javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel kmRecorridos;
  private javax.swing.JLabel kmRecorridos1;
  private javax.swing.JLabel kmRecorridos2;
  private javax.swing.JLabel txtColorDestino;
  private javax.swing.JLabel txtColorNodoRecorrido;
  private javax.swing.JLabel txtColorOrigen;
  private javax.swing.JLabel txtDestino;
  private javax.swing.JTextArea txtKMAcumulados;
  private javax.swing.JLabel txtOrigen;
  // End of variables declaration//GEN-END:variables
}
