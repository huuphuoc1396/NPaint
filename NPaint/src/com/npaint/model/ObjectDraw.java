/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npaint.model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;

/**
 *
 * @author Minh Tien
 */
public abstract class ObjectDraw {

    private Point start;
    private Point end;
    private Color color;
    private final float widthStroke;

    public ObjectDraw(Point start, Point end, Color color, float widthStroke) {
        this.start = start;
        this.end = end;
        this.color = color;
        this.widthStroke = widthStroke;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Stroke getStroke() {
        return new BasicStroke(widthStroke);
    }

    public float getWidthStroke() {
        return widthStroke;
    }

    public abstract void Drawing(Graphics2D g2d);
}
