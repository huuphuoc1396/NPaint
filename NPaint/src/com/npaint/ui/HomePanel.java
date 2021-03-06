/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npaint.ui;

/**
 *
 * @author Huu Phuoc
 */
public class HomePanel extends javax.swing.JPanel {

    /**
     * Creates new form HomePanel
     */
    public HomePanel() {
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

        clipboardPanel = new com.npaint.ui.ClipboardPanel();
        separator1 = new javax.swing.JSeparator();
        imagePanel = new com.npaint.ui.ImagePanel();
        separator2 = new javax.swing.JSeparator();
        toolsPanel = new com.npaint.ui.ToolsPanel();
        separator3 = new javax.swing.JSeparator();
        brushesPanel = new com.npaint.ui.BrushesPanel();
        separator4 = new javax.swing.JSeparator();
        shapesPanel = new com.npaint.ui.ShapesPanel();
        separator5 = new javax.swing.JSeparator();
        sizePanel = new com.npaint.ui.SizePanel();
        separator6 = new javax.swing.JSeparator();
        coloursPanel = new com.npaint.ui.ColoursPanel();

        setPreferredSize(new java.awt.Dimension(1280, 150));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 8, 8);
        flowLayout1.setAlignOnBaseline(true);
        setLayout(flowLayout1);
        add(clipboardPanel);

        separator1.setBackground(new java.awt.Color(153, 153, 153));
        separator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separator1.setAlignmentX(0.0F);
        separator1.setAlignmentY(0.0F);
        separator1.setPreferredSize(new java.awt.Dimension(2, 130));
        add(separator1);
        add(imagePanel);

        separator2.setBackground(new java.awt.Color(153, 153, 153));
        separator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separator2.setAlignmentX(0.0F);
        separator2.setAlignmentY(0.0F);
        separator2.setPreferredSize(new java.awt.Dimension(2, 130));
        add(separator2);
        add(toolsPanel);

        separator3.setBackground(new java.awt.Color(153, 153, 153));
        separator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separator3.setAlignmentX(0.0F);
        separator3.setAlignmentY(0.0F);
        separator3.setPreferredSize(new java.awt.Dimension(2, 130));
        add(separator3);
        add(brushesPanel);

        separator4.setBackground(new java.awt.Color(153, 153, 153));
        separator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separator4.setAlignmentX(0.0F);
        separator4.setAlignmentY(0.0F);
        separator4.setPreferredSize(new java.awt.Dimension(2, 130));
        add(separator4);
        add(shapesPanel);

        separator5.setBackground(new java.awt.Color(153, 153, 153));
        separator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separator5.setAlignmentX(0.0F);
        separator5.setAlignmentY(0.0F);
        separator5.setPreferredSize(new java.awt.Dimension(2, 130));
        add(separator5);
        add(sizePanel);

        separator6.setBackground(new java.awt.Color(153, 153, 153));
        separator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separator6.setAlignmentX(0.0F);
        separator6.setAlignmentY(0.0F);
        separator6.setPreferredSize(new java.awt.Dimension(2, 130));
        add(separator6);
        add(coloursPanel);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.npaint.ui.BrushesPanel brushesPanel;
    private com.npaint.ui.ClipboardPanel clipboardPanel;
    private com.npaint.ui.ColoursPanel coloursPanel;
    private com.npaint.ui.ImagePanel imagePanel;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JSeparator separator3;
    private javax.swing.JSeparator separator4;
    private javax.swing.JSeparator separator5;
    private javax.swing.JSeparator separator6;
    private com.npaint.ui.ShapesPanel shapesPanel;
    private com.npaint.ui.SizePanel sizePanel;
    private com.npaint.ui.ToolsPanel toolsPanel;
    // End of variables declaration//GEN-END:variables
}
