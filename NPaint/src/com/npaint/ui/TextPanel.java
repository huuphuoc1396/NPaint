/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npaint.ui;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Huu Phuoc
 */
public class TextPanel extends javax.swing.JPanel {

    /**
     * Creates new form TextPanel
     */
    public TextPanel() {
        initComponents();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] localFonts = ge.getAllFonts();
        fontNames = new String[localFonts.length];
        for (int i = 0; i < localFonts.length; i++) {
            fontNames[i] = localFonts[i].getFontName();
        }
        fontComboBox.setModel(new DefaultComboBoxModel<>(fontNames));
        fontName = fontNames[0];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fontComboBox = new javax.swing.JComboBox<>();
        panel = new javax.swing.JPanel();
        boldButton = new javax.swing.JToggleButton();
        italicButton = new javax.swing.JToggleButton();
        chkStrkTrhButton = new javax.swing.JToggleButton();
        sizeSpinner = new javax.swing.JSpinner();

        setMaximumSize(new java.awt.Dimension(200, 50));
        setMinimumSize(new java.awt.Dimension(200, 50));
        setPreferredSize(new java.awt.Dimension(200, 50));
        setLayout(new java.awt.GridLayout(0, 1));

        fontComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fontComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Times New Roman" }));
        fontComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontComboBoxActionPerformed(evt);
            }
        });
        add(fontComboBox);

        panel.setLayout(new java.awt.GridLayout(1, 0));

        boldButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        boldButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/npaint/icon/Bold.png"))); // NOI18N
        boldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boldButtonActionPerformed(evt);
            }
        });
        panel.add(boldButton);

        italicButton.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        italicButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/npaint/icon/Italic.png"))); // NOI18N
        italicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                italicButtonActionPerformed(evt);
            }
        });
        panel.add(italicButton);

        chkStrkTrhButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkStrkTrhButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/npaint/icon/Strikethrough.png"))); // NOI18N
        chkStrkTrhButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkStrkTrhButtonActionPerformed(evt);
            }
        });
        panel.add(chkStrkTrhButton);

        sizeSpinner.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sizeSpinner.setValue(13);
        sizeSpinner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sizeSpinnerMousePressed(evt);
            }
        });
        panel.add(sizeSpinner);

        add(panel);
    }// </editor-fold>//GEN-END:initComponents

    private void boldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boldButtonActionPerformed
        isBold = boldButton.isSelected();
        updateCurrentFont();
    }//GEN-LAST:event_boldButtonActionPerformed

    private void italicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_italicButtonActionPerformed
        isItalic = italicButton.isSelected();
        updateCurrentFont();
    }//GEN-LAST:event_italicButtonActionPerformed

    private void chkStrkTrhButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkStrkTrhButtonActionPerformed
        if (drawingPanel == null) {
            return;
        }

        if (chkStrkTrhButton.isSelected()) {
            drawingPanel.makeFontStrk();
        } else {
            updateCurrentFont();
        }
    }//GEN-LAST:event_chkStrkTrhButtonActionPerformed

    private void sizeSpinnerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sizeSpinnerMousePressed
        fontSize = (int) sizeSpinner.getValue();
        updateCurrentFont();
    }//GEN-LAST:event_sizeSpinnerMousePressed

    private void fontComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontComboBoxActionPerformed
        fontName = fontComboBox.getSelectedItem().toString();
        updateCurrentFont();
    }//GEN-LAST:event_fontComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton boldButton;
    private javax.swing.JToggleButton chkStrkTrhButton;
    private javax.swing.JComboBox<String> fontComboBox;
    private javax.swing.JToggleButton italicButton;
    private javax.swing.JPanel panel;
    private javax.swing.JSpinner sizeSpinner;
    // End of variables declaration//GEN-END:variables

    private DrawingPanel drawingPanel;
    private final String[] fontNames;
    private String fontName;
    private int fontSize = 13;
    private boolean isBold;
    private boolean isItalic;

    public void setDrawingPanel(DrawingPanel drawingPanel) {
        this.drawingPanel = drawingPanel;
        updateCurrentFont();
    }
    
    public void updateCurrentFont() {
        if (drawingPanel == null) {
            return;
        }

        if (isBold && !isItalic) {
            drawingPanel.setFont(fontName, Font.BOLD, fontSize);
        } else if (!isBold && isItalic) {
            drawingPanel.setFont(fontName, Font.ITALIC, fontSize);
        } else if (isBold && isItalic) {
            drawingPanel.setFont(fontName, Font.BOLD + Font.ITALIC, fontSize);
        } else {
            drawingPanel.setFont(fontName, Font.PLAIN, fontSize);
            drawingPanel.setBasic();
        }
    }
}
