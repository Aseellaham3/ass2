package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =null ;
    boolean invalid = false;
    String Colector="";
    TextView txtalertName;
    EditText specializtion,university,experiene,skill;
    Button finishBT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        specializtion=findViewById(R.id.specializationT);
        university=findViewById(R.id.universityT);
        experiene=findViewById(R.id.experianceT);
        skill=findViewById(R.id.skillT);
        Button SubmitSave;

        txtalertName=findViewById(R.id.userAlert);

        SubmitSave=findViewById(R.id.finishBT);
        SubmitSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String specializtionST= specializtion.getText().toString();
                String universityST= university.getText().toString();
                String experieneST= experiene.getText().toString();
                String skillST =skill.getText().toString();
                if (specializtionST.isEmpty()){
                    Toast.makeText(MainActivity2.this,"Please fill the specialization field",Toast.LENGTH_SHORT).show();
                }

                else if(universityST.isEmpty()){
                    Toast.makeText(MainActivity2.this,"Please fill the university field",Toast.LENGTH_SHORT).show();
                }


                else if (experieneST.isEmpty()){
                    Toast.makeText(MainActivity2.this,"Pleas fill the experiene field",Toast.LENGTH_SHORT).show();
                }

                else if (skillST.isEmpty()){
                    Toast.makeText(MainActivity2.this,"Pleas fill the skillST field",Toast.LENGTH_SHORT).show();
                }



                else{

                    Colector+=specializtionST+"\n";
                    Colector+=universityST+"\n";
                    Colector+= experieneST+"\n";
                    Colector+=skillST+"\n";

                    Toast.makeText(MainActivity2.this,"Edu & Work skill info \n:"+Colector,Toast.LENGTH_SHORT).show();
                }

            }
        });




    }

}