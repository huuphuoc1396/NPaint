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
public class Triangle extends ObjectDraw {

    private int endx, endy;
    private int width;
    private boolean isFill;

    public Triangle(Point start, Point end, Color color, float widthStroke, boolean isFill) {
        super(start, end, color, widthStroke);
        this.isFill = isFill;
    }

    public void setIsFill(boolean isFill) {
        this.isFill = isFill;
    }
    
    public void trans() {
        width = Math.abs(getEnd().x - getStart().x);

        endx = getStart().x > getEnd().x ? getEnd().x + 2 * width : getEnd().x - width * 2;
        endy = getEnd().y;
    }

    @Override
    public void Drawing(Graphics2D g2d) {
        g2d.setStroke(getStroke());
        g2d.setColor(getColor());
        trans();

        int xPoint[] = {getStart().x, getEnd().x, endx};
        int yPoint[] = {getStart().y, getEnd().y, endy};

        if (!isFill) {
            g2d.drawPolygon(xPoint, yPoint, 3);
        } else {
            g2d.fillPolygon(xPoint, yPoint, 3);
        }
    }
}
