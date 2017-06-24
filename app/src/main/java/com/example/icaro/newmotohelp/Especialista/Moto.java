package com.example.icaro.newmotohelp.Especialista;

import com.example.icaro.newmotohelp.Tipos.Estilo;
import com.example.icaro.newmotohelp.Tipos.FaixaValor;
import com.example.icaro.newmotohelp.Tipos.Finalidade;
import com.example.icaro.newmotohelp.Tipos.Tempo;
import com.example.icaro.newmotohelp.Tipos.Velocidade;

public class Moto {

    private Estilo estilo;
    private Finalidade finalidade;
    private FaixaValor faixaValor;
    private Tempo tempo;
    private Velocidade velocidade;

    private String imagem;

    public Moto(){

    }

    public Moto(Estilo estilo, Finalidade finalidade, FaixaValor faixaValor, Tempo tempo, Velocidade velocidade,String imagem) {
        this.estilo = estilo;
        this.finalidade = finalidade;
        this.faixaValor = faixaValor;
        this.tempo = tempo;
        this.velocidade = velocidade;
        this.imagem = imagem;
    }

    public Estilo getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }

    public FaixaValor getFaixaValor() {
        return faixaValor;
    }

    public void setFaixaValor(FaixaValor faixaValor) {
        this.faixaValor = faixaValor;
    }

    public Tempo getTempo() {
        return tempo;
    }

    public void setTempo(Tempo tempo) {
        this.tempo = tempo;
    }

    public Velocidade getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Velocidade velocidade) {
        this.velocidade = velocidade;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
