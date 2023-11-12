/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CATEGORIAS_FRAME;

import static CATEGORIAS_FRAME.CINE.BadePreguntas;
import static CATEGORIAS_FRAME.CINE.LeerArchivo_ASCII;
import static CATEGORIAS_FRAME.CINE.cantidadPreguntas;
import static CATEGORIAS_FRAME.CULTURA_GENERAL.cantidadPreguntas;
import JFRAM.CategoriasFrame;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class DEPORTE extends javax.swing.JFrame {
    
    CategoriasFrame regresar_categoria=new CategoriasFrame();
    
    static int cantidadPreguntas;
                                        
    static String [][] BadePreguntas;
    
    private void cargarArrayList() {
        
        String URLBD = "https://docs.google.com/spreadsheets/d/e/2PACX-1vQXpqm1UpSKMgSKAdghzHBa3Lvq7xUMB2XHZQx1LD6nnsQP0llKv0PLgAnHDTTZWip9dt2T-IbpFSKl/pub?output=tsv";
        String TextoBasePreguntas = LeerArchivo_ASCII(URLBD);
        String[] renglones = TextoBasePreguntas.split("\n");
        cantidadPreguntas = renglones.length;
        BadePreguntas = new String[cantidadPreguntas][5];
        
        for (int i = 0; i < renglones.length; i++) {
            String renglon = renglones[i];
            BadePreguntas[i] = renglon.split("\t");
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            
        
        }
         
            new DEPORTE();
    }
    
    String [] preguntaEscogida;
    String pregunta;
    String respuesta;
    ArrayList<String> opciones = new ArrayList<>();
    
    int n_pregunta=0;
    
    public void escogerPregunta(int n){
        
        if (n >= 0 && n < cantidadPreguntas) {
        preguntaEscogida = BadePreguntas[n];
        pregunta = preguntaEscogida[0];
        respuesta = preguntaEscogida[1];
        opciones.clear();
        for (int i = 1; i < preguntaEscogida.length; i++) {
            opciones.add(preguntaEscogida[i]);
        }
        Collections.shuffle(opciones);
    }
    
    }
    
  
    
    public void MostrarPregunta(){
    
    txtPregunta.setText(pregunta);
    txtOpcionUno.setText(opciones.get(0));
    txtopcionDos.setText(opciones.get(1));
    txtopcionTres.setText(opciones.get(2));
    txtOpcionCuatro.setText(opciones.get(3));
    
    
    }
    
    public void EscogerRespuesta(int n){
    
        if (opciones.get(n).equals(respuesta)){
            
            JOptionPane.showMessageDialog(this 
                    , "La respuesta es correcta"
                    ,"Correcto :D"
                    ,JOptionPane.INFORMATION_MESSAGE);
            
        }else{
        
            JOptionPane.showMessageDialog(this
                    , "Su respuesta es incorrecta, la respuesta es: "
                            +respuesta
                    ,"Mensaje"
                    ,JOptionPane.ERROR_MESSAGE);
             
        }
        JUGAR();
        
    }
    
    public void JUGAR (){
        if (n_pregunta==cantidadPreguntas){
            JOptionPane.showMessageDialog(this
                    , "Juego terminado"
            ,"Muy bien :D",JOptionPane.PLAIN_MESSAGE);
            regresar_categoria.setVisible(true);
            this.setVisible(false);
            
            
         
        }
    
        escogerPregunta(n_pregunta);
        MostrarPregunta();
        n_pregunta++;
    
    }

    /**
     * Creates new form DEPORTE
     */
    public DEPORTE() {
        initComponents();
        setLocationRelativeTo(null);
         setResizable(false);
         cargarArrayList();
        setVisible(true);
        JUGAR();
         setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static String LeerArchivo_ASCII(String ruta) {
        try {
            if (ruta == null) {
                throw new RuntimeException("Error, la URL de lectura no puede ser nula");
            }
            URL url = new URL(ruta);
            URLConnection conexion = url.openConnection();
            InputStreamReader isr = new InputStreamReader(conexion.getInputStream());
            return LeerArchivo_ASCII(isr);
        } catch (Exception e) {
            System.out.println("No hay conexión a internet, la base de datos no pudo ser cargada");
            System.exit(0);
        }
        return "";
    }
     
     public static String LeerArchivo_ASCII(Reader reader) throws Exception {
        BufferedReader br = new BufferedReader(reader);
        String texto = "";
        String linea;
        boolean primerRenglón = true;
        while ((linea = br.readLine()) != null) {
            if (primerRenglón) {
                primerRenglón = false;
            } else {
                texto += "\n";
            }
            texto += linea;
        }
        reader.close();
        br.close();
        return texto;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        txtPregunta = new javax.swing.JLabel();
        txtopcionDos = new javax.swing.JButton();
        txtopcionTres = new javax.swing.JButton();
        txtOpcionCuatro = new javax.swing.JButton();
        txtOpcionUno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPregunta.setText("jLabel1");
        txtPregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPrincipal.add(txtPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 1090, 340));

        txtopcionDos.setText("jButton1");
        txtopcionDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtopcionDosActionPerformed(evt);
            }
        });
        panelPrincipal.add(txtopcionDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 1090, -1));

        txtopcionTres.setText("jButton1");
        txtopcionTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtopcionTresActionPerformed(evt);
            }
        });
        panelPrincipal.add(txtopcionTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 1090, -1));

        txtOpcionCuatro.setText("jButton1");
        txtOpcionCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOpcionCuatroActionPerformed(evt);
            }
        });
        panelPrincipal.add(txtOpcionCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 1090, -1));

        txtOpcionUno.setText("jButton1");
        txtOpcionUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOpcionUnoActionPerformed(evt);
            }
        });
        panelPrincipal.add(txtOpcionUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 1090, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOpcionUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOpcionUnoActionPerformed
        // TODO add your handling code here:
        EscogerRespuesta(0);
    }//GEN-LAST:event_txtOpcionUnoActionPerformed

    private void txtopcionDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtopcionDosActionPerformed
        // TODO add your handling code here:
        EscogerRespuesta(1);
    }//GEN-LAST:event_txtopcionDosActionPerformed

    private void txtopcionTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtopcionTresActionPerformed
        // TODO add your handling code here:
        EscogerRespuesta(2);
    }//GEN-LAST:event_txtopcionTresActionPerformed

    private void txtOpcionCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOpcionCuatroActionPerformed
        // TODO add your handling code here:
        EscogerRespuesta(3);
    }//GEN-LAST:event_txtOpcionCuatroActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JButton txtOpcionCuatro;
    private javax.swing.JButton txtOpcionUno;
    private javax.swing.JLabel txtPregunta;
    private javax.swing.JButton txtopcionDos;
    private javax.swing.JButton txtopcionTres;
    // End of variables declaration//GEN-END:variables
}
