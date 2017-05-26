package com.npaint.ui;

import com.npaint.Utils;
import com.npaint.model.shapes.EnumRope;
import com.sun.glass.events.KeyEvent;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.Timer;

public final class MenuBar extends JMenuBar implements ActionListener {

    private final JMenu fileMenu;
    private final JMenuItem newItem;
    private final JMenuItem openItem;
    private final JMenuItem saveItem;
    private final JMenuItem saveAsItem;
    private final JMenuItem printItem;
    private final JMenuItem closeItem;

    private final JMenu editMenu;
    private final JMenuItem undoItem;
    private final JMenuItem redoItem;
    private final JMenuItem copyItem;
    private final JMenuItem cutItem;
    private final JMenuItem pasteItem;

    private final JMenu viewMenu;
    private final JCheckBoxMenuItem guideLinesItem;

    private final JMenu helpMenu;
    private final JMenuItem helpItem;
    private final JMenuItem checkUpdateItem;
    private final JMenuItem aboutItem;

    public MenuBar() {

        fileMenu = new JMenu("File");
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open...");
        saveItem = new JMenuItem("Save");
        saveAsItem = new JMenuItem("Save As...");
        printItem = new JMenuItem("Print...");
        closeItem = new JMenuItem("Exit");

        newItem.setMnemonic('N');
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, Event.CTRL_MASK));
        fileMenu.add(newItem);

        openItem.setMnemonic('O');
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, Event.CTRL_MASK));
        fileMenu.add(openItem);

        saveItem.setMnemonic('S');
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Event.CTRL_MASK));
        fileMenu.add(saveItem);

        fileMenu.add(saveAsItem);

        printItem.setMnemonic('P');
        printItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, Event.CTRL_MASK));
        fileMenu.add(printItem);

        closeItem.setMnemonic('E');
        closeItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, Event.CTRL_MASK));
        fileMenu.add(closeItem);

        editMenu = new JMenu("Edit");
        undoItem = new JMenuItem("Undo");
        redoItem = new JMenuItem("Redo");
        cutItem = new JMenuItem("Cut");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");

        undoItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, Event.CTRL_MASK));
        editMenu.add(undoItem);

        redoItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, Event.CTRL_MASK));
        editMenu.add(redoItem);

        cutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, Event.CTRL_MASK));
        editMenu.add(cutItem);

        copyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK));
        editMenu.add(copyItem);

        pasteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK));
        editMenu.add(pasteItem);

        viewMenu = new JMenu("View");
        guideLinesItem = new JCheckBoxMenuItem("Guide Lines");

        viewMenu.add(guideLinesItem);

        helpMenu = new JMenu("Help");
        helpItem = new JMenuItem("Help");
        checkUpdateItem = new JMenuItem("Check for Updates");
        aboutItem = new JMenuItem("About");

        helpItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
        helpMenu.add(helpItem);

        helpMenu.add(checkUpdateItem);

        aboutItem.setMnemonic('A');
        aboutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK));
        helpMenu.add(aboutItem);

        add(fileMenu);
        add(editMenu);
        add(viewMenu);
        add(helpMenu);
        addAction();
    }

    public void addAction() {
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        saveAsItem.addActionListener(this);
        printItem.addActionListener(this);
        closeItem.addActionListener(this);
        helpItem.addActionListener(this);
        checkUpdateItem.addActionListener(this);
        aboutItem.addActionListener(this);

        undoItem.addActionListener(this);
        redoItem.addActionListener(this);
        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);

        guideLinesItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newItem) {
            int response = Utils.showConfirmSaveDialog();
            switch (response) {
                case JOptionPane.YES_OPTION:
                    DrawingPanel.getDrawingPanel().save();
                    break;
                case JOptionPane.NO_OPTION:
                    DrawingPanel.getDrawingPanel().clearArea();
                    break;
                case JOptionPane.CANCEL_OPTION:
                    break;
                default:
                    break;
            }
        }

        if (e.getSource() == openItem) {
            int response = Utils.showConfirmSaveDialog();
            switch (response) {
                case JOptionPane.YES_OPTION:
                    DrawingPanel.getDrawingPanel().save();
                    DrawingPanel.getDrawingPanel().clearArea();
                    DrawingPanel.getDrawingPanel().importImage();
                    break;
                case JOptionPane.NO_OPTION:
                    DrawingPanel.getDrawingPanel().clearArea();
                    DrawingPanel.getDrawingPanel().importImage();
                    break;
                case JOptionPane.CANCEL_OPTION:
                    break;
                default:
                    break;
            }
        }

        if (e.getSource() == saveItem) {
            DrawingPanel.getDrawingPanel().save();
        }

        if (e.getSource() == saveAsItem) {
            DrawingPanel.getDrawingPanel().saveAs();
        }

        if (e.getSource() == printItem) {
            DrawingPanel.getDrawingPanel().printImage();
        }

        if (e.getSource() == closeItem) {
            int response = Utils.showConfirmSaveDialog();
            switch (response) {
                case JOptionPane.YES_OPTION:
                    DrawingPanel.getDrawingPanel().save();
                    break;
                case JOptionPane.NO_OPTION:
                    System.exit(0);
                    break;
                case JOptionPane.CANCEL_OPTION:
                    break;
                default:
                    break;
            }
        }

        if (e.getSource() == undoItem) {
            DrawingPanel.getDrawingPanel().undo();
        }

        if (e.getSource() == redoItem) {
            DrawingPanel.getDrawingPanel().redo();
        }

        if (e.getSource() == copyItem) {
            DrawingPanel.getDrawingPanel().setFigures(EnumRope.COPY);
            DrawingPanel.getDrawingPanel().addToClipboard();
        }

        if (e.getSource() == cutItem) {

        }

        if (e.getSource() == pasteItem) {
            DrawingPanel drawingPanel = DrawingPanel.getDrawingPanel();
            drawingPanel.getFromClipboard();
            drawingPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    if (drawingPanel.getFigures() == EnumRope.PASTE && !drawingPanel.isLabel()) {
                        drawingPanel.setFigures(EnumRope.DOIT);
                        drawingPanel.notify("Copied image pasted.");
                    }
                }
            });
        }

        if (e.getSource() == guideLinesItem) {
            DrawingPanel drawingPanel = DrawingPanel.getDrawingPanel();
            if (guideLinesItem.isSelected() == true) {
                drawingPanel.setFigures(EnumRope.GUIDELINES);
                drawingPanel.repaint();
            }
        }

        if (e.getSource() == helpItem) {
            NotifyFrame notifyFrame = new NotifyFrame();
            notifyFrame.setNotifiyNote("Help");
            notifyFrame.setVisible(true);
            Timer swingTimer = new Timer(2000, (ActionEvent ae) -> {
                notifyFrame.setVisible(false);
            });
            swingTimer.start();
        }

        if (e.getSource() == checkUpdateItem) {

        }

        if (e.getSource() == aboutItem) {
            NotifyFrame notifyFrame = new NotifyFrame();
            notifyFrame.setNotifiyNote("About");
            notifyFrame.setVisible(true);
            Timer swingTimer = new Timer(2000, (ActionEvent ae) -> {
                notifyFrame.setVisible(false);
            });
            swingTimer.start();
        }

    }

}
