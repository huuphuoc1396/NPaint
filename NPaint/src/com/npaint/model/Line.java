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
public class Line extends ObjectDraw {

    public Line(Point start, Point end, Color color, float widthStroke) {
        super(start, end, color, widthStroke);
    }

    @Override
    public void Drawing(Graphics2D g2d) {
        g2d.setStroke(getStroke());
        g2d.setColor(getColor());
        g2d.drawLine(getStart().x, getStart().y, getEnd().x, getEnd().y);
    }
}
