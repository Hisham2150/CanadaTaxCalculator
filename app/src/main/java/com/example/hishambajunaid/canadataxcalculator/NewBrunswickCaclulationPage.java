package com.example.hishambajunaid.canadataxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class NewBrunswickCaclulationPage extends AppCompatActivity {

    private ImageView flag;
    private Button calculateButton;
    private EditText incometaxIn;
    private TextView fedtax, CPP_EI, provtax, incomeAfterTax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_brunswick_caclulation_page);

        flag = (ImageView)findViewById(R.id.newbrunswickflag);
        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){

            int NewBrun = bundle.getInt("NBId");
            flag.setImageResource(NewBrun);
        }

        // Inputs
        incometaxIn = findViewById(R.id.taxableincomeamnt);


        // Calculating Button
        calculateButton = findViewById(R.id.calcbutton);

        // Outputs
        fedtax = findViewById(R.id.FederalTaxResults);
        provtax = findViewById(R.id.ProvincialTaxResults);
        CPP_EI = findViewById(R.id.CPP_EIResults);
        incomeAfterTax = findViewById(R.id.incomeAfterTaxResults);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String incometaxInString = incometaxIn.getText().toString();


                if(!incometaxInString.isEmpty())
                    try{

                        CPP_EI.setText(CPP_QPP_EI.CPP_EICalc(incometaxInString));
                        provtax.setText(ProvincialTaxCalculations.newBrunswickProvincialtax(incometaxInString));
                        fedtax.setText(FederalTaxCalculations.Federaltaxcalc(incometaxInString));
                        double incomeAfterTaxDouble = Double.parseDouble(incometaxInString) -(Double.parseDouble(CPP_QPP_EI.CPP_EICalc(incometaxInString)) + Double.parseDouble(ProvincialTaxCalculations.newBrunswickProvincialtax(incometaxInString)) + Double.parseDouble(FederalTaxCalculations.Federaltaxcalc(incometaxInString)));
                        String incomeAfterTaxString = String.valueOf(incomeAfterTaxDouble);
                        incomeAfterTax.setText(incomeAfterTaxString);


                    }catch(Exception e1){
                        e1.printStackTrace();
                    }


            }
        });
    }
}
