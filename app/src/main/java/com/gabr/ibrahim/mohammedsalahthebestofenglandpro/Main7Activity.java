package com.gabr.ibrahim.mohammedsalahthebestofenglandpro;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaScannerConnection;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.widget.CircularProgressDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main7Activity extends AppCompatActivity {
    private Spinner shapesSpinner=null;
    private Spinner zoomSpinner=null;
    private Spinner layersImageSpinner=null;
    private ImageView topImage=null;
    private ImageView bottomImage=null;
    private ShapesClass7 shapesClass7=new ShapesClass7();
    private ZoomListClass7 zoomListClass7=new ZoomListClass7();
    private ImagesLayersClass imagesLayersClass=new ImagesLayersClass();
    private Intent getImagesFromGallery=new Intent(Intent.ACTION_PICK);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main7);


                final OneTimeDialog oneTimeDialog=new OneTimeDialog(Main7Activity.this);
                oneTimeDialog.oneTime(getResources().getString(R.string.never),
                        getResources().getString(R.string.guide_title),
                        getResources().getString(R.string.mixing_gallery),"time7");



        shapesSpinner=(Spinner)findViewById(R.id.shape7);
        shapesSpinner.setOnItemSelectedListener(shapesClass7);
        ArrayAdapter<String> aaShape=new ArrayAdapter<>(Main7Activity.this,R.layout.support_simple_spinner_dropdown_item,getResources().getStringArray(R.array.shapes_array_5));
        aaShape.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        shapesSpinner.setAdapter(aaShape);


        shapesSpinner.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    oneTimeDialog.oneTime(getResources().getString(R.string.never),
                            getResources().getString(R.string.guide_title),
                            getResources().getString(R.string.shapes_guide),"time768");
                    return false;
                }else
                return false;
            }
        });


       zoomSpinner=(Spinner)findViewById(R.id.zoomSpin7);
       zoomSpinner.setOnItemSelectedListener(zoomListClass7);
       ArrayAdapter<String> aaZoom=new ArrayAdapter<>(Main7Activity.this,R.layout.support_simple_spinner_dropdown_item,getResources().getStringArray(R.array.zoom_array_7));
       aaZoom.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
       zoomSpinner.setAdapter(aaZoom);


       layersImageSpinner=(Spinner)findViewById(R.id.layers7);
       layersImageSpinner.setOnItemSelectedListener(imagesLayersClass);
       ArrayAdapter<String> aaLayers=new ArrayAdapter<>(Main7Activity.this,R.layout.support_simple_spinner_dropdown_item,getResources().getStringArray(R.array.layers));
       aaLayers.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
       layersImageSpinner.setAdapter(aaLayers);





    }

    private String [] salah_edited7;
    private void setSalah_edited7(int edit_num){
        switch (edit_num){

            case 1:
                salah_edited7= new String[]{
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h1.png?alt=media&token=58852b25-16d3-44a0-8abb-d5d19a96fb78",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h2.png?alt=media&token=0f1a2f9b-b558-41e9-9250-1f4d24f613a7",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h3.png?alt=media&token=4768de72-3b10-44ed-85f6-2a8fb9fc83b4",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h4.png?alt=media&token=2b7e766e-0eaf-4fdc-92fe-2e91397574b5",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h5.png?alt=media&token=22e704b6-9ab3-48cd-9916-8268c5ca0c99",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h6.png?alt=media&token=cff5a3ca-eaf2-425a-9db9-b527671696e2",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h7.png?alt=media&token=e4846287-de70-471f-b54f-00f321502b8b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h8.png?alt=media&token=40f16397-084f-41c8-bf49-47a19d4627d2",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h9.png?alt=media&token=29f410b7-748f-4576-96b9-e404ea0d3661",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h10.png?alt=media&token=45bf8bfe-22f9-4688-b31a-790ddecfd242",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h11.png?alt=media&token=e2734d08-66ce-4b75-b11c-3e3a331b1531",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h12.png?alt=media&token=9e9c881d-9bd5-4078-877b-4409f140bc28",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h13.png?alt=media&token=d269a13b-67c6-4b2c-a790-9c59210e6689",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h14.png?alt=media&token=d0b92aff-3922-4bbe-9b59-d895b3365882",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h15.png?alt=media&token=c85ba358-eae7-460c-b767-9f3b2cd9df90",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h16.png?alt=media&token=22a3db44-1e15-4235-aa08-4a8a963eff16",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h17.png?alt=media&token=e2e648fd-a803-4c02-9c8f-5a8ef653e814",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h18.png?alt=media&token=21e4d815-28d2-4b64-bc46-b5dd7483dd85",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h19.png?alt=media&token=ea209684-59c3-49fe-b078-500d5b0ea653",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h20.png?alt=media&token=e28172f2-f05e-4bc7-9442-7ed54743d3df",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h21.png?alt=media&token=cbd2375d-87ae-488d-87fc-13a87099da53",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h22.png?alt=media&token=4ae9b64a-a089-4cae-865a-3bbc06c8eb0f",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h23.png?alt=media&token=e6f7b503-f04f-42e1-8778-338dde31fd32",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h24.png?alt=media&token=86a0236e-2a37-4daf-a2f9-5b82f1f0890f",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h25.png?alt=media&token=56398725-3ff4-4b8f-a819-fe22cd572064",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h26.png?alt=media&token=7b175702-ad73-48fb-a5c5-64aa6965b0b1",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h27.png?alt=media&token=d796744c-08d5-4eb1-910b-6ef4c04dfd99",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h28.png?alt=media&token=4d5864fc-a488-43eb-aba8-fc6edb8578d7",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h29.png?alt=media&token=fd29cee7-cce8-4a9b-a14b-99c2fa2affed",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h30.png?alt=media&token=a5d828f2-b279-4a98-8c57-1553ff8db8c8",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h31.png?alt=media&token=ef62f8a1-639b-4fd9-9b33-8d9be7e7d089",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h32.png?alt=media&token=b428f4ee-cd22-41d4-93f3-828b98f5270c",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h33.png?alt=media&token=e6b4252c-64e0-4536-b04c-f86ba7e07d6b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h34.png?alt=media&token=2a33fe3e-cdf6-4930-8110-81dcbe067056",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h35.png?alt=media&token=2ad6146b-a1d8-4e2b-9a28-80375eb717be",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h36.png?alt=media&token=6f2e4f8e-2db7-4e1a-992d-810b0dc7bf5f",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h37.png?alt=media&token=8ba750b5-4eec-4739-bfd7-112e431e4153",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h38.png?alt=media&token=2b34d8c0-c2a0-46fb-9b68-5a3c676b41c1",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h39.png?alt=media&token=67ce7e5b-47e1-4ae9-9f35-f25f90512a18",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h40.png?alt=media&token=563f9c58-98af-47a4-aa7b-a085531592bc",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h41.png?alt=media&token=0c54ab8b-e4d2-43c8-8f1b-aa9cac748694",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h42.png?alt=media&token=813360fe-17ad-4701-87ac-a777dace006e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h43.png?alt=media&token=dab22e6c-c973-4911-8416-bb12f2a525a5",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h44.png?alt=media&token=ab151d42-36bb-4765-92e0-7fe0b475ca9b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h45.png?alt=media&token=b695df8a-9ef7-4b2c-a2a3-d4ee751a1ec2",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h46.png?alt=media&token=b4feeae3-409e-4f25-a238-b0bb11a8c31a",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h47.png?alt=media&token=d404137b-7e95-4027-9824-646304bb5991",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h48.png?alt=media&token=f955570b-ff38-4ef7-b5ba-b444ff8b03a6",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h49.png?alt=media&token=50cf5ab2-7daa-4aea-a762-009083f0e5db",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h50.png?alt=media&token=2046a485-e103-405e-9f60-e363fedc3201",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h51.png?alt=media&token=d3f8fc21-399d-4ed2-b7d8-9085b8ea7c28",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h52.png?alt=media&token=dc33aa21-6fb3-4c00-a26c-0030290dd501",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h53.png?alt=media&token=13a676f1-8414-4614-8141-1509cb61d1a3",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h54.png?alt=media&token=dda5b15e-ab02-418f-81ee-c58c2956d016",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h55.png?alt=media&token=4b183456-0bee-4d13-9c00-b0b1aa59f3e6",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h56.png?alt=media&token=172e0cf9-7c91-4b13-8313-ac6aa50c9c3d",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h57.png?alt=media&token=65a02a5b-15ce-4c78-8ed5-9380dc9a7303",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h58.png?alt=media&token=d129a6d3-e843-4ec4-baa4-2721642aab4f",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h59.png?alt=media&token=79ce3163-316c-439b-b5f2-05c6066f44dc",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h60.png?alt=media&token=d4839334-ea80-4d86-a593-cbbb7d0de1c9",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h61.png?alt=media&token=ecf84120-9959-4612-ab5d-9e514159e63e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h62.png?alt=media&token=67d50010-6aaa-4aa5-ba4d-44281a6f5590",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h63.png?alt=media&token=b88b0760-0375-4218-8ca2-e4103e92c21a",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h64.png?alt=media&token=a3c9fa5c-2e4c-41bc-bb33-096c8e4dc814",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h65.png?alt=media&token=923e8859-8a6b-4a77-bcc7-7846e621cf83",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h66.png?alt=media&token=fc40dae0-f3b0-42bf-bb27-e249f393e962",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h67.png?alt=media&token=10794846-c3ba-4f47-85ce-7b747557be46",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h68.png?alt=media&token=b431a5c9-4488-4fbd-bf8b-87f79d8bc92f",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h69.png?alt=media&token=d15b102d-f424-478a-9809-6437f0ccd7e6",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h70.png?alt=media&token=6b42da9d-6fc3-461e-8f0f-7fcaf7b386e8",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h71.png?alt=media&token=089ebb0c-9b8c-4813-a3cc-5b7b144b1f95",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h72.png?alt=media&token=cdf316cd-f697-4a8e-9a4a-fea9f3ea8b24",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h73.png?alt=media&token=67324bf5-823e-4fed-9e5f-717130745053",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h74.png?alt=media&token=766cc17a-e776-48d5-b136-827b6eb83611",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h75.png?alt=media&token=46ef617c-1319-443a-9a61-eca14149123c",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h76.png?alt=media&token=f0637642-34a4-422d-8f28-66c57774492b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h77.png?alt=media&token=e3cabddc-6723-4b50-8c04-c2b7dad0d316",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h78.png?alt=media&token=de5ec3b9-6bf3-4b38-a88a-c12971b7bd76",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h79.png?alt=media&token=535fde71-6104-4733-81e6-9cf1c6c685ab",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h80.png?alt=media&token=e141bed4-134a-4e8a-979b-3fb208589344",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h81.png?alt=media&token=de29f420-b1a4-4727-9b04-baa4b002d476",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h82.png?alt=media&token=78e3a36d-159f-42f1-9c56-e39bf8e5a71e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h83.png?alt=media&token=edc87c91-d8ce-4b23-8077-ff887bc001fe",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h84.png?alt=media&token=79049847-eb9e-4bc4-b845-5ad046c6efb5",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h85.png?alt=media&token=13b78908-5a34-4656-8465-1ca232992434",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h86.png?alt=media&token=e1a70dd4-b85c-435b-8d25-fd352265f026",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h87.png?alt=media&token=e2402438-4cb2-472f-9837-7fc5b04e1bb1",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h88.png?alt=media&token=dfefa2f2-8dbf-479c-be11-367e491fe2a4",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h89.png?alt=media&token=99c874c7-27af-42d0-b0bc-064d7523f997",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h90.png?alt=media&token=04c8dfa7-4713-4297-a574-8a2bc4916bd3",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h91.png?alt=media&token=56782752-e923-48e4-b8b0-947df0b7fcdd",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h92.png?alt=media&token=4489e663-bedc-46fc-a750-dae6e8316de6",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h93.png?alt=media&token=bf9b94b5-f01f-4eb9-a96d-26a53fd6117e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h94.png?alt=media&token=cd39aa08-c026-4273-bcac-c1b1b55a8c05",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h95.png?alt=media&token=0f0307f7-d13c-4003-ac34-6cce2af39b26",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h96.png?alt=media&token=a3e5e9be-b72d-4fad-a422-bfc3921f9dec",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h97.png?alt=media&token=7c09017c-2bd6-4d18-b3bb-17e08aece907",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h98.png?alt=media&token=d656e762-7a5c-4a68-abe5-9307dabea128",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h99.png?alt=media&token=ca74e9d0-3c77-4820-9401-2708b5956989",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahH%2Fsalah_h100.png?alt=media&token=8c949afa-988b-49a1-88f1-9b51b6c106a6",
                };
                break;

            case 2:
                salah_edited7=new String[]{
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp1.png?alt=media&token=48141d2a-82fd-4114-a29c-8af731b36b9e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp2.png?alt=media&token=e6c724dd-6abe-4ab6-b0dc-184e84450541",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp3.png?alt=media&token=4fe23149-a115-440c-8108-1aefa5a47e07",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp4.png?alt=media&token=d9a55662-ff71-47ba-bda8-63d35645c048",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp5.png?alt=media&token=68580c6c-e616-4979-b379-c330da05a012",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp6.png?alt=media&token=e35fbaab-024e-4ea1-9df9-8b12f7dfa178",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp7.png?alt=media&token=0e44e98f-357b-41ed-979e-767d48bdc216",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp8.png?alt=media&token=340a3b10-4c9f-48f8-986c-0b9857bf12e6",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp9.png?alt=media&token=e2a9ff73-c480-4efa-ab2d-2d06d7e43114",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp10.png?alt=media&token=0955d87b-ebe6-4ec9-a6ef-f924ffb20498",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp11.png?alt=media&token=3c62ce37-dfba-447d-b7bc-9978c2a5f49c",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp12.png?alt=media&token=577d87b2-4fd9-4f39-b68a-0c32792fbb6d",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp13.png?alt=media&token=30515e11-ac49-4bbb-b76e-cde3e43a16b8",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp14.png?alt=media&token=b889e343-4b03-44e1-ab3c-be3938d00a40",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp15.png?alt=media&token=824d28f3-253a-4f4a-be6f-535e47e8096f",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp16.png?alt=media&token=8740b7fe-521b-4734-ac1d-94c7b34c1c7e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp17.png?alt=media&token=24c605fd-78fb-4b85-b375-76e8023de352",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp18.png?alt=media&token=0c8a6cd9-3b59-4388-84f0-7063e21191ff",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp19.png?alt=media&token=a719ea69-f8bb-4aa5-a2d8-031c80a956f4",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp20.png?alt=media&token=cd83c952-b0bf-4bfa-8f53-85f527f20e25",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp21.png?alt=media&token=2c434027-2502-452d-be2a-aab02019914c",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp22.png?alt=media&token=87f07f40-eefd-44b2-b578-d8d9547486c3",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp23.png?alt=media&token=d5b9bf8a-e1ee-421a-908b-649c694636b5",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp24.png?alt=media&token=5a1b86c2-6a5a-4abf-a852-b782899459a3",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp25.png?alt=media&token=abbe7bbc-538f-4002-a352-443c7dbe1e24",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp26.png?alt=media&token=308b8829-80eb-4f1d-b59f-60031a42008a",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp27.png?alt=media&token=91d3fda0-2a29-425f-b7cd-f0da0a0cd1c0",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp28.png?alt=media&token=37f1af85-060f-4be1-a2e1-5eeff1b7ffd5",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp29.png?alt=media&token=6b2f11af-c39d-4a24-9097-90eb59b293f7",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp30.png?alt=media&token=81ed36d7-95a8-4619-81a8-1725cb3a3f77",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp31.png?alt=media&token=a15fbba7-4531-44c4-aeba-84aa2d4808bb",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp32.png?alt=media&token=2a83e726-7f07-401b-9c75-42b6154ef93d",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp33.png?alt=media&token=1285a5a8-8348-4f23-9d91-2ab442164078",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp34.png?alt=media&token=a82f2150-4e5b-44f1-94df-53fb0d32ba5a",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp35.png?alt=media&token=34f4e2a6-5c20-4949-8a50-184c55cb1a56",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp36.png?alt=media&token=b18872d9-e6a0-4167-87de-f104faa97b50",                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp37.png?alt=media&token=a5cfda15-bae7-4171-bb73-e002b8215455",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp38.png?alt=media&token=2164b2ca-5970-46f0-b3a9-72cf18d17a05",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp39.png?alt=media&token=f66c3705-f11f-4c25-9aa5-7a2b000748c1",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp40.png?alt=media&token=06f5c110-d308-4844-9fce-9229764e1986",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp41.png?alt=media&token=7668b9b4-dbbc-42d3-9cd6-e610246e3b6f",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp42.png?alt=media&token=06089993-6337-4740-a16a-4194ded97586",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp43.png?alt=media&token=2aa291b9-6ad4-49e4-b175-6d6e85b8724b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp44.png?alt=media&token=57a75849-6eab-4583-83b9-56d1041c791a",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp45.png?alt=media&token=a8ec42e9-913f-4b89-9c96-ecad975d775e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp46.png?alt=media&token=bf024dc8-a001-43e5-a446-8dec4f3b96ff",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp47.png?alt=media&token=1caa8b4c-ef1e-4fb8-92c0-bf450082f96b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp48.png?alt=media&token=4159b98c-d6a7-4c44-8cc5-0c590d20f8a8",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp49.png?alt=media&token=7ecad95e-4c58-47b2-be54-09bf889cda59",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp50.png?alt=media&token=056e3315-846a-4902-9d83-3b285485b73c",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp51.png?alt=media&token=6f51264d-e2e2-4d9c-95cb-6c87c6e109c0",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp52.png?alt=media&token=09c8fe45-d85d-4662-ad46-0bff89313dd6",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp53.png?alt=media&token=28bd2b32-c58d-4cc8-b1de-91be08ca8dd8",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp54.png?alt=media&token=43783bc3-28e4-4801-ac3b-e0251d303164",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp55.png?alt=media&token=e8813035-ae63-48b2-8aa7-9900385e8ab8",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp56.png?alt=media&token=e946734b-48df-41c5-9abd-56cf30d789ef",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp57.png?alt=media&token=a464e8f0-c316-475f-9772-b1eb4288b89f",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp58.png?alt=media&token=30c2b427-443c-4063-ae49-76cf0a91b1d4",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp59.png?alt=media&token=758deba1-1049-46dd-8872-4afd6d60d274",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp60.png?alt=media&token=6d112cd2-9b7b-486f-abc6-b651a0b663bf",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp61.png?alt=media&token=06c09f27-49c8-4436-996e-73b26ec26e4d",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp62.png?alt=media&token=1c254042-2d32-4415-afbe-43a9f298237c",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp63.png?alt=media&token=22e84aa1-c1ce-4ed0-8367-9213929fb23a",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp64.png?alt=media&token=4330e2c1-95dc-43a7-b637-768f237a7a6e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp65.png?alt=media&token=781215e3-ecd3-4066-9c17-985c5d6c3098",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp66.png?alt=media&token=0238c77e-93dc-4d56-b69a-0e2a3b005cd6",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp67.png?alt=media&token=b2af62d4-573b-4dd1-855d-fbf02d438d9b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp68.png?alt=media&token=7ad26860-c8b6-4b52-aa75-a9818fc0d8d9",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp69.png?alt=media&token=f5b08b0f-8cf7-4b98-9485-540d6397edad",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp70.png?alt=media&token=6c6269c3-e9d4-4355-917a-ca53059c5410",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp71.png?alt=media&token=551295f2-dad3-4322-8f9b-9d57c797de78",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp72.png?alt=media&token=d09a4a00-3f4f-407b-adef-ab642c0d000d",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp73.png?alt=media&token=3e7695a9-f1b5-4696-8fd2-1158f39b8b84",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp74.png?alt=media&token=9608ab78-8224-4cf7-94ed-b9f6544b200e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp75.png?alt=media&token=11f6b7c8-4606-4f1d-b707-d4851fa419a2",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp76.png?alt=media&token=4ba78e2b-ad48-4194-ac79-ba4e445d0e1a",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp77.png?alt=media&token=81056f23-d8da-487a-acf1-042032e546f1",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp78.png?alt=media&token=6b799657-eb92-46f3-b292-735d79ac3b06",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp79.png?alt=media&token=aa60a9e4-c27f-4589-887f-a0f8ad65444b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp80.png?alt=media&token=536290ca-04ea-499d-a2a5-a2314d0a41c8",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp81.png?alt=media&token=ae23ef4a-bd96-4370-962c-2068bd45e6e7",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp82.png?alt=media&token=4f7d061e-0035-44ae-86b3-542f02ad3986",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp83.png?alt=media&token=978cc8c0-9420-4757-9ece-2443f3d0e3b2",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp84.png?alt=media&token=3dceb06e-c27f-473e-8ec2-e7925e5b081c",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp85.png?alt=media&token=a06da70e-b419-49af-a813-9df201bef877",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp86.png?alt=media&token=ffa3b40a-9b1a-405e-bc48-bb8f56882ee6",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp87.png?alt=media&token=e9c779fb-ac1d-456b-8728-54a9e41123a5",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp88.png?alt=media&token=54063c32-0fd4-4089-8c09-e3c4069dcd76",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp89.png?alt=media&token=e7ff7f20-e496-4cc1-8d39-902dd178a527",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp90.png?alt=media&token=ac413fb3-f4b7-440b-906b-0f1a72c9347b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp91.png?alt=media&token=4cdb47d3-ee3e-45d4-ad90-8e8e87f08a48",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp92.png?alt=media&token=a938ad8b-e73b-46da-aa2e-1a036026232c",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp93.png?alt=media&token=2f09a19e-511f-4936-965a-fb83cf018d54",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp94.png?alt=media&token=a8316a67-638c-4b89-b33b-2dc363331c2c",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp95.png?alt=media&token=e96cfd3f-713e-4625-82d0-473bc87d6f08",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp96.png?alt=media&token=5c4607f9-367f-4890-9c9d-b8c6b72498df",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp97.png?alt=media&token=a1dbca7e-9ff3-4e49-a827-19c849758015",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp98.png?alt=media&token=6048d546-29f7-4bca-954f-4b418ef3e6cc",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp99.png?alt=media&token=528c4d2d-4136-4222-8151-701e91cc88c5",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahWP%2Fsalah_wp100.png?alt=media&token=012e2cba-5f0d-4372-8d44-a8429e55ca8e",
                };
                break;
            case 3:
                salah_edited7=new String[]{
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb1.png?alt=media&token=db75e374-fc3b-4739-901c-b53dc1c21911",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb2.png?alt=media&token=40e2a7fb-d09c-4909-9593-e39808892665",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb3.png?alt=media&token=ba2ead53-9b45-4740-8b88-aec18aedcffa",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb4.png?alt=media&token=18efcc66-c1c6-4c70-92fe-8f648194e7e4",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb5.png?alt=media&token=1221a5a1-cddd-4460-8801-027bab3fef5b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb6.png?alt=media&token=2decd55f-badb-413f-9c19-bbb698953ee8",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb7.png?alt=media&token=73b13b5a-1235-4ea1-8e87-94b5f9d25612",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb8.png?alt=media&token=6aeb9af1-c01c-41ca-8664-9b4913b6449d",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb9.png?alt=media&token=3cf65a3d-efe9-4b81-bdd1-3df41bb8a249",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb10.png?alt=media&token=b198a893-ed1a-4942-983b-15c678a8d22a",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb11.png?alt=media&token=ba981294-7567-45c2-aae8-8a2f4dc1a249",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb12.png?alt=media&token=bc4c104c-a785-4589-aa1b-79cde8f77e11",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb13.png?alt=media&token=3d43c7e2-37a7-4957-aeca-e99f79cc0636",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb14.png?alt=media&token=7c399dbd-bc79-4534-b02f-490af3e72bf2",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb15.png?alt=media&token=36becdde-138f-47f8-8f4b-ebdc0bf312a1",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb16.png?alt=media&token=2757aa9e-1003-4bf8-95e1-900d704f56ca",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb17.png?alt=media&token=65231fab-4137-4c17-b385-2a9511d23fe1",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb18.png?alt=media&token=7254b1da-31a6-474c-a2ab-3e4aab5e213a",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb19.png?alt=media&token=72177862-f4b6-485a-a0e0-99d15e6e8a1c",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb20.png?alt=media&token=259a3a48-6910-4c53-801e-cfeea2bf619a",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb21.png?alt=media&token=7fe3dee7-6400-4b9b-853b-708677fbb69f",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb22.png?alt=media&token=2bee5ce9-737a-493b-976e-646b208e3050",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb23.png?alt=media&token=5f064be3-22d9-49ab-80e8-2fb94fb15720",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb24.png?alt=media&token=196dd676-26da-49ae-8139-85d61c041c8e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb25.png?alt=media&token=9c3f8113-e4d4-4032-9dc7-4d3a30c4113a",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb26.png?alt=media&token=ae8bf5f9-9287-40b3-bce2-4a53e4ebe3ff",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb27.png?alt=media&token=83a5582d-e229-497b-bf63-f67c81efa47a",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb28.png?alt=media&token=e8ecd6a3-7982-464b-af9d-3d6e9d2b3ada",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb29.png?alt=media&token=1934cf8e-3108-425d-8ab4-9981c13bfede",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb30.png?alt=media&token=b0ab084f-542e-4aef-aac0-01753cb8c323",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb31.png?alt=media&token=4a5113ee-3f19-42ac-a4dd-548cf1b7c37f",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb32.png?alt=media&token=fd22dacd-1e7c-4674-a4fd-79a559a078be",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb33.png?alt=media&token=82f00471-a031-4d32-96bf-3c99f1428217",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb34.png?alt=media&token=3b97ad52-3c30-4c11-b54b-5c121ec19d65",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb35.png?alt=media&token=67ef8b38-e2e3-4533-973e-a9e730f16283",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb36.png?alt=media&token=b0f17ae8-28c4-4a08-a5c1-be752ba2bdb7",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb37.png?alt=media&token=d103d952-6d5f-4d2b-8247-3389f5b5faac",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb38.png?alt=media&token=d03454bb-ddc7-4477-8b96-b2dc0524b187",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb39.png?alt=media&token=d3067df3-8720-4202-95ac-91209ffc485e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb40.png?alt=media&token=93ce6f1d-909e-4745-bad1-31d92fff2b16",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb41.png?alt=media&token=5912c4ff-eaa7-44ca-bfad-6f99d2cd9058",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb42.png?alt=media&token=4a14efca-e308-42f0-a97c-86304c71efb3",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb43.png?alt=media&token=6dfde7b7-e469-498c-8895-37ada96ed95a",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb44.png?alt=media&token=e188b977-25e4-4580-8191-234a96500973",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb45.png?alt=media&token=4a36fe6d-fe01-4ab1-8484-6be0cf8dc40a",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb46.png?alt=media&token=2a5ea486-d483-4508-a0da-420c8fbf6b42",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb47.png?alt=media&token=27cc9cec-4206-4b53-bcb0-f5bb5d7a65f3",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb48.png?alt=media&token=39c14b25-8a88-4be4-a3c4-06f5ce1808ba",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb49.png?alt=media&token=e8e4e1bf-ad08-4282-8197-cab75a4f3cca",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb50.png?alt=media&token=3ddd046a-440a-43d5-83f6-460804a1c69e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb51.png?alt=media&token=11b60edb-6f31-439c-b45e-1f8d3d7002e5",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb52.png?alt=media&token=903c9d81-3207-4756-9a1f-ca223ead90ba",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb53.png?alt=media&token=33bfd3c5-6229-482b-a1f3-2f1e601781e5",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb54.png?alt=media&token=c532996c-03da-4792-8516-0fb9b2d1d9dd",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb55.png?alt=media&token=eb3060f5-5b2f-41df-8dda-4b92da994dc0",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb56.png?alt=media&token=476232fe-c9c8-4701-855d-ca5491edfb30",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb57.png?alt=media&token=5b438c37-5862-43ce-882d-bc4f6fa4c755",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb58.png?alt=media&token=847ec791-52da-45c1-8933-52880532fa87",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb59.png?alt=media&token=88e2c4f2-c275-48a1-86b6-054eaa4f590b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb60.png?alt=media&token=827546c4-2d71-4203-8a75-a12f5eb480b2",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb61.png?alt=media&token=cc4a9ee2-508c-4c3b-ac5d-81cc4f7dd8cf",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb62.png?alt=media&token=913f2b1c-6ebb-4dc3-87cd-efc16baa39f5",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb63.png?alt=media&token=ed4c8b3c-31bb-419c-bdd4-b24c5d2fcc20",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb64.png?alt=media&token=84813748-9507-42c5-a358-d6024b365949",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb65.png?alt=media&token=4b3205c5-ece4-4edc-9670-e3b156b60081",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb66.png?alt=media&token=feb921fd-7998-47b6-a3ed-d8aba4e44735",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb67.png?alt=media&token=ed6e8407-95bb-46e7-93ec-192c31d5e4c1",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb68.png?alt=media&token=c7a84376-48c3-4b06-a6b1-7344ad18f86c",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb69.png?alt=media&token=3bce3d5e-5573-491b-b37b-2ab5be09a3fb",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb70.png?alt=media&token=7ca2d231-9829-4281-991f-ebaf017edef7",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb71.png?alt=media&token=6957e49c-319e-4ef7-8897-0b25d26e9d7e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb72.png?alt=media&token=3e3cfe8d-46ea-459a-aaa2-cb5a3d80768c",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb73.png?alt=media&token=2100472a-e67a-4ac1-8727-f5702bd47237",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb74.png?alt=media&token=c1ca3178-b75f-466a-8764-d9db5930dc25",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb75.png?alt=media&token=fc9bc33f-47d6-4980-9c9a-8ae529d77b6d",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb76.png?alt=media&token=b0770225-b52c-4e79-a4c0-3cc104f96859",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb77.png?alt=media&token=8398c8a2-9d58-49c2-85bd-f826c3cd4232",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb78.png?alt=media&token=a7465dbb-3b6e-4d47-b438-750db3232274",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb79.png?alt=media&token=19a70417-b81d-42e1-91b5-bd38ac52d2cd",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb80.png?alt=media&token=2ecaa069-9801-4c5f-a6fa-a36b87ed3cf1",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb81.png?alt=media&token=6eac29e7-8fa3-4288-8c89-789f1d08bb29",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb82.png?alt=media&token=2aa3c867-49e2-46bd-ba53-91146ff2274c",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb83.png?alt=media&token=a15a0114-8b10-45b1-b420-911c793176ec",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb84.png?alt=media&token=5fff2b2c-7695-4518-9291-f896d2e43c39",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb85.png?alt=media&token=62cae160-e473-4453-9150-5366487461e7",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb86.png?alt=media&token=f4442417-3c58-4ae8-9780-b114b147c12b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb87.png?alt=media&token=3ee83879-d74b-4b87-a8d6-7efb6b467f42",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb88.png?alt=media&token=6fd64b1e-2ce9-425f-9fb9-87556b18bef0",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb89.png?alt=media&token=66aa2825-5f54-481c-95eb-0b884eb11269",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb90.png?alt=media&token=b3ac51c8-3d40-4fca-8110-4157b2319d3a",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb91.png?alt=media&token=1875491d-4ff8-4615-8385-cedbd434a76d",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb92.png?alt=media&token=15bbabb4-3761-4582-8cc9-529b4586d2b9",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb93.png?alt=media&token=9b15a27e-cc25-4ea3-b5e5-fcde5a8ea126",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb94.png?alt=media&token=10285920-df1a-44e8-be43-ce262391a6e8",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb95.png?alt=media&token=ed1ad68d-6869-43fd-bc16-2188400d9284",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb96.png?alt=media&token=7d034081-cf88-4daf-8f08-b223462e4b5a",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb97.png?alt=media&token=e73437b0-f0f0-43a5-afca-69b293178b11",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb98.png?alt=media&token=1c34b4bb-e260-4eb0-b748-816aa3ad847f",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb99.png?alt=media&token=1d7ae077-652d-4e43-a152-d94fadeb281d",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahFB%2Fsalah_fb100.png?alt=media&token=15de623a-082f-4246-9e67-511907973865"
                };
                break;
            case 4:
                salah_edited7=new String[]{
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b1.png?alt=media&token=64d9e4e2-973a-4740-a0cc-337782169df6",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b2.png?alt=media&token=5922dad1-6582-4496-9011-c93eb93af401",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b3.png?alt=media&token=dfc430db-1dd5-44b1-83ea-77e114c08c2e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b4.png?alt=media&token=36525e2e-9e06-4f8b-8682-593361fe2ef2",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b5.png?alt=media&token=b13feab7-f738-43ee-8bd3-4f47c5ad5766",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b6.png?alt=media&token=47c60053-d797-4f37-8094-4f32b63b394d",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b7.png?alt=media&token=40a6caca-c65c-4b0c-a0fd-ebafbf73838b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b8.png?alt=media&token=0ffdef1d-46fd-41ca-8970-d07cfc591d78",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b9.png?alt=media&token=e45af792-3689-4102-a1f8-efde3bdce085",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b10.png?alt=media&token=60201e01-ad5a-4e48-981b-ede3d88fb911",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b11.png?alt=media&token=8ccd1649-f16d-423c-97e4-c20c695fa072",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b12.png?alt=media&token=0559a1a3-e05b-4ee9-a24e-9338c3632b43",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b13.png?alt=media&token=1644c616-0379-4ecf-b531-040751b07e89",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b14.png?alt=media&token=129c964a-712f-4dac-b7ff-fb74037d7cb2",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b15.png?alt=media&token=cab1deaa-202a-4d26-ba8a-74c0c88758bd",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b16.png?alt=media&token=e3f6ccab-c416-480e-960a-36c91a36470b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b17.png?alt=media&token=eeb8dbbd-feac-475b-9c45-e71eb0ba2cf3",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b18.png?alt=media&token=cd8604b5-49ec-4604-b653-8bd491a95500",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b19.png?alt=media&token=01eaa970-598d-4929-a02c-2479f1f85e14",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b20.png?alt=media&token=679fb1bf-8200-4e28-8a3e-3716946a6726",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b21.png?alt=media&token=b6616865-7051-44e2-8034-0ec9a0bde03f",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b22.png?alt=media&token=9b0d13b9-09a2-4b25-bfd7-7dc9dc51156f",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b23.png?alt=media&token=adb03340-3de8-439e-a0cc-68b7d91ffef8",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b24.png?alt=media&token=30a895f4-a77a-472a-96c5-56d0da29cdf4",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b25.png?alt=media&token=c28f1e87-ec13-4163-b201-cdaa2c990af9",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b26.png?alt=media&token=e7a62deb-7c32-49a9-a2a5-ccabbf4b3848",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b27.png?alt=media&token=52410e37-0c19-4c4e-b646-bc695fa44b30",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b28.png?alt=media&token=98c414f0-59d2-48aa-b92f-3615308ce970",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b29.png?alt=media&token=45e9922a-1f71-428f-8e6e-804b6123893a",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b30.png?alt=media&token=8aa36b15-54e7-4fc8-a188-835ca87a653c",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b31.png?alt=media&token=d771bfbc-61e8-4159-93ab-052bec194f5c",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b32.png?alt=media&token=258882ba-4332-438d-82ee-278949232d07",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b33.png?alt=media&token=3f3e465b-aab6-49ef-b4b7-bdf5e90b0d0c",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b34.png?alt=media&token=10858e84-02ad-4937-a87f-5c79d37407b2",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b35.png?alt=media&token=03e078fb-baf2-4eef-b7a4-9ecbf29085c2",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b36.png?alt=media&token=cd2baf90-bcef-40e8-a6de-d9cf2c470296",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b37.png?alt=media&token=d29838f5-119d-4962-b166-b1ad0eebd105",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b38.png?alt=media&token=67746ad9-c81e-48c3-a67b-bd7526e9defb",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b39.png?alt=media&token=64282b79-e424-4000-9222-a39796dcc62b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b40.png?alt=media&token=94a6981c-4f75-489b-9633-b330128e1270",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b41.png?alt=media&token=73ac61f0-bf92-4246-879c-af7670896997",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b42.png?alt=media&token=3119918e-fcc8-43ff-bc78-3b1aca64bb0e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b43.png?alt=media&token=c38a3e1b-bad4-4ba7-9595-4b0401d06338",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b44.png?alt=media&token=8a3119c4-8c27-4788-8a44-1efbd14c15f7",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b45.png?alt=media&token=01a8a42e-7400-4841-81a3-8ded41120a56",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b46.png?alt=media&token=8142f41f-cc03-44c4-b4a0-81d49d437ea3",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b47.png?alt=media&token=73e87ce7-f614-4b5a-aa39-a4efb455d2f8",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b48.png?alt=media&token=1d6b195b-6036-443f-9301-0daf3bf8e84b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b49.png?alt=media&token=9abc1d5b-b501-4d4a-beae-c2dd156c5ae2",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b50.png?alt=media&token=6592b060-b033-4593-8e22-2c1b2b1bff8e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b51.png?alt=media&token=d8b0bed7-593f-44cc-a1c7-d9eaff9fd169",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b52.png?alt=media&token=a3ed89e9-367e-4feb-af42-2d1fe992a26f",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b53.png?alt=media&token=3c92a819-7eed-4cd8-89c5-96ea69a1011e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b54.png?alt=media&token=ad3c78af-8d48-491d-8a22-80d74bcdf2e6",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b55.png?alt=media&token=0ccd7a8f-9da6-4e17-bdbc-e242f38988be",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b56.png?alt=media&token=dfd152d7-8ac9-436e-ad6a-9dc3b3ab8d64",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b57.png?alt=media&token=5ca7e877-369e-400c-8379-f508de89f342",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b58.png?alt=media&token=fcfb7bc6-edb1-48f0-93d7-de31c3eac954",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b59.png?alt=media&token=3a34a415-beea-42b4-b798-af13975b30ca",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b60.png?alt=media&token=3db40906-1eb9-477b-947a-b102eaaedc15",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b61.png?alt=media&token=0b42dff0-a6eb-4d52-91a8-dc5e63dea345",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b62.png?alt=media&token=a1a7620b-d058-4d1f-8966-68f41c0d0a50",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b63.png?alt=media&token=41e0d30c-8079-41c8-a23e-1862f17ebc9b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b64.png?alt=media&token=2ccb24c8-0e1a-4bcd-a02a-15ee12d39296",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b65.png?alt=media&token=babd61e5-001e-437c-8e54-e087a8b1bdfd",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b66.png?alt=media&token=3d8cad27-b843-441f-9b7d-1064a56f9264",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b67.png?alt=media&token=4f414037-ebef-44fc-bdfb-af820f628032",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b68.png?alt=media&token=19bd7553-467b-4394-97d9-4c6b5834fba7",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b69.png?alt=media&token=22d4bfa8-d4f2-42e3-b29a-72cffdcd3a4c",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b70.png?alt=media&token=22ce897e-6c4f-4335-b475-335bb39ee34a",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b71.png?alt=media&token=14f35496-3579-4554-a78d-9130591b7c88",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b72.png?alt=media&token=988ee2d9-6a2d-47c8-8fad-9a5875e022f8",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b73.png?alt=media&token=bb832c95-211a-46d6-b6d8-28b0f9009fdd",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b74.png?alt=media&token=10cf0f9f-b640-43b4-aabc-16117c238599",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b75.png?alt=media&token=e083f248-46d1-49ec-9e40-4c36d2757242",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b76.png?alt=media&token=ffa63131-13e7-48a0-9340-e38314f4cbe4",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b77.png?alt=media&token=7532d0e5-3398-4789-ba0a-78d6ed5fb23b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b78.png?alt=media&token=94deb5b4-77c4-4c46-877b-b6d2f150657f",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b79.png?alt=media&token=3addb67a-1305-4f4a-b37f-34169e7a7f03",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b80.png?alt=media&token=e02e942c-e6d4-4c47-80c8-56261f1d8849",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b81.png?alt=media&token=8807b2b8-65fd-4f25-b050-4b04cea7e876",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b82.png?alt=media&token=1fa10219-6ba6-45a6-9a4e-7b481f38e716",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b83.png?alt=media&token=4755077f-5083-45b9-8b6c-6d2c619eb5a4",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b84.png?alt=media&token=60c39676-c8c2-4d2b-aa98-3b27635e2fce",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b85.png?alt=media&token=15849e86-4004-4792-ae52-87b73df92cc6",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b86.png?alt=media&token=d5b0afcd-eb4b-47e0-b0bf-6d72eb6220ea",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b87.png?alt=media&token=3b2eb001-0693-456b-a65d-7b43cc1cee1d",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b88.png?alt=media&token=50053980-0b76-4eb8-870e-bfce9738912f",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b89.png?alt=media&token=5e5ba0c3-e555-4c86-adc1-58d5774b1da6",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b90.png?alt=media&token=a56777ef-6000-43b3-9ab7-bfb0295dc73e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b91.png?alt=media&token=84e26765-47fa-4106-a3c1-fa8a856d3393",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b92.png?alt=media&token=346a3372-70a6-4159-bab5-f61ca292f28e",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b93.png?alt=media&token=33e6418d-efd4-4f84-aa98-0e1f6a188369",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b94.png?alt=media&token=a164d3ea-379e-4acc-b590-4ec0a334efe5",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b95.png?alt=media&token=d7031b99-8d58-4ab7-92b6-a243a5dfd55b",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b96.png?alt=media&token=0f7993c9-f195-406d-8b16-c20e7f43c340",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b97.png?alt=media&token=7a07b989-e6b1-46d9-b0bb-057329fb98c0",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b98.png?alt=media&token=de2c173c-8db4-4299-aae0-c2179ea6e967",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b99.png?alt=media&token=5cc41787-5f2c-41db-b9db-733d640d8d12",
                        "https://firebasestorage.googleapis.com/v0/b/mosalah-eb905.appspot.com/o/mosalahB%2Fsalah_b100.png?alt=media&token=8cf22f70-d7ca-4128-a538-4d51980e1758"
                };
                break;
            default:
                break;
        }
    }

    public void orientation7(View view) {
        if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }


    private void takeScreenShot(File imageFile){
        View v1=Main7Activity.this.getWindow().getDecorView().getRootView();
        v1.setDrawingCacheEnabled(true);
        Bitmap bitmap=Bitmap.createBitmap(v1.getDrawingCache());
        v1.setDrawingCacheEnabled(false);

        try {
            FileOutputStream outputStream=new FileOutputStream(imageFile);
            bitmap.compress(Bitmap.CompressFormat.JPEG,100,outputStream);
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void mixingPhoto7(View view){

        //===================================================================
        final Button rotate7=(Button)findViewById(R.id.orientation7);
        final Button takephoto7=(Button)findViewById(R.id.mixPhoto);
        zoomSpinner=(Spinner)findViewById(R.id.zoomSpin7);
        shapesSpinner=(Spinner)findViewById(R.id.shape7);
        layersImageSpinner=(Spinner)findViewById(R.id.layers7);
        //===================================================================
        rotate7.setVisibility(View.INVISIBLE);
        takephoto7.setVisibility(View.INVISIBLE);
        zoomSpinner.setVisibility(View.INVISIBLE);
        shapesSpinner.setVisibility(View.INVISIBLE);
        layersImageSpinner.setVisibility(View.INVISIBLE);
        //========================================================
        File imageFile=null;
        int fileNumber;
        final Intent openImage=new Intent(Main7Activity.this,Main6Activity.class);
        //=================================================================================

        switch (shapesSpinner.getSelectedItemPosition()){
            case 0:
                fileNumber=(int)(10000*Math.random());
                imageFile=new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK"),"MixingImage_7"+fileNumber+".jpg");
                if (!imageFile.exists()){
                    openImage.putExtra("ImageFileNumber",fileNumber);
                    openImage.putExtra("ImageFileWord","MixingImage_7");
                    openImage.putExtra("SpinnerCurrentPosition",0);
                }else {
                    int extrafileNumber=(int)(100000*Math.random());
                    imageFile=new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK"),"MixingImage_57"+extrafileNumber+".jpg");
                    openImage.putExtra("ImageFileNumber",extrafileNumber);
                    openImage.putExtra("ImageFileWord","MixingImage_57");
                    openImage.putExtra("SpinnerCurrentPosition",0);
                }
                break;
            case 2:
                fileNumber=(int)(10000*Math.random());
                imageFile=new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK/MoSalahH"),"MoSalah_H7"+fileNumber+".jpg");
                if (!imageFile.exists()){
                    openImage.putExtra("ImageFileNumber",fileNumber);
                    openImage.putExtra("ImageFileWord","MoSalah_H7");
                    openImage.putExtra("SpinnerCurrentPosition",2);
                }else {
                    int extrafileNumber=(int)(100000*Math.random());
                    imageFile=new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK/MoSalahH"),"MoSalah_H57"+extrafileNumber+".jpg");
                    openImage.putExtra("ImageFileNumber",extrafileNumber);
                    openImage.putExtra("ImageFileWord","MoSalah_H57");
                    openImage.putExtra("SpinnerCurrentPosition",2);
                }
                break;
            case 3:
                fileNumber=(int)(10000*Math.random());
                imageFile=new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK/MoSalahWP"),"MoSalah_WP7"+fileNumber+".jpg");
                if (!imageFile.exists()){
                    openImage.putExtra("ImageFileNumber",fileNumber);
                    openImage.putExtra("ImageFileWord","MoSalah_WP7");
                    openImage.putExtra("SpinnerCurrentPosition" ,3);
                }else {
                    int extrafileNumber=(int)(100000*Math.random());
                    imageFile=new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK/MoSalahWP"),"MoSalah_WP57"+extrafileNumber+".jpg");
                    openImage.putExtra("ImageFileNumber",extrafileNumber);
                    openImage.putExtra("ImageFileWord","MoSalah_WP57");
                    openImage.putExtra("SpinnerCurrentPosition",3);
                }
                break;
            case 4:
                fileNumber=(int)(10000*Math.random());
                imageFile=new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK/MoSalahFB"),"MoSalah_FB7"+fileNumber+".jpg");
                if (!imageFile.exists()){
                    openImage.putExtra("ImageFileNumber",fileNumber);
                    openImage.putExtra("ImageFileWord","MoSalah_FB7");
                    openImage.putExtra("SpinnerCurrentPosition",4);
                }else {
                    int extrafileNumber=(int)(100000*Math.random());
                    imageFile=new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK/MoSalahFB"),"MoSalah_FB57"+extrafileNumber+".jpg");
                    openImage.putExtra("ImageFileNumber",extrafileNumber);
                    openImage.putExtra("ImageFileWord","MoSalah_FB57");
                    openImage.putExtra("SpinnerCurrentPosition",4);
                }
                break;
            case 5:
                fileNumber=(int)(10000*Math.random());
                imageFile=new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK/MoSalahB"),"MoSalah_B7"+fileNumber+".jpg");
                if (!imageFile.exists()){
                    openImage.putExtra("ImageFileNumber",fileNumber);
                    openImage.putExtra("ImageFileWord","MoSalah_B7");
                    openImage.putExtra("SpinnerCurrentPosition",5);
                }else {
                    int extrafileNumber=(int)(100000*Math.random());
                    imageFile=new File(Environment.getExternalStoragePublicDirectory("SalahImages @GIMI79.DUK/MoSalahB"),"MoSalah_B57"+extrafileNumber+".jpg");
                    openImage.putExtra("ImageFileNumber",extrafileNumber);
                    openImage.putExtra("ImageFileWord","MoSalah_B57");
                    openImage.putExtra("SpinnerCurrentPosition",5);
                }
                break;

        }
        //========================================================================================================================================================



        //=======================================================================================
        if (getResources().getConfiguration().orientation==Configuration.ORIENTATION_LANDSCAPE){
            openImage.putExtra("getOrientationState",0);
        }else {
            openImage.putExtra("getOrientationState",1);
        }
        //=======================================================================================

        Handler mhand=new Handler();
        final File finalImageFile = imageFile;
        mhand.postDelayed(new Runnable() {
            @Override
            public void run() {
                takeScreenShot(finalImageFile);
            }
        },200L);
        mhand.postDelayed(new Runnable() {
            @Override
            public void run() {
                rotate7.setVisibility(View.VISIBLE);
                takephoto7.setVisibility(View.VISIBLE);
                zoomSpinner.setVisibility(View.VISIBLE);
                shapesSpinner.setVisibility(View.VISIBLE);
                layersImageSpinner.setVisibility(View.VISIBLE);

                MediaScannerConnection.scanFile(Main7Activity.this,
                        new String[] { finalImageFile.toString() }, null,
                        null);
                startActivity(openImage);

            }
        },500L);
    }


    private boolean checkInternet(){
        ConnectivityManager connectivityManager=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        assert connectivityManager != null;
        NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
        return networkInfo !=null&&networkInfo.isConnected();
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        layersImageSpinner=(Spinner)findViewById(R.id.layers7);



       if (data!=null) {
           Uri uri=data.getData();

           try {
               Bitmap getImagesFromGalleryBitmap = MediaStore.Images.Media.getBitmap(Main7Activity.this.getContentResolver(), uri);
               if (requestCode == 1) {
                   Glide.with(Main7Activity.this).load(getImagesFromGalleryBitmap).into(topImage);
                   layersImageSpinner.setSelection(0);
               } else if (requestCode == 2) {
                   Glide.with(Main7Activity.this).load(getImagesFromGalleryBitmap).into(bottomImage);
                   layersImageSpinner.setSelection(0);
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
       }else
           layersImageSpinner.setSelection(0);


    }



    //==============================================================================

    public class ShapesClass7 implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                int getImageNumber7 = getIntent().getIntExtra("receiveImageNumber", 0);
                layersImageSpinner = (Spinner) findViewById(R.id.layers7);
                bottomImage = (ImageView) findViewById(R.id.bottomimage7);
                topImage = (ImageView) findViewById(R.id.topimage7);
                shapesSpinner=(Spinner)findViewById(R.id.shape7);
                RequestOptions requestOptions=new RequestOptions();
                CircularProgressDrawable circularProgressDrawable=new CircularProgressDrawable(Main7Activity.this);
                circularProgressDrawable.setStrokeWidth(20f);
                circularProgressDrawable.setCenterRadius(60f);
                circularProgressDrawable.setColorSchemeColors(Color.GRAY);
                circularProgressDrawable.start();
                requestOptions.placeholder(circularProgressDrawable);
                try {
                    switch (i) {
                        case 0:
                            break;
                        case 1:
                            shapesSpinner.setSelection(0);
                            break;
                        case 2:
                            if (checkInternet()) {
                                setSalah_edited7(1);

                                if (layersImageSpinner.getSelectedItemPosition() == 2) {
                                    Glide.with(Main7Activity.this).load(salah_edited7[getImageNumber7]).apply(requestOptions).into(topImage);
                                } else if (layersImageSpinner.getSelectedItemPosition() == 4) {
                                    Glide.with(Main7Activity.this).load(salah_edited7[getImageNumber7]).apply(requestOptions).into(bottomImage);
                                }
                                shapesSpinner.setVisibility(View.INVISIBLE);
                                shapesSpinner.setSelection(0);
                                layersImageSpinner.setSelection(0);
                            } else {
                                Toast.makeText(Main7Activity.this, "" + getResources().getString(R.string.check_internet) + "", Toast.LENGTH_SHORT).show();
                                shapesSpinner.setSelection(0);
                            }
                            break;


                        case 3:
                            if (checkInternet()) {
                                setSalah_edited7(2);

                                if (layersImageSpinner.getSelectedItemPosition() == 2) {
                                    Glide.with(Main7Activity.this).load(salah_edited7[getImageNumber7]).apply(requestOptions).into(topImage);
                                } else if (layersImageSpinner.getSelectedItemPosition() == 4) {
                                    Glide.with(Main7Activity.this).load(salah_edited7[getImageNumber7]).apply(requestOptions).into(bottomImage);
                                }
                                shapesSpinner.setVisibility(View.INVISIBLE);
                                shapesSpinner.setSelection(0);
                                layersImageSpinner.setSelection(0);
                            } else {
                                Toast.makeText(Main7Activity.this, "" + getResources().getString(R.string.check_internet) + "", Toast.LENGTH_SHORT).show();
                                shapesSpinner.setSelection(0);
                            }
                            break;
                        case 4:
                            if (checkInternet()) {
                                setSalah_edited7(3);

                                if (layersImageSpinner.getSelectedItemPosition() == 2) {
                                    Glide.with(Main7Activity.this).load(salah_edited7[getImageNumber7]).apply(requestOptions).into(topImage);
                                } else if (layersImageSpinner.getSelectedItemPosition() == 4) {
                                    Glide.with(Main7Activity.this).load(salah_edited7[getImageNumber7]).apply(requestOptions).into(bottomImage);
                                }
                                shapesSpinner.setVisibility(View.INVISIBLE);
                                shapesSpinner.setSelection(0);
                                layersImageSpinner.setSelection(0);
                            } else {
                                Toast.makeText(Main7Activity.this, "" + getResources().getString(R.string.check_internet) + "", Toast.LENGTH_SHORT).show();
                                shapesSpinner.setSelection(0);
                            }
                            break;
                        case 5:
                            if (checkInternet()) {
                                setSalah_edited7(4);

                                if (layersImageSpinner.getSelectedItemPosition() == 2) {
                                    Glide.with(Main7Activity.this).load(salah_edited7[getImageNumber7]).apply(requestOptions).into(topImage);
                                } else if (layersImageSpinner.getSelectedItemPosition() == 4) {
                                    Glide.with(Main7Activity.this).load(salah_edited7[getImageNumber7]).apply(requestOptions).into(bottomImage);
                                }
                                shapesSpinner.setVisibility(View.INVISIBLE);
                                shapesSpinner.setSelection(0);
                                layersImageSpinner.setSelection(0);
                            } else {
                                Toast.makeText(Main7Activity.this, "" + getResources().getString(R.string.check_internet) + "", Toast.LENGTH_SHORT).show();
                                shapesSpinner.setSelection(0);
                            }
                            break;

                    }
                }catch (OutOfMemoryError error){
                    Toast.makeText(Main7Activity.this,""+getResources().getString(R.string.try_again)+"",Toast.LENGTH_LONG).show();
                    recreate();
                }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

    public class ZoomListClass7 implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ZoomingClass zoomingClass=new ZoomingClass(null);
                topImage=(ImageView)findViewById(R.id.topimage7);
                bottomImage=(ImageView)findViewById(R.id.bottomimage7);
          switch (i){
              case 0:
                  topImage.setOnTouchListener(null);
                  bottomImage.setOnTouchListener(null);
                  break;
              case 1:
                  bottomImage.setOnTouchListener(null);
                  topImage.setOnTouchListener(zoomingClass);
                  break;
              case 2:
                  topImage.setOnTouchListener(null);
                  bottomImage.setOnTouchListener(zoomingClass);
                  break;
              case 3:
                  topImage.setOnTouchListener(null);
                  bottomImage.setOnTouchListener(null);
                  topImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
                  break;
              case 4:topImage.setOnTouchListener(null);
                  bottomImage.setOnTouchListener(null);
                  bottomImage.setScaleType(ImageView.ScaleType.FIT_XY);
                  break;
          }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

    public class ImagesLayersClass implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                shapesSpinner=(Spinner)findViewById(R.id.shape7);
                topImage=(ImageView)findViewById(R.id.topimage7);
                bottomImage=(ImageView)findViewById(R.id.bottomimage7);
               switch (i){
                   case 0:
                       shapesSpinner.setVisibility(View.INVISIBLE);
                       break;
                   case 1:
                       shapesSpinner.setVisibility(View.INVISIBLE);
                       getImagesFromGallery.setType("image/*");
                       startActivityForResult(getImagesFromGallery,1);
                       break;
                   case 2:
                       shapesSpinner.setVisibility(View.VISIBLE);
                       break;
                   case 3:
                       shapesSpinner.setVisibility(View.INVISIBLE);
                       getImagesFromGallery.setType("image/*");
                       startActivityForResult(getImagesFromGallery,2);
                       break;
                   case 4:
                       shapesSpinner.setVisibility(View.VISIBLE);
                       break;
                   case 5:
                       Glide.with(Main7Activity.this).load(R.drawable.buttoninvisible).into(topImage);
                       break;
                   case 6:
                       Glide.with(Main7Activity.this).load(R.drawable.buttoninvisible).into(bottomImage);
                       break;
               }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

    //==================================================================================




}
