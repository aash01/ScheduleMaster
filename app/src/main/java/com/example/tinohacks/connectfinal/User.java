package com.example.tinohacks.connectfinal;


import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by TinoHacks on 4/15/17.
 */

public class User {
    private String username;
    private String email;
    private String name;
    private String zip;
    private String password;
    private String interest;


    public FirebaseDatabase database = FirebaseDatabase.getInstance();
    public DatabaseReference myRef = database.getReference("Users");
    public User(String username, String name, String email,String zip,String password,String interest) {
        this.username = username;
        this.email = email;
        this.name = name;
        this.zip = zip;
        this.password = password;
        this.interest = interest;
        //myRef.child("Test").setValue("Testing");
        writeNewUser(username, name, email, zip, password, interest);

    }
    public void writeNewUser(String ID, String name, String email, String zip, String password, String interest) {
        //User user = new User("urmum","asdas","lol","meme","yeahboi","league");



        myRef.child("User " + ID).child("Name").setValue(name);
        myRef.child("User " + ID).child("email").setValue(email);
        myRef.child("User " + ID).child("zip").setValue(zip);
        myRef.child("User " + ID).child("password").setValue(password);
        myRef.child("User " + ID).child("interest").setValue(interest);
        /*
        myRef.child("ID").child("123").child("Name").setValue("HI");
        //myRef.child("users").setValue("123");

        myRef.child("ID").child("123").child("Email").setValue("MAM");
*/

    }





}
