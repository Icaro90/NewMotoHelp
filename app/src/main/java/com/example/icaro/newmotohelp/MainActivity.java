package com.example.icaro.newmotohelp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.icaro.newmotohelp.Fragment.AboutFragment;
import com.example.icaro.newmotohelp.Fragment.MapsFragment;
import com.example.icaro.newmotohelp.Fragment.PerguntasFragment;
import com.example.icaro.newmotohelp.Fragment.RespostaFragment;

import static android.R.attr.fragment;

public class MainActivity extends AppCompatActivity implements AboutFragment.OnFragmentInteractionListener, MapsFragment.OnFragmentInteractionListener, PerguntasFragment.OnFragmentInteractionListener, RespostaFragment.OnFragmentInteractionListener {

    private TextView mTextMessage;
    private FragmentManager fragmentManager;

    /*FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
    fragmentTransaction.replace(R.id.container, MapsFragment.newInstance());
    fragmentTransaction.commit();*/


    BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener(){

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    /*Intent exemplo2 = new Intent(MainActivity.this, MapsActivity.class);
                    startActivity(exemplo2);*/
                    fragment = MapsFragment.newInstance("", "");
                    break;
                case R.id.navigation_dashboard:
                    /*Intent exemplo3 = new Intent(MainActivity.this, PerguntasActivity.class);
                    startActivity(exemplo3);*/
                    fragment = PerguntasFragment.newInstance("", "");
                    break;
                case R.id.navigation_notifications:
                    /*Intent exemplo1 = new Intent(MainActivity.this, AboutActivity.class);
                    startActivity(exemplo1);*/
                    fragment = AboutFragment.newInstance("", "");
                    break;
            }
            if (fragment != null) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, fragment);
                fragmentTransaction.commit();
            }
            return true;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        /*fragmentManager = getSupportFragmentManager();

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.add(R.id.container, new MapsActivity(), "MapsFragment");

        transaction.commitAllowingStateLoss();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, MapsActivity.newInstance());
        fragmentTransaction.commit();*/

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, MapsFragment.newInstance("", ""));
        fragmentTransaction.commit();

        /*BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                = new BottomNavigationView.OnNavigationItemSelectedListener(){

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        fragment = MapsFragment.newInstance("", "");
                        break;
                    case R.id.navigation_dashboard:
                        fragment = PerguntasFragment.newInstance("", "");
                        break;
                    case R.id.navigation_notifications:
                        fragment = AboutFragment.newInstance("", "");
                        break;
                }
                if (fragment != null) {
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.container, fragment);
                    fragmentTransaction.commit();
                }
                return true;
            }

        };*/

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
