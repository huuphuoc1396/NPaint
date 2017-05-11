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
public class Circle extends ObjectDraw {

    private boolean isFill;
    private int x, y;
    private int r;

    public void setIsFill(boolean isFill) {
        this.isFill = isFill;
    }
    
    public Circle(Point start, Point end, Color color, float widthStroke, boolean isFill) {
        super(start, end, color, widthStroke);
        this.isFill = isFill;
    }

    @Override
    public void Drawing(Graphics2D g2d) {
        g2d.setStroke(getStroke());
        g2d.setColor(getColor());
        r = Math.abs(getEnd().x - getStart().x);
        x = getStart().x - r / 2;
        y = getStart().y - r / 2;
        if (isFill) {
            g2d.fillOval(x, y, r, r);
        } else {
            g2d.drawOval(x, y, r, r);
        }       
    }

}
