package com.example.tinohacks.connectfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    private String username;
    private String email;
    private String name;
    private String zip;
    private String password;
    private String interest;
    private Button update;
    private Button create;
    public String searchName;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);


        update = (Button) findViewById(R.id.update);
        create = (Button) findViewById(R.id.create);
        searchView = (SearchView) findViewById(R.id.searchView);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });














    }
}
