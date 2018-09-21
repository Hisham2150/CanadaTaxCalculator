package com.example.hishambajunaid.canadataxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class QuebecCalculationPage extends AppCompatActivity {

    private ImageView flag;
    private Button calculateButton;
    private EditText incometaxIn;
    private TextView fedtax, QPP_EI, provtax, incomeAfterTax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quebec_calculation_page);

        flag = (ImageView)findViewById(R.id.quebecflag);
        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){

            int QuebecId = bundle.getInt("QuebecId");
            flag.setImageResource(QuebecId);
        }

        // Inputs
        incometaxIn = findViewById(R.id.taxableincomeamnt);


        // Calculating Button
        calculateButton = findViewById(R.id.calcbutton);

        // Outputs
        fedtax = findViewById(R.id.FederalTaxResults);
        provtax = findViewById(R.id.ProvincialTaxResults);
        QPP_EI = findViewById(R.id.CPP_EIResults);
        incomeAfterTax = findViewById(R.id.incomeAfterTaxResults);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String incometaxInString = incometaxIn.getText().toString();


                if(!incometaxInString.isEmpty())
                    try{

                        QPP_EI.setText(CPP_QPP_EI.QPP_EICalc(incometaxInString));
                        provtax.setText(ProvincialTaxCalculations.quebecProvincialtax(incometaxInString));
                        fedtax.setText(FederalTaxCalculations.Federaltaxcalc(incometaxInString));
                        double incomeAfterTaxDouble = Double.parseDouble(incometaxInString) -(Double.parseDouble(CPP_QPP_EI.QPP_EICalc(incometaxInString)) + Double.parseDouble(ProvincialTaxCalculations.quebecProvincialtax(incometaxInString)) + Double.parseDouble(FederalTaxCalculations.Federaltaxcalc(incometaxInString)));
                        String incomeAfterTaxString = String.valueOf(incomeAfterTaxDouble);
                        incomeAfterTax.setText(incomeAfterTaxString);


                    }catch(Exception e1){
                        e1.printStackTrace();
                    }


            }
        });
    }
}
