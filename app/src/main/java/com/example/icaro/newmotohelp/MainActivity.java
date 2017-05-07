package com.example.icaro.newmotohelp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import static android.R.attr.fragment;

public class MainActivity extends AppCompatActivity  {

    private TextView mTextMessage;
    private FragmentManager fragmentManager;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent exemplo2 = new Intent(MainActivity.this, MapsActivity.class);
                    startActivity(exemplo2);
                    return true;
                case R.id.navigation_dashboard:
                    Intent exemplo3 = new Intent(MainActivity.this, PerguntasActivity.class);
                    startActivity(exemplo3);
                    return true;
                case R.id.navigation_notifications:
                    Intent exemplo1 = new Intent(MainActivity.this, AboutActivity.class);
                    startActivity(exemplo1);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        fragmentManager = getSupportFragmentManager();

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.add(R.id.container, new MapsActivity(), "MapsFragment");

        transaction.commitAllowingStateLoss();
    }

}
