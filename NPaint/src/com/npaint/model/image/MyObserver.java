package com.npaint.model.image;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

public class MyObserver implements ImageObserver {

    @Override
    public boolean imageUpdate(Image image, int flags, int x, int y,
            int width, int height) {

        if ((flags & HEIGHT) != 0) {
            System.out.println("Image height = " + height);
        }

        if ((flags & WIDTH) != 0) {
            System.out.println("Image width = " + width);
        }

        if ((flags & FRAMEBITS) != 0) {
            System.out.println("Another frame finished.");
        }

        if ((flags & SOMEBITS) != 0) {
            System.out.println("Image section :"
                    + new Rectangle(x, y, width, height));
        }

        if ((flags & ALLBITS) != 0) {
            System.out.println("Image finished!");
            return false;
        }

        if ((flags & ABORT) != 0) {
            System.out.println("Image load aborted...");
            return false;
        }
        return true;
    }

}
