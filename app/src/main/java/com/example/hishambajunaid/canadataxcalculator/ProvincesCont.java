package com.example.hishambajunaid.canadataxcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ProvincesCont extends AppCompatActivity{

    ImageButton nunavutButton, ontarioButton, princeedwardButton, quebecButton, saskatchewanButton, yukonButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinces_cont);

    //Nunavut Button
        nunavutButton = findViewById(R.id.nunavutflagbutton);
        nunavutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nunavutOpenCalculationPage();
            }
        });

    //Ontario Button
        ontarioButton = findViewById(R.id.ontarioflagbutton);
        ontarioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ontarioOpenCalculationPage();
            }
        });

    //Prince Edward Island Button
        princeedwardButton = findViewById(R.id.princeedwardflagbutton);
        princeedwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                princeedwardOpenCalculationPage();
            }
        });

    //Quebec Button
        quebecButton = findViewById(R.id.quebecflagbutton);
        quebecButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quebecOpenCalculationPage();
            }
        });

    //Saskatchewan Button
        saskatchewanButton = findViewById(R.id.saskatchewanflagbutton);
        saskatchewanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saskatchewanOpenCalculationPage();
            }
        });

    //Yukon Button
        yukonButton = findViewById(R.id.yukonflagbutton);
        yukonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yukonOpenCalculationPage();
            }
        });

    }

    public void nunavutOpenCalculationPage(){
        Intent intent = new Intent(this,NunavutCalculationPage.class);
        intent.putExtra("NunId",R.drawable.nunavutflag);
        startActivity(intent);
    }

    public void ontarioOpenCalculationPage(){
        Intent intent = new Intent(this,OntarioCalculationPage.class);
        intent.putExtra("OntarioId",R.drawable.ontarioflag);
        startActivity(intent);
    }

    public void princeedwardOpenCalculationPage(){
        Intent intent = new Intent(this,PrinceEdwardIlandCalculationPage.class);
        intent.putExtra("PrinceEId",R.drawable.princeedwardislandflag);
        startActivity(intent);
    }

    public void quebecOpenCalculationPage(){
        Intent intent = new Intent(this,QuebecCalculationPage.class);
        intent.putExtra("QuebecId",R.drawable.quebecflag);
        startActivity(intent);
    }

    public void saskatchewanOpenCalculationPage(){
        Intent intent = new Intent(this,SasktachewanCalculationPage.class);
        intent.putExtra("SaskatchewanId",R.drawable.saskatchewanflag);
        startActivity(intent);
    }

    public void yukonOpenCalculationPage(){
        Intent intent = new Intent(this,YukonCalculationPage.class);
        intent.putExtra("YukonId",R.drawable.yukonflag);
        startActivity(intent);
    }


}
