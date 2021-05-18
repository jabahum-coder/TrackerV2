package com.lyecdevelopers.facetracker;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

public class Profile {
    private static final Paint  p  = new Paint();
    private static final Paint  ps = new Paint();
    private static final Path   t  = new Path();
    private static final Matrix m  = new Matrix();
    private static float od;
    private static ColorFilter cf = null;

    /**
     *  IMPORTANT: Due to the static usage of this class this
     *  method sets the tint color statically. So it is highly
     *  recommended to call the clearColorTint method when you
     *  have finished drawing.
     *
     *  Sets the color to use when drawing the SVG. This replaces
     *  all parts of the drawable which are not completely
     *  transparent with this color.
     */
    public static void setColorTint(int color){
        cf = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
    }

    public static void clearColorTint(int color){
        cf = null;
    }

    public static void draw(Canvas c, int w, int h){
        draw(c, w, h, 0, 0);
    }

    public static void draw(Canvas c, int w, int h, int dx, int dy) {
        float ow = 400f;
        float oh = 356f;

        od = Math.min(w / ow, h / oh);

        //r();
        //c.save();
        c.translate((w - od * ow) / 2f + dx, (h - od * oh) / 2f + dy);
        //m.reset();
        m.setScale(od, od);
        //c.save();

        ps.setColor(Color.argb(0, 0, 0, 0));
        ps.setStrokeCap(Paint.Cap.BUTT);
        ps.setStrokeJoin(Paint.Join.MITER);
        ps.setStrokeMiter(4.0f * od);
        c.scale(1.33f, 1.33f);
        //c.save();
        //c.restore();

        //r(1,3,0,4);
        c.save();
        p.setColor(Color.parseColor("#000000"));
        c.translate(0.0f, 267.0f * od);
        c.scale(0.05f, -0.05f);
        c.save();
        t.reset();
        t.moveTo(2830.0f, 5319.0f);
        t.cubicTo(2157.0f, 5254.0f, 1480.0f, 4478.0f, 1480.0f, 3772.0f);
        t.cubicTo(1480.0f, 3727.0f, 1464.0f, 3692.0f, 1427.0f, 3658.0f);
        t.cubicTo(1260.0f, 3504.0f, 1288.0f, 3195.0f, 1495.0f, 2893.0f);
        t.cubicTo(1613.0f,2721.0f,1618.0f,2712.0f,1730.0f,2477.0f);
        t.cubicTo(1832.0f,2262.0f,1963.0f,2065.0f,2117.0f,1897.0f);
        t.lineTo(2220.0f,1785.0f);
        t.lineTo(2149.0f,1644.0f);
        t.cubicTo(2012.0f,1369.0f,1795.0f,1226.0f,1340.0f,1109.0f);
        t.cubicTo(559.0f,909.0f,114.0f,572.0f,30.0f,117.0f);
        t.cubicTo(0.0f,-44.0f,157.0f,-36.0f,209.0f,126.0f);
        t.cubicTo(338.0f,526.0f,682.0f,762.0f,1416.0f,951.0f);
        t.cubicTo(1899.0f,1076.0f,2158.0f,1259.0f,2310.0f,1585.0f);
        t.cubicTo(2418.0f,1818.0f,2419.0f,1846.0f,2319.0f,1935.0f);
        t.cubicTo(2144.0f,2092.0f,1916.0f,2445.0f,1799.0f,2740.0f);
        t.cubicTo(1784.0f,2779.0f,1734.0f,2856.0f,1688.0f,2913.0f);
        t.cubicTo(1480.0f,3169.0f,1428.0f,3431.0f,1562.0f,3547.0f);
        t.cubicTo(1627.0f,3604.0f,1635.0f,3623.0f,1647.0f,3743.0f);
        t.cubicTo(1770.0f,4959.0f,2977.0f,5577.0f,3835.0f,4863.0f);
        t.cubicTo(4153.0f,4598.0f,4399.0f,4076.0f,4400.0f,3663.0f);
        t.cubicTo(4400.0f,3621.0f,4419.0f,3574.0f,4450.0f,3536.0f);
        t.cubicTo(4542.0f,3427.0f,4497.0f,3165.0f,4354.0f,2977.0f);
        t.cubicTo(4324.0f,2938.0f,4283.0f,2858.0f,4263.0f,2798.0f);
        t.cubicTo(4158.0f,2493.0f,3912.0f,2107.0f,3700.0f,1916.0f);
        t.cubicTo(3579.0f,1806.0f,3579.0f,1790.0f,3691.0f,1544.0f);
        t.cubicTo(3843.0f,1214.0f,4096.0f,1043.0f,4634.0f,910.0f);
        t.cubicTo(5347.0f,733.0f,5664.0f,518.0f,5790.0f,126.0f);
        t.cubicTo(5843.0f,-36.0f,6000.0f,-44.0f,5970.0f,117.0f);
        t.cubicTo(5887.0f,566.0f,5451.0f,889.0f,4668.0f,1080.0f);
        t.cubicTo(4164.0f,1203.0f,3955.0f,1345.0f,3831.0f,1648.0f);
        t.lineTo(3787.0f,1758.0f);
        t.lineTo(3913.0f,1889.0f);
        t.cubicTo(4087.0f, 2071.0f, 4261.0f, 2343.0f, 4372.0f, 2607.0f);
        t.cubicTo(4423.0f, 2730.0f, 4501.0f, 2888.0f, 4543.0f, 2960.0f);
        t.cubicTo(4689.0f, 3203.0f, 4717.0f, 3401.0f, 4629.0f, 3572.0f);
        t.cubicTo(4601.0f, 3628.0f, 4571.0f, 3732.0f, 4560.0f, 3815.0f);
        t.cubicTo(4473.0f, 4483.0f, 4080.0f, 5027.0f, 3529.0f, 5242.0f);
        t.cubicTo(3337.0f, 5318.0f, 3092.0f, 5344.0f, 2830.0f, 5319.0f);
        t.transform(m);
        c.drawPath(t, p);
        c.drawPath(t, ps);
        c.restore();


        /*r(1,3,0,4,2);
        c.save();
        t.reset();
        t.moveTo(4949.0f,5208.0f);
        t.cubicTo(4954.0f,5172.0f,4986.0f,5167.0f,5056.0f,5191.0f);
        t.cubicTo(5087.0f,5201.0f,5069.0f,5240.0f,5034.0f,5240.0f);
        t.cubicTo(5020.0f,5240.0f,5022.0f,5232.0f,5040.0f,5220.0f);
        t.cubicTo(5065.0f,5204.0f,5063.0f,5201.0f,5029.0f,5200.0f);
        t.cubicTo(5006.0f,5200.0f,4978.0f,5210.0f,4965.0f,5223.0f);
        t.cubicTo(4949.0f,5239.0f,4944.0f,5236.0f,4949.0f,5208.0f);
        t.transform(m);
        c.drawPath(t, p);
        c.drawPath(t, ps);
        c.restore();*/


       /* r(1,3,0,4,2);
        c.save();
        t.reset();
        t.moveTo(5944.0f,5129.0f);
        t.cubicTo(5951.0f,5122.0f,5941.0f,5087.0f,5921.0f,5051.0f);
        t.cubicTo(5893.0f,5002.0f,5891.0f,4987.0f,5911.0f,4987.0f);
        t.cubicTo(5926.0f,4987.0f,5937.0f,4992.0f,5937.0f,4998.0f);
        t.cubicTo(5933.0f,5033.0f,5943.0f,5060.0f,5969.0f,5087.0f);
        t.cubicTo(5995.0f,5113.0f,5995.0f,5118.0f,5965.0f,5129.0f);
        t.cubicTo(5946.0f,5136.0f,5937.0f,5136.0f,5944.0f,5129.0f);
        t.transform(m);
        c.drawPath(t, p);
        c.drawPath(t, ps);
        c.restore();*/


       /* r(1,3,0,4,2);
        c.restore();
        r(1,3,0,4);
        p.setColor(Color.parseColor("#000000"));
        c.restore();
        r();
        c.restore();*/
    }

    private static void r(Integer... o){
        p.reset();
        ps.reset();
        if(cf != null){
            p.setColorFilter(cf);
            ps.setColorFilter(cf);
        }
        p.setAntiAlias(true);
        ps.setAntiAlias(true);
        p.setStyle(Paint.Style.FILL);
        ps.setStyle(Paint.Style.STROKE);
        for(Integer i : o){
            switch (i){
                case 0: ps.setStrokeJoin(Paint.Join.MITER); break;
                case 1: ps.setColor(Color.argb(0,0,0,0)); break;
                case 2: p.setColor(Color.parseColor("#000000")); break;
                case 3: ps.setStrokeCap(Paint.Cap.BUTT); break;
                case 4: ps.setStrokeMiter(4.0f*od); break;
            }
        }
    }
}
