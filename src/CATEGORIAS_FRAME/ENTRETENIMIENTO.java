/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CATEGORIAS_FRAME;

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
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author cesar
 */
public class ENTRETENIMIENTO extends javax.swing.JFrame {
    
    CategoriasFrame regresar_categoria=new CategoriasFrame();

    static int cantidadPreguntas;
                                        
    static String [][] BadePreguntas;
    
    private void cargarArrayList() {
        
        String URLBD = "https://docs.google.com/spreadsheets/d/e/2PACX-1vS7Vb_v5rbQf8wy3cPk8vBSfm_ADFJjSjlw9nC3yF2auyKTzMTgBKLVRBNMtmZImvIrfqYnmhTAz35L/pub?output=tsv";
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
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            
        
        }
         
            new ENTRETENIMIENTO();
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
    
    label_preguntas.setText(pregunta);
    boton1.setText(opciones.get(0));
    boton2.setText(opciones.get(1));
    boton3.setText(opciones.get(2));
    boton4.setText(opciones.get(3));
    
    
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
    
    
    
     public ENTRETENIMIENTO() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        label_preguntas = new javax.swing.JLabel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        panel_principal.setBackground(new java.awt.Color(255, 255, 255));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_preguntas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_principal.add(label_preguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 880, 380));

        boton1.setText("jButton1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        panel_principal.add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 880, -1));

        boton2.setText("jButton2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        panel_principal.add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 880, -1));

        boton3.setText("jButton3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        panel_principal.add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 880, -1));

        boton4.setText("jButton4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        panel_principal.add(boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 880, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        // TODO add your handling code here:
        EscogerRespuesta(0);
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        // TODO add your handling code here:
        EscogerRespuesta(1);
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        // TODO add your handling code here:
        EscogerRespuesta(2);
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        // TODO add your handling code here:
        EscogerRespuesta(3);
    }//GEN-LAST:event_boton4ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JLabel label_preguntas;
    private javax.swing.JPanel panel_principal;
    // End of variables declaration//GEN-END:variables
}
