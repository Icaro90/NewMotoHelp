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
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.*;

public class PerguntasActivity extends AppCompatActivity implements View.OnClickListener {
    private Button Botao1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas);
        Botao1 = (Button)findViewById(R.id.Botao1);
    }



    public void onClick(View v) {
        Intent it = new Intent(PerguntasActivity.this, RespostaActivity.class);
        startActivity(it);
    }
}
