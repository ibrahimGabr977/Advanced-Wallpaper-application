package com.gabr.ibrahim.mohammedsalahthebestofenglandpro;

import android.Manifest;
import android.app.ActivityManager;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.StrictMode;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.devs.sketchimage.SketchImage;
import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;



public  class  Main3Activity extends AppCompatActivity {


    // pramaters
   //=====================================================================================================
    private Bitmap bitmap=null;
    private Drawable drawable=null;
    private File file=null;
    //===================================================
    private ViewPager viewPager=null;
    private Handler mHandler=null;
    private boolean success=true;
    private int h;
    private ImageView imageView=null;
    private View viewb;
    private EditText editText=null;
    private CircleMenu circleMenu=null;
    private CircleMenu circleMenu1=null;
    private Spinner savespin=null;
    private Spinner setSpin=null;
    private Spinner filterSpin=null;
    private int fileNum=0;
    private String fileName=null;
    private Intent inpo=null;
    private android.support.v7.app.AlertDialog.Builder alertDialog=null;

    //====================================================================================================

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main3);


        int x = getIntent().getIntExtra("value", 0);
        viewPager=(ViewPager)findViewById(R.id.VP2);
        Slider slider = new Slider(Main3Activity.this, img);
        viewPager.setAdapter(slider);
        viewPager.setCurrentItem(x);



    }




    //application Folders for saving images by this code if the folder not exist it will be created else nothing will happen
    //===========================================================================================================================================
    private File folder=new File(Environment.getExternalStorageDirectory()+File.separator + "SalahImages @GIMI79.DUK");

    private File org_fold=new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK")+File.separator+"MoSalahorg");

    private File h_fold=new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK")+File.separator+"MoSalahH");

    private File b_fold=new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK")+File.separator+"MoSalahB");

    private File fb_fold=new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK")+File.separator+"MoSalahFB");

    private File wp_fold=new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK")+File.separator+"MoSalahWP");
    //============================================================================================================================================






    //images array
    //=================================================================================================================================
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
    //===================================================================================================================================




    //download images Methods
    //=================================================================

    private  void saveInOrginalSizeAndPosition() {

        if (ActivityCompat.checkSelfPermission(Main3Activity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED){

            //making folders
            //====================================================================

            if (!folder.exists()) {success = folder.mkdir();}

            if (!org_fold.exists()) {success = org_fold.mkdir();}

            if (!h_fold.exists()) {success = h_fold.mkdir();}

            if (!b_fold.exists()) {success = b_fold.mkdir();}

            if (!fb_fold.exists()) {success = fb_fold.mkdir();}

            if (!wp_fold.exists()) {success = wp_fold.mkdir();}

            //========================================================================
            viewPager=(ViewPager)findViewById(R.id.VP2);
            this.h = viewPager.getCurrentItem();
            file = new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK/MoSalahorg"), "MoSalah_0" + ((this.h + 1) * 6) + ".jpg");
            if (!file.exists()) {

                drawable = getResources().getDrawable(img[this.h]);
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                saveMainMethod(bitmap,file,1);


                Toast.makeText(Main3Activity.this, ""+getResources().getString(R.string.this_image)+" (MoSalah_0"+((this.h+1)*6)+") "+getResources().getString(R.string.saves_to)
                        +Environment.getExternalStorageDirectory().getPath()+"/SalahImages @GIMI79.DUK/MoSalahorg", Toast.LENGTH_LONG).show();


            } else {
                Toast.makeText(Main3Activity.this, ""+getResources().getString(R.string.existing_images_3)+"", Toast.LENGTH_SHORT).show();
            }
        }else {
            ActivityCompat.requestPermissions(Main3Activity.this,new String[]{
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.READ_EXTERNAL_STORAGE
            },1);
        }




    }

    private void saveInCurrentSizeAndPosition(){

        if (ActivityCompat.checkSelfPermission(Main3Activity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED){
        //making folders
        //===================================================
        if (!folder.exists()) {success = folder.mkdir();}

        if (!org_fold.exists()) {success = org_fold.mkdir();}

        if (!h_fold.exists()) {success = h_fold.mkdir();}

        if (!b_fold.exists()) {success = b_fold.mkdir();}

        if (!fb_fold.exists()) {success = fb_fold.mkdir();}

        if (!wp_fold.exists()) {success = wp_fold.mkdir();}
        //=================================================

         //===============================================================
             savespin=viewb.findViewById(R.id.save);
                    savespin.setVisibility(View.INVISIBLE);
             setSpin=viewb.findViewById(R.id.set);
                    setSpin.setVisibility(View.INVISIBLE);
             filterSpin=viewb.findViewById(R.id.filters);
                    filterSpin.setVisibility(View.INVISIBLE);
        final Button button=viewb.findViewById(R.id.open_menu);
                    button.setVisibility(View.INVISIBLE);
        final ConstraintLayout constraintLayout=viewb.findViewById(R.id.sliderLayout);
                    constraintLayout.setBackgroundResource(R.drawable.buttoninvisible);
                    viewPager=(ViewPager) findViewById(R.id.VP2);
                    viewPager.setBackgroundResource(R.drawable.buttoninvisible);
                    editText=viewb.findViewById(R.id.editText);
                    if (editText.getVisibility()==View.VISIBLE){
                    editText.setVisibility(View.INVISIBLE);}
         //===============================================================





        fileNum=(int)(1606*Math.random());
        fileName="MoSalah_6"+fileNum+".jpg";

        file =new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK/MoSalahorg"),fileName);

        if (file.exists()){

            fileNum=(int)(26578*Math.random());
            fileName="MoSalah_8"+fileNum+".jpg";

            file=new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK/MoSalahorg"),fileName);
        }

         mHandler=new Handler();

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                View v1=Main3Activity.this.getWindow().getDecorView().getRootView();
                v1.setDrawingCacheEnabled(true);
                bitmap=Bitmap.createBitmap(v1.getDrawingCache());
                v1.setDrawingCacheEnabled(false);
                saveMainMethod(bitmap,file,1);



            }
        },200L);

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.this_image)+" ("+fileName+") "+getResources().getString(R.string.saves_to)
                        +Environment.getExternalStorageDirectory().getPath() +"/SalahImages @GIMI79.DUK/MoSalahorg",Toast.LENGTH_LONG).show();


                //===================================
                savespin.setVisibility(View.VISIBLE);
                setSpin.setVisibility(View.VISIBLE);
                filterSpin.setVisibility(View.VISIBLE);
                button.setVisibility(View.VISIBLE);
                viewPager.setBackgroundResource(R.drawable.blackframe);
                constraintLayout.setBackgroundResource(R.drawable.wpfalla);
                //==================================

            }
        },400L);

        }else {
            ActivityCompat.requestPermissions(Main3Activity.this, new String[]{
                    Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE
            }, 1);
        }

    }




    private void saveInCurrnetFilter(){
        if (ActivityCompat.checkSelfPermission(Main3Activity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED){

            //making folders
            //====================================================================

            if (!folder.exists()) {success = folder.mkdir();}

            if (!org_fold.exists()) {success = org_fold.mkdir();}

            if (!h_fold.exists()) {success = h_fold.mkdir();}

            if (!b_fold.exists()) {success = b_fold.mkdir();}

            if (!fb_fold.exists()) {success = fb_fold.mkdir();}

            if (!wp_fold.exists()) {success = wp_fold.mkdir();}

            //========================================================================


            imageView=viewb.findViewById(R.id.imageView);

            fileNum=(int)(4906*Math.random());
            fileName="MoSalah_F"+fileNum+".jpg";

            file =new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK/MoSalahorg"),fileName);

            if (file.exists()){

                fileNum=(int)(87465*Math.random());
                fileName="MoSalah_F7"+fileNum+".jpg";

                file=new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK/MoSalahorg"),fileName);
            }

                drawable = imageView.getDrawable();
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                saveMainMethod(bitmap,file,1);
            Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.this_image)+" ("+fileName+") "+getResources().getString(R.string.saves_to)
                    +Environment.getExternalStorageDirectory().getPath()+"/SalahImages @GIMI79.DUK/MoSalahorg",Toast.LENGTH_LONG).show();


        }else {
            ActivityCompat.requestPermissions(Main3Activity.this, new String[]{
                    Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE
            }, 1);

        }
    }

    private void saveMainMethod(Bitmap mBitmap,File mfile,int b){

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            try {
                mfile.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(mfile);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (b==1) {
                MediaScannerConnection.scanFile(Main3Activity.this, //to add image to gallery directly
                        new String[]{mfile.toString()}, null,
                        null);
            }

    }

    //===============================================================

    //ImageFilters
    //===============================================

    private void imageFiltersMethod(final int n){
        viewPager=(ViewPager)findViewById(R.id.VP2);
        this.h = viewPager.getCurrentItem();
        editText=viewb.findViewById(R.id.editText);
        imageView = viewb.findViewById(R.id.imageView);
        drawable =getResources().getDrawable(img[h]);
        bitmap=((BitmapDrawable)drawable).getBitmap();

           editText.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (i == KeyEvent.KEYCODE_ENTER)) {
                        if(editText.getText().length()!=0) {
                             String s = editText.getText().toString();
                             int m = Integer.valueOf(s);
                             if (m>0&m<=25) {
                                 try {
                                     SketchImage sketchImage = new SketchImage.Builder(Main3Activity.this, bitmap).build();
                                     Bitmap[] filterBitmap = new Bitmap[1];

                                     switch (n) {
                                         case 2:
                                             filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_GRAY, m * 5);
                                             Glide.with(Main3Activity.this).load(filterBitmap[0]).into(imageView);
                                             break;
                                         case 3:
                                             filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_GRAY, 125 + (m * 15));
                                             Glide.with(Main3Activity.this).load(filterBitmap[0]).into(imageView);
                                             break;
                                         case 4:
                                             filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_GRAY, 500 + (m * 100));
                                             Glide.with(Main3Activity.this).load(filterBitmap[0]).into(imageView);
                                             break;
                                         case 5:
                                             filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_SKETCH, m * 4);
                                             Glide.with(Main3Activity.this).load(filterBitmap[0]).into(imageView);
                                             break;
                                         case 6:
                                             filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_SKETCH, 100 + (m * 5));
                                             Glide.with(Main3Activity.this).load(filterBitmap[0]).into(imageView);
                                             break;
                                         case 7:
                                             filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_SKETCH, 225 + (m * 71));
                                             Glide.with(Main3Activity.this).load(filterBitmap[0]).into(imageView);
                                             break;
                                         case 8:
                                             filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_COLORED_SKETCH, m * 4);
                                             Glide.with(Main3Activity.this).load(filterBitmap[0]).into(imageView);
                                             break;
                                         case 9:
                                             filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_SOFT_SKETCH, m * 4);
                                             Glide.with(Main3Activity.this).load(filterBitmap[0]).into(imageView);
                                             break;
                                         case 10:
                                             filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_SOFT_SKETCH, 100 + (m * 76));
                                             Glide.with(Main3Activity.this).load(filterBitmap[0]).into(imageView);
                                             break;
                                         case 11:
                                             filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_SOFT_COLOR_SKETCH, m * 4);
                                             Glide.with(Main3Activity.this).load(filterBitmap[0]).into(imageView);
                                             break;
                                         case 12:
                                             filterBitmap[0] = sketchImage.getImageAs(SketchImage.GRAY_TO_SKETCH, m * 4);
                                             Glide.with(Main3Activity.this).load(filterBitmap[0]).into(imageView);
                                             break;
                                         case 13:
                                             filterBitmap[0] = sketchImage.getImageAs(SketchImage.GRAY_TO_COLORED_SKETCH, m * 4);
                                             Glide.with(Main3Activity.this).load(filterBitmap[0]).into(imageView);
                                             break;
                                         case 14:
                                             filterBitmap[0] = sketchImage.getImageAs(SketchImage.GRAY_TO_SOFT_SKETCH, m * 4);
                                             Glide.with(Main3Activity.this).load(filterBitmap[0]).into(imageView);
                                             break;
                                         case 15:
                                             filterBitmap[0] = sketchImage.getImageAs(SketchImage.GRAY_TO_SOFT_COLOR_SKETCH, m * 4);
                                             Glide.with(Main3Activity.this).load(filterBitmap[0]).into(imageView);
                                             break;
                                         case 16:
                                             filterBitmap[0] = sketchImage.getImageAs(SketchImage.GRAY_TO_SOFT_COLOR_SKETCH, 100 + (m * 116));
                                             Glide.with(Main3Activity.this).load(filterBitmap[0]).into(imageView);
                                             break;
                                         case 17:
                                             filterBitmap[0] = sketchImage.getImageAs(SketchImage.SKETCH_TO_COLOR_SKETCH, m * 12);
                                             Glide.with(Main3Activity.this).load(filterBitmap[0]).into(imageView);
                                             break;
                                         case 18:
                                             filterBitmap[0] = sketchImage.getImageAs(SketchImage.SKETCH_TO_COLOR_SKETCH, 300 + (m * 88));
                                             Glide.with(Main3Activity.this).load(filterBitmap[0]).into(imageView);
                                             break;
                                     }
                                 }catch (OutOfMemoryError error){
                                     Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.try_again)+"",Toast.LENGTH_LONG).show();
                                     recreate();
                                 }
                             }else
                                 Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.too_big_level)+"",Toast.LENGTH_SHORT).show();
                        }
                        if (editText!=null){
                        editText.setText(null);}
                            return true;
                        }
                    return false;
                }
            });
    }

    //==================================================




    //Share Images button
    //===============================

    private void share() {

        if (ActivityCompat.checkSelfPermission(Main3Activity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED){

            Intent share =new Intent(Intent.ACTION_SEND);
            this.h = viewPager.getCurrentItem();
            file =new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK"),"moSalah_1652Share_Temoperary.jpg");
            drawable = getResources().getDrawable(img[h]);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            share.setType("image/jpg");
            saveMainMethod(bitmap,file,2);


            StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
            StrictMode.setVmPolicy(builder.build());
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
                builder.detectFileUriExposure();
            }
            share.putExtra(Intent.EXTRA_STREAM,Uri.fromFile(file));
            startActivity(Intent.createChooser(share, getResources().getString(R.string.share_title)));

            //deleting the temp files
            mHandler = new Handler();
            mHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    file.delete();
                }
            }, 15000L);
        }else {
            ActivityCompat.requestPermissions(Main3Activity.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.READ_EXTERNAL_STORAGE
            },1);

        }
    }

    //===============================


    //Slide Show button and Menu
    //====================================

    private void slideShow(){
        Intent I=new Intent(this,Main4Activity.class);
        startActivity(I);

    }

    public void openCMenu(View view){
        circleMenu=viewb.findViewById(R.id.circle_menu);
        circleMenu1=viewb.findViewById(R.id.circle2);
        imageView=viewb.findViewById(R.id.imageView);
        imageView.setOnTouchListener(null);
        circleMenu.setVisibility(View.VISIBLE);
        circleMenu1.closeMenu();
        circleMenu.openMenu();



    }


    //===================================



    //change orient
    //============================================

    private void switchOrientation3(){
        if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }

    //===========================================



    //Help
    //==============================

    private void help(){

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            alertDialog = new android.support.v7.app.AlertDialog.Builder(Main3Activity.this,R.style.Theme_AppCompat_Dialog_MinWidth);
        } else {
            alertDialog = new android.support.v7.app.AlertDialog.Builder(Main3Activity.this);
        }

        alertDialog.setTitle(""+getResources().getString(R.string.help_title)+"")
                .setMessage(""+getResources().getString(R.string.help)+"")
                .setNeutralButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setIcon(R.drawable.alerts)
                .show();
    }

    private void cleanApp(){

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    alertDialog = new android.support.v7.app.AlertDialog.Builder(Main3Activity.this,R.style.Theme_AppCompat_Dialog_MinWidth);
                    //Theme_AppCompat_Dialog_MinWidth                              R.style.Theme_AppCompat_Dialog_MinWidth

                } else {
                    alertDialog = new android.support.v7.app.AlertDialog.Builder(Main3Activity.this);
                }

                alertDialog.setTitle(""+getResources().getString(R.string.clearing_title)+"")
                        .setMessage(""+getResources().getString(R.string.clearing)+"")
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();

                            }
                        })
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                                    ((ActivityManager)getSystemService(ACTIVITY_SERVICE)).clearApplicationUserData();
                                }
                            }
                        })
                        .setIcon(R.drawable.alerts)
                        .show();


    }

    //==============================


    //private option open
    //========================================

    private void privateOption (){

        if (ActivityCompat.checkSelfPermission(Main3Activity.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED
                |ActivityCompat.checkSelfPermission(Main3Activity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE)!=PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(Main3Activity.this,new String[]{
                    Manifest.permission.CAMERA,Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.READ_EXTERNAL_STORAGE
            },100);
            return;
        }else {
            //making folders
            //====================================================================

            if (!folder.exists()) {success = folder.mkdir();}

            if (!org_fold.exists()) {success = org_fold.mkdir();}

            if (!h_fold.exists()) {success = h_fold.mkdir();}

            if (!b_fold.exists()) {success = b_fold.mkdir();}

            if (!fb_fold.exists()) {success = fb_fold.mkdir();}

            if (!wp_fold.exists()) {success = wp_fold.mkdir();}

            //========================================================================
            viewPager=(ViewPager)findViewById(R.id.VP2);
            inpo=new Intent(Main3Activity.this,Main5Activity.class);
            inpo.putExtra("receiveImageNumber",viewPager.getCurrentItem());
        startActivity(inpo);}
    }

    private void privateOptionG (){

        if (ActivityCompat.checkSelfPermission(Main3Activity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(Main3Activity.this,new String[]{
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.READ_EXTERNAL_STORAGE
            },1);
            return;
        }else {
            //making folders
            //====================================================================

            if (!folder.exists()) {success = folder.mkdir();}

            if (!org_fold.exists()) {success = org_fold.mkdir();}

            if (!h_fold.exists()) {success = h_fold.mkdir();}

            if (!b_fold.exists()) {success = b_fold.mkdir();}

            if (!fb_fold.exists()) {success = fb_fold.mkdir();}

            if (!wp_fold.exists()) {success = wp_fold.mkdir();}

            //========================================================================

            viewPager=(ViewPager)findViewById(R.id.VP2);
            inpo=new Intent(Main3Activity.this,Main7Activity.class);
            inpo.putExtra("receiveImageNumber",viewPager.getCurrentItem());
            startActivity(inpo);}
    }

    //========================================


    //Check Permission
    //=======================================================================================================================

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode==100){
            if (grantResults[0] != PackageManager.PERMISSION_GRANTED){
                Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.camera_permission_error_3)+"",Toast.LENGTH_SHORT).show();
            }
        }
        if (requestCode==1){
            if (grantResults[0] != PackageManager.PERMISSION_GRANTED){
                Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.store_permission_error_3)+"",Toast.LENGTH_SHORT).show();
            }
        }
    }


    //=======================================================================================================================





    //image slider class with buttons and spinners
    //==============================================

    public  class Slider extends PagerAdapter  {
        private int[]img;
        private Context context;
        private LayoutInflater layoutInflater;
        private Set set=new Set();
        private SaveList saveList=new SaveList();
        private ImageFilters imageFilters=new ImageFilters();




        Slider(Context context ,int[] img ){
            this.context=context;
            this.img=img;


        }

        @Override
        public int getCount() {

            return img.length;
        }


        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

            return view==(ConstraintLayout)object;
        }

        @Override
        public void setPrimaryItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
         viewb=(View) object;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull final ViewGroup container, final int position) {
            layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
             final View lyv=layoutInflater.inflate(R.layout.slider,container,false);
            container.addView(lyv);



            //==============================================================================================
            setSpin=lyv.findViewById(R.id.set);
            setSpin.setOnItemSelectedListener(set);
            ArrayAdapter<String> aaSet=new ArrayAdapter<>(context,R.layout.support_simple_spinner_dropdown_item,getResources().getStringArray(R.array.set_array_3));
            aaSet.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
            setSpin.setAdapter(aaSet);

            //================================================================================================


            //=====================================================================================================
            savespin=lyv.findViewById(R.id.save);
            savespin.setOnItemSelectedListener(saveList);
            ArrayAdapter<String> aaSave=new ArrayAdapter<>(context,R.layout.support_simple_spinner_dropdown_item,getResources().getStringArray(R.array.save_array_3));
            aaSave.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
            savespin.setAdapter(aaSave);

            //=====================================================================================================================================
            filterSpin=lyv.findViewById(R.id.filters);
            filterSpin.setOnItemSelectedListener(imageFilters);
            ArrayAdapter<String> aaFilters=new ArrayAdapter<>(context,R.layout.support_simple_spinner_dropdown_item,getResources().getStringArray(R.array.image_filters_3));
            aaFilters.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
            filterSpin.setAdapter(aaFilters);
            //======================================================================================================================================
             filterSpin.setOnTouchListener(new View.OnTouchListener() {
                 @Override
                 public boolean onTouch(View view, MotionEvent motionEvent) {
                     if (motionEvent.getAction() == MotionEvent.ACTION_UP) {

                         OneTimeDialog oneTimeDialog = new OneTimeDialog(Main3Activity.this);
                         oneTimeDialog.oneTime(getResources().getString(R.string.never),
                                 getResources().getString(R.string.guide_title),
                                 getResources().getString(R.string.filters_guide),"time3");

                         return false;
                     }else
                         return false;
                 }
             });


            //Menu
            //=======================================================================================================
            circleMenu=lyv.findViewById(R.id.circle_menu);
            imageView=lyv.findViewById(R.id.imageView);
            circleMenu1=lyv.findViewById(R.id.circle2);

            circleMenu1.setMainMenu(Color.parseColor("#258CFF"),R.drawable.main_menu,R.drawable.close)
                    .addSubMenu(Color.TRANSPARENT,R.drawable.buttoninvisible)
                    .addSubMenu(Color.TRANSPARENT,R.drawable.buttoninvisible)
                    .addSubMenu(Color.parseColor("#f2cf07"),R.drawable.new_opt_camerapng)
                    .addSubMenu(Color.parseColor("#f2cf07"),R.drawable.new_opt_gallery)
                    .addSubMenu(Color.TRANSPARENT,R.drawable.buttoninvisible)

                    .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                        @Override
                        public void onMenuSelected(int i) {
                            switch (i){
                                case 2:
                                    privateOption();
                                    break;
                                case 3:
                                    privateOptionG();
                                    break;
                            }
                        }
                    }).setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {
                @Override
                public void onMenuOpened() {

                }

                @Override
                public void onMenuClosed() {
                    circleMenu1.setVisibility(View.INVISIBLE);
                }
            });

            circleMenu.setMainMenu(Color.parseColor("#258CFF"),R.drawable.main_menu, R.drawable.close)
                    .addSubMenu(Color.parseColor("#f2cf07"), R.drawable.share)
                    .addSubMenu(Color.parseColor("#f2cf07"), R.drawable.help)
                    .addSubMenu(Color.parseColor("#f2cf07"), R.drawable.slideshow)
                    .addSubMenu(Color.parseColor("#f2cf07"), R.drawable.orientation)
                    .addSubMenu(Color.parseColor("#f2cf07"),R.drawable.new_opt)
                    .addSubMenu(Color.parseColor("#f2cf07"),R.drawable.zoomin)
                    .addSubMenu(Color.parseColor("#f2cf07"),R.drawable.reseting)
                    .addSubMenu(Color.parseColor("#f2cf07"),R.drawable.cleaning)
                    .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                        @Override
                        public void onMenuSelected(final int i) {
                            switch (i){
                                case 0:
                                    share();
                                    break;
                                case 1:
                                    help();
                                    break;
                                case 2:
                                    slideShow();
                                    break;
                                case 3:
                                    switchOrientation3();
                                    break;
                                case 4:
                                    circleMenu1.setVisibility(View.VISIBLE);
                                   circleMenu1.openMenu();
                                    break;
                                case 5:
                                    viewPager=(ViewPager) findViewById(R.id.VP2);
                                    imageView=lyv.findViewById(R.id.imageView);
                                    ZoomingClass zoomingClass=new ZoomingClass(viewPager);
                                    imageView.setOnTouchListener(zoomingClass);
                                    Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.stop_zoom)+"",Toast.LENGTH_LONG).show();
                                    break;
                                case 6:
                                    recreate();
                                    break;
                                case 7:
                                    cleanApp();
                                    break;
                            }
                        }
                    }).setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {
                @Override
                public void onMenuOpened() {

                }

                @Override
                public void onMenuClosed() {
                    circleMenu.setVisibility(View.INVISIBLE);
                }
            });


            circleMenu.setVisibility(View.INVISIBLE);
            circleMenu1.setVisibility(View.INVISIBLE);
            try {
                Glide.with(context).load(img[position]).into(imageView);
            }catch (OutOfMemoryError error){
                Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.try_again)+"",Toast.LENGTH_LONG).show();
                recreate();}

            return lyv;

        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, Object object) {
            container.removeView((ConstraintLayout)object);
        }




    }

    //==============================================




    //Set Spinners Blocks
    //======================================================================

    public class Set implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            WallpaperManager wallpaperManager;
            imageView=viewb.findViewById(R.id.imageView);
            viewPager=(ViewPager)findViewById(R.id.VP2);
            h=viewPager.getCurrentItem();
            Spinner spinner=viewb.findViewById(R.id.set);
            switch (i){
                case 0:
                    break;
                case 1:
                    drawable = getResources().getDrawable(img[h]);
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                    wallpaperManager=WallpaperManager.getInstance(getApplicationContext());

                    try{
                        wallpaperManager.setBitmap(bitmap);
                        Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.set_wallpaper_success_3)+"",Toast.LENGTH_SHORT).show();
                    } catch (IOException e){
                        Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.set_wallpaper_error_3)+"",Toast.LENGTH_SHORT).show();
                    }
                    spinner.setSelection(0);
                    break;

                case 2:
                    drawable = imageView.getDrawable();
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                    wallpaperManager=WallpaperManager.getInstance(getApplicationContext());

                    try{
                        wallpaperManager.setBitmap(bitmap);
                        Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.set_wallpaper_success_3)+"",Toast.LENGTH_SHORT).show();
                    } catch (IOException e){
                        Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.set_wallpaper_error_3)+"",Toast.LENGTH_SHORT).show();
                    }
                    spinner.setSelection(0);
                    break;

                case 3:
                    drawable = getResources().getDrawable(img[h]);
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                    wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
                    try{
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {

                            wallpaperManager.setBitmap(bitmap,null,true,WallpaperManager.FLAG_LOCK);
                            Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.set_wallpaper_success_3)+"",Toast.LENGTH_SHORT).show();
                        }else
                            Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.set_wallpaper_andro_3)+"",Toast.LENGTH_LONG).show();

                    } catch (IOException e){
                        Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.set_wallpaper_error_3)+"",Toast.LENGTH_SHORT).show();
                    }
                    spinner.setSelection(0);
                    break;

                case 4:

                    drawable = imageView.getDrawable();
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                    wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
                    try{
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {

                            wallpaperManager.setBitmap(bitmap,null,true,WallpaperManager.FLAG_LOCK);
                            Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.set_wallpaper_success_3)+"",Toast.LENGTH_SHORT).show();
                        }else
                            Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.set_wallpaper_andro_3)+"",Toast.LENGTH_LONG).show();

                    } catch (IOException e){
                        Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.set_wallpaper_error_3)+"",Toast.LENGTH_SHORT).show();
                    }
                    spinner.setSelection(0);
                    break;

                case 5:
                    drawable = getResources().getDrawable(img[h]);
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                    wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
                    try{
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                            wallpaperManager.setBitmap(bitmap);
                            wallpaperManager.setBitmap(bitmap,null,true,WallpaperManager.FLAG_LOCK);
                            Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.set_wallpaper_success_3)+"",Toast.LENGTH_SHORT).show();
                        }else
                            Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.set_wallpaper_andro_3)+"",Toast.LENGTH_LONG).show();

                    } catch (IOException e){
                        Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.set_wallpaper_error_3)+"",Toast.LENGTH_SHORT).show();
                    }
                    spinner.setSelection(0);
                    break;


                case 6:

                    drawable = imageView.getDrawable();
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                    wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
                    try{
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                            wallpaperManager.setBitmap(bitmap);
                            wallpaperManager.setBitmap(bitmap,null,true,WallpaperManager.FLAG_LOCK);
                            Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.set_wallpaper_success_3)+"",Toast.LENGTH_SHORT).show();
                        }else
                            Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.set_wallpaper_andro_3)+"",Toast.LENGTH_LONG).show();

                    } catch (IOException e){
                        Toast.makeText(Main3Activity.this,""+getResources().getString(R.string.set_wallpaper_error_3)+"",Toast.LENGTH_SHORT).show();
                    }
                    spinner.setSelection(0);
                    break;
            }

        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }


    }

    public class SaveList implements AdapterView.OnItemSelectedListener{




        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Spinner saveSpin=viewb.findViewById(R.id.save);
        switch (position){

            case 0:
                break;
            case 1:
                saveInOrginalSizeAndPosition();
                saveSpin.setSelection(0);
                break;
            case 2:
                saveInCurrnetFilter();
                saveSpin.setSelection(0);
                break;
            case 3:
                saveInCurrentSizeAndPosition();
                saveSpin.setSelection(0);
                break;
        }



        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }


    public class ImageFilters implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            editText=viewb.findViewById(R.id.editText);
            filterSpin=(Spinner)findViewById(R.id.filters);
            if (i==0|i==1){
                editText.setVisibility(View.INVISIBLE);
            }else {
                editText.setVisibility(View.VISIBLE);
                imageFiltersMethod(i);
            }
            if (i==1)
                filterSpin.setSelection(0);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

    //======================================================================
}
