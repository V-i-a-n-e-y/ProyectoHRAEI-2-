/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Objetos.Institucion;
import Objetos.Licenciatura;
import Objetos.Tutor;
import Objetos.Servicios1;
import Objetos.Persona;
import Operaciones.Operaciones;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vianey
 */
//aqui error
public class Menu extends javax.swing.JFrame {
    
   //File f = new File (".\\Sqliteman-1.2.2\\registroold.db");

    DefaultTableModel modelo;
    DefaultTableModel modelo1;
    Operaciones operaciones;
    String ruta_archivo = "";

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
        setLocationRelativeTo(null);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setTitle("Registro de campos clínicos");

        operaciones = new Operaciones();
        operaciones.conectar();
        modelo = new DefaultTableModel();
        modelo.addColumn("Folio1");
        modelo.addColumn("Institucion");
        modelo.addColumn("Servicios");
        modelo.addColumn("Total de alumnos");
        modelo.addColumn("Fecha de inicio");
        modelo.addColumn("Fecha de termino");

        modelo1 = new DefaultTableModel();
        modelo1.addColumn("Folio");
        modelo1.addColumn("Institucion");
        modelo1.addColumn("Servicios");
        modelo1.addColumn("Total de alumno");
        modelo1.addColumn("Fecha de inicio");
        modelo1.addColumn("Fecha de termino");
        this.tabla1.setModel(modelo1);

        
    }

    public void seleccionar_pdf() {
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        j.setFileFilter(fi);
        int se = j.showOpenDialog(this);
        if (se == 0) {
            //this.btnseleccionarpdf.setText("" + j.getSelectedFile().getName());
            String ruta_archivo = j.getSelectedFile().getAbsolutePath();

        } else {
        }

        MostrarPDFTutor abrir = new MostrarPDFTutor();
        abrir.setVisible(true);

    }

    /**
     
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtftermino = new javax.swing.JTextField();
        jLTitulo = new javax.swing.JLabel();
        jLfolio = new javax.swing.JLabel();
        jLinstitucion = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jTxtFolio = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtinstitucion = new javax.swing.JTextField();
        jtutor = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        jLcorreo = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLtelefono = new javax.swing.JLabel();
        txtlada = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        jLpractica = new javax.swing.JLabel();
        txtpractica = new javax.swing.JTextField();
        jLinicio = new javax.swing.JLabel();
        txtfinicio = new javax.swing.JTextField();
        jLftermino = new javax.swing.JLabel();
        jLentrada = new javax.swing.JLabel();
        txtentrada = new javax.swing.JTextField();
        jLsalida = new javax.swing.JLabel();
        txtsalida = new javax.swing.JTextField();
        jLturno = new javax.swing.JLabel();
        txtturno = new javax.swing.JTextField();
        jLnumeroalum = new javax.swing.JLabel();
        txtnumalum = new javax.swing.JTextField();
        jLsemestre = new javax.swing.JLabel();
        txtsemestre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        txtfechinicio2 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtfechtermino2 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtservicio2 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtotalalumnos2 = new javax.swing.JTextField();
        btninsertar1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        btneliminar1 = new javax.swing.JButton();
        btneliminartodo1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        btnseleccionarpdf = new javax.swing.JButton();
        jbguardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtgrado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtapellidom = new javax.swing.JTextField();
        txtapellidop = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        labelusuario = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLinst = new javax.swing.JLabel();
        txtinst = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla3 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla4 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        txtftermino.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLTitulo.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLTitulo.setText("REGISTRO DE CAMPOS CLÍNICOS PARA LICENCIATURA  Y POSGRADO.");

        jLfolio.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLfolio.setText("Folio:");

        jLinstitucion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLinstitucion.setText("Institución:");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hraei.png"))); // NOI18N
        jLabel21.setText("vbgfbnhgngh");

        jLabel22.setText("Unidad de Educación Continua");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel23.setText("  Dirección Planeación, Enseñanza e Investigación");

        jLabel24.setText("Hospital Regional de Alta Especialidad de Ixtapaluca");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel5.setText("Datos generales");

        jTxtFolio.setEditable(false);
        jTxtFolio.setBackground(new java.awt.Color(204, 204, 204));
        jTxtFolio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTxtFolio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtFolioMouseClicked(evt);
            }
        });
        jTxtFolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFolioActionPerformed(evt);
            }
        });

        jButton2.setText("Generar folio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtinstitucion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtinstitucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtinstitucionActionPerformed(evt);
            }
        });

        jtutor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jtutor.setText("Nombres:");

        txtnombres.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLcorreo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLcorreo.setText("Correo electrónico:");

        txtcorreo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });

        jLtelefono.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLtelefono.setText("Teléfono:");

        txtlada.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtlada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtladaActionPerformed(evt);
            }
        });

        txttel.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jLpractica.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLpractica.setText("Práctica:");

        txtpractica.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLinicio.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLinicio.setText("Fecha de inicio:");

        txtfinicio.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtfinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfinicioActionPerformed(evt);
            }
        });

        jLftermino.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLftermino.setText("Fecha de termino: ");

        jLentrada.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLentrada.setText("Hora de entrada:");

        txtentrada.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtentradaActionPerformed(evt);
            }
        });

        jLsalida.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLsalida.setText("Hora de salida:");

        txtsalida.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtsalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalidaActionPerformed(evt);
            }
        });

        jLturno.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLturno.setText("Turno:");

        txtturno.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLnumeroalum.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLnumeroalum.setText("Número de alumnos:");

        txtnumalum.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLsemestre.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLsemestre.setText("Semestre:");

        txtsemestre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setText("Servicios");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel38.setText("Fecha de inicio: ");

        txtfechinicio2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtfechinicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechinicio2ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel39.setText("Fecha de termino:");

        txtfechtermino2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel40.setText("Servicio:");

        txtservicio2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtservicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtservicio2ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel41.setText("Total de alumnos:");

        txtotalalumnos2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        btninsertar1.setText("Insertar");
        btninsertar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertar1ActionPerformed(evt);
            }
        });

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Institución", "Servicios", "Total de alumnos", "Fecha de inicio", "Fecha de termino"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabla1);

        btneliminar1.setText("Eliminar");
        btneliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminar1ActionPerformed(evt);
            }
        });

        btneliminartodo1.setText("Limpiar");
        btneliminartodo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminartodo1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setText("Documentos");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Agregar documentos ");

        btnseleccionarpdf.setText("Agregar...");
        btnseleccionarpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseleccionarpdfActionPerformed(evt);
            }
        });

        jbguardar.setText("Guardar");
        jbguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Grado:");

        txtgrado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtgrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgradoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Apellido paterno:");

        txtapellidom.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtapellidom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidomActionPerformed(evt);
            }
        });

        txtapellidop.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Apellido materno:");

        labelusuario.setText("-");

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel12.setText("Datos del tutor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 1115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLsemestre)
                                    .addComponent(jLsalida)
                                    .addComponent(jLinstitucion)
                                    .addComponent(jLpractica, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLturno)
                                    .addComponent(jLinicio)
                                    .addComponent(jLftermino)
                                    .addComponent(jLentrada))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLnumeroalum)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtgrado, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpractica, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtftermino, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtturno, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnumalum, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtinstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLcorreo)
                                    .addComponent(jLtelefono)
                                    .addComponent(jtutor)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtsemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtapellidom, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnombres, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(txtapellidop, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtcorreo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtlada, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(187, 187, 187)))
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(124, 124, 124))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLfolio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(407, 407, 407))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel22))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))))
                        .addGap(146, 146, 146))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btneliminar1)
                                .addGap(18, 18, 18)
                                .addComponent(btneliminartodo1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfechinicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addGap(94, 94, 94)
                                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtfechtermino2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 1096, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8)
                        .addGap(50, 50, 50)
                        .addComponent(btnseleccionarpdf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(161, 161, 161))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(525, 525, 525)
                .addComponent(txtservicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtotalalumnos2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btninsertar1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelusuario)
                            .addComponent(jLTitulo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLfolio)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtgrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtutor)
                                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtinstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLinstitucion)
                                    .addComponent(jLabel9)
                                    .addComponent(txtapellidop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtpractica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLpractica)
                                    .addComponent(jLabel10)
                                    .addComponent(txtapellidom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtfinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLinicio)
                                    .addComponent(jLcorreo)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtftermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLftermino)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtlada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))
                        .addComponent(txtentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLsalida))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLturno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtnumalum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLnumeroalum, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLsemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfechinicio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfechtermino2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtservicio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtotalalumnos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btninsertar1))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneliminartodo1)
                    .addComponent(btneliminar1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnseleccionarpdf)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("REGISTRO CAMPO CLÍNICO", jScrollPane1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hraei.png"))); // NOI18N
        jLabel33.setText("vbgfbnhgngh");

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel11.setText("CONSULTAS DE CAMPOS CLÍNICOS ");

        jLabel36.setText("Hospital Regional de Alta Especialidad de Ixtapaluca");

        jLabel34.setText("Dirección Planeación, Enseñanza e Investigación ");

        jLabel35.setText("Unidad de Educación Continua");
        jLabel35.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLinst.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLinst.setText("Buscar por institución:");

        txtinst.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtinst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtinstActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Campo clínico");

        tabla3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla3);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Servicios");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Documentos");

        tabla4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tabla4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1187, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane5)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLinst))
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtinst, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addComponent(btnConsultar)
                                .addGap(39, 39, 39)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 137, Short.MAX_VALUE)))))
                .addGap(207, 207, 207))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel33)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(71, 71, 71)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLinst)
                    .addComponent(txtinst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jScrollPane6.setViewportView(jPanel3);

        jTabbedPane1.addTab("CONSULTA DE CAMPOS CLINICOS", jScrollPane6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1235, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1171, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if(tabla3.getRowCount()>0){
            javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(0,tabla3.getColumnCount());
            tabla3.setModel(modelo);

            if(tabla4.getRowCount()>0){
                javax.swing.table.DefaultTableModel modelo1 = new javax.swing.table.DefaultTableModel(0,tabla4.getColumnCount());
                tabla4.setModel(modelo1);
            }
            if(jTable1.getRowCount()>0){
                javax.swing.table.DefaultTableModel modelo2 = new javax.swing.table.DefaultTableModel(0,jTable1.getColumnCount());
                jTable1.setModel(modelo2);
                
                
                 limpiar();
            modelo.setRowCount(0);

            int fila = tabla1.getRowCount();
            for (int i = fila - 1; i >= 0; i--) {
                modelo1.removeRow(i);
        
            }
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
       String totalServicios = txtinst.getText();
        operaciones.totalLicenciaturas((DefaultTableModel) tabla3.getModel(), totalServicios);

        operaciones.totalServicios((DefaultTableModel) jTable1.getModel(), totalServicios);

        operaciones.totalDocumentos((DefaultTableModel) tabla4.getModel(), totalServicios);

        modelo.setRowCount(0);
        
         
     

        // ResultSet /*totalServicios1*/ = operaciones.totalServicios((DefaultTableModel) jTable1.getModel(), totalServicios);
        //modelo1.removeRow(i);
        /* try {

            // TODO add your handling code here:

            ResultSet rs =null;
            rs = operaciones.totalServicios((DefaultTableModel)jTable1.getModel(),totalServicios);
            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);
            modelo.setColumnIdentifiers(new Object[]{"folio","institucion", "servicio", "alumnos", "Fecha de inicio", "Fecha de termino"});

            while(rs.next() ){
                modelo.addRow(new Object[]{rs.getInt("folio"), rs.getString("institucion"),rs.getString("servicios"), rs.getString("alumnos"), rs.getString("Fecha de inicio"), rs.getString("Fecha de termino")});

                modelo.addColumn("folio");
                modelo.addColumn("institucion");
                modelo.addColumn("no_de_alumnos");
                modelo.addColumn("fecha_de_inicio");
                modelo.addColumn("fecha_de_termino");
                modelo.addColumn("turno");
                modelo.addColumn("hora_de_entrada");
                modelo.addColumn("hora_de_salida");

                tabla3.setModel(modelo);

            } catch (SQLException ex) {
                Logger.getLogger(Consultacc.class.getName()).log(Level.SEVERE, null, ex);
            }

        } } catch (SQLException ex) {
            Logger.getLogger(Consultacc.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtinstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtinstActionPerformed

    private void txtapellidomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidomActionPerformed

    private void txtgradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgradoActionPerformed

    private void jbguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarActionPerformed
        // TODO add your handling code here

            try {

          Tutor tutor;
           int id_tutor;
           Operaciones o;
           o = new Operaciones();
           id_tutor = o.auto_tutor();
            int a = 0;
            
                
       //   String id_tutor = Integer.toString(a);
     //     jTxtFolio.setText(id_tutor);
          int lada= Integer.parseInt(txtlada.getText());
            int tel = Integer.parseInt(txttel.getText());
            tutor = new Tutor( id_tutor, txtnombres.getText() ,txtapellidop.getText(), txtapellidom.getText(), txtcorreo.getText(), lada, tel);
            
         Persona persona;
            int id_usuario;
            persona = new Persona();
            id_usuario = persona.getId_usuario();
            //Persona persona = new Persona (id_usuario, nombres, primer_apellido, segundo_apellido, user, pass);
            //int b = 0;
            //   String id_tutor = Integer.toString(a);
            //     jTxtFolio.setText(id_tutor);   
            
            
        
             Institucion institucion;
            int id_institucion;
            id_institucion = o.auto_institucion();
            institucion = new Institucion( id_institucion, txtinstitucion.getText());

            
          //  Persona persona = new Persona (id_usuario, nombres, primer_apellido, segundo_apellido, user, pass);
        Licenciatura licenciatura;
            int folio = Integer.parseInt(jTxtFolio.getText());
            int semestre = Integer.parseInt(txtsemestre.getText());
            int no_alumnos = Integer.parseInt(txtnumalum.getText());

            licenciatura = new Licenciatura(folio, txtgrado.getText(), txtpractica.getText(), txtfinicio.getText(), txtftermino.getText(),  no_alumnos,  semestre, txtturno.getText(), txtentrada.getText(), txtsalida.getText(), id_institucion, id_tutor, id_usuario);
 
            operaciones.guardarLicenciaturas(licenciatura);
            operaciones.guardarinstitucion(institucion);
            operaciones.guardartutor(tutor);
            JOptionPane.showMessageDialog(null, "Campo clínico, registrado exitosamente");
            limpiar();
        //} catch (NumberFormatException | HeadlessException ex) {
            } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "Error:" + ex.getMessage() + "\nVerifique");
            limpiar();
            modelo.setRowCount(0);

            int fila = tabla1.getRowCount();
            for (int i = fila - 1; i >= 0; i--) {
                modelo1.removeRow(i);
            }

        
    }//GEN-LAST:event_jbguardarActionPerformed
                      
               
            
            }
    private void btnseleccionarpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseleccionarpdfActionPerformed
        // TODO add your handling code here:
        MostrarPDFTutor obj = new MostrarPDFTutor();
        obj.setVisible(true);
        MostrarPDFTutor.txtfolio.setText(jTxtFolio.getText());
        MostrarPDFTutor.txtinstitucion.setText(txtinstitucion.getText());
        MostrarPDFTutor.txtfechainicio.setText(txtfinicio.getText());
        MostrarPDFTutor.txtfechatermino.setText(txtftermino.getText());
         // obj.txtfechatermino.setText(txtftermino.getText());
        //MostrarPDFTutor.txtfolio2.setText(jTxtFolio.getText());
        //MostrarPDFTutor.txtinstitucion2.setText(txtinstitucion.getText());
    }//GEN-LAST:event_btnseleccionarpdfActionPerformed

    private void btneliminartodo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminartodo1ActionPerformed
        // TODO add your handling code here:
        int fila = tabla1.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            modelo1.removeRow(i);
        }
    }//GEN-LAST:event_btneliminartodo1ActionPerformed

    private void btneliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminar1ActionPerformed
        // TODO add your handling code here:
        int fila = tabla1.getSelectedRow();
        if (fila >= 0) {
            modelo1.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccionar Fila");
        }
    }//GEN-LAST:event_btneliminar1ActionPerformed

    private void btninsertar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertar1ActionPerformed
        // TODO add your handling code here:
        String[] info = new String[6];
        info[0] = jTxtFolio.getText();
        info[1] = txtinstitucion.getText();
        info[2] = txtservicio2.getText();
        info[3] = txtotalalumnos2.getText();
        info[4] = txtfechinicio2.getText();
        info[5] = txtfechtermino2.getText();
        modelo1.addRow(info);

         Servicios1 servicios1 ;
        int folio = Integer.parseInt(jTxtFolio.getText());
        int num_alumno = Integer.parseInt(txtotalalumnos2.getText());

        servicios1 = new Servicios1(folio,txtservicio2.getText(), num_alumno ,txtfechinicio2.getText(),txtfechtermino2.getText());
        operaciones.guardarServicios1(servicios1);


        
        limpiar() ;
        txtservicio2.setText("");
        txtotalalumnos2.setText("");
        txtfechinicio2.setText("");
        txtfechtermino2.setText("");
    }//GEN-LAST:event_btninsertar1ActionPerformed

    private void txtservicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtservicio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtservicio2ActionPerformed

    private void txtfechinicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechinicio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechinicio2ActionPerformed

    private void txtsalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalidaActionPerformed

    private void txtentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtentradaActionPerformed

    private void txtfinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfinicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfinicioActionPerformed

    private void txtladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtladaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtladaActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txtinstitucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinstitucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtinstitucionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Operaciones o;
        o = new Operaciones();
        int a = o.auto_lic();
        String folio = Integer.toString(a);
        jTxtFolio.setText(folio);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTxtFolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFolioActionPerformed

    }//GEN-LAST:event_jTxtFolioActionPerformed

    private void jTxtFolioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtFolioMouseClicked

    }//GEN-LAST:event_jTxtFolioMouseClicked
    

         private void limpiar() {
        jTxtFolio.setText(" ");
        txtinstitucion.setText(" ");
        txtpractica.setText(" ");
        txtturno.setText(" ");
        txtfinicio.setText(" ");
        txtftermino.setText(" ");
        txtnumalum.setText("");
        txtsemestre.setText(" ");
        txtentrada.setText(" ");
        txtsalida.setText(" ");
        txtnombres.setText(" ");
        txtcorreo.setText(" ");
        txttel.setText(" ");
        txtlada.setText(" ");
        txtgrado.setText(" ");
        txtapellidop.setText(" ");
        txtapellidom.setText(" ");
        txtfechinicio2.setText(" ");
        txtfechtermino2.setText(" ");
        txtservicio2.setText(" ");
        txtotalalumnos2.setText(" ");

        jTxtFolio.setText("");
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            Menu men = new Menu();
            men.setExtendedState(MAXIMIZED_BOTH);
            men.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btneliminar1;
    private javax.swing.JButton btneliminartodo1;
    private javax.swing.JButton btninsertar1;
    private javax.swing.JButton btnseleccionarpdf;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLcorreo;
    private javax.swing.JLabel jLentrada;
    private javax.swing.JLabel jLfolio;
    private javax.swing.JLabel jLftermino;
    private javax.swing.JLabel jLinicio;
    private javax.swing.JLabel jLinst;
    private javax.swing.JLabel jLinstitucion;
    private javax.swing.JLabel jLnumeroalum;
    private javax.swing.JLabel jLpractica;
    private javax.swing.JLabel jLsalida;
    private javax.swing.JLabel jLsemestre;
    private javax.swing.JLabel jLtelefono;
    private javax.swing.JLabel jLturno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTxtFolio;
    private javax.swing.JButton jbguardar;
    private javax.swing.JLabel jtutor;
    public javax.swing.JLabel labelusuario;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla3;
    private javax.swing.JTable tabla4;
    private javax.swing.JTextField txtapellidom;
    private javax.swing.JTextField txtapellidop;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtentrada;
    private javax.swing.JTextField txtfechinicio2;
    private javax.swing.JTextField txtfechtermino2;
    private javax.swing.JTextField txtfinicio;
    private javax.swing.JTextField txtftermino;
    private javax.swing.JTextField txtgrado;
    private javax.swing.JTextField txtinst;
    public javax.swing.JTextField txtinstitucion;
    private javax.swing.JTextField txtlada;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtnumalum;
    private javax.swing.JTextField txtotalalumnos2;
    private javax.swing.JTextField txtpractica;
    private javax.swing.JTextField txtsalida;
    private javax.swing.JTextField txtsemestre;
    private javax.swing.JTextField txtservicio2;
    private javax.swing.JTextField txttel;
    private javax.swing.JTextField txtturno;
    // End of variables declaration//GEN-END:variables
}
