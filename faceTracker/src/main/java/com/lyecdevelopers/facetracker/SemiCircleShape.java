package com.lyecdevelopers.facetracker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class SemiCircleShape extends View {

    // declare variables
    // semi circle
    private final Paint paint = new Paint();
    Paint curvePaint;
    Path path;
    private RectF rectangle = null;
    private Float margin;


    public SemiCircleShape(Context context) {
        super(context);
        init();
    }

    public SemiCircleShape(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SemiCircleShape(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        margin = 20f;


        curvePaint = new Paint();
        curvePaint.setStyle(Paint.Style.STROKE);

        path = new Path();


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (rectangle == null) {
            rectangle = new RectF(0f + margin, 0f + margin, getWidth() - margin, getHeight() - margin);
        }
        canvas.drawArc(rectangle, -180f, 180f, false, paint);
        canvas.drawArc(rectangle, 0f, 60f, false, paint);
        canvas.drawArc(rectangle, 180f, -60f, false, paint);

        // drawing the curve
       /* curvePaint.setColor(Color.RED);
        curvePaint.setStrokeWidth(3);
        path.moveTo(-300, 600);
        path.cubicTo(217, 57, 227, 201, 138, 205);
        canvas.drawPath(path, curvePaint);*/
    }
}
