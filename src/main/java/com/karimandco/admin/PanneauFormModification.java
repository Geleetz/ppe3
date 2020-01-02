/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karimandco.admin;

import com.karimandco.auth.*;
import com.pradyna.components.PanneauInformationsCompte;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Damien F, Pawel R, Théo M
 */
public class PanneauFormModification extends javax.swing.JPanel {

    public com.pradyna.components.connexionmdp.DialogFormConnexionMdp cConnexionMdp;
    public com.karimandco.admin.DialogFormModification panneauPereModification;

    private Boolean nomOK = false;
    private Boolean prenomOK = false;
    private Boolean identifiantOK = true;
    private Boolean courrielOK = false;
    private Boolean numeroTelephoneOK = false;
    private Boolean dateNaissanceOK = false;

    private Boolean modificationOK = false;

    /**
     * Ce constructeur permet d'initialiser le nom des labels et de générer les
     * KeyListener pour capturer les actions.
     */
    public PanneauFormModification() {
        initComponents();

        panneauNom.setjLabelNomChamp("Nom");
        panneauPrenom.setjLabelNomChamp("Prénom");
        panneauIdentifiant.setjLabelNomChamp("Identifiant");
        panneauCourriel.setjLabelNomChamp("Courriel");
        panneauNumeroTelephone.setjLabelNomChamp("Numéro de téléphone");
        panneauDateNaissance.setjLabelNomChamp("Date de naissance (jj/mm/aaaa)");

        KeyListener(panneauNom, 0);
        KeyListener(panneauPrenom, 1);
        KeyListener(panneauIdentifiant, 2);
        KeyListener(panneauCourriel, 3);
        KeyListener(panneauNumeroTelephone, 4);
        KeyListener(panneauDateNaissance, 5);

        panneauIdentifiant.getChamp2().setEditable(false);

    }

    public void setNomOK(Boolean nomOK) {
        this.nomOK = nomOK;
    }

    public void setPrenomOK(Boolean prenomOK) {
        this.prenomOK = prenomOK;
    }

    public void setIdentifiantOK(Boolean identifiantOK) {
        this.identifiantOK = identifiantOK;
    }

    public void setCourrielOK(Boolean courrielOK) {
        this.courrielOK = courrielOK;
    }

    public void setNumeroTelephoneOK(Boolean numeroTelephoneOK) {
        this.numeroTelephoneOK = numeroTelephoneOK;
    }

