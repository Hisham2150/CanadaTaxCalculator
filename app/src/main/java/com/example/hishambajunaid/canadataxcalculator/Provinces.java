package com.example.hishambajunaid.canadataxcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Provinces extends AppCompatActivity {

    private Button nextPageButton;
    private ImageButton albertaButton, britishColumbiaButton, manitobaButton, newBrunswickButton, newFoundlandButton, novaScotiaButton, northwestbutton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinces);

    //Alberta Button
        albertaButton = findViewById(R.id.albertaflagbutton);
        albertaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                albertaOpenCalculationPage();
            }
        });

    //British Columbia Button
        britishColumbiaButton = findViewById(R.id.britishcolumbiaflagbutton);
        britishColumbiaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                britishColumbiaOpenCalculationPage();
            }
        });

    //Manitoba Button
        manitobaButton = findViewById(R.id.manitobaflagbutton);
        manitobaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manitobaOpenCalculationPage();
            }
        });

    //New Brunswick Button
        newBrunswickButton = findViewById(R.id.newbrunswickflagbutton);
        newBrunswickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newBrunswickOpenCalculationPage();
            }
        });

    //Newfoundland Button
        newFoundlandButton = findViewById(R.id.newfoundlandflagbutton);
        newFoundlandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newFoundlandOpenCalculationPage();
            }
        });

    //Nova Scotia Button
        novaScotiaButton = findViewById(R.id.novascotiaflagbutton);
        novaScotiaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                novaScotiaOpenCalculationPage();
            }
        });

    //Northwest Territories Button
        northwestbutton = findViewById(R.id.northwestflagbutton);
        northwestbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                northWestOpenCalculationPage();
            }
        });

    //Next Page Button
        nextPageButton = findViewById(R.id.nextpage);
        nextPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProvincesCont();
            }
        });
    }

    public void openProvincesCont(){
        Intent intent = new Intent(Provinces.this, ProvincesCont.class);
        startActivity(intent);
    }

    public void albertaOpenCalculationPage(){
        Intent intent = new Intent(this,AlbertaCalculationPage.class);
        intent.putExtra("AlbertaId", R.drawable.albertaflag);
        startActivity(intent);
    }



    public void britishColumbiaOpenCalculationPage(){
        Intent intent = new Intent(this,BcCalculationPage.class);
        intent.putExtra("BCId", R.drawable.britishcolumbiaflag);
        startActivity(intent);
    }

    public void manitobaOpenCalculationPage(){
        Intent intent = new Intent(this,ManitobaCalculationPage.class);
        intent.putExtra("ManitobaId", R.drawable.manitobaflag);
        startActivity(intent);
    }

    public void newBrunswickOpenCalculationPage(){
        Intent intent = new Intent(this,NewBrunswickCaclulationPage.class);
        intent.putExtra("NBId", R.drawable.newbrunswickflag);
        startActivity(intent);
    }

    public void newFoundlandOpenCalculationPage(){
        Intent intent = new Intent(this,NewfoundlandCalculationPage.class);
        intent.putExtra("NFLId", R.drawable.newfoundlandandlabrador);
        startActivity(intent);
    }

    public void novaScotiaOpenCalculationPage(){
        Intent intent = new Intent(this,NovaScotiaCalculationPage.class);
        intent.putExtra("NSId", R.drawable.novascotiaflag);
        startActivity(intent);
    }

    public void northWestOpenCalculationPage(){
        Intent intent = new Intent(this,NorthWestTerritoriesCalculationPage.class);
        intent.putExtra("NWId", R.drawable.northwestterritories);
        startActivity(intent);
    }


}
