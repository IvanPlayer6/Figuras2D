
package Figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Interfaz2 extends javax.swing.JFrame {
    int giro = 0, forma = 0;
    int escaladoX = 0, escaladoY = 0;
    int X = 0, Y = 0, X2 = 0, Y2 = 0, opc = 0, Colores1 = 0, ColorLi = 0;
    int XCir = 0, YCir = 0, AnchoCir = 0, AltoCir = 0, ColorCir = 0;
    int XCua = 0, YCua = 0, AnchoCua = 0, AltoCua = 0, ColorCua = 0;
    int XRec = 0, YRec = 0, AnchoRec = 0, AltoRec = 0, ColorRec = 0;
    int XTri = 0, YTri = 0, AnchoTri = 0, AltoTri = 0, ColorTri = 0;
    int XRom = 0, YRom = 0, AnchoRom = 0, AltoRom = 0, ColorRom = 0;
    ArrayList<Linea> ListaLinea = null;
    ArrayList<Circulo> ListaCirculos = null;
    ArrayList<Cuadrado> ListaCuadrados = null;
    ArrayList<Rombo> listaRombos = null;
    ArrayList<Triangulo> ListaTriangulos = null;
    int contador = 0;

    public Interfaz2() {

        initComponents();
    }

    /**
     * .
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCorX = new javax.swing.JTextField();
        txtCorY = new javax.swing.JTextField();
        txtCor2x = new javax.swing.JTextField();
        txtCor2y = new javax.swing.JTextField();
        Colores = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        figuras = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        txtCorX.setEditable(false);
        txtCorX.setToolTipText("");
        txtCorX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorXActionPerformed(evt);
            }
        });

        txtCorY.setEditable(false);
        txtCorY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorYActionPerformed(evt);
            }
        });

        txtCor2x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCor2xActionPerformed(evt);
            }
        });

        Colores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Rojo", "Verde", "Azul", "Rosado", "Negro" }));
        Colores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColoresActionPerformed(evt);
            }
        });

        jLabel1.setText("Rotación");

        jLabel2.setText("X=");

        jLabel3.setText("Y=");

        jLabel4.setText("Ancho=");

        jLabel5.setText("Alto=");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        figuras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "linea", "triangulo", "cuadrilatero", "circulo" }));
        figuras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                figurasActionPerformed(evt);
            }
        });

        jLabel7.setText("Acercar/Zoom: x");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        jLabel8.setText("Figuras:");

        jLabel9.setText("Colores:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCorX, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCor2x, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel9)
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addGap(6, 6, 6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(txtCorY, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCor2y, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Colores, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(figuras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)))
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 163, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCor2x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCor2y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtCorY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Colores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(figuras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void figurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_figurasActionPerformed
        // TODO add your handling code here:
        int forma = figuras.getSelectedIndex();
        Cargar(forma);
        
    }//GEN-LAST:event_figurasActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        
        txtCorX.setText(Integer.toString(evt.getX()));
        txtCorY.setText(Integer.toString(evt.getY()));        
        
    }//GEN-LAST:event_jPanel1MousePressed

    private void txtCorYActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCorYActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCorYActionPerformed

    private void txtCorXActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCorXActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCorXActionPerformed

    private void txtCor2xActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCor2xActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCor2xActionPerformed

    private void ColoresActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ColoresActionPerformed
        Colores1 = Colores.getSelectedIndex();
    }// GEN-LAST:event_ColoresActionPerformed

    
    public void Cargar(int forma){ //Carga los valores de la Tabla
if (forma==1){
//realiza una linea
        X = Integer.parseInt(txtCorX.getText());
        Y = Integer.parseInt(txtCorY.getText());
        // txtCor2x
        X2 = Integer.parseInt(txtCor2x.getText());
        Y2 = Integer.parseInt(txtCor2y.getText());
        opc = 1;
} else if (forma==2){
    //realiza un tranulo
        XTri = Integer.parseInt(txtCorX.getText());
        YTri = Integer.parseInt(txtCorY.getText());
        AnchoTri = Integer.parseInt(txtCor2x.getText());
        AltoTri = Integer.parseInt(txtCor2y.getText());
        opc = 5;
}else if (forma==3){
    //realiza un cuadrado
        XCua = Integer.parseInt(txtCorX.getText());
        YCua = Integer.parseInt(txtCorX.getText());
        AnchoCua = Integer.parseInt(txtCor2x.getText());
        AltoCua = Integer.parseInt(txtCor2y.getText());
        opc = 4;
}else if (forma==4){
        //realiza un circulo
        XCir = Integer.parseInt(txtCorX.getText());
        YCir = Integer.parseInt(txtCorY.getText());
        AnchoCir = Integer.parseInt(txtCor2x.getText());
        AltoCir = Integer.parseInt(txtCor2y.getText());
        opc = 3;
}
}
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        switch (opc) {
            case 1:// linea
                g2d.scale(escaladoX, escaladoY);
                g2d.translate(15, 36);
                g2d.rotate(Math.toRadians(giro));
                switch (Colores1) {
                    case 1:
                        g2d.setColor(Color.red);
                        break;
                    case 2:
                        g2d.setColor(Color.green);
                        break;
                    case 3:
                        g2d.setColor(Color.blue);
                        break;
                    case 4:
                        g2d.setColor(Color.pink);
                        break;
                    case 5:
                        g2d.setColor(Color.black);
                        break;
                }
                g.drawLine(X2, Y2, Integer.parseInt(txtCorX.getText()), Integer.parseInt(txtCorY.getText()));
                repaint();
                jSpinner1.addChangeListener(new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        giro = (int) jSpinner1.getValue();
                        repaint();
                    }
                });
                if (jSpinner3.getValue() != null && (int) jSpinner3.getValue() < 10) {
                    escaladoX = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen X
                    if (X > 30)
                        X = X / 2;
                    X = X;
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    if (Y > 30)
                        Y = Y / 2;
                    Y = Y;
                    repaint();
                }
                /*
                // si jcheckbox esta seleccionado jspinner2 y jspinner3 se igualan
                if (jCheckBox1.isSelected()) {
                    jSpinner2.setValue(jSpinner3.getValue());
                    repaint();
                }
                // escalaremos 2 veces su tamaño en X y Y, es decir, se duplicara
                // su tamaño
                // jSpinner2 es el spinner que controla el escalado en X y jSpinner3 en Y
                if (jSpinner2.getValue() != null && (int) jSpinner2.getValue() < 10) {// si el valor del spinner no es
                                                                                      // nulo se asigna a la variable
                                                                                      // escaladoX y se duplica el
                                                                                      // tamaño
                    escaladoX = (int) jSpinner2.getValue() + 1;
                    // mantener en el origen X
                    if (X > 30)
                        X = X / 2;
                    X = X;
                    repaint();
                }
                if (jSpinner3.getValue() != null && (int) jSpinner3.getValue() < 10) {
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    if (Y > 30)
                        Y = Y / 2;
                    Y = Y;
                    repaint();
                }
                */
                break;
            case 2:// rombo
                g2d.scale(escaladoX, escaladoY);
                g2d.translate(15, 36);
                g2d.rotate(Math.toRadians(giro));
                switch (Colores1) {
                    case 1:
                        g2d.setColor(Color.red);
                        break;
                    case 2:
                        g2d.setColor(Color.green);
                        break;
                    case 3:
                        g2d.setColor(Color.blue);
                        break;
                    case 4:
                        g2d.setColor(Color.pink);
                        break;
                    case 5:
                        g2d.setColor(Color.black);
                        break;
                }
                // se dibuja relleno, XRom y YRom son las coordenadas del centro del rombo
                g2d.fillPolygon(new int[] { XRom, XRom + 10, XRom, XRom - 10 },
                        new int[] { YRom - 10, YRom, YRom + 10, YRom },
                        4);
                repaint();
                jSpinner1.addChangeListener(new ChangeListener() {

                    @Override
                    public void stateChanged(ChangeEvent e) {
                        giro = (int) jSpinner1.getValue();
                        repaint();

                    }
                });
                if (jSpinner3.getValue() != null && (int) jSpinner3.getValue() < 10) {
                    escaladoX = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen X
                    if (X > 30)
                        X = X / 2;
                    X = X;
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    if (Y > 30)
                        Y = Y / 2;
                    Y = Y;
                    repaint();
                }
                /*
                // si jcheckbox esta seleccionado jspinner2 y jspinner3 se igualan
                if (jCheckBox1.isSelected()) {
                    jSpinner2.setValue(jSpinner3.getValue());
                    repaint();
                }

                // escalaremos 2 veces su tamaño en X y Y, es decir, se duplicara
                // su tamaño
                // jSpinner2 es el spinner que controla el escalado en X y jSpinner3 en Y
                if (jSpinner2.getValue() != null) {// si el valor del spinner no es
                                                   // nulo se asigna a la variable
                                                   // escaladoX y se duplica el
                                                   // tamaño
                    escaladoX = (int) jSpinner2.getValue() + 1;
                    // mantener en el origen X
                    if (X > 12)
                        X = X - 1;
                    X = X;
                    repaint();
                }
                if (jSpinner3.getValue() != null) {
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    if (Y > 90)
                        Y = Y - 1;
                    Y = Y;
                    repaint();
                }
                */
                break;
            case 3:// circulo
                g2d.scale(escaladoX, escaladoY);

                g2d.translate(15, 36);

                g2d.rotate(Math.toRadians(giro));

                switch (Colores1) {

                    case 1:
                        g2d.setColor(Color.red);
                        break;
                    case 2:
                        g2d.setColor(Color.green);
                        break;
                    case 3:
                        g2d.setColor(Color.blue);
                        break;
                    case 4:
                        g2d.setColor(Color.pink);
                        break;
                    case 5:
                        g2d.setColor(Color.black);
                        break;
                }
                g.fillOval(XCir, YCir, AnchoCir, AltoCir);
                repaint();
                jSpinner1.addChangeListener(new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        giro = (int) jSpinner1.getValue();
                        repaint();
                    }
                });
                if (jSpinner3.getValue() != null && (int) jSpinner3.getValue() < 10) {
                    escaladoX = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen X
                    if (X > 30)
                        X = X / 2;
                    X = X;
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    if (Y > 30)
                        Y = Y / 2;
                    Y = Y;
                    repaint();
                }
                /*
                // si jcheckbox esta seleccionado jspinner2 y jspinner3 se igualan
                if (jCheckBox1.isSelected()) {
                    jSpinner2.setValue(jSpinner3.getValue());
                    repaint();
                }

                // escalaremos el cuadrado en 2 veces su tamaño en X y Y, es decir, se duplicara
                // su tamaño
                // jSpinner2 es el spinner que controla el escalado en X y jSpinner3 en Y
                if (jSpinner2.getValue() != null && (int) jSpinner2.getValue() <= 5) {// si el valor del spinner no es
                                                                                      // nulo se asigna a la variable
                                                                                      // escaladoX y se duplica el
                                                                                      // tamaño
                    escaladoX = (int) jSpinner2.getValue() + 1;
                    // mantener el origen X
                    X = -1;
                    repaint();
                }
                if (jSpinner3.getValue() != null && (int) jSpinner3.getValue() <= 5) {
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    Y = -1;
                    repaint();
                }
                */
                break;
            case 4:// Cuadrado
                g2d.scale(escaladoX, escaladoY);
                g2d.translate(15, 36);
                g2d.rotate(Math.toRadians(giro));
                switch (Colores1) {
                    case 1:
                        g2d.setColor(Color.red);
                        break;
                    case 2:
                        g2d.setColor(Color.green);
                        break;
                    case 3:
                        g2d.setColor(Color.blue);
                        break;
                    case 4:
                        g2d.setColor(Color.pink);
                        break;
                    case 5:
                        g2d.setColor(Color.black);
                        break;
                }
                g.fillRect(XCua, YCua, AnchoCua, AltoCua);
                repaint();
                jSpinner1.addChangeListener(new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        giro = (int) jSpinner1.getValue();
                        repaint();
                    }
                });
                if (jSpinner3.getValue() != null && (int) jSpinner3.getValue() < 10) {
                    escaladoX = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen X
                    if (X > 30)
                        X = X / 2;
                    X = X;
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    if (Y > 30)
                        Y = Y / 2;
                    Y = Y;
                    repaint();
                }
                /*
                // si jcheckbox esta seleccionado jspinner2 y jspinner3 se igualan
                if (jCheckBox1.isSelected()) {
                    jSpinner2.setValue(jSpinner3.getValue());
                    repaint();
                }

                // escalaremos 2 veces su tamaño en X y Y, es decir, se duplicara
                // su tamaño
                // jSpinner2 es el spinner que controla el escalado en X y jSpinner3 en Y
                if (jSpinner2.getValue() != null && (int) jSpinner2.getValue() <= 5) {// si el valor del spinner no es
                                                                                      // nulo se asigna a la variable
                                                                                      // escaladoX y se duplica el
                                                                                      // tamaño
                    escaladoX = (int) jSpinner2.getValue() + 1;
                    // mantener en el origen X
                    X = -1;
                    repaint();
                }
                if (jSpinner3.getValue() != null && (int) jSpinner3.getValue() <= 5) {
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    Y = -1;
                    repaint();
                }
                */
                break;
            case 5:// Triangulo
                g2d.scale(escaladoX, escaladoY);
                g2d.translate(15, 36);
                g2d.rotate(Math.toRadians(giro));
                switch (Colores1) {
                    case 1:
                        g2d.setColor(Color.red);
                        break;
                    case 2:
                        g2d.setColor(Color.green);
                        break;
                    case 3:
                        g2d.setColor(Color.blue);
                        break;
                    case 4:
                        g2d.setColor(Color.pink);
                        break;
                    case 5:
                        g2d.setColor(Color.black);
                        break;
                }
                // se dibuja el triangulo relleno y que pueda tomar los valores AnchoTri y
                // AltoTri
                g.fillPolygon(new int[] { XTri, XTri + AnchoTri, XTri + AnchoTri / 2 },
                        new int[] { YTri, YTri, YTri + AltoTri }, 3);
                repaint();
                jSpinner1.addChangeListener(new ChangeListener() {// rotacion

                    @Override
                    public void stateChanged(ChangeEvent e) {// esta parte es para que se pueda girar el triangulo
                        giro = (int) jSpinner1.getValue();
                        repaint();

                    }
                });
                if (jSpinner3.getValue() != null && (int) jSpinner3.getValue() < 10) {
                    escaladoX = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen X
                    if (X > 30)
                        X = X / 2;
                    X = X;
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    if (Y > 30)
                        Y = Y / 2;
                    Y = Y;
                    repaint();
                }
                /*
                // si jcheckbox esta seleccionado jspinner2 y jspinner3 se igualan
                if (jCheckBox1.isSelected()) {
                    jSpinner2.setValue(jSpinner3.getValue());
                    repaint();
                }

                // escalaremos 2 veces su tamaño en X y Y, es decir, se duplicara
                // su tamaño
                // jSpinner2 es el spinner que controla el escalado en X y jSpinner3 en Y
                if (jSpinner2.getValue() != null && (int) jSpinner2.getValue() <= 5) {// si el valor del spinner no es
                                                                                      // nulo se asigna a la variable
                                                                                      // escaladoX y se duplica el
                                                                                      // tamaño
                    escaladoX = (int) jSpinner2.getValue() + 1;
                    // mantener en el origen X
                    if (X > 12)
                        X = X - 1;
                    X = X;
                    repaint();
                }
                if (jSpinner3.getValue() != null && (int) jSpinner3.getValue() <= 5) {
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    if (Y > 90)
                        Y = Y - 1;
                    Y = Y;
                    repaint();
                }
                */
                break;
        }
        repaint();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Colores;
    private javax.swing.JComboBox<String> figuras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner3;
    public static javax.swing.JTextField txtCor2x;
    public static javax.swing.JTextField txtCor2y;
    public static javax.swing.JTextField txtCorX;
    public static javax.swing.JTextField txtCorY;
    // End of variables declaration//GEN-END:variables
}
