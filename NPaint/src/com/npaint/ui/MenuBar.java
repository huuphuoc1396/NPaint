package com.npaint.ui;

import com.npaint.Utils;
import com.npaint.model.shapes.EnumRope;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

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
        closeItem = new JMenuItem("Close");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);
        fileMenu.add(printItem);
        fileMenu.add(closeItem);

        editMenu = new JMenu("Edit");
        undoItem = new JMenuItem("Undo");
        redoItem = new JMenuItem("Redo");

        editMenu.add(undoItem);
        editMenu.add(redoItem);

        viewMenu = new JMenu("View");
        guideLinesItem = new JCheckBoxMenuItem("Guide Lines");

        viewMenu.add(guideLinesItem);

        helpMenu = new JMenu("Help");
        helpItem = new JMenuItem("NPaint Help");
        checkUpdateItem = new JMenuItem("Check for Updates");
        aboutItem = new JMenuItem("About");

        helpMenu.add(helpItem);
        helpMenu.add(checkUpdateItem);
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

        if (e.getSource() == guideLinesItem) {
            DrawingPanel drawingPanel = DrawingPanel.getDrawingPanel();
            if (guideLinesItem.isSelected() == true) {
                drawingPanel.setFigures(EnumRope.GUIDELINES);
                drawingPanel.repaint();
            }
        }

        if (e.getSource() == helpItem) {

        }

        if (e.getSource() == checkUpdateItem) {

        }

        if (e.getSource() == aboutItem) {

        }

    }

}
