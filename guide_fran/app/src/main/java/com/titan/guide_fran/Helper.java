package com.titan.guide_fran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toolbar;

public class Helper extends AppCompatActivity {

    ListView listview;
    Toolbar toolbar;

    Button btn_reverso;
    Button btn_francaisfacile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helper);

        toolbar= findViewById(R.id.toolbar_guide);
        toolbar.setTitle("Assistante communication");

        btn_reverso=(Button)findViewById(R.id.btn_reverso);
        btn_francaisfacile=(Button)findViewById(R.id.btn_francais_facile);

        final String links[]=getResources().getStringArray(R.array.links_helper);

        btn_reverso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Helper.this, PlaceDetails.class);

                Bundle extras = new Bundle();
                extras.putString("PLACE_LINK",links[0]);

                intent.putExtras(extras);

                startActivity(intent);

            }
        });

        btn_francaisfacile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Helper.this, PlaceDetails.class);

                Bundle extras = new Bundle();
                extras.putString("PLACE_LINK",links[1]);

                intent.putExtras(extras);

                startActivity(intent);
            }
        });


    }

}


