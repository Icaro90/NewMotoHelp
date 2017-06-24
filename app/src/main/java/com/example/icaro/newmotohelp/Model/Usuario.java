package com.example.icaro.newmotohelp.Model;

import com.example.icaro.newmotohelp.Config.ConfiguracaoFirebase;
import com.google.firebase.database.DatabaseReference;

/**
 * Created by thiag on 09/06/2017.
 */

public class Usuario {

    private String id;
    private String nome;
    private String email;
    private String senha;

    public Usuario(){

    }

     //cod para salvar o usuario no firebase
    public void salvar(){
        /*DatabaseReference referenciaFirebase = ConfiguracaoFirebase.getFirebase();
        referenciaFirebase.child("usuarios");*/

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
