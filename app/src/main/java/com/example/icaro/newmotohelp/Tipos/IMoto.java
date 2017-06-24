package com.example.icaro.newmotohelp.Tipos;

import com.example.icaro.newmotohelp.Especialista.Moto;

public interface IMoto {

    public Moto defineMoto(Estilo estilo, FaixaValor faixaValor, Finalidade finalidade, Tempo tempo, Velocidade velocidade);
}