package com.example.module;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class module  {
    protected String name;
    protected String email;
    protected String phone;
    protected String dob;
    protected String country;
    protected String objective;
    protected String gender;
    protected String  specializtion;
    protected String university;
    protected String experiene;
    protected String  skill;

    public module(){}
    public module(String name, String email,  String phone,
             String dob, String country, String objective, String gender){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.country = country;
        this.objective = objective;
        this.gender = gender;
    }
    public module( String  specializtion,String university,
     String experiene, String  skill){

        this.specializtion = specializtion;
        this.university = university;
        this.experiene = experiene;
        this.skill = skill;

    }
}