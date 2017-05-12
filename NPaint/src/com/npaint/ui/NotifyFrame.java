/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npaint.ui;

import static java.awt.GraphicsDevice.WindowTranslucency.PERPIXEL_TRANSPARENT;
import static java.awt.GraphicsDevice.WindowTranslucency.TRANSLUCENT;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author Coder ACJHP
 */
public class NotifyFrame extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private final JLabel label;

    public NotifyFrame() {
        super("NotifyFrame");
        setLayout(new GridBagLayout());
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));
            }
        });

        setUndecorated(true);
        setSize(250, 80);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        label = new JLabel();
        label.setFont(new Font("Adobe Arabic", Font.BOLD, 14));
        label.setBounds(0, 0, getWidth(), getHeight());

        label.setForeground(Color.BLACK);
        add(label);
    }

    public void setNotifiyNote(String note) {
        this.label.setText(note);
    }
    
     public static void notifyUser(String note, int duration) {
        NotifyFrame notifyFrame = new NotifyFrame();
        notifyFrame.setNotifiyNote(note);
        notifyFrame.setVisible(true);
        Timer swingTimer = new Timer(duration, (ActionEvent e) -> {
            notifyFrame.setVisible(false);
        });
        swingTimer.start();
    }

    public static void main(String[] args) {

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        final boolean isTranslucencySupported = gd.isWindowTranslucencySupported(TRANSLUCENT);

        if (!gd.isWindowTranslucencySupported(PERPIXEL_TRANSPARENT)) {
            System.err.println("Shaped windows are not supported");
            System.exit(0);
        }

        if (!isTranslucencySupported) {
            System.out.println("Translucency is not supported, creating an opaque window");
        }

        SwingUtilities.invokeLater(() -> {
            NotifyFrame sw = new NotifyFrame();

            if (isTranslucencySupported) {
                sw.setOpacity(0.7f);
            }
        });
    }
}
