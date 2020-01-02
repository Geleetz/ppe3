/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pradyna.components;

import com.karimandco.auth.PanneauChamp;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author pawel
 */
public class PanneauInformationsCompte extends javax.swing.JPanel {

    private Boolean numeroTelephoneDeuxOK = true;
    private Boolean siteWebOK = true;
    private Boolean paysOK = false;
    private Boolean codePostalOK = false;
    private Boolean villeOK = false;
    private Boolean numeroRueOK = true;
    private Boolean adresseOK = false;
    private Boolean infoCompOK = true;

    public Boolean getNumeroTelephoneDeuxOK() {
        return numeroTelephoneDeuxOK;
    }

    public void setNumeroTelephoneDeuxOK(Boolean numeroTelephoneDeuxOK) {
        this.numeroTelephoneDeuxOK = numeroTelephoneDeuxOK;
    }

    public Boolean getSiteWebOK() {
        return siteWebOK;
    }

    public void setSiteWebOK(Boolean siteWebOK) {
        this.siteWebOK = siteWebOK;
    }

    public Boolean getPaysOK() {
        return paysOK;
    }

    public void setPaysOK(Boolean paysOK) {
        this.paysOK = paysOK;
    }

    public Boolean getCodePostalOK() {
        return codePostalOK;
    }

    public void setCodePostalOK(Boolean codePostalOK) {
        this.codePostalOK = codePostalOK;
    }

    public Boolean getVilleOK() {
        return villeOK;
    }

    public void setVilleOK(Boolean villeOK) {
        this.villeOK = villeOK;
    }

    public Boolean getNumeroRueOK() {
        return numeroRueOK;
    }

    public void setNumeroRueOK(Boolean numeroRueOK) {
        this.numeroRueOK = numeroRueOK;
    }

    public Boolean getAdresseOK() {
        return adresseOK;
    }

    public void setAdresseOK(Boolean adresseOK) {
        this.adresseOK = adresseOK;
    }

    public Boolean getInfoCompOK() {
        return infoCompOK;
    }

    public void setInfoCompOK(Boolean infoCompOK) {
        this.infoCompOK = infoCompOK;
    }

    public PanneauChamp getPanneauAdresse() {
        return panneauAdresse;
    }

    public void setPanneauAdresse(PanneauChamp panneauAdresse) {
        this.panneauAdresse = panneauAdresse;
    }

    public PanneauChamp getPanneauInfoComp() {
        return panneauInfoComp;
    }

    public void setPanneauInfoComp(PanneauChamp panneauInfoComp) {
        this.panneauInfoComp = panneauInfoComp;
    }

    public PanneauChamp getPanneauNumeroRue() {
        return panneauNumeroRue;
    }

    public void setPanneauNumeroRue(PanneauChamp panneauNumeroRue) {
        this.panneauNumeroRue = panneauNumeroRue;
    }

    public PanneauChamp getPanneauNumeroTelephoneDeux() {
        return panneauNumeroTelephoneDeux;
    }

    public void setPanneauNumeroTelephoneDeux(PanneauChamp panneauNumeroTelephoneDeux) {
        this.panneauNumeroTelephoneDeux = panneauNumeroTelephoneDeux;
    }

    public PanneauChamp getPanneauPays() {
        return panneauPays;
    }

    public void setPanneauPays(PanneauChamp panneauPays) {
        this.panneauPays = panneauPays;
    }

    public PanneauChamp getPanneauSiteWeb() {
        return panneauSiteWeb;
    }

    public void setPanneauSiteWeb(PanneauChamp panneauSiteWeb) {
        this.panneauSiteWeb = panneauSiteWeb;
    }

    public PanneauChamp getPanneauVille() {
        return panneauVille;
    }

    public void setPanneauVille(PanneauChamp panneauVille) {
        this.panneauVille = panneauVille;
    }

    public PanneauChamp getPanneauCodePostal() {
        return panneauCodePostal;
    }

    public void setPanneauCodePostal(PanneauChamp panneauCodePostal) {
        this.panneauCodePostal = panneauCodePostal;
    }

