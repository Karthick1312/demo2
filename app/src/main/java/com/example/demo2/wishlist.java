package com.example.demo2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class wishlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);



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
            }
        }
