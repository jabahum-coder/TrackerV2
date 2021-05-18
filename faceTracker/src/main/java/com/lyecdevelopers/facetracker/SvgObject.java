package com.lyecdevelopers.facetracker;// TODO Include your package name here

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

public class SvgObject {
    private static final Paint p = new Paint();
    private static final Paint ps = new Paint();
    private static final Path t = new Path();
    private static final Matrix m = new Matrix();
    protected static ColorFilter cf = null;
    private static float od;

    /**
     * IMPORTANT: Due to the static usage of this class this
     * method sets the tint color statically. So it is highly
     * recommended to call the clearColorTint method when you
     * have finished drawing.
     * <p>
     * Sets the color to use when drawing the SVG. This replaces
     * all parts of the drawable which are not completely
     * transparent with this color.
     */
    public static void setColorTint(int color) {
        cf = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
    }

    public static void clearColorTint(int color) {
        cf = null;
    }

    public static void draw(Canvas c, int w, int h) {
        draw(c, w, h, 0, 0);
    }

    public static void draw(Canvas c, int w, int h, int dx, int dy) {
        float ow = 200f;
        float oh = 200f;

        od = (w / ow < h / oh) ? w / ow : h / oh;

        r();
        c.save();
        c.translate((w - od * ow) / 2f + dx, (h - od * oh) / 2f + dy);

        m.reset();
        m.setScale(od, od);

        c.save();
        c.restore();
        r();

        c.restore();
    }

    private static void r(Integer... o) {
        p.reset();
        ps.reset();
        if (cf != null) {
            p.setColorFilter(cf);
            ps.setColorFilter(cf);
        }
        p.setAntiAlias(true);
        ps.setAntiAlias(true);
        p.setStyle(Paint.Style.FILL);
        ps.setStyle(Paint.Style.STROKE);
        for (Integer i : o) {
            switch (i) {
            }
        }
    }
}