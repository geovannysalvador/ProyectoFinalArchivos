/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProyManejoArchivos;

import java.io.File;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FormAbrirArchivo extends javax.swing.JFrame {

    /**
     * Creates new form FormAbrirArchivo
     */
    public FormAbrirArchivo() {
        initComponents();
        this.setLocationRelativeTo(null);
        FechaCreacion.setVisible(false);
        FechaModificacion.setVisible(false);
        Productor.setVisible(false);
        jTextField11.setVisible(false);
    }
    
    Lista lista = new Lista();
    NodoM aux = new NodoM();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Creador = new javax.swing.JTextField();
        FechaCreacion = new javax.swing.JTextField();
        FechaModificacion = new javax.swing.JTextField();
        Productor = new javax.swing.JTextField();
        autor = new javax.swing.JTextField();
        imagenes = new javax.swing.JTextField();
        numeroPaginas = new javax.swing.JTextField();
        tamanio = new javax.swing.JTextField();
        tamanioPaginasX = new javax.swing.JTextField();
        tamanioPaginasY = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        version = new javax.swing.JTextField();
        nombreArchivo = new javax.swing.JTextField();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        fuentes = new javax.swing.JTextArea();
        seleccionar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Metadatos PDF");

        FechaCreacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaCreacionActionPerformed(evt);
            }
        });

        version.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                versionActionPerformed(evt);
            }
        });

        btnAnterior.setText("Siguiente");
        btnAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnteriorMouseClicked(evt);
            }
        });
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Cargar");
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        fuentes.setColumns(20);
        fuentes.setRows(5);
        jScrollPane1.setViewportView(fuentes);

        seleccionar1.setText("Selccionar");
        seleccionar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionar1MouseClicked(evt);
            }
        });
        seleccionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionar1ActionPerformed(evt);
            }
        });

        jLabel1.setText("X");

        jLabel2.setText("mm");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("METADATOS  PDF");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Titulo:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Autor:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Imagenes en PDF");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Tamaño PDF (bytes):");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Numero de paginas: ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Version:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Tamaño Paginas");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Creado en:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Fuentes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FechaModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Productor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSiguiente)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAnterior))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(guardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(seleccionar1)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tamanioPaginasX, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tamanioPaginasY, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(imagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numeroPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(version, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Creador, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 66, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(Creador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numeroPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(version, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tamanioPaginasX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tamanioPaginasY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSiguiente)
                            .addComponent(btnAnterior))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seleccionar1)
                            .addComponent(guardar))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Productor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void versionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_versionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_versionActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        EscritorArchivo escritor = new EscritorArchivo();
        
        
        escritor.setNombre(nombreArchivo.getText());
        escritor.setAutor(autor.getText());
        escritor.setCreador(Creador.getText());
        escritor.setFechaCreacion(FechaCreacion.getText());
        escritor.setFechaModificacion(FechaModificacion.getText());
        escritor.setProductor(Productor.getText());
        escritor.setVersion(version.getText());
        escritor.setTamanio(Integer.parseInt(tamanio.getText()));
        escritor.setPaginas(Integer.parseInt(numeroPaginas.getText()));
        escritor.setTamanioPaginas(Float.parseFloat(tamanioPaginasX.getText()), Float.parseFloat(tamanioPaginasY.getText()));
        escritor.setImagenes(Integer.parseInt(imagenes.getText()));
        escritor.setFuentes(fuentes.getText());
        renameAutor("C:\\Users\\yowte\\Desktop\\pdfs\\"+ aux.getNombre());
        renameFile("C:\\Users\\yowte\\Desktop\\pdfs\\"+ aux.getNombre(),"C:\\Users\\yowte\\Desktop\\pdfs\\"+ nombreArchivo.getText());
        
        escritor.escrituraAleatoria();
        
        JOptionPane.showMessageDialog(rootPane, "se guardo correctamente");
        System.out.println("Se guardo correctamente");
        this.dispose();
    }//GEN-LAST:event_guardarActionPerformed

    private void seleccionar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionar1MouseClicked
        // TODO add your handling code here:
          String temp = "";
        JFileChooser pdfruta = new JFileChooser();
        pdfruta.setDialogTitle("Seleccione la carpeta");
        pdfruta.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        if(pdfruta.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
        {
            File archivo = pdfruta.getSelectedFile();
            if(archivo.isDirectory())
            {
                lectorCarpetas(archivo);
            }
            else if (archivo.isFile())
            {
            System.out.println(archivo.getName());
            lectorArchivosPDF(archivo);
            }
        }  
    }//GEN-LAST:event_seleccionar1MouseClicked

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
        // TODO add your handling code here:
        if(aux.getAnterior() != null){
            aux = aux.getAnterior();
        }
        else{
            btnSiguiente.setOpaque(false);
        }
        this.nombreArchivo.setText(aux.getNombre());
        this.autor.setText(aux.getAutor());
        this.Creador.setText(aux.getCreador());
        this.FechaCreacion.setText(aux.getFechaCreacion());
        this.FechaModificacion.setText(aux.getFechaModificacion());
        this.Productor.setText(aux.getProductor());
        this.version.setText(aux.getVersion());
        this.tamanio.setText(String.valueOf(aux.getTamanio()));
        this.numeroPaginas.setText(String.valueOf(aux.getPaginas()));
        this.tamanioPaginasX.setText(String.valueOf(aux.getTamaniox()));
        this.tamanioPaginasY.setText(String.valueOf(aux.getTamanioy()));
        this.imagenes.setText(String.valueOf(aux.getImagenes()));
        this.fuentes.setText(aux.getFuentes());
        
    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void btnAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnteriorMouseClicked
        // TODO add your handling code here:
        if(aux.getSiguiente() != null){
            aux = aux.getSiguiente();
        }
        else{
            btnAnterior.setOpaque(false);
        }
        this.nombreArchivo.setText(aux.getNombre());
        this.autor.setText(aux.getAutor());
        this.Creador.setText(aux.getCreador());
        this.FechaCreacion.setText(aux.getFechaCreacion());
        this.FechaModificacion.setText(aux.getFechaModificacion());
        this.Productor.setText(aux.getProductor());
        this.version.setText(aux.getVersion());
        this.tamanio.setText(String.valueOf(aux.getTamanio()));
        this.numeroPaginas.setText(String.valueOf(aux.getPaginas()));
        this.tamanioPaginasX.setText(String.valueOf(aux.getTamaniox()));
        this.tamanioPaginasY.setText(String.valueOf(aux.getTamanioy()));
        this.imagenes.setText(String.valueOf(aux.getImagenes()));
        this.fuentes.setText(aux.getFuentes());
        
    }//GEN-LAST:event_btnAnteriorMouseClicked

    private void seleccionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionar1ActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_seleccionar1ActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void FechaCreacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaCreacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaCreacionActionPerformed

    
     private void renameFile(String nombreAntiguo, String nuevoNombre)  {                                             

            File file = new File(nombreAntiguo);
            System.out.println("File1///////////////");
            System.out.println(file);

            // File (or directory) with new name
            File file2 = new File(nuevoNombre);
            System.out.println("///////////");
            System.out.println(file2);


            boolean success = file.renameTo(file2);
//
            if (!success) {
                // File was not successfully renamed
                System.out.println("No se logro");
            }
            

    }
     
     private void renameAutor(String nombreAntiguo)  {                                             

            File file = new File(nombreAntiguo);
            System.out.println("File1///////////////");
            System.out.println(file);
            
          

    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormAbrirArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAbrirArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAbrirArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAbrirArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormAbrirArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAbrirArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAbrirArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAbrirArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAbrirArchivo().setVisible(true);
            }
        });
    }
    
     private void lectorCarpetas(File archivo)
    {
        String temp = "";
        for (final File fileEntry : archivo.listFiles()) 
            {
             if (fileEntry.isDirectory()) {
            System.out.println("leyendo archivos de la caarpeta " + archivo.getAbsolutePath());
            lectorCarpetas(fileEntry);
              } else {
                if (fileEntry.isFile()) {
                temp = fileEntry.getName();
                 if ((temp.substring(temp.lastIndexOf('.') + 1, temp.length()).toLowerCase()).equals("pdf"))
                 {
                     System.out.println("----------------------------------");
                     System.out.println("Leyendo el pdf: " + fileEntry.getName());
                     String aux = archivo.getAbsolutePath()+ "\\" + fileEntry.getName();
                     File archivopdf = new File(aux);
                     lectorArchivosPDF(archivopdf);
                 }
                }

                }
           }
    }
    
