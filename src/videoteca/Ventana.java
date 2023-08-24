/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoteca;


import com.jtattoo.plaf.hifi.HiFiLookAndFeel;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 *Esta clase será el entorno gráfico que servirá al usuario para manejar
 * de forma sencilla con botones todas las operaciones que se pueden
 * realizar.
 * @author José María Expósito Reyes
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    
    DbPeliculas db = new DbPeliculas();
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        JBtnBorrar = new javax.swing.JButton();
        JBtnGuardar1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jbtnModificar = new javax.swing.JButton();
        jBtnCatalogo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JtextSaga = new javax.swing.JTextField();
        JtextTitulo = new javax.swing.JTextField();
        JtextDirector = new javax.swing.JTextField();
        JtextGenero = new javax.swing.JTextField();
        JtextAnio = new javax.swing.JTextField();
        JtextActor = new javax.swing.JTextField();
        JtextHdd = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        JBtnBuscar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Año");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Videoteca de Pepe");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        JBtnBorrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBtnBorrar.setText("Borrar");
        JBtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnBorrarActionPerformed(evt);
            }
        });

        JBtnGuardar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBtnGuardar1.setText("Guardar");
        JBtnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnGuardar1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Resultado Búsqueda");

        jbtnModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnModificar.setText("Modificar");
        jbtnModificar.setToolTipText("");
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        jBtnCatalogo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtnCatalogo.setText("Catálogo");
        jBtnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCatalogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel10)
                        .addGap(0, 106, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBtnGuardar1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBtnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(jBtnCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Título");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Actor");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Director");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Género");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Saga");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Año");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("HDD");

        JtextSaga.setToolTipText("");
        JtextSaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextSagaActionPerformed(evt);
            }
        });

        JtextTitulo.setToolTipText("");
        JtextTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextTituloActionPerformed(evt);
            }
        });

        JtextDirector.setToolTipText("");
        JtextDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextDirectorActionPerformed(evt);
            }
        });

        JtextGenero.setToolTipText("");
        JtextGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextGeneroActionPerformed(evt);
            }
        });

        JtextAnio.setToolTipText("");
        JtextAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextAnioActionPerformed(evt);
            }
        });

        JtextActor.setToolTipText("");
        JtextActor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextActorActionPerformed(evt);
            }
        });

        JtextHdd.setToolTipText("");
        JtextHdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextHddActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Título", "Año", "Actor", "Director", "Género", "Saga", "HDD" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        JBtnBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBtnBuscar.setText("Buscar por:");
        JBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JtextActor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JtextDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JtextGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JtextSaga, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JtextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JtextAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JtextHdd, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(JBtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtextAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtextActor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtextDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtextGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtextSaga, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtextHdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1)
                    .addComponent(JBtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtextSagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextSagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextSagaActionPerformed

    private void JtextTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextTituloActionPerformed

    private void JtextDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextDirectorActionPerformed

    private void JtextGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextGeneroActionPerformed

    private void JtextAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextAnioActionPerformed

    private void JtextActorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextActorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextActorActionPerformed

    private void JtextHddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextHddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextHddActionPerformed
    /**
     * Este botón sirve para borrar películas.
     * @param evt 
     */
    private void JBtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnBorrarActionPerformed
        String cadena="";
        if (JtextTitulo.getText().length()==0){
            JOptionPane.showMessageDialog(null, "No ha introducido ningún título");
        }else{
            cadena= db.bajas(JtextTitulo.getText());
            JOptionPane.showMessageDialog(null, cadena);            
        }

        
        JtextTitulo.setText("");
        JtextActor.setText("");
        JtextDirector.setText("");
        JtextGenero.setText("");
        JtextHdd.setText("");
        JtextSaga.setText("");
        JtextAnio.setText("");
    }//GEN-LAST:event_JBtnBorrarActionPerformed
    /**
     * Este botón sirve para Buscar películas según la condición escogida.
     * Podemos buscar por:
     * <ul>
     * <li>Título</li>
     * <li>Año</li>
     * <li>Actor</li>
     * <li>Director</li>
     * <li>Género</li>
     * <li>Saga</li>
     * <li>HDD</li>
     * </ul>
     * @param evt 
     */
    private void JBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnBuscarActionPerformed
        // TODO add your handling code here:
        /*esta parte para mirar como hacerlo sin jcombobox
        if (JtextTitulo.getText()!=""){
            
        }
        */
        if(jComboBox1.getSelectedItem()=="Título"){
                if(JtextTitulo.getText().length()==0){
                    JOptionPane.showMessageDialog(null, "No ha introducido ningún"
                    + " título a buscar.");
                }else{
                    jTextArea1.setText(db.buscartitulo(JtextTitulo.getText()));
                }
        }
        if(jComboBox1.getSelectedItem()=="Año"){
                String cadena = JtextAnio.getText();
                cadena=cadena.replaceAll(" ", "");
                if(cadena.length()==0){
                    JOptionPane.showMessageDialog(null, "No ha introducido ningún"
                    + " año a buscar.");
                }else{
                    jTextArea1.setText(db.buscaranio(Integer.parseInt(cadena)));

                }
        }
        if(jComboBox1.getSelectedItem()=="Actor"){
                if(JtextActor.getText().length()==0){
                    JOptionPane.showMessageDialog(null, "No ha introducido ningún"
                    + " actor a buscar.");
                }else{
                    jTextArea1.setText(db.buscaractor(JtextActor.getText()));
                }
        }
        if(jComboBox1.getSelectedItem()=="Director"){
                if(JtextDirector.getText().length()==0){
                    JOptionPane.showMessageDialog(null, "No ha introducido ningún"
                    + " director a buscar.");
                }else{
                    jTextArea1.setText(db.buscardirector(JtextDirector.getText()));
                }
        }        
        if(jComboBox1.getSelectedItem()=="Género"){
                if(JtextGenero.getText().length()==0){
                    JOptionPane.showMessageDialog(null, "No ha introducido ningún"
                    + " género a buscar.");
                }else{
                    jTextArea1.setText(db.buscargenero(JtextGenero.getText()));
                }
        }
        if(jComboBox1.getSelectedItem()=="Saga"){
                if(JtextSaga.getText().length()==0){
                    JOptionPane.showMessageDialog(null, "No ha introducido ninguna"
                    + " saga a buscar.");
                }else{
                    jTextArea1.setText(db.buscarsaga(JtextSaga.getText()));
                }
        }       
        if(jComboBox1.getSelectedItem()=="HDD"){
                String cadena = JtextHdd.getText();
                cadena=cadena.replaceAll(" ", "");
                if(cadena.length()==0){
                    JOptionPane.showMessageDialog(null, "No ha introducido ningún"
                    + " hdd a buscar.");
                }else{
                    jTextArea1.setText(db.buscarhdd(Integer.parseInt(cadena)));
                }
        }
        JtextTitulo.setText("");
        JtextActor.setText("");
        JtextDirector.setText("");
        JtextGenero.setText("");
        JtextHdd.setText("");
        JtextSaga.setText("");
        JtextAnio.setText("");
        
    }//GEN-LAST:event_JBtnBuscarActionPerformed
    /**
     * Este botón nos servirá para guardar una película con todos sus atributos.
     * @param evt 
     */
    private void JBtnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnGuardar1ActionPerformed
        Pelicula p = new Pelicula(JtextTitulo.getText().toLowerCase(), 
                Integer.parseInt(JtextAnio.getText()),
                JtextActor.getText().toLowerCase(), 
                JtextDirector.getText().toLowerCase(),
                JtextGenero.getText().toLowerCase(),
                JtextSaga.getText().toLowerCase(),
                Integer.parseInt(JtextHdd.getText()));
     
        db.altas(p);
        JOptionPane.showMessageDialog(null, "Se ha guardado la película");
        
        JtextTitulo.setText("");
        JtextActor.setText("");
        JtextDirector.setText("");
        JtextGenero.setText("");
        JtextHdd.setText("");
        JtextSaga.setText("");
        JtextAnio.setText("");
    }//GEN-LAST:event_JBtnGuardar1ActionPerformed
    /**
     * Este botón servirá para modificar los atributos de una película.
     * @param evt 
     */
    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        String cadena="";
        if (JtextTitulo.getText().length()==0){
            JOptionPane.showMessageDialog(null, "No ha introducido ningún título");
        }else{
            if (JtextAnio.getText().length()==0){
            JOptionPane.showMessageDialog(null, "No ha introducido el año");
            }else{
                if (JtextActor.getText().length()==0){
                JOptionPane.showMessageDialog(null, "No ha introducido ningún actor");    
                }else
                    if (JtextDirector.getText().length()==0){
                    JOptionPane.showMessageDialog(null, "No ha introducido ningún director");
                    }else
                       if (JtextGenero.getText().length()==0){
                        JOptionPane.showMessageDialog(null, "No ha introducido ningún género"); 
                       }else
                           if (JtextSaga.getText().length()==0){
                            JtextSaga.setText("");
                            }else
                               if (JtextHdd.getText().length()==0){
                                JOptionPane.showMessageDialog(null, "No ha introducido el HDD");
                                }        
            }
        }
        
        cadena=db.modificar(JtextTitulo.getText(), 
                Integer.parseInt(JtextAnio.getText()),
                JtextActor.getText(),  
                JtextDirector.getText(),
                JtextGenero.getText(),
                JtextSaga.getText(),
                Integer.parseInt(JtextHdd.getText()));
        
        JOptionPane.showMessageDialog(null, cadena);
        
        JtextTitulo.setText("");
        JtextActor.setText("");
        JtextDirector.setText("");
        JtextGenero.setText("");
        JtextHdd.setText("");
        JtextSaga.setText("");
        JtextAnio.setText("");
    }//GEN-LAST:event_jbtnModificarActionPerformed
    /**
     * Este botón muestra todo el catálogo de la videoteca de películas.
     * @param evt 
     */
    private void jBtnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCatalogoActionPerformed
        jTextArea1.setText(db.mostrar());
    }//GEN-LAST:event_jBtnCatalogoActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    UIManager.setLookAndFeel(new HiFiLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnBorrar;
    private javax.swing.JButton JBtnBuscar;
    private javax.swing.JButton JBtnGuardar1;
    private javax.swing.JTextField JtextActor;
    private javax.swing.JTextField JtextAnio;
    private javax.swing.JTextField JtextDirector;
    private javax.swing.JTextField JtextGenero;
    private javax.swing.JTextField JtextHdd;
    private javax.swing.JTextField JtextSaga;
    private javax.swing.JTextField JtextTitulo;
    private javax.swing.JButton jBtnCatalogo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtnModificar;
    // End of variables declaration//GEN-END:variables
}