package com.example.demo2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class wishlist extends AppCompatActivity {
    private Button nike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);

//        RecyclerView recyclerView = findViewById(R.id.recyclerContact);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        getSupportActionBar().setTitle("Shoezy");
        getWindow().setFlags(
                        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
                );
                getSupportActionBar().hide();

                // Initialize and assign variable
                BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);

                // Set Home selected
                bottomNavigationView.setSelectedItemId(R.id.wiselist);

                // Perform item selected listener
                bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
                    @SuppressLint("NonConstantResourceId")
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        switch(item.getItemId())
                        {
                            case R.id.offer:
                                startActivity(new Intent(getApplicationContext(),offer.class));
                                overridePendingTransition(0,0);
                                return true;
                            case R.id.explore:
                                startActivity(new Intent(getApplicationContext(),explore.class));
                                overridePendingTransition(0,0);
                                return true;
                            case R.id.wiselist:
                                return true;
                            case R.id.home:
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                                overridePendingTransition(0,0);
                                return true;
                            case R.id.profile:
                                startActivity(new Intent(getApplicationContext(),profile.class));
                                overridePendingTransition(0,0);
                                return true;

                        }
                        return false;
                    }
                });

//                nike=findViewById(R.id.nike);
//                nike.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        gotoUrl("https://www.nike.com/in/w/mens-sale-shoes-3yaepznik1zy7ok");
//                    }
//
//                    private void gotoUrl(String s) {
//                        Uri uri = Uri.parse(s);
//                        startActivity(new Intent(Intent.ACTION_VIEW,uri));
//                    }
//                });

            }
        }
