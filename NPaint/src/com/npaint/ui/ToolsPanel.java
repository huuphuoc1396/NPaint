/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npaint.ui;

import com.npaint.model.shapes.EnumRope;
import javax.swing.JButton;

/**
 *
 * @author Huu Phuoc
 */
public class ToolsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ToolPanel
     */
    public ToolsPanel() {
        initComponents();
        toolsPanel = this;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pencilButton = new javax.swing.JButton();
        rubberButton = new javax.swing.JButton();
        fillButton = new javax.swing.JButton();
        airBrushButton = new javax.swing.JButton();
        textButton = new javax.swing.JButton();
        pickButton = new javax.swing.JButton();
        toolsLabel = new javax.swing.JLabel();

        pencilButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/npaint/icon/pencil_icon.png"))); // NOI18N
        pencilButton.setToolTipText("Pencil");
        pencilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencilButtonActionPerformed(evt);
            }
        });

        rubberButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/npaint/icon/rubber_icon.png"))); // NOI18N
        rubberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rubberButtonActionPerformed(evt);
            }
        });

        fillButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/npaint/icon/fill_colour_icon.png"))); // NOI18N
        fillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillButtonActionPerformed(evt);
            }
        });

        airBrushButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/npaint/icon/airbrush_icon.png"))); // NOI18N
        airBrushButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airBrushButtonActionPerformed(evt);
            }
        });

        textButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/npaint/icon/text_icon.png"))); // NOI18N
        textButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textButtonActionPerformed(evt);
            }
        });

        pickButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/npaint/icon/pick_color_icon.png"))); // NOI18N
        pickButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickButtonActionPerformed(evt);
            }
        });

        toolsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toolsLabel.setText("Tools");
        toolsLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pencilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(rubberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(airBrushButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pickButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(toolsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pencilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rubberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airBrushButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pickButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(toolsLabel))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pencilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencilButtonActionPerformed
        DrawingPanel.getDrawingPanel().setFigures(EnumRope.PENCIL);
        DrawingPanel.getDrawingPanel().redraw();
    }//GEN-LAST:event_pencilButtonActionPerformed

    private void fillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillButtonActionPerformed
        DrawingPanel.getDrawingPanel().setFigures(EnumRope.AUTOFILLED);
    }//GEN-LAST:event_fillButtonActionPerformed

    private void textButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textButtonActionPerformed
        DrawingPanel.getDrawingPanel().setFigures(EnumRope.TEXT);
        DrawingPanel.getDrawingPanel().setTextStroke();
    }//GEN-LAST:event_textButtonActionPerformed

    private void rubberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rubberButtonActionPerformed
        DrawingPanel.getDrawingPanel().setFigures(EnumRope.ERASER);
        DrawingPanel.getDrawingPanel().repaint();
    }//GEN-LAST:event_rubberButtonActionPerformed

    private void airBrushButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airBrushButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airBrushButtonActionPerformed

    private void pickButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickButtonActionPerformed
        DrawingPanel.getDrawingPanel().setFigures(EnumRope.COLORPICKER);
    }//GEN-LAST:event_pickButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton airBrushButton;
    private javax.swing.JButton fillButton;
    private javax.swing.JButton pencilButton;
    private javax.swing.JButton pickButton;
    private javax.swing.JButton rubberButton;
    private javax.swing.JButton textButton;
    private javax.swing.JLabel toolsLabel;
    // End of variables declaration//GEN-END:variables
    private static ToolsPanel toolsPanel;

    public static ToolsPanel getToolsPanel() {
        return toolsPanel;
    }

    public JButton getPencilButton() {
        return pencilButton;
    }

    public JButton getTextButton() {
        return textButton;
    }

}
