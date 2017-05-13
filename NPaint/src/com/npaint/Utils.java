/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npaint;

import com.npaint.ui.DrawingPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author Huu Phuoc
 */
public class Utils {

    public static int showConfirmSaveDialog() {
        String fileName = "Untitled";
        if (DrawingPanel.getDrawingPanel().wasSaved()) {
            String pathString = DrawingPanel.getDrawingPanel().getCurrentSavePath();
            String temp[] = pathString.split("/");
            fileName = temp[temp.length - 1];
            System.out.println(temp[0]);
        }
        int response = JOptionPane.showConfirmDialog(null, "Do you want to save changes to " + fileName + "?",
                "NPaint", JOptionPane.YES_NO_CANCEL_OPTION);
        return response;
    }
}
