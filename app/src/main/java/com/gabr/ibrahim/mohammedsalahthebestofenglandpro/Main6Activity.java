package com.gabr.ibrahim.mohammedsalahthebestofenglandpro;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main6Activity extends AppCompatActivity {
    private EditText editText6=null;
    private ImageView getGettingImageFileBitmap;
    private Bitmap bitmap;
    private ImageFilters6 imageFilters6=new ImageFilters6();
    private Spinner spinner=null;

    @SuppressLint("SdCardPath")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main6);
        //============================================================================================
        int getOrientationState=getIntent().getIntExtra("getOrientationState",0);
        if (getOrientationState==0){
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
        //============================================================================================

        File deleting_file=new File("/sdcard/SalahImages @GIMI79.DUK/Temporary_image_from_app_Camera.jpg");
        if (deleting_file.exists())
        deleting_file.delete();


        //======================================================================================================================================
        int getSpinnerCurrentPosition=getIntent().getIntExtra("SpinnerCurrentPosition",0);
        int getImageFileNumber=getIntent().getIntExtra("ImageFileNumber",0);
        String getImageFileWord=getIntent().getStringExtra("ImageFileWord");
        File getImageFilesFromFolder=null;
        switch (getSpinnerCurrentPosition){
            case 0:
                getImageFilesFromFolder=new File("/sdcard/SalahImages @GIMI79.DUK/"+getImageFileWord+getImageFileNumber+".jpg");
                break;
            case 2:
                getImageFilesFromFolder=new File("/sdcard/SalahImages @GIMI79.DUK/MoSalahH/"+getImageFileWord+getImageFileNumber+".jpg");
                break;
            case 3:
                getImageFilesFromFolder=new File("/sdcard/SalahImages @GIMI79.DUK/MoSalahWP/"+getImageFileWord+getImageFileNumber+".jpg");
                break;
            case 4:
                getImageFilesFromFolder=new File("/sdcard/SalahImages @GIMI79.DUK/MoSalahFB/"+getImageFileWord+getImageFileNumber+".jpg");
                break;
            case 5:
                getImageFilesFromFolder=new File("/sdcard/SalahImages @GIMI79.DUK/MoSalahB/"+getImageFileWord+getImageFileNumber+".jpg");
                break;


        }

        //============================================================================================================
        final File finalGetImageFilesFromFolder = getImageFilesFromFolder;
        assert finalGetImageFilesFromFolder != null;
        this.bitmap= BitmapFactory.decodeFile(finalGetImageFilesFromFolder.getAbsolutePath());
        getGettingImageFileBitmap=(ImageView)findViewById(R.id.getDoneImages);
        if(bitmap!=null)
        getGettingImageFileBitmap.setImageBitmap(bitmap);
        else
            Toast.makeText(Main6Activity.this,"error??!!",Toast.LENGTH_LONG).show();
        //=======================================================================================================


        spinner=(Spinner)findViewById(R.id.filters6);
        spinner.setOnItemSelectedListener(imageFilters6);
        ArrayAdapter<String> aa=new ArrayAdapter<>(Main6Activity.this,R.layout.support_simple_spinner_dropdown_item,getResources().getStringArray(R.array.image_filters_3));
        aa.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(aa);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                spinner.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == MotionEvent.ACTION_UP) {

                            OneTimeDialog oneTimeDialog = new OneTimeDialog(Main6Activity.this);
                            oneTimeDialog.oneTime(getResources().getString(R.string.never),
                                    getResources().getString(R.string.guide_title),
                                    getResources().getString(R.string.filters_guide),"time666");

                            return false;
                        }else
                            return false;
                    }
                });
            }
        },1000L);



        Button sharebtn=(Button)findViewById(R.id.share6);

        sharebtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
                 StrictMode.setVmPolicy(builder.build());
                 if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
                     builder.detectFileUriExposure();
                 }
                 Intent share =new Intent(Intent.ACTION_SEND);
                 share.setType("image/jpg");
                 share.putExtra(Intent.EXTRA_STREAM,Uri.fromFile(finalGetImageFilesFromFolder));
                 startActivity(Intent.createChooser(share, getResources().getString(R.string.share_title)));
             }
         });


    }


    public void close(View view) {
       finish();
    }

    private void imageFiltersMethod(final int n){

        editText6=(EditText) findViewById(R.id.editText6);
        getGettingImageFileBitmap =(ImageView) findViewById(R.id.getDoneImages);
        if (getGettingImageFileBitmap.getDrawable()!=null&bitmap!=null) {
            editText6.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (i == KeyEvent.KEYCODE_ENTER)) {
                        if (editText6.getText().length() != 0) {
                            String s = editText6.getText().toString();
                            int m = Integer.valueOf(s);
                            if (m > 0 & m <= 25) {
                              try {
                                  SketchImage sketchImage = new SketchImage.Builder(Main6Activity.this, bitmap).build();
                                  Bitmap[] filterBitmap = new Bitmap[1];

                                  switch (n) {
                                      case 2:
                                          filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_GRAY, m * 5);
                                          Glide.with(Main6Activity.this).load(filterBitmap[0]).into(getGettingImageFileBitmap);
                                          break;
                                      case 3:
                                          filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_GRAY, 125 + (m * 15));
                                          Glide.with(Main6Activity.this).load(filterBitmap[0]).into(getGettingImageFileBitmap);
                                          break;
                                      case 4:
                                          filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_GRAY, 500 + (m * 100));
                                          Glide.with(Main6Activity.this).load(filterBitmap[0]).into(getGettingImageFileBitmap);
                                          break;
                                      case 5:
                                          filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_SKETCH, m * 4);
                                          Glide.with(Main6Activity.this).load(filterBitmap[0]).into(getGettingImageFileBitmap);
                                          break;
                                      case 6:
                                          filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_SKETCH, 100 + (m * 5));
                                          Glide.with(Main6Activity.this).load(filterBitmap[0]).into(getGettingImageFileBitmap);
                                          break;
                                      case 7:
                                          filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_SKETCH, 225 + (m * 71));
                                          Glide.with(Main6Activity.this).load(filterBitmap[0]).into(getGettingImageFileBitmap);
                                          break;
                                      case 8:
                                          filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_COLORED_SKETCH, m * 4);
                                          Glide.with(Main6Activity.this).load(filterBitmap[0]).into(getGettingImageFileBitmap);
                                          break;
                                      case 9:
                                          filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_SOFT_SKETCH, m * 4);
                                          Glide.with(Main6Activity.this).load(filterBitmap[0]).into(getGettingImageFileBitmap);
                                          break;
                                      case 10:
                                          filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_SOFT_SKETCH, 100 + (m * 76));
                                          Glide.with(Main6Activity.this).load(filterBitmap[0]).into(getGettingImageFileBitmap);
                                          break;
                                      case 11:
                                          filterBitmap[0] = sketchImage.getImageAs(SketchImage.ORIGINAL_TO_SOFT_COLOR_SKETCH, m * 4);
                                          Glide.with(Main6Activity.this).load(filterBitmap[0]).into(getGettingImageFileBitmap);
                                          break;
                                      case 12:
                                          filterBitmap[0] = sketchImage.getImageAs(SketchImage.GRAY_TO_SKETCH, m * 4);
                                          Glide.with(Main6Activity.this).load(filterBitmap[0]).into(getGettingImageFileBitmap);
                                          break;
                                      case 13:
                                          filterBitmap[0] = sketchImage.getImageAs(SketchImage.GRAY_TO_COLORED_SKETCH, m * 4);
                                          Glide.with(Main6Activity.this).load(filterBitmap[0]).into(getGettingImageFileBitmap);
                                          break;
                                      case 14:
                                          filterBitmap[0] = sketchImage.getImageAs(SketchImage.GRAY_TO_SOFT_SKETCH, m * 4);
                                          Glide.with(Main6Activity.this).load(filterBitmap[0]).into(getGettingImageFileBitmap);
                                          break;
                                      case 15:
                                          filterBitmap[0] = sketchImage.getImageAs(SketchImage.GRAY_TO_SOFT_COLOR_SKETCH, m * 4);
                                          Glide.with(Main6Activity.this).load(filterBitmap[0]).into(getGettingImageFileBitmap);
                                          break;
                                      case 16:
                                          filterBitmap[0] = sketchImage.getImageAs(SketchImage.GRAY_TO_SOFT_COLOR_SKETCH, 100 + (m * 116));
                                          Glide.with(Main6Activity.this).load(filterBitmap[0]).into(getGettingImageFileBitmap);
                                          break;
                                      case 17:
                                          filterBitmap[0] = sketchImage.getImageAs(SketchImage.SKETCH_TO_COLOR_SKETCH, m * 12);
                                          Glide.with(Main6Activity.this).load(filterBitmap[0]).into(getGettingImageFileBitmap);
                                          break;
                                      case 18:
                                          filterBitmap[0] = sketchImage.getImageAs(SketchImage.SKETCH_TO_COLOR_SKETCH, 300 + (m * 88));
                                          Glide.with(Main6Activity.this).load(filterBitmap[0]).into(getGettingImageFileBitmap);
                                          break;
                                  }
                              }catch (OutOfMemoryError error){
                                  Toast.makeText(Main6Activity.this,""+getResources().getString(R.string.try_again)+"",Toast.LENGTH_LONG).show();
                                  recreate();}
                            } else
                                Toast.makeText(Main6Activity.this, "" + getResources().getString(R.string.too_big_level) + "", Toast.LENGTH_SHORT).show();
                        }
                        editText6.setText(null);
                        return true;
                    }
                    return false;
                }
            });
        }
    }


    public void save6(View view) {
        getGettingImageFileBitmap=(ImageView)findViewById(R.id.getDoneImages);
        if (getGettingImageFileBitmap.getDrawable()!=null) {
            Drawable drawable = getGettingImageFileBitmap.getDrawable();
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            String s = "ExtraImages_MSFF29" + ((int) (Math.random() * 2674580)) + ".jpg";
            File file = new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK"), s);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Toast.makeText(Main6Activity.this, "" + getResources().getString(R.string.this_image) + " (" + s + ") " + getResources().getString(R.string.saves_to)
                    + Environment.getExternalStorageDirectory().getPath() + "/SalahImages @GIMI79.DUK", Toast.LENGTH_LONG).show();
            MediaScannerConnection.scanFile(Main6Activity.this, new String[]{file.toString()}, null, null);
        }


    }


    public class ImageFilters6 implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            editText6=(EditText) findViewById(R.id.editText6);
            spinner=(Spinner)findViewById(R.id.filters6);
            if (i==0|i==1){
                editText6.setVisibility(View.INVISIBLE);
            }else {
                editText6.setVisibility(View.VISIBLE);
                imageFiltersMethod(i);
            }
            if (i==1)
                spinner.setSelection(0);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }



}
