package com.example.icaro.newmotohelp;

/**
 * Created by icaro on 02/05/2017.
 */

public class Enderecos {
    private String nome;
    private String id;
    private double lat;
    private double lng;

    public final static String REFERENCE = "Enderecos";

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getLat(){
        return lat;
    }
    public void setLat(double lat){
        this.lat = lat;
    }
    public double getLng(){
        return lng;
    }
    public void setLng(double lng){
        this.lng = lng;
    }


}
