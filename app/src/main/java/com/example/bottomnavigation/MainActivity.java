package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.bottomnavigation.fragment.HomeFragment;
import com.example.bottomnavigation.fragment.MessageFragment;
import com.example.bottomnavigation.fragment.ProfileFragment;
import com.example.bottomnavigation.fragment.SettingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

private BottomNavigationView bottomNavigationView;

private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottomNavigation);
        frameLayout=findViewById(R.id.framlayout);



        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            if (item.getItemId()==R.id.Home){
               getSupportFragmentManager().beginTransaction().replace(R.id.framlayout,new HomeFragment()).commit();
            }else if(item.getItemId()==R.id.MyProfile){
                getSupportFragmentManager().beginTransaction().replace(R.id.framlayout,new ProfileFragment()).commit();

            }else if(item.getItemId()==R.id.setting){
                getSupportFragmentManager().beginTransaction().replace(R.id.framlayout,new SettingFragment()).commit();

            }else if(item.getItemId()==R.id.messager){
                getSupportFragmentManager().beginTransaction().replace(R.id.framlayout,new MessageFragment()).commit();

            }


            return true;
        });


    }
}