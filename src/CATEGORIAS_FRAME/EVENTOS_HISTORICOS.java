/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CATEGORIAS_FRAME;

import static CATEGORIAS_FRAME.DEPORTE.BadePreguntas;
import static CATEGORIAS_FRAME.DEPORTE.LeerArchivo_ASCII;
import static CATEGORIAS_FRAME.DEPORTE.cantidadPreguntas;
import static CATEGORIAS_FRAME.ENTRETENIMIENTO.cantidadPreguntas;
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
public class EVENTOS_HISTORICOS extends javax.swing.JFrame {
    
    CategoriasFrame regresar_categoria=new CategoriasFrame();
    
    static int cantidadPreguntas;
                                        
    static String [][] BadePreguntas;
    
    private void cargarArrayList() {
        
        String URLBD = "https://docs.google.com/spreadsheets/d/e/2PACX-1vSDIda1rKVEx6jz6Sz-0U4tpJEzdcFy7TsaLzNRTITppxaEe-TFzFWOGwW2RZgsOESjeEmpdM6jpWKT/pub?output=tsv";
        String TextoBasePreguntas = LeerArchivo_ASCII(URLBD);
        String[] renglones = TextoBasePreguntas.split("\n");
        cantidadPreguntas = renglones.length;
        BadePreguntas = new String[cantidadPreguntas][5];
        
        for (int i = 0; i < renglones.length; i++) {
            String renglon = renglones[i];
            BadePreguntas[i] = renglon.split("\t");
        }
    }

    /**
     * Creates new form EVENTOS_HISTORICOS
     */
    
    
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
         
            new EVENTOS_HISTORICOS();
        
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
    
    Preguntatxt.setText(pregunta);
    txtPreguntaUno.setText(opciones.get(0));
    txtPreguntaDos.setText(opciones.get(1));
    txtPreguntaTres.setText(opciones.get(2));
    txtPreguntaCuatro.setText(opciones.get(3));
    
    
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
    
    public EVENTOS_HISTORICOS() {
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

        panelPrincipal = new javax.swing.JPanel();
        Preguntatxt = new javax.swing.JLabel();
        txtPreguntaDos = new javax.swing.JButton();
        txtPreguntaTres = new javax.swing.JButton();
        txtPreguntaCuatro = new javax.swing.JButton();
        txtPreguntaUno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Preguntatxt.setBackground(new java.awt.Color(0, 0, 0));
        Preguntatxt.setForeground(new java.awt.Color(0, 0, 0));
        Preguntatxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPrincipal.add(Preguntatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 1180, 380));

        txtPreguntaDos.setText("jButton1");
        txtPreguntaDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreguntaDosActionPerformed(evt);
            }
        });
        panelPrincipal.add(txtPreguntaDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 1180, -1));

        txtPreguntaTres.setText("jButton1");
        txtPreguntaTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreguntaTresActionPerformed(evt);
            }
        });
        panelPrincipal.add(txtPreguntaTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 1180, -1));

        txtPreguntaCuatro.setText("jButton1");
        txtPreguntaCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreguntaCuatroActionPerformed(evt);
            }
        });
        panelPrincipal.add(txtPreguntaCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 1180, -1));

        txtPreguntaUno.setText("jButton1");
        txtPreguntaUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreguntaUnoActionPerformed(evt);
            }
        });
        panelPrincipal.add(txtPreguntaUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 1180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1284, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPreguntaUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreguntaUnoActionPerformed
        // TODO add your handling code here:
         EscogerRespuesta(0);
        
    }//GEN-LAST:event_txtPreguntaUnoActionPerformed

    private void txtPreguntaDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreguntaDosActionPerformed
        // TODO add your handling code here:
         EscogerRespuesta(1);
    }//GEN-LAST:event_txtPreguntaDosActionPerformed

    private void txtPreguntaTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreguntaTresActionPerformed
        // TODO add your handling code here:
         EscogerRespuesta(2);
    }//GEN-LAST:event_txtPreguntaTresActionPerformed

    private void txtPreguntaCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreguntaCuatroActionPerformed
        // TODO add your handling code here:
         EscogerRespuesta(3);
    }//GEN-LAST:event_txtPreguntaCuatroActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Preguntatxt;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JButton txtPreguntaCuatro;
    private javax.swing.JButton txtPreguntaDos;
    private javax.swing.JButton txtPreguntaTres;
    private javax.swing.JButton txtPreguntaUno;
    // End of variables declaration//GEN-END:variables
}
