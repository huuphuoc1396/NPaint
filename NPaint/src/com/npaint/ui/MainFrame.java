/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npaint.ui;

import com.npaint.Utils;
import com.npaint.model.shapes.EnumRope;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Huu Phuoc
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        this.setIconImage(new ImageIcon(getClass().getResource("/com/npaint/icon/npaint_main_icon.png")).getImage());
        initComponents();
        drawingPanel.setFigures(EnumRope.PENCIL);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawingScrollPane = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        drawingPanel = new com.npaint.ui.DrawingPanel();
        homeScrollPane = new javax.swing.JScrollPane();
        homePanel = new com.npaint.ui.HomePanel();
        menuBar = new com.npaint.ui.MenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NPaint Application");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panel.setMaximumSize(new java.awt.Dimension(1280, 720));
        panel.setPreferredSize(new java.awt.Dimension(1280, 720));

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(drawingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(drawingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        drawingScrollPane.setViewportView(panel);

        homeScrollPane.setMaximumSize(new java.awt.Dimension(1280, 150));

        homePanel.setMaximumSize(new java.awt.Dimension(1280, 150));
        homePanel.setMinimumSize(new java.awt.Dimension(32, 32));
        homeScrollPane.setViewportView(homePanel);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drawingScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE)
                    .addComponent(homeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(homeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(drawingScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int response = Utils.showConfirmSaveDialog();
        switch (response) {
            case JOptionPane.YES_OPTION:
                drawingPanel.save();
                break;
            case JOptionPane.NO_OPTION:
                System.exit(0);
                break;
            case JOptionPane.CANCEL_OPTION:
                setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_formWindowClosing

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        new Thread(() -> {
            new MainFrame().setVisible(true);
        }).start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.npaint.ui.DrawingPanel drawingPanel;
    private javax.swing.JScrollPane drawingScrollPane;
    private com.npaint.ui.HomePanel homePanel;
    private javax.swing.JScrollPane homeScrollPane;
    private com.npaint.ui.MenuBar menuBar;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
