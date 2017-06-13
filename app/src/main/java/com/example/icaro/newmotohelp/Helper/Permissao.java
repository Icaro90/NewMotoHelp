package com.example.icaro.newmotohelp.Helper;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thiag on 09/06/2017.
 */

public class Permissao {

    public static boolean validaPermissoes (int requestCode, Activity activity, String[] permisoes){

        List<String> listaPermissoes = new ArrayList<String>();

        if(Build.VERSION.SDK_INT >= 23 ){
            for (String permissao : permisoes){
                Boolean validaPermissao = ContextCompat.checkSelfPermission(activity, permissao) == PackageManager.PERMISSION_GRANTED;
                if ( !validaPermissao) listaPermissoes.add(permissao);
            }
            if (listaPermissoes.isEmpty())return true;
            String[] novasPermisoes = new String[listaPermissoes.size()];
            listaPermissoes.toArray( novasPermisoes);

            ActivityCompat.requestPermissions(activity, novasPermisoes, requestCode);

        }

        return true;
    }
}