private void lectorArchivosPDF(File archivo)
    {
     String nombre = "";
     String autor = "";
     String creador = ""; 
     String fechaCreacion = ""; // 23
     String fechaModificacion = ""; // 23
     String productor="";
     String version=""; // 8
     int tamanio=0;
     int paginas=0;
     float tamaniox=0;
     float tamanioy=0;
     int imagenes=0;
     String fuentes=""; 
    
          LectorPDF lector = new LectorPDF(archivo);
          int a = lector.LecturaMetaDatos().split("/").length;
          String[] partir = lector.LecturaMetaDatos().split("/");
          //System.out.println("Los metadatos son:");
          //this.nombreArchivo.setText(archivo.getName());
          nombre=archivo.getName();
          String b = "";
          String c = "";
          boolean parentesis = false;
           for(int j=1; j<a; j++)
          {
           b = "";
           c = "";
           parentesis = false;
           //System.out.println(partir[j]);
             for(int i=1; i<partir[j].length(); i++)
             {
                 if(partir[j].charAt(i-1) ==  '(')
                 {
                     parentesis = true;
                 }
                  if(parentesis)   
                  {
                     if(partir[j].charAt(i) !=  ')')
                     {
                         b+=partir[j].charAt(i);
                     }
                     else{
                         parentesis = false;
                         break;
                     }
                  }
                  else{
                      c+=partir[j].charAt(i-1);
                  }
             }
             //System.out.println(c);
             if("Author".equals(c) || "Author ".equals(c))
             {
                 //System.out.println("Autor: " + b);
                 //this.autor.setText(b);
                 autor = b;
             }
             else if("Creator".equals(c) || "Creator ".equals(c))
             {
                 //System.out.println("Creador: " + b);
                 //this.Creador.setText(b);
                 creador = b;
             }
             else if("CreationDate".equals(c) || "CreationDate ".equals(c))
             {
                 //System.out.println("Fecha Creacion: " + b);
                 //this.FechaCreacion.setText(b);
                 fechaCreacion = b;
             }
             else if("ModDate".equals(c) || "ModDate ".equals(c))
             {
                 //System.out.println("Fecha Modificacion: " + b);
                 //this.FechaModificacion.setText(b);
                 fechaModificacion = b;
             }
             else if("Producer".equals(c) || "Producer ".equals(c))
             {
                 //System.out.println("Productor: " + b);
              //   this.Productor.setText(b);
                 productor =b;
             }
             else if("Title".equals(c) || "Title ".equals(c))
             {
                 //System.out.println("Titulo: " + b);
                 //this.autor.setText(b);                 
             }
             System.out.println(b);
          }
           
          System.out.println("La version del PDF es: " + lector.LecturaVersion());
          System.out.println("Tamaño del archivo: " + lector.Tamanio() + " Bytes");
          System.out.println("Número de Páginas: "+lector.Numpaginas());
          lector.TamanioPag();
          System.out.println("Tamaño de Página: "+ lector.getTamanioX() + " X " + lector.getTamanioY() + " mm");
          System.out.println("Listado de Imágenes: "+ lector.LectorImagenes());
          System.out.println("Listado de Fuentes: " + lector.LectordeFuentes());
          
          
          
          this.version.setText(lector.LecturaVersion());
          this.tamanio.setText(String.valueOf(lector.Tamanio()));
          this.numeroPaginas.setText(String.valueOf(lector.Numpaginas()));
          this.tamanioPaginasX.setText(String.valueOf(lector.getTamanioX()));    
          this.tamanioPaginasY.setText(String.valueOf(lector.getTamanioY())); 
          this.imagenes.setText(String.valueOf(lector.LectorImagenes()));
          this.fuentes.setText(lector.LectordeFuentes());
          
          version=lector.LecturaVersion();
          tamanio=lector.Tamanio();
          paginas = lector.Numpaginas();
          tamaniox = lector.getTamanioX();
          tamanioy = lector.getTamanioY();
          imagenes = lector.LectorImagenes();
          fuentes = lector.LectordeFuentes();
          lista.InsertarM(nombre,autor,creador,fechaCreacion,fechaModificacion,productor,version,tamanio,paginas,tamaniox,tamanioy,imagenes,fuentes);                
        
       aux = lista.getInicioM();
          System.out.println();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Creador;
    private javax.swing.JTextField FechaCreacion;
    private javax.swing.JTextField FechaModificacion;
    private javax.swing.JTextField Productor;
    private javax.swing.JTextField autor;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JTextArea fuentes;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField imagenes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField nombreArchivo;
    private javax.swing.JTextField numeroPaginas;
    private javax.swing.JButton seleccionar1;
    private javax.swing.JTextField tamanio;
    private javax.swing.JTextField tamanioPaginasX;
    private javax.swing.JTextField tamanioPaginasY;
    private javax.swing.JTextField version;
    // End of variables declaration//GEN-END:variables
}
