package com.gabr.ibrahim.mohammedsalahthebestofenglandpro;


import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;


public class Main4Activity extends AppCompatActivity {

    private  MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main4);

        final ViewPager viewPager=(ViewPager)findViewById(R.id.viewPager4);
        SlideShowPager slideShowPager=new SlideShowPager(this);
        viewPager.setAdapter(slideShowPager);
        viewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });



        mediaPlayer=MediaPlayer.create(Main4Activity.this,R.raw.fans);
        mediaPlayer.start();

       final  Handler mHandler=new Handler();
        Runnable runnable=new Runnable() {
            int i=0;
            public void run() {
                mediaPlayer.start();
                if(!mediaPlayer.isPlaying()){mediaPlayer.start();}
                viewPager.setCurrentItem(i);
                i++;
                if (i>img.length-1){
                    i=0;
                }
                mHandler.postDelayed(this,2000);
            }
        };
        mHandler.postDelayed(runnable,500);
        Toast.makeText(this,""+getResources().getString(R.string.slide_show_4)+"",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onBackPressed() {
        mediaPlayer.stop();
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        mediaPlayer.stop();
        super.onDestroy();
    }

    private int img[]=new int[]{
            R.drawable.salah_1, R.drawable.salah_2, R.drawable.salah_3, R.drawable.salah_4, R.drawable.salah_5, R.drawable.salah_6,
            R.drawable.salah_7, R.drawable.salah_8, R.drawable.salah_9, R.drawable.salah_10, R.drawable.salah_11, R.drawable.salah_12,
            R.drawable.salah_13, R.drawable.salah_14, R.drawable.salah_15, R.drawable.salah_16, R.drawable.salah_17, R.drawable.salah_18,
            R.drawable.salah_19, R.drawable.salah_20, R.drawable.salah_21, R.drawable.salah_22, R.drawable.salah_23, R.drawable.salah_24,
            R.drawable.salah_25, R.drawable.salah_26, R.drawable.salah_27, R.drawable.salah_28, R.drawable.salah_29, R.drawable.salah_30,
            R.drawable.salah_31, R.drawable.salah_32, R.drawable.salah_33, R.drawable.salah_34, R.drawable.salah_35, R.drawable.salah_36,
            R.drawable.salah_37, R.drawable.salah_38, R.drawable.salah_39, R.drawable.salah_40, R.drawable.salah_41, R.drawable.salah_42,
            R.drawable.salah_43, R.drawable.salah_44, R.drawable.salah_45, R.drawable.salah_46, R.drawable.salah_47, R.drawable.salah_48,
            R.drawable.salah_49, R.drawable.salah_50, R.drawable.salah_51, R.drawable.salah_52, R.drawable.salah_53, R.drawable.salah_54,
            R.drawable.salah_55, R.drawable.salah_56, R.drawable.salah_57, R.drawable.salah_58, R.drawable.salah_59, R.drawable.salah_60,
            R.drawable.salah_61, R.drawable.salah_62, R.drawable.salah_63, R.drawable.salah_64, R.drawable.salah_65, R.drawable.salah_66,
            R.drawable.salah_67, R.drawable.salah_68, R.drawable.salah_69, R.drawable.salah_70, R.drawable.salah_71, R.drawable.salah_72,
            R.drawable.salah_73, R.drawable.salah_74, R.drawable.salah_75, R.drawable.salah_76, R.drawable.salah_77, R.drawable.salah_78,
            R.drawable.salah_79, R.drawable.salah_80, R.drawable.salah_81, R.drawable.salah_82, R.drawable.salah_83, R.drawable.salah_84,
            R.drawable.salah_85, R.drawable.salah_86, R.drawable.salah_87, R.drawable.salah_88, R.drawable.salah_89, R.drawable.salah_90,
            R.drawable.salah_91, R.drawable.salah_92, R.drawable.salah_93, R.drawable.salah_94, R.drawable.salah_95, R.drawable.salah_96,
            R.drawable.salah_97, R.drawable.salah_98, R.drawable.salah_99, R.drawable.salah_100};


    public void orient(View view){
        if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }

    public class SlideShowPager extends PagerAdapter{
        private Context context=null;
        private LayoutInflater layoutInflater=null;
        private View lyv=null;
        private ImageView mimageView=null;

        SlideShowPager(Context context){
            this.context=context;
        }

        @Override
        public int getCount() {
            return img.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            return view == o;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            lyv=layoutInflater.inflate(R.layout.slideshow,container,false);
            container.addView(lyv);
            mimageView=lyv.findViewById(R.id.slideShow);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                mimageView.setClipToOutline(true);
            }
            try {
                Picasso.get().load(img[position]).into(mimageView);
            }catch (OutOfMemoryError error){
                Toast.makeText(Main4Activity.this,""+getResources().getString(R.string.try_again)+"",Toast.LENGTH_LONG).show();
                recreate();}
            return lyv;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((View) object);
        }
    }

}
