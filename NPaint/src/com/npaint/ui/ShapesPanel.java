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
public class ShapesPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShapesPanel
     */
    public ShapesPanel() {
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

        panel = new javax.swing.JPanel();
        lineButton = new javax.swing.JButton();
        curveButton = new javax.swing.JButton();
        ovalButton = new javax.swing.JButton();
        rectangleButton = new javax.swing.JButton();
        rahimbusButton = new javax.swing.JButton();
        triangleButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        heartButton = new javax.swing.JButton();
        bahaiButton = new javax.swing.JButton();
        shapesLabel = new javax.swing.JLabel();
        fillCheckBox = new javax.swing.JCheckBox();
        outlineButton = new javax.swing.JButton();

        panel.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        lineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/npaint/icon/Line.png"))); // NOI18N
        lineButton.setAlignmentY(0.0F);
        lineButton.setPreferredSize(new java.awt.Dimension(30, 30));
        lineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineButtonActionPerformed(evt);
            }
        });
        panel.add(lineButton);

        curveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/npaint/icon/Curved.png"))); // NOI18N
        curveButton.setAlignmentY(0.0F);
        curveButton.setPreferredSize(new java.awt.Dimension(30, 30));
        curveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curveButtonActionPerformed(evt);
            }
        });
        panel.add(curveButton);

        ovalButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/npaint/icon/Circle.png"))); // NOI18N
        ovalButton.setAlignmentY(0.0F);
        ovalButton.setPreferredSize(new java.awt.Dimension(30, 30));
        ovalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovalButtonActionPerformed(evt);
            }
        });
        panel.add(ovalButton);

        rectangleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/npaint/icon/Rectangle.png"))); // NOI18N
        rectangleButton.setAlignmentY(0.0F);
        rectangleButton.setPreferredSize(new java.awt.Dimension(30, 30));
        rectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleButtonActionPerformed(evt);
            }
        });
        panel.add(rectangleButton);

        rahimbusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/npaint/icon/Rahimbus.png"))); // NOI18N
        rahimbusButton.setAlignmentY(0.0F);
        rahimbusButton.setPreferredSize(new java.awt.Dimension(30, 30));
        rahimbusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rahimbusButtonActionPerformed(evt);
            }
        });
        panel.add(rahimbusButton);

        triangleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/npaint/icon/Triangle.png"))); // NOI18N
        triangleButton.setAlignmentY(0.0F);
        triangleButton.setPreferredSize(new java.awt.Dimension(30, 30));
        triangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangleButtonActionPerformed(evt);
            }
        });
        panel.add(triangleButton);

        startButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/npaint/icon/Star.png"))); // NOI18N
        startButton.setAlignmentY(0.0F);
        startButton.setPreferredSize(new java.awt.Dimension(30, 30));
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        panel.add(startButton);

        heartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/npaint/icon/heart.png"))); // NOI18N
        heartButton.setAlignmentY(0.0F);
        heartButton.setPreferredSize(new java.awt.Dimension(30, 30));
        heartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heartButtonActionPerformed(evt);
            }
        });
        panel.add(heartButton);

        bahaiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/npaint/icon/Bahai.png"))); // NOI18N
        bahaiButton.setAlignmentY(0.0F);
        bahaiButton.setPreferredSize(new java.awt.Dimension(30, 30));
        bahaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bahaiButtonActionPerformed(evt);
            }
        });
        panel.add(bahaiButton);

        shapesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shapesLabel.setText("Shapes");
        shapesLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        fillCheckBox.setText(" Fill");
        fillCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillCheckBoxActionPerformed(evt);
            }
        });

        outlineButton.setText("Outline");
        outlineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outlineButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shapesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outlineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fillCheckBox)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(outlineButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fillCheckBox)))
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(shapesLabel))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fillCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillCheckBoxActionPerformed
        if (fillCheckBox.isSelected()) {
            DrawingPanel.getDrawingPanel().setAllFilled();
        } else {
            DrawingPanel.getDrawingPanel().setUnFilled();
        }
    }//GEN-LAST:event_fillCheckBoxActionPerformed

    private void lineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineButtonActionPerformed
        DrawingPanel.getDrawingPanel().setFigures(EnumRope.LINE);
    }//GEN-LAST:event_lineButtonActionPerformed

    private void curveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curveButtonActionPerformed
        DrawingPanel.getDrawingPanel().setFigures(EnumRope.CURVE);
        DrawingPanel.getDrawingPanel().redraw();
    }//GEN-LAST:event_curveButtonActionPerformed

    private void ovalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovalButtonActionPerformed
        DrawingPanel.getDrawingPanel().setFigures(EnumRope.OVAL);
    }//GEN-LAST:event_ovalButtonActionPerformed

    private void rectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleButtonActionPerformed
        DrawingPanel.getDrawingPanel().setFigures(EnumRope.RECT);
    }//GEN-LAST:event_rectangleButtonActionPerformed

    private void rahimbusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rahimbusButtonActionPerformed
        DrawingPanel.getDrawingPanel().setFigures(EnumRope.RAHIMBUS);
    }//GEN-LAST:event_rahimbusButtonActionPerformed

    private void triangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangleButtonActionPerformed
        DrawingPanel.getDrawingPanel().setFigures(EnumRope.TRIANGLE);
    }//GEN-LAST:event_triangleButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        DrawingPanel.getDrawingPanel().setFigures(EnumRope.STAR);
    }//GEN-LAST:event_startButtonActionPerformed

    private void heartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heartButtonActionPerformed
        DrawingPanel.getDrawingPanel().setFigures(EnumRope.HEART);
    }//GEN-LAST:event_heartButtonActionPerformed

    private void bahaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bahaiButtonActionPerformed
        DrawingPanel.getDrawingPanel().setFigures(EnumRope.BAHAI);
    }//GEN-LAST:event_bahaiButtonActionPerformed

    private void outlineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outlineButtonActionPerformed

    }//GEN-LAST:event_outlineButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bahaiButton;
    private javax.swing.JButton curveButton;
    private javax.swing.JCheckBox fillCheckBox;
    private javax.swing.JButton heartButton;
    private javax.swing.JButton lineButton;
    private javax.swing.JButton outlineButton;
    private javax.swing.JButton ovalButton;
    private javax.swing.JPanel panel;
    private javax.swing.JButton rahimbusButton;
    private javax.swing.JButton rectangleButton;
    private javax.swing.JLabel shapesLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JButton triangleButton;
    // End of variables declaration//GEN-END:variables

    public static boolean isFill;

    public static boolean isIsFill() {
        return isFill;
    }
}
