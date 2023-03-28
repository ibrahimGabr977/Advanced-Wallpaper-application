package com.gabr.ibrahim.mohammedsalahthebestofenglandpro;


import android.graphics.Matrix;
import android.graphics.PointF;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class ZoomingClass implements View.OnTouchListener{

    Matrix matrix = new Matrix();
    Matrix savedMatrix = new Matrix();
    static final int NONE = 0;
    static final int DRAG = 1;
    static final int ZOOM = 2;
    int mode = NONE;
    PointF start = new PointF();
    PointF mid = new PointF();
    float oldDist = 1f;
    ViewPager viewPager1;

    ZoomingClass(ViewPager mViewPager){
        this.viewPager1=mViewPager;
    }
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        ImageView zoomingImageView = (ImageView) view;
        zoomingImageView.setScaleType(ImageView.ScaleType.MATRIX);
        float scale;

        switch (motionEvent.getAction() & MotionEvent.ACTION_MASK)
        {
            case MotionEvent.ACTION_DOWN:
                if(viewPager1!=null){viewPager1.requestDisallowInterceptTouchEvent(true);}
                matrix.set(zoomingImageView.getImageMatrix());
                savedMatrix.set(matrix);
                start.set(motionEvent.getX(), motionEvent.getY());
                mode = DRAG;
                break;

            case MotionEvent.ACTION_UP:
                if(viewPager1!=null){viewPager1.requestDisallowInterceptTouchEvent(true);}
                break;

            case MotionEvent.ACTION_POINTER_UP:
                if(viewPager1!=null){viewPager1.requestDisallowInterceptTouchEvent(true);}
                mode = NONE;
                break;

            case MotionEvent.ACTION_POINTER_DOWN:
                if(viewPager1!=null){viewPager1.requestDisallowInterceptTouchEvent(true);}
                oldDist = spacing(motionEvent);

                if (oldDist > 5f) {
                    savedMatrix.set(matrix);
                    midPoint(mid, motionEvent);
                    mode = ZOOM;

                }
                break;

            case MotionEvent.ACTION_MOVE:
                if(viewPager1!=null){viewPager1.requestDisallowInterceptTouchEvent(true);}
                if (mode == DRAG)
                {
                    matrix.set(savedMatrix);
                    matrix.postTranslate(motionEvent.getX() - start.x, motionEvent.getY() - start.y);
                }
                else if (mode == ZOOM)
                {

                    float newDist = spacing(motionEvent);

                    if (newDist > 5f)
                    {
                        matrix.set(savedMatrix);
                        scale = newDist / oldDist;
                        matrix.postScale(scale, scale, mid.x, mid.y);
                    }
                }
                break;
           default:
               if(viewPager1!=null){viewPager1.requestDisallowInterceptTouchEvent(true);}
                break;


        }

        zoomingImageView.setImageMatrix(matrix);

        return true;
    }

    private float spacing(MotionEvent event) {
        float x = event.getX(0) - event.getX(1);
        float y = event.getY(0) - event.getY(1);
        return (float) Math.sqrt(x*x + y*y);
    }

    private void midPoint(PointF point, MotionEvent event) {
        float x = event.getX(0) + event.getX(1);
        float y = event.getY(0) + event.getY(1);
        point.set(x/2 , y/2);
    }

}
