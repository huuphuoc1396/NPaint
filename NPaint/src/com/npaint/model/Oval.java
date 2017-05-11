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
public class Oval extends ObjectDraw {

    private int x, y;
    private int width;
    private int height;
    private boolean isFill;

    public Oval(Point start, Point end, Color color, float widthStroke, boolean isFill) {
        super(start, end, color, widthStroke);
        this.isFill = isFill;
    }

    public void setIsFill(boolean isFill) {
        this.isFill = isFill;
    }

    public void trans() {
        x = Math.min(getStart().x, getEnd().x);
        y = Math.min(getStart().y, getEnd().y);
        width = Math.abs(getEnd().x - getStart().x);
        height = Math.abs(getEnd().y - getStart().y);
    }

    @Override
    public void Drawing(Graphics2D g2d) {
        g2d.setStroke(getStroke());
        g2d.setColor(getColor());
        trans();
        if (!isFill) {
            g2d.drawOval(x, y, width, height);
        } else {
            g2d.fillOval(x, y, width, height);
        }
    }

}
