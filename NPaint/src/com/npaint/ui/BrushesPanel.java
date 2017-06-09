/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npaint.ui;

import com.npaint.model.shapes.EnumRope;

/**
 *
 * @author Huu Phuoc
 */
public class BrushesPanel extends javax.swing.JPanel {

    /**
     * Creates new form BrushesPanel
     */
    public BrushesPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        brushesComboBox = new javax.swing.JComboBox<>();
        brushesChooserLabel = new javax.swing.JLabel();

        brushesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brush", "Airbrush" }));
        brushesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brushesComboBoxActionPerformed(evt);
            }
        });

        brushesChooserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        brushesChooserLabel.setText("Brushes");
        brushesChooserLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(brushesComboBox, 0, 0, Short.MAX_VALUE)
            .addComponent(brushesChooserLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(brushesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(brushesChooserLabel))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void brushesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brushesComboBoxActionPerformed
        switch(brushesComboBox.getSelectedIndex()) {
            case 0:
                DrawingPanel.getDrawingPanel().setFigures(EnumRope.PENCIL);
                break;
            case 1:
                DrawingPanel.getDrawingPanel().setFigures(EnumRope.AIR_BRUSH);
                break;
        }
    }//GEN-LAST:event_brushesComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brushesChooserLabel;
    private javax.swing.JComboBox<String> brushesComboBox;
    // End of variables declaration//GEN-END:variables
}
