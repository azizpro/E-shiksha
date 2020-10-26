package com.techleadbd.eshiksha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {


    TextView btn_back, tv_Class1_OpenId, tv_Class2_OpenId, tv_Class3_OpenId, tv_Class4_OpenId,
            tv_Class5_OpenId, tv_Class6_OpenId, tv_Class7_OpenId, tv_Class8_OpenId,
            tv_Class9_OpenId, tv_Class10_OpenId, tv_Class11_OpenId, tv_Class12_OpenId;

    TextView tv_Class1_DownloadId, tv_Class2_DownloadId, tv_Class3_DownloadId,
            tv_Class4_DownloadId, tv_Class5_DownloadId, tv_Class6_DownloadId
            ,tv_Class7_DownloadId ,tv_Class8_DownloadId, tv_Class9_DownloadId,
            tv_Class10_DownloadId,tv_Class11_DownloadId,tv_Class12_DownloadId;
    TextView homeId, aboutId, galleryId, helpId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        //Class1 - Class12 find Id
        tv_Class1_OpenId = findViewById(R.id.tv_Class1_OpenId);
        tv_Class2_OpenId = findViewById(R.id.tv_Class2_OpenId);
        tv_Class3_OpenId = findViewById(R.id.tv_Class3_OpenId);
        tv_Class4_OpenId = findViewById(R.id.tv_Class4_OpenId);
        tv_Class5_OpenId = findViewById(R.id.tv_Class5_OpenId);
        tv_Class6_OpenId = findViewById(R.id.tv_Class6_OpenId);
        tv_Class7_OpenId = findViewById(R.id.tv_Class7_OpenId);
        tv_Class8_OpenId = findViewById(R.id.tv_Class8_OpenId);
        tv_Class9_OpenId = findViewById(R.id.tv_Class9_OpenId);
        tv_Class10_OpenId = findViewById(R.id.tv_Class10_OpenId);
        tv_Class11_OpenId = findViewById(R.id.tv_Class11_OpenId);
        tv_Class12_OpenId = findViewById(R.id.tv_Class12_OpenId);



        //Class1 - Class12 download find Id
        tv_Class1_DownloadId = findViewById(R.id.tv_Class1_DownloadId);
        tv_Class2_DownloadId = findViewById(R.id.tv_Class2_DownloadId);
        tv_Class3_DownloadId = findViewById(R.id.tv_Class3_DownloadId);
        tv_Class4_DownloadId = findViewById(R.id.tv_Class4_DownloadId);
        tv_Class5_DownloadId = findViewById(R.id.tv_Class5_DownloadId);
        tv_Class6_DownloadId = findViewById(R.id.tv_Class6_DownloadId);
        tv_Class7_DownloadId = findViewById(R.id.tv_Class7_DownloadId);
        tv_Class8_DownloadId = findViewById(R.id.tv_Class8_DownloadId);
        tv_Class9_DownloadId = findViewById(R.id.tv_Class9_DownloadId);
        tv_Class10_DownloadId = findViewById(R.id.tv_Class10_DownloadId);
        tv_Class11_DownloadId = findViewById(R.id.tv_Class11_DownloadId);
        tv_Class12_DownloadId = findViewById(R.id.tv_Class12_DownloadId);

        btn_back = findViewById(R.id.btn_back);

        homeId = findViewById(R.id.homeId);
        aboutId = findViewById(R.id.aboutId);
        galleryId = findViewById(R.id.galleryId);
        helpId = findViewById(R.id.helpId);



        //Open Class One with url
        tv_Class1_OpenId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/page.php?section=general&class=1")));
            }
        });

        //Open Class Two with url
        tv_Class2_OpenId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/page.php?section=general&class=2")));

            }
        });
        //Open Class Three with url
        tv_Class3_OpenId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/page.php?section=general&class=3")));
            }
        });
        //Open Class Four with url
        tv_Class4_OpenId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/page.php?section=general&class=4")));
            }
        });
        //Open Class Five with url
        tv_Class5_OpenId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/page.php?section=general&class=5")));
            }
        });
        //Open Class Six with url
        tv_Class6_OpenId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/page.php?section=general&class=6")));
            }
        });
        //Open Class Seven with url
        tv_Class7_OpenId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/page.php?section=general&class=7")));
            }
        });
        //Open Class Eight with url
        tv_Class8_OpenId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/page.php?section=general&class=8")));
            }
        });
        //Open Class Nine with url
        tv_Class9_OpenId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/page.php?section=general&class=9")));
            }
        });
        //Open Class Ten with url
        tv_Class10_OpenId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/page.php?section=general&class=9")));
            }
        });
        //Open Class Eleven with url
        tv_Class11_OpenId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://dl.bdebooks.com/School%20Board%20Book/HSC%20Books/Class%2011%20Bangla%20-%20(BDeBooks.com).pdf")));
            }
        });
        //Open Class Twelve with url
        tv_Class12_OpenId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/page.php?section=general&class=12")));
            }
        });



        //Download Class One with url
        tv_Class1_DownloadId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/ebook2013/rar/c1_rar/c1_bangla.rar")));
            }
        });
        //Download Class Two with url
        tv_Class2_DownloadId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/ebook2013/rar/c3_rar/c3_bangla.rar")));
            }
        });
        //Download Class Three with url
        tv_Class3_DownloadId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/ebook2013/rar/c4_rar/c4_bangla.rar")));
            }
        });
        //Download Class Four with url
        tv_Class4_DownloadId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/ebook2013/rar/c5_rar/c5_bangla.rar")));
            }
        });
        //Download Class Five with url
        tv_Class5_DownloadId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/ebook2013/rar/c6_rar/c6_khudro.rar")));
            }
        });
        //Download Class Six with url
        tv_Class6_DownloadId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/ebook2013/rar/c7_rar/c7_math.rar")));
            }
        });
        //Download Class Seven with url
        tv_Class7_DownloadId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/ebook2013/rar/c8_rar/c8_math.rar")));
            }
        });
        //Download Class Eight with url

        tv_Class8_DownloadId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/ebook2013/rar/c9-10_rar/c9-10_math.rar")));
            }
        });
        //Download Class Nine with url
        tv_Class9_DownloadId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/ebook2013/rar/c9-10_rar/c9-10_eco.rar")));
            }
        });
        //Download Class Ten with url
        tv_Class10_DownloadId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebook.gov.bd/ebook2013/rar/c9-10_rar/c9-10_christan.rar")));
            }
        });
        //Download Class Eleven with url
        tv_Class11_DownloadId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://dl.bdebooks.com/School%20Board%20Book/HSC%20Books/Class%2011%20Bangla%20-%20(BDeBooks.com).pdf")));
            }
        });
        //Download Class Twelve with url

        tv_Class12_DownloadId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://dl.bdebooks.com/School%20Board%20Book/HSC%20Books/Class%2011%20English%20-%20(BDeBooks.com).pdf")));
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        homeId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHome = new Intent(Second_Activity.this, MainActivity.class);
                startActivity(goHome);
            }
        });

        aboutId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goAbout = new Intent(Second_Activity.this, About_Activity.class);
                startActivity(goAbout);
            }
        });

        galleryId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goGallery = new Intent(Second_Activity.this, Gallery_Activity.class);
                startActivity(goGallery);
            }
        });
        helpId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHelp = new Intent(Second_Activity.this, Help_Activity.class);
                startActivity(goHelp);
            }
        });



    }
}