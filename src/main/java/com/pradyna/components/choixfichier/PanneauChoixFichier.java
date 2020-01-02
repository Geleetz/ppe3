/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pradyna.components.choixfichier;

import java.awt.Color;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author pawel
 */
public class PanneauChoixFichier extends javax.swing.JPanel {

    public JFileChooser jFileChooser;
    public File choix = null;

    private String formatFichier = null;
    private Boolean choixFichierOK = false;

    javax.swing.JDialog panneauPereChoixFichier = null;

    /**
     * Creates new form PanneauChoixFichierDossier
     */
    public PanneauChoixFichier() {
        initComponents();

        this.jFileChooser = new JFileChooser();
        this.jFileChooser.setAcceptAllFileFilterUsed(false);
        this.jFileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory() || FilenameUtils.getExtension(file.getAbsolutePath()).equals("json");
            }

            @Override
            public String getDescription() {
                return "Fichier .json";
            }
        });
        this.jFileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory() || FilenameUtils.getExtension(file.getAbsolutePath()).equals("xml");
            }

            @Override
            public String getDescription() {
                return "Fichier .xml";
            }
        });
        this.jFileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory() || FilenameUtils.getExtension(file.getAbsolutePath()).equals("csv");
            }

            @Override
            public String getDescription() {
                return "Fichier .csv";
            }
        });
        this.jFileChooser.setFileFilter(this.jFileChooser.getChoosableFileFilters()[0]);
    }

    public JButton getjButtonValider() {
        return jButtonValider;
    }

    public JTextField getjTextFieldChemin() {
        return jTextFieldChemin;
    }

    public JDialog getPanneauPereChoixFichier() {
        return panneauPereChoixFichier;
    }

    public void setPanneauPereChoixFichier(JDialog panneauPereChoixFichier) {
        this.panneauPereChoixFichier = panneauPereChoixFichier;
    }

    public String getFormatFichier() {
        return formatFichier;
    }

    public Boolean getChoixFichierOK() {
        return choixFichierOK;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonChoisir = new javax.swing.JButton();
        jTextFieldChemin = new javax.swing.JTextField();
        jButtonValider = new javax.swing.JButton();
        jLabelEtat = new javax.swing.JLabel();

        jButtonChoisir.setText("Choisir fichier");
        jButtonChoisir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChoisirActionPerformed(evt);
            }
        });

        jTextFieldChemin.setEditable(false);
        jTextFieldChemin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldChemin.setText("Aucun fichier sélectionné");

        jButtonValider.setText("Valider");
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        jLabelEtat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonValider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldChemin, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonChoisir))
                    .addComponent(jLabelEtat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonChoisir)
                    .addComponent(jTextFieldChemin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonValider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEtat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChoisirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChoisirActionPerformed
        if (this.jFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            this.choix = this.jFileChooser.getSelectedFile();
            jTextFieldChemin.setText(this.choix.getAbsolutePath());
            formatFichier = FilenameUtils.getExtension(this.choix.getAbsolutePath());
            choixFichierOK = true;
        }
    }//GEN-LAST:event_jButtonChoisirActionPerformed

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        if (!this.getChoixFichierOK()) {
            jLabelEtat.setForeground(Color.red);
            jLabelEtat.setText("Choix du fichier manquant");
        }
    }//GEN-LAST:event_jButtonValiderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChoisir;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JLabel jLabelEtat;
    private javax.swing.JTextField jTextFieldChemin;
    // End of variables declaration//GEN-END:variables
}
