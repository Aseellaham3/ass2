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

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =null ;
    Spinner spinener;
    boolean invalid = false;
    String Colector="";
    TextView txtalertName;
    EditText name,email,dob,objective,phone;
    Button SubmitSave;
    RadioButton Malebtn,Femalbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinener=findViewById(R.id.SpCountry);
        name=findViewById(R.id.skillT);
        email=findViewById(R.id.emailT);
        dob=findViewById(R.id.date);
        phone=findViewById(R.id.phoneT);
        objective=findViewById(R.id.objectivetxt);
        txtalertName=findViewById(R.id.userAlert);
        Malebtn =findViewById(R.id.Male);
        Femalbtn=findViewById(R.id.Female);
        SubmitSave=findViewById(R.id.nextBt);
        SubmitSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameSt= name.getText().toString();
                String emailSt= email.getText().toString();
                String dobSt= dob.getText().toString();
                String objectiveSt =objective.getText().toString();
                String phoneST =objective.getText().toString();
                if (nameSt.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please fill the password field",Toast.LENGTH_SHORT).show();
                }
                else if (nameSt.equals("Aseel") ||nameSt.equals("Laham")){
                    invalid=true;
                    txtalertName.setText("Name Already exist");
                }

                else if(emailSt.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please fill the email field",Toast.LENGTH_SHORT).show();
                }


                else if (dobSt.isEmpty()){
                    Toast.makeText(MainActivity.this,"Pleas fill the Contact field",Toast.LENGTH_SHORT).show();
                }

                else if (phoneST.isEmpty()){
                    Toast.makeText(MainActivity.this,"Pleas fill the Comment field",Toast.LENGTH_SHORT).show();
                }



                else{

                    Colector+=nameSt+"\n";
                    Colector+=emailSt+"\n";
                    Colector+= dobSt+"\n";
                    Colector+=objectiveSt+"\n";

                    Toast.makeText(MainActivity.this,"User Info \n:"+Colector,Toast.LENGTH_SHORT).show();
                }

            }
        });

        List<String> categoryCountry=new ArrayList<>();
        categoryCountry.add("Select City");
        categoryCountry.add("Ramallah");
        categoryCountry.add("Nablus");
        categoryCountry.add("Hebron");
        categoryCountry.add("jericho");
        categoryCountry.add("beith lehem");
        categoryCountry.add("jerusalem");
        ArrayAdapter<String> arrayAdapter;
        arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,categoryCountry);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinener.setAdapter(arrayAdapter);
        spinener.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                if(parent.getItemAtPosition(position).equals("Select Country")){
                    //Do Nothing

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Colector+=item+"\n";
                    Toast.makeText(MainActivity.this, "Selected Country: "+item, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        EditText editText = (EditText) findViewById(R.id.skillT);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}