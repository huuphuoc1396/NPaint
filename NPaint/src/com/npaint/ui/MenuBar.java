package com.npaint.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public final class MenuBar extends JMenuBar implements ActionListener {

    private final JMenu fileMenu;
    private final JMenuItem newItem;
    private final JMenuItem openItem;
    private final JMenuItem saveItem;
    private final JMenuItem saveAsItem;
    private final JMenuItem printItem;
    private final JMenuItem closeItem;

    private final JMenu viewMenu;

    private final JMenu optionsMenu;

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

        viewMenu = new JMenu("View");

        optionsMenu = new JMenu("Options");

        helpMenu = new JMenu("Help");
        helpItem = new JMenuItem("NPaint Help");
        checkUpdateItem = new JMenuItem("Check for Updates");
        aboutItem = new JMenuItem("About");

        helpMenu.add(helpItem);
        helpMenu.add(checkUpdateItem);
        helpMenu.add(aboutItem);

        add(fileMenu);
        add(viewMenu);
        add(optionsMenu);
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newItem) {
            DrawingPanel.getDrawingPanel().clearArea();
        }

        if (e.getSource() == openItem) {
            DrawingPanel.getDrawingPanel().importImage();
        }

        if (e.getSource() == saveItem) {
            DrawingPanel.getDrawingPanel().SaveImage();
        }

        if (e.getSource() == saveAsItem) {
            DrawingPanel.getDrawingPanel().SaveImage();
        }

        if (e.getSource() == printItem) {
            DrawingPanel.getDrawingPanel().printImage();
        }

        if (e.getSource() == closeItem) {
            System.exit(0);
        }

        if (e.getSource() == helpItem) {

        }

        if (e.getSource() == checkUpdateItem) {

        }

        if (e.getSource() == aboutItem) {

        }

    }

}
