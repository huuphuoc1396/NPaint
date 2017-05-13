/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npaint.model.shapes;

import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Minh Tien
 */
public final class Triangle {

    int xs, ys;
    int xe, ye;
    int x,y;
    Polygon triangle;

    public Triangle(int xs, int ys, int xe, int ye) {
        this.xs = xs;
        this.ys = ys;
        this.xe = xe;
        this.ye = ye;
        triangle = trans();
    }

    public Polygon trans() {
        Polygon p;
        int width = Math.abs(xe - xs);
        int[] xpoints = {xs, xe, xs > xe ? (xe + width*2) : (xe - width * 2)};
        int[] ypoints = {ys, ye, ye};
        p = new Polygon(xpoints, ypoints, 3);
        return p;
    }
    
    public void drawTriangle(Graphics2D g2d){
        g2d.drawPolygon(triangle);
    }
    
    public void fillTriangle(Graphics2D g2d){
        g2d.fillPolygon(triangle);
    }
}