    /**
     * Creates new form PanneauInformationsCompte
     */
    public PanneauInformationsCompte() {
        initComponents();

        panneauNumeroTelephoneDeux.setjLabelNomChamp("Numéro de téléphone 2");
        panneauSiteWeb.setjLabelNomChamp("Site web");
        panneauPays.setjLabelNomChamp("Pays *");
        panneauCodePostal.setjLabelNomChamp("Code postal *");
        panneauVille.setjLabelNomChamp("Ville *");
        panneauNumeroRue.setjLabelNomChamp("Numéro de rue *");
        panneauAdresse.setjLabelNomChamp("Adresse *");
        panneauInfoComp.setjLabelNomChamp("Informations complémentaire");

        KeyListener(panneauNumeroTelephoneDeux, 0);
        KeyListener(panneauSiteWeb, 1);
        KeyListener(panneauPays, 2);
        KeyListener(panneauCodePostal, 3);
        KeyListener(panneauVille, 4);
        KeyListener(panneauNumeroRue, 5);
        KeyListener(panneauAdresse, 6);
        KeyListener(panneauInfoComp, 7);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneauNumeroTelephoneDeux = new com.karimandco.auth.PanneauChamp();
        panneauSiteWeb = new com.karimandco.auth.PanneauChamp();
        panneauPays = new com.karimandco.auth.PanneauChamp();
        panneauNumeroRue = new com.karimandco.auth.PanneauChamp();
        panneauAdresse = new com.karimandco.auth.PanneauChamp();
        panneauInfoComp = new com.karimandco.auth.PanneauChamp();
        panneauCodePostal = new com.karimandco.auth.PanneauChamp();
        panneauVille = new com.karimandco.auth.PanneauChamp();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panneauNumeroTelephoneDeux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panneauSiteWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panneauPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panneauCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panneauAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panneauInfoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panneauVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panneauNumeroRue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panneauSiteWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panneauNumeroTelephoneDeux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panneauPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panneauCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panneauNumeroRue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panneauVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panneauInfoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panneauAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

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
                resultat = champ.getChamp2().verifNumeroTelephone();
                setNumeroTelephoneDeuxOK(resultat);
            } else if (numeroVerif == 1) {
                resultat = champ.getChamp2().verifSiteWeb();
                setSiteWebOK(resultat);
            } else if (numeroVerif == 2) {
                resultat = champ.getChamp2().verifPays();
                if (resultat) {
                    if (champ.getChamp2().getText().length() > 2) {
                        Pays.setNom_pays(champ.getChamp2().getText());
                        Pays.getInstance().chargerInfoPays();
                        if (Pays.getInstance().getPays() != null) {
                            resultat = true;
                            setPaysOK(true);
                        } else {
                            resultat = false;
                            setPaysOK(false);
                        }
                    } else {
                        resultat = false;
                        setPaysOK(false);
                    }
                }
            } else if (numeroVerif == 3) {
                resultat = champ.getChamp2().verifCodePostal();
                if (Pays.getInstance().getPays() != null && resultat) {
                    if (champ.getChamp2().getText().length() > 2) {
                        Ville.setAbreviation_pays(Pays.getInstance().getPays()[2]);
                        Ville.setCode_postal(champ.getChamp2().getText());
                        Ville.getInstance().chargerInfoVille();
                        if (Ville.getInstance().getVilles() != null) {
                            panneauVille.getChamp2().setText(Ville.getInstance().getVilles()[0]);
                            updateJLabelEtat(panneauVille, 4);
                            resultat = true;
                            setCodePostalOK(true);
                        } else {
                            panneauVille.getChamp2().setText("");
                            updateJLabelEtat(panneauVille, 4);
                            resultat = false;
                            setCodePostalOK(false);
                        }
                    } else {
                        panneauVille.getChamp2().setText("");
                        updateJLabelEtat(panneauVille, 4);
                        resultat = false;
                        setCodePostalOK(false);
                    }
                } else {
                    panneauVille.getChamp2().setText("");
                    updateJLabelEtat(panneauVille, 4);
                    resultat = false;
                    setCodePostalOK(false);
                }
            } else if (numeroVerif == 4) {
                resultat = champ.getChamp2().verifVille();
                if (Ville.getInstance().getVraiNomVille(champ.getChamp2().getText()) != null && resultat) {
                    resultat = true;
                    setVilleOK(true);
                } else {
                    resultat = false;
                    setVilleOK(false);
                }
            } else if (numeroVerif == 5) {
                resultat = champ.getChamp2().verifNumeroRue();
                setNumeroRueOK(resultat);
            } else if (numeroVerif == 6) {
                resultat = champ.getChamp2().verifAdresse();
                setAdresseOK(resultat);
            } else if (numeroVerif == 7) {
                resultat = champ.getChamp2().verifInfoComp();
                setInfoCompOK(resultat);
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
                setNumeroTelephoneDeuxOK(true);
            } else if (numeroVerif == 1) {
                setSiteWebOK(true);
            } else if (numeroVerif == 2) {
                setPaysOK(false);
            } else if (numeroVerif == 3) {
                setCodePostalOK(false);
            } else if (numeroVerif == 4) {
                setVilleOK(false);
            } else if (numeroVerif == 5) {
                setNumeroRueOK(false);
            } else if (numeroVerif == 6) {
                setAdresseOK(false);
            } else if (numeroVerif == 7) {
                setInfoCompOK(true);
            }

            champ.setjLabelEtatChamp(Color.black);
            champ.setjLabelEtatChamp("");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.karimandco.auth.PanneauChamp panneauAdresse;
    private com.karimandco.auth.PanneauChamp panneauCodePostal;
    private com.karimandco.auth.PanneauChamp panneauInfoComp;
    private com.karimandco.auth.PanneauChamp panneauNumeroRue;
    private com.karimandco.auth.PanneauChamp panneauNumeroTelephoneDeux;
    private com.karimandco.auth.PanneauChamp panneauPays;
    private com.karimandco.auth.PanneauChamp panneauSiteWeb;
    private com.karimandco.auth.PanneauChamp panneauVille;
    // End of variables declaration//GEN-END:variables
}