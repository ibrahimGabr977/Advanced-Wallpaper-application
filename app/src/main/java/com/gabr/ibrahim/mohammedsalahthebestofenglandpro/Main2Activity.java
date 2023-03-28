package com.gabr.ibrahim.mohammedsalahthebestofenglandpro;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import com.squareup.picasso.Picasso;


public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);


        ViewPager viewPager = (ViewPager) findViewById(R.id.VP);
        Sliders sliders = new Sliders(Main2Activity.this, pages);
        viewPager.setAdapter(sliders);

        }


    private int [] pages=new int[]{1,2,3,4,5};


    //images array
    //===========================================

        ImageView[] imageViews=new ImageView[20];
    private void setImageViews(View lyv){
        imageViews[0]=lyv.findViewById(R.id.imageView1);imageViews[1]=lyv.findViewById(R.id.imageView2);imageViews[2]=lyv.findViewById(R.id.imageView3);
        imageViews[3]=lyv.findViewById(R.id.imageView4);imageViews[4]=lyv.findViewById(R.id.imageView5);imageViews[5]=lyv.findViewById(R.id.imageView6);
        imageViews[6]=lyv.findViewById(R.id.imageView7);imageViews[7]=lyv.findViewById(R.id.imageView8);imageViews[8]=lyv.findViewById(R.id.imageView9);
        imageViews[9]=lyv.findViewById(R.id.imageView10);imageViews[10]=lyv.findViewById(R.id.imageView11);imageViews[11]=lyv.findViewById(R.id.imageView12);
        imageViews[12]=lyv.findViewById(R.id.imageView13);imageViews[13]=lyv.findViewById(R.id.imageView14);imageViews[14]=lyv.findViewById(R.id.imageView15);
        imageViews[15]=lyv.findViewById(R.id.imageView16);imageViews[16]=lyv.findViewById(R.id.imageView17);imageViews[17]=lyv.findViewById(R.id.imageView18);
        imageViews[18]=lyv.findViewById(R.id.imageView19);imageViews[19]=lyv.findViewById(R.id.imageView20);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            for(int i=0;i<20;i++){
                imageViews[i].setClipToOutline(true);
            }
        }

    }

    //===========================================

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finishAffinity();
    }


    //set images in images array
    //=========================================

    private void switchSet(int switcher){
        switch (switcher){
            case 0:
             Picasso.get().load(R.drawable.salah_01).fit().into(imageViews[0]);Picasso.get().load(R.drawable.salah_02).fit().into(imageViews[1]);
             Picasso.get().load(R.drawable.salah_03).fit().into(imageViews[2]);Picasso.get().load(R.drawable.salah_04).fit().into(imageViews[3]);
             Picasso.get().load(R.drawable.salah_05).fit().into(imageViews[4]);Picasso.get().load(R.drawable.salah_06).fit().into(imageViews[5]);
             Picasso.get().load(R.drawable.salah_07).fit().into(imageViews[6]);Picasso.get().load(R.drawable.salah_08).fit().into(imageViews[7]);
             Picasso.get().load(R.drawable.salah_09).fit().into(imageViews[8]);Picasso.get().load(R.drawable.salah_010).fit().into(imageViews[9]);
             Picasso.get().load(R.drawable.salah_011).fit().into(imageViews[10]);Picasso.get().load(R.drawable.salah_012).fit().into(imageViews[11]);
             Picasso.get().load(R.drawable.salah_013).fit().into(imageViews[12]);Picasso.get().load(R.drawable.salah_014).fit().into(imageViews[13]);
             Picasso.get().load(R.drawable.salah_015).fit().into(imageViews[14]);Picasso.get().load(R.drawable.salah_016).fit().into(imageViews[15]);
             Picasso.get().load(R.drawable.salah_017).fit().into(imageViews[16]);Picasso.get().load(R.drawable.salah_018).fit().into(imageViews[17]);
             Picasso.get().load(R.drawable.salah_019).fit().into(imageViews[18]);Picasso.get().load(R.drawable.salah_020).fit().into(imageViews[19]);
                break;
            case 1:
            Picasso.get().load(R.drawable.salah_021).fit().into(imageViews[0]);Picasso.get().load(R.drawable.salah_022).fit().into(imageViews[1]);
            Picasso.get().load(R.drawable.salah_023).fit().into(imageViews[2]);Picasso.get().load(R.drawable.salah_024).fit().into(imageViews[3]);
            Picasso.get().load(R.drawable.salah_025).fit().into(imageViews[4]);Picasso.get().load(R.drawable.salah_026).fit().into(imageViews[5]);
            Picasso.get().load(R.drawable.salah_027).fit().into(imageViews[6]);Picasso.get().load(R.drawable.salah_028).fit().into(imageViews[7]);
            Picasso.get().load(R.drawable.salah_029).fit().into(imageViews[8]);Picasso.get().load(R.drawable.salah_030).fit().into(imageViews[9]);
            Picasso.get().load(R.drawable.salah_031).fit().into(imageViews[10]);Picasso.get().load(R.drawable.salah_032).fit().into(imageViews[11]);
            Picasso.get().load(R.drawable.salah_033).fit().into(imageViews[12]);Picasso.get().load(R.drawable.salah_034).fit().into(imageViews[13]);
            Picasso.get().load(R.drawable.salah_035).fit().into(imageViews[14]);Picasso.get().load(R.drawable.salah_036).fit().into(imageViews[15]);
            Picasso.get().load(R.drawable.salah_037).fit().into(imageViews[16]);Picasso.get().load(R.drawable.salah_038).fit().into(imageViews[17]);
            Picasso.get().load(R.drawable.salah_039).fit().into(imageViews[18]);Picasso.get().load(R.drawable.salah_040).fit().into(imageViews[19]);
                break;
            case 2:
            Picasso.get().load(R.drawable.salah_041).fit().into(imageViews[0]);Picasso.get().load(R.drawable.salah_042).fit().into(imageViews[1]);
            Picasso.get().load(R.drawable.salah_043).fit().into(imageViews[2]);Picasso.get().load(R.drawable.salah_044).fit().into(imageViews[3]);
            Picasso.get().load(R.drawable.salah_045).fit().into(imageViews[4]);Picasso.get().load(R.drawable.salah_046).fit().into(imageViews[5]);
            Picasso.get().load(R.drawable.salah_047).fit().into(imageViews[6]);Picasso.get().load(R.drawable.salah_048).fit().into(imageViews[7]);
            Picasso.get().load(R.drawable.salah_049).fit().into(imageViews[8]);Picasso.get().load(R.drawable.salah_050).fit().into(imageViews[9]);
            Picasso.get().load(R.drawable.salah_051).fit().into(imageViews[10]);Picasso.get().load(R.drawable.salah_052).fit().into(imageViews[11]);
            Picasso.get().load(R.drawable.salah_053).fit().into(imageViews[12]);Picasso.get().load(R.drawable.salah_054).fit().into(imageViews[13]);
            Picasso.get().load(R.drawable.salah_055).fit().into(imageViews[14]);Picasso.get().load(R.drawable.salah_056).fit().into(imageViews[15]);
            Picasso.get().load(R.drawable.salah_057).fit().into(imageViews[16]);Picasso.get().load(R.drawable.salah_058).fit().into(imageViews[17]);
            Picasso.get().load(R.drawable.salah_059).fit().into(imageViews[18]);Picasso.get().load(R.drawable.salah_060).fit().into(imageViews[19]);
                break;
            case 3:
            Picasso.get().load(R.drawable.salah_061).fit().into(imageViews[0]);Picasso.get().load(R.drawable.salah_062).fit().into(imageViews[1]);
            Picasso.get().load(R.drawable.salah_063).fit().into(imageViews[2]);Picasso.get().load(R.drawable.salah_064).fit().into(imageViews[3]);
            Picasso.get().load(R.drawable.salah_065).fit().into(imageViews[4]);Picasso.get().load(R.drawable.salah_066).fit().into(imageViews[5]);
            Picasso.get().load(R.drawable.salah_067).fit().into(imageViews[6]);Picasso.get().load(R.drawable.salah_068).fit().into(imageViews[7]);
            Picasso.get().load(R.drawable.salah_069).fit().into(imageViews[8]);Picasso.get().load(R.drawable.salah_070).fit().into(imageViews[9]);
            Picasso.get().load(R.drawable.salah_071).fit().into(imageViews[10]);Picasso.get().load(R.drawable.salah_072).fit().into(imageViews[11]);
            Picasso.get().load(R.drawable.salah_073).fit().into(imageViews[12]);Picasso.get().load(R.drawable.salah_074).fit().into(imageViews[13]);
            Picasso.get().load(R.drawable.salah_075).fit().into(imageViews[14]);Picasso.get().load(R.drawable.salah_076).fit().into(imageViews[15]);
            Picasso.get().load(R.drawable.salah_077).fit().into(imageViews[16]);Picasso.get().load(R.drawable.salah_078).fit().into(imageViews[17]);
            Picasso.get().load(R.drawable.salah_079).fit().into(imageViews[18]);Picasso.get().load(R.drawable.salah_080).fit().into(imageViews[19]);
                break;
            case 4:
            Picasso.get().load(R.drawable.salah_081).fit().into(imageViews[0]);Picasso.get().load(R.drawable.salah_082).fit().into(imageViews[1]);
            Picasso.get().load(R.drawable.salah_083).fit().into(imageViews[2]);Picasso.get().load(R.drawable.salah_084).fit().into(imageViews[3]);
            Picasso.get().load(R.drawable.salah_085).fit().into(imageViews[4]);Picasso.get().load(R.drawable.salah_086).fit().into(imageViews[5]);
            Picasso.get().load(R.drawable.salah_087).fit().into(imageViews[6]);Picasso.get().load(R.drawable.salah_088).fit().into(imageViews[7]);
            Picasso.get().load(R.drawable.salah_089).fit().into(imageViews[8]);Picasso.get().load(R.drawable.salah_090).fit().into(imageViews[9]);
            Picasso.get().load(R.drawable.salah_091).fit().into(imageViews[10]);Picasso.get().load(R.drawable.salah_092).fit().into(imageViews[11]);
            Picasso.get().load(R.drawable.salah_093).fit().into(imageViews[12]);Picasso.get().load(R.drawable.salah_094).fit().into(imageViews[13]);
            Picasso.get().load(R.drawable.salah_095).fit().into(imageViews[14]);Picasso.get().load(R.drawable.salah_096).fit().into(imageViews[15]);
            Picasso.get().load(R.drawable.salah_097).fit().into(imageViews[16]);Picasso.get().load(R.drawable.salah_098).fit().into(imageViews[17]);
            Picasso.get().load(R.drawable.salah_099).fit().into(imageViews[18]);Picasso.get().load(R.drawable.salah_0100).fit().into(imageViews[19]);
                break;
        }


    }

    //=========================================


    //send information to other activities
    //=================================

   private void oPA(final int f){
       final Intent mIntent=new Intent(Main2Activity.this,Main3Activity.class);
         imageViews[0].setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 switch (f){
                     case 0:
                         mIntent.putExtra("value",0);
                         startActivity(mIntent);
                         break;
                     case 1:
                         mIntent.putExtra("value",20);
                         startActivity(mIntent);
                         break;
                     case 2:
                         mIntent.putExtra("value",40);
                         startActivity(mIntent);
                         break;
                     case 3:
                         mIntent.putExtra("value",60);

                         startActivity(mIntent);
                         break;
                     case 4:
                         mIntent.putExtra("value",80);
                         startActivity(mIntent);
                         break;
                 }

             }
         });
       imageViews[1].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",1);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",21);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",41);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",61);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",81);
                       startActivity(mIntent);
                       break;
               }

           }
       });
       imageViews[2].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",2);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",22);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",42);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",62);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",82);
                       startActivity(mIntent);
                       break;
               }

           }
       });
       imageViews[3].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",3);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",23);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",43);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",63);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",83);
                       startActivity(mIntent);
                       break;
               }
           }
       });
       imageViews[4].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",4);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",24);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",44);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",64);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",84);
                       startActivity(mIntent);
                       break;
               }
           }
       });
       imageViews[5].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",5);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",25);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",45);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",65);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",85);
                       startActivity(mIntent);
                       break;
               }

           }
       });
       imageViews[6].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",6);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",26);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",46);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",66);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",86);
                       startActivity(mIntent);
                       break;
               }
           }
       });
       imageViews[7].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",7);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",27);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",47);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",67);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",87);
                       startActivity(mIntent);
                       break;
               }
           }
       });
       imageViews[8].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",8);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",28);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",48);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",68);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",88);
                       startActivity(mIntent);
                       break;
               }
           }
       });
       imageViews[9].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",9);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",29);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",49);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",69);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",89);
                       startActivity(mIntent);
                       break;
               }
           }
       });
       imageViews[10].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",10);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",30);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",50);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",70);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",90);
                       startActivity(mIntent);
                       break;
               }
           }
       });
       imageViews[11].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",11);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",31);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",51);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",71);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",91);
                       startActivity(mIntent);
                       break;
               }
           }
       });
       imageViews[12].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",12);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",32);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",52);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",72);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",92);
                       startActivity(mIntent);
                       break;
               }
           }
       });
       imageViews[13].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",13);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",33);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",53);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",73);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",93);
                       startActivity(mIntent);
                       break;
               }
           }
       });
       imageViews[14].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",14);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",34);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",54);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",74);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",94);
                       startActivity(mIntent);
                       break;
               }
           }
       });
       imageViews[15].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",15);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",35);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",55);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",75);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",95);
                       startActivity(mIntent);
                       break;
               }
           }
       });
       imageViews[16].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",16);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",36);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",56);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",76);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",96);
                       startActivity(mIntent);
                       break;
               }
           }
       });
       imageViews[17].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",17);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",37);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",57);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",77);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",97);
                       startActivity(mIntent);
                       break;
               }
           }
       });
       imageViews[18].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",18);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",38);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",58);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",78);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",98);
                       startActivity(mIntent);
                       break;
               }
           }
       });
       imageViews[19].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (f){
                   case 0:
                       mIntent.putExtra("value",19);
                       startActivity(mIntent);
                       break;
                   case 1:
                       mIntent.putExtra("value",39);
                       startActivity(mIntent);
                       break;
                   case 2:
                       mIntent.putExtra("value",59);
                       startActivity(mIntent);
                       break;
                   case 3:
                       mIntent.putExtra("value",79);
                       startActivity(mIntent);
                       break;
                   case 4:
                       mIntent.putExtra("value",99);
                       startActivity(mIntent);
                       break;
               }
           }
       });


    }

    //=================================


    //imageViews swipe class
    //=============================================

    public  class Sliders extends PagerAdapter{
        private int[]pages;
        private Context context;
        private LayoutInflater layoutInflater;
        Sliders(Context context ,int[] pages ){
            this.context=context;
            this.pages=pages;

        }
        @Override
        public int getCount() {

            return pages.length;
        }




        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

            return view==(ConstraintLayout)object;
        }
        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View lyv=layoutInflater.inflate(R.layout.sliders,container,false);
            container.addView(lyv);
            setImageViews(lyv);
            try {
            switch (position){
                case 0:
                    switchSet(0);
                    oPA(0);
                    break;
                case 1:
                    switchSet(1);
                    oPA(1);
                    break;
                case 2:
                    switchSet(2);
                    oPA(2);
                    break;
                case 3:
                    switchSet(3);
                    oPA(3);
                    break;
                case 4:
                    switchSet(4);
                    oPA(4);
                    break;
            }
            }catch (OutOfMemoryError error){
                Toast.makeText(Main2Activity.this,""+getResources().getString(R.string.try_again)+"",Toast.LENGTH_LONG).show();
                recreate();
            }
            return lyv;

        }



        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((ConstraintLayout)object);
        }
    }

    //=============================================

    }


