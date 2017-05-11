/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npaint.model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 *
 * @author Minh Tien
 */
public class Pencil extends ObjectDraw{

    public Pencil(Point start, Point end, Color color, float widthStroke) {
        super(start, end, color, widthStroke);
    }

    @Override
    public void Drawing(Graphics2D g2d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
