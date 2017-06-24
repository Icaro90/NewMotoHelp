package com.example.icaro.newmotohelp.Especialista;

import com.example.icaro.newmotohelp.Tipos.Estilo;
import com.example.icaro.newmotohelp.Tipos.FaixaValor;
import com.example.icaro.newmotohelp.Tipos.Finalidade;
import com.example.icaro.newmotohelp.Tipos.Tempo;
import com.example.icaro.newmotohelp.Tipos.Velocidade;

public class MotoService {

    public Moto montaMoto(Estilo estilo, FaixaValor faixaValor, Finalidade finalidade, Tempo tempo, Velocidade velocidade){

        switch (estilo)
        {
            case CUSTOM:
                Custom custom = new Custom();
                return custom.defineMoto(estilo, faixaValor, finalidade, tempo, velocidade);
            case ESPORTIVA:
                Esportiva esportiva = new Esportiva();
                return esportiva.defineMoto(estilo, faixaValor, finalidade, tempo, velocidade);
            case NAKED:
                Naked naked = new Naked();
                return naked.defineMoto(estilo, faixaValor, finalidade, tempo, velocidade);
            case SCOOTER:
                Scooter scooter = new Scooter();
                return scooter.defineMoto(estilo, faixaValor, finalidade, tempo, velocidade);
            case STREET:
                Street street = new Street();
                return street.defineMoto(estilo, faixaValor, finalidade, tempo, velocidade);
            case TRAIL:
                TrailOff trailOff = new TrailOff();
                return trailOff.defineMoto(estilo, faixaValor, finalidade, tempo, velocidade);
        }

        return null;
    }
}
