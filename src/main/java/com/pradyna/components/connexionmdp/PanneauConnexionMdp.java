/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pradyna.components.connexionmdp;

import com.karimandco.auth.Cryptage;
import com.karimandco.auth.Utilisateur;
import com.karimandco.bdd.DaoSIO;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;

/**
 *
 * @author pawel
 */
public class PanneauConnexionMdp extends javax.swing.JPanel {

    javax.swing.JDialog panneauPereModification = null;

    private Boolean connexionMdp = false;

    /**
     * Creates new form PanneauConnexionMdp
     */
    public PanneauConnexionMdp() {
        initComponents();

        panneauMdp.getjLabelNomChamp().setText("Veuillez saisir le mot de passe");
    }

    public Boolean getConnexionMdp() {
        return connexionMdp;
    }

    public void setConnexionMdp(Boolean connexionMdp) {
        this.connexionMdp = connexionMdp;
    }

    public void setFenParentConnexion(javax.swing.JDialog i) {
        this.panneauPereModification = i;
    }

    public JButton getjButtonValider() {
        return jButtonValider;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneauMdp = new com.pradyna.components.connexionmdp.PanneauMdp();
        jButtonValider = new javax.swing.JButton();
        jLabelEtat = new javax.swing.JLabel();

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panneauMdp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonValider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEtat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panneauMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonValider, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEtat, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        if (this.panneauMdp.getMdpOK()) {
            String mdp_sha256 = Cryptage.sha256(Cryptage.sha256(String.valueOf(this.panneauMdp.getjPasswordFieldResultat().getPassword())));
            ResultSet lesResultats = DaoSIO.getInstance().requeteSelection("SELECT id FROM utilisateurs WHERE identifiant='" + Utilisateur.getIdentifiant() + "' AND mot_de_passe='" + mdp_sha256 + "'");
            try {
                if (lesResultats.next()) {
                    jLabelEtat.setForeground(Color.blue);
                    jLabelEtat.setText("Connexion réussie");
                    this.setConnexionMdp(true);
                } else {
                    jLabelEtat.setForeground(Color.red);
                    jLabelEtat.setText("Mot de passe incorrect(s)");
                    this.setConnexionMdp(false);
                }
            } catch (SQLException e) {
            }
        } else {
            jLabelEtat.setForeground(Color.red);
            jLabelEtat.setText("Mot de passe manquant");
            this.setConnexionMdp(false);
        }
    }//GEN-LAST:event_jButtonValiderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonValider;
    private javax.swing.JLabel jLabelEtat;
    private com.pradyna.components.connexionmdp.PanneauMdp panneauMdp;
    // End of variables declaration//GEN-END:variables
}
