/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.canautomotion.invoicegenerator;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;


/**
 *
 * @author User
 */
public class FilePicker extends javax.swing.JFrame {
    public static JDatePickerImpl datePicker;
    public static String siteName;
    
    /**
     * Creates new form FilePicker
     */
    public FilePicker() {
        initComponents();
        
        UtilDateModel model = new UtilDateModel();
        
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        datePicker = new JDatePickerImpl(datePanel);
        datePicker.setBounds(220,380,160,30);
                
        this.add(datePicker,BorderLayout.LINE_END);
        this.setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnChooseCSVFiles = new javax.swing.JButton();
        javax.swing.JLabel lblImage = new javax.swing.JLabel();
        lblAppName = new javax.swing.JLabel();
        txtSiteName = new javax.swing.JTextField();
        lblSiteName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Invoice Generator");
        setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/can_icon.jpg")));
        setName("mainFrame"); // NOI18N

        btnChooseCSVFiles.setBackground(new java.awt.Color(204, 0, 0));
        btnChooseCSVFiles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChooseCSVFiles.setForeground(new java.awt.Color(255, 255, 255));
        btnChooseCSVFiles.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnChooseCSVFiles.setBorderPainted(false);
        btnChooseCSVFiles.setLabel("Choose CSV Files");
        btnChooseCSVFiles.setName("btnChooseCSVFiles"); // NOI18N
        btnChooseCSVFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseCSVFilesActionPerformed(evt);
            }
        });

        lblImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\InvoiceGenerator\\src\\main\\resources\\Can_Automotion_Pty_Ltd.jpg")); // NOI18N
        lblImage.setText("\"Hello\"");

        lblAppName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAppName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAppName.setText("Invoice Generator");

        txtSiteName.setText("Enter the site name");
        txtSiteName.setToolTipText("Enter site name or business name");
        txtSiteName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSiteNameActionPerformed(evt);
            }
        });

        lblSiteName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSiteName.setText("Site Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Order Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblAppName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSiteName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSiteName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(175, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(btnChooseCSVFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAppName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSiteName)
                    .addComponent(txtSiteName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(btnChooseCSVFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        btnChooseCSVFiles.getAccessibleContext().setAccessibleName("btnChooseCSVFiles");
        lblImage.getAccessibleContext().setAccessibleParent(lblImage);

        getAccessibleContext().setAccessibleName("mainFrame");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooseCSVFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseCSVFilesActionPerformed
        JFileChooser chooser = new JFileChooser();
        
        // Setting multiple files select option
        chooser.setMultiSelectionEnabled(true);
        
        // Setting the title for the file browser
        chooser.setDialogTitle("Choose all CSV Files to merge");
        
        // Setting File Filter as CSV
        chooser.setFileFilter(new CSVFilter());

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) { 
          System.out.println("getCurrentDirectory(): " 
             +  chooser.getCurrentDirectory());
          System.out.println("getSelectedFile() : " 
             +  chooser.getSelectedFile());
        }
        else {
          System.out.println("No Selection ");
        }
        
        // Show the dialog; wait until dialog is closed
        JFrame frame = new JFrame();
        chooser.showOpenDialog(frame);

        // Retrieve the selected files.
        File[] files;
        files = chooser.getSelectedFiles();
        
        this.setVisible(false);
        siteName = txtSiteName.getText();
        
        java.awt.EventQueue.invokeLater(() -> {
            new FileMerger(files).setVisible(true);
        });
    }//GEN-LAST:event_btnChooseCSVFilesActionPerformed

    private void txtSiteNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSiteNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSiteNameActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilePicker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FilePicker().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseCSVFiles;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAppName;
    private javax.swing.JLabel lblSiteName;
    private javax.swing.JTextField txtSiteName;
    // End of variables declaration//GEN-END:variables
}