    public void setDateNaissanceOK(Boolean dateNaissanceOK) {
        this.dateNaissanceOK = dateNaissanceOK;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setPanneauPereModification(DialogFormModification panneauPereModification) {
        this.panneauPereModification = panneauPereModification;
    }

    public Boolean getModificationOK() {
        return modificationOK;
    }

    public void setModificationOK(Boolean modificationOK) {
        this.modificationOK = modificationOK;
    }

    public PanneauChamp getPanneauCourriel() {
        return panneauCourriel;
    }

    public PanneauChamp getPanneauDateNaissance() {
        return panneauDateNaissance;
    }

    public PanneauChamp getPanneauNom() {
        return panneauNom;
    }

    public PanneauChamp getPanneauPrenom() {
        return panneauPrenom;
    }

    public PanneauInformationsCompte getPanneauInformationsCompte1() {
        return panneauInformationsCompte1;
    }

    public PanneauChamp getPanneauNumeroTelephone() {
        return panneauNumeroTelephone;
    }

    public PanneauChamp getPanneauIdentifiant() {
        return panneauIdentifiant;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelEtatMaj = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelInfoImp = new javax.swing.JPanel();
        panneauNom = new com.karimandco.auth.PanneauChamp();
        panneauDateNaissance = new com.karimandco.auth.PanneauChamp();
        panneauNumeroTelephone = new com.karimandco.auth.PanneauChamp();
        panneauIdentifiant = new com.karimandco.auth.PanneauChamp();
        panneauCourriel = new com.karimandco.auth.PanneauChamp();
        panneauPrenom = new com.karimandco.auth.PanneauChamp();
        jPanelInfoComp = new javax.swing.JPanel();
        panneauInformationsCompte1 = new com.pradyna.components.PanneauInformationsCompte();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mon profil");

        jButton1.setText("Mettre à jour les informations");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelEtatMaj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelInfoImpLayout = new javax.swing.GroupLayout(jPanelInfoImp);
        jPanelInfoImp.setLayout(jPanelInfoImpLayout);
        jPanelInfoImpLayout.setHorizontalGroup(
            jPanelInfoImpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoImpLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelInfoImpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoImpLayout.createSequentialGroup()
                        .addComponent(panneauNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panneauPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInfoImpLayout.createSequentialGroup()
                        .addComponent(panneauIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panneauCourriel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInfoImpLayout.createSequentialGroup()
                        .addComponent(panneauNumeroTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panneauDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelInfoImpLayout.setVerticalGroup(
            jPanelInfoImpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoImpLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanelInfoImpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panneauPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panneauNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoImpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panneauIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panneauCourriel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoImpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panneauNumeroTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panneauDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        jTabbedPane1.addTab("Info importants", jPanelInfoImp);

        javax.swing.GroupLayout jPanelInfoCompLayout = new javax.swing.GroupLayout(jPanelInfoComp);
        jPanelInfoComp.setLayout(jPanelInfoCompLayout);
        jPanelInfoCompLayout.setHorizontalGroup(
            jPanelInfoCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
            .addGroup(jPanelInfoCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelInfoCompLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panneauInformationsCompte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelInfoCompLayout.setVerticalGroup(
            jPanelInfoCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
            .addGroup(jPanelInfoCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelInfoCompLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panneauInformationsCompte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Info complémentaires", jPanelInfoComp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelEtatMaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 8, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEtatMaj, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (nomOK && prenomOK && identifiantOK && courrielOK && numeroTelephoneOK && dateNaissanceOK && panneauInformationsCompte1.getNumeroTelephoneDeuxOK() && panneauInformationsCompte1.getSiteWebOK() && panneauInformationsCompte1.getPaysOK() && panneauInformationsCompte1.getCodePostalOK() && panneauInformationsCompte1.getVilleOK() && panneauInformationsCompte1.getNumeroRueOK() && panneauInformationsCompte1.getAdresseOK() && panneauInformationsCompte1.getInfoCompOK()) {
            this.setModificationOK(true);
        } else {
            jLabelEtatMaj.setForeground(Color.red);
            jLabelEtatMaj.setText("Champ(s) manquant(s)");
            this.setModificationOK(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEtatMaj;
    private javax.swing.JPanel jPanelInfoComp;
    private javax.swing.JPanel jPanelInfoImp;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.karimandco.auth.PanneauChamp panneauCourriel;
    private com.karimandco.auth.PanneauChamp panneauDateNaissance;
    private com.karimandco.auth.PanneauChamp panneauIdentifiant;
    private com.pradyna.components.PanneauInformationsCompte panneauInformationsCompte1;
    private com.karimandco.auth.PanneauChamp panneauNom;
    private com.karimandco.auth.PanneauChamp panneauNumeroTelephone;
    private com.karimandco.auth.PanneauChamp panneauPrenom;
    // End of variables declaration//GEN-END:variables

    /**
     * Cette méthode permet de générer un KeyListener pour les panneaux champ.
     *
     * @param champ PanneauChamp champ
     * @param numeroVerif Integer numéro du champ
     */
    private void KeyListener(PanneauChamp champ, Integer numeroVerif) {
        champ.getChamp2().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                updateJLabelEtat(champ, numeroVerif);
            }
        });
    }

    public void updateAllJLabelEtat() {
        updateJLabelEtat(panneauNom, 0);
        updateJLabelEtat(panneauPrenom, 1);
        updateJLabelEtat(panneauIdentifiant, 2);
        updateJLabelEtat(panneauCourriel, 3);
        updateJLabelEtat(panneauNumeroTelephone, 4);
        updateJLabelEtat(panneauDateNaissance, 5);

        panneauInformationsCompte1.updateJLabelEtat(panneauInformationsCompte1.getPanneauNumeroTelephoneDeux(), 0);
        panneauInformationsCompte1.updateJLabelEtat(panneauInformationsCompte1.getPanneauSiteWeb(), 1);
        panneauInformationsCompte1.updateJLabelEtat(panneauInformationsCompte1.getPanneauPays(), 2);
        panneauInformationsCompte1.updateJLabelEtat(panneauInformationsCompte1.getPanneauCodePostal(), 3);
        panneauInformationsCompte1.updateJLabelEtat(panneauInformationsCompte1.getPanneauVille(), 4);
        panneauInformationsCompte1.updateJLabelEtat(panneauInformationsCompte1.getPanneauNumeroRue(), 5);
        panneauInformationsCompte1.updateJLabelEtat(panneauInformationsCompte1.getPanneauAdresse(), 6);
        panneauInformationsCompte1.updateJLabelEtat(panneauInformationsCompte1.getPanneauInfoComp(), 7);
    }

    /**
     * Cette méthode permet de mettre à jour les JLabelEtat des champs
     *
     * @param champ PanneauChamp champ
     * @param numeroVerif Integer numéro du champ à vérifier
     */
    public void updateJLabelEtat(PanneauChamp champ, Integer numeroVerif) {
        Boolean resultat = null;
        if (!champ.getChamp2().getText().equals("")) {
            if (numeroVerif == 0) {
                resultat = champ.getChamp2().verifNom();
                setNomOK(resultat);
            } else if (numeroVerif == 1) {
                resultat = champ.getChamp2().verifPrenom();
                setPrenomOK(resultat);
            } else if (numeroVerif == 2) {
                resultat = champ.getChamp2().verifIdentifiant();
                setIdentifiantOK(resultat);
            } else if (numeroVerif == 3) {
                resultat = champ.getChamp2().verifCourriel();
                setCourrielOK(resultat);
            } else if (numeroVerif == 4) {
                resultat = champ.getChamp2().verifNumeroTelephone();
                setNumeroTelephoneOK(resultat);
            } else if (numeroVerif == 5) {
                resultat = champ.getChamp2().verifDateNaissance();
                setDateNaissanceOK(resultat);
            }

            if (resultat == true) {
                champ.setjLabelEtatChamp(Color.blue);
                champ.setjLabelEtatChamp("Format ok");
            } else {
                champ.setjLabelEtatChamp(Color.red);
                champ.setjLabelEtatChamp("Format non ok");
            }
        } else {
            if (numeroVerif == 0) {
                setNomOK(champ.getChamp2().verifNom());
            } else if (numeroVerif == 1) {
                setPrenomOK(champ.getChamp2().verifPrenom());
            } else if (numeroVerif == 2) {
                setIdentifiantOK(champ.getChamp2().verifIdentifiant());
            } else if (numeroVerif == 3) {
                setCourrielOK(champ.getChamp2().verifCourriel());
            } else if (numeroVerif == 4) {
                setNumeroTelephoneOK(champ.getChamp2().verifNumeroTelephone());
            } else if (numeroVerif == 5) {
                setDateNaissanceOK(champ.getChamp2().verifDateNaissance());
            }

            champ.setjLabelEtatChamp(Color.black);
            champ.setjLabelEtatChamp("");
        }
    }

    public void updateAllJTextField(String[] information) {
        getPanneauNom().getChamp2().setText(information[2]);
        getPanneauPrenom().getChamp2().setText(information[3]);
        getPanneauDateNaissance().getChamp2().setText(information[4]);
        getPanneauInformationsCompte1().getPanneauNumeroRue().getChamp2().setText(information[5]);
        getPanneauInformationsCompte1().getPanneauAdresse().getChamp2().setText(information[6]);
        getPanneauInformationsCompte1().getPanneauInfoComp().getChamp2().setText(information[7]);
        getPanneauInformationsCompte1().getPanneauCodePostal().getChamp2().setText(information[8]);
        getPanneauInformationsCompte1().getPanneauVille().getChamp2().setText(information[9]);
        getPanneauInformationsCompte1().getPanneauPays().getChamp2().setText(information[10]);
        getPanneauCourriel().getChamp2().setText(information[11]);
        getPanneauNumeroTelephone().getChamp2().setText(information[12]);
        getPanneauInformationsCompte1().getPanneauNumeroTelephoneDeux().getChamp2().setText(information[13]);
        getPanneauInformationsCompte1().getPanneauSiteWeb().getChamp2().setText(information[14]);

        updateAllJLabelEtat();
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

}
