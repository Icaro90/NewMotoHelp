package com.example.icaro.newmotohelp.Especialista;

import com.example.icaro.newmotohelp.Tipos.Estilo;
import com.example.icaro.newmotohelp.Tipos.FaixaValor;
import com.example.icaro.newmotohelp.Tipos.Finalidade;
import com.example.icaro.newmotohelp.Tipos.IMoto;
import com.example.icaro.newmotohelp.Tipos.Tempo;
import com.example.icaro.newmotohelp.Tipos.Velocidade;

public class Esportiva implements IMoto {

    @Override
    public Moto defineMoto(Estilo estilo, FaixaValor Valor, Finalidade Finalidade, Tempo Situacao, Velocidade Velocidade) {

        String x = "";

        switch (Finalidade)
        {
            case TRABALHO:
                if (Valor == FaixaValor.ATE_23)
                {
                    if (Situacao == Tempo.COM_GARUPA)
                    {
                        if (Velocidade == Velocidade.ATE_80)
                        {
                            x = "2-1.png";
                        }
                        else if (Velocidade == Velocidade.ACIMA_80)
                        {
                            x = "2-1.png";
                        }
                    }
                    else if (Situacao == Tempo.SEM_GARUPA)
                    {
                        if (Velocidade == Velocidade.ATE_80)
                        {
                            x = "2-1.png";
                        }
                        else if (Velocidade == Velocidade.ACIMA_80)
                        {
                            x = "2-1.png";
                        }
                    }
                }

                else if (Valor ==FaixaValor.ACIMA_23)
                {
                    if (Situacao == Tempo.COM_GARUPA)
                    {
                        if (Velocidade == Velocidade.ATE_80)
                        {
                            x = "1-11.png";
                        }
                        else if (Velocidade == Velocidade.ACIMA_80)
                        {
                            x = "1-11.png";
                        }
                    }
                    else if (Situacao == Tempo.SEM_GARUPA)
                    {
                        if (Velocidade == Velocidade.ATE_80)
                        {
                            x = "1-11.png";
                        }
                        else if (Velocidade == Velocidade.ACIMA_80)
                        {
                            x = "1-11.png";
                        }
                    }
                }
                break;

            case LAZER:
                if (Valor == FaixaValor.ATE_23)
                {
                    if (Situacao == Tempo.COM_GARUPA)
                    {
                        if (Velocidade == Velocidade.ATE_80)
                        {
                            x = "2-1.png";
                        }
                        else if (Velocidade == Velocidade.ACIMA_80)
                        {
                            x = "2-1.png";
                        }
                    }
                    else if (Situacao == Tempo.SEM_GARUPA)
                    {
                        if (Velocidade == Velocidade.ATE_80)
                        {
                            x = "2-1.png";
                        }
                        else if (Velocidade == Velocidade.ACIMA_80)
                        {
                            x = "2-1.png";
                        }
                    }
                }

                else if (Valor ==FaixaValor.ACIMA_23)
                {
                    if (Situacao == Tempo.COM_GARUPA)
                    {
                        if (Velocidade == Velocidade.ATE_80)
                        {
                            x = "1-11.png";
                        }
                        else if (Velocidade == Velocidade.ACIMA_80)
                        {
                            x = "1-11.png";
                        }
                    }
                    else if (Situacao == Tempo.SEM_GARUPA)
                    {
                        if (Velocidade == Velocidade.ATE_80)
                        {
                            x = "1-11.png";
                        }
                        else if (Velocidade == Velocidade.ACIMA_80)
                        {
                            x = "1-11.png";
                        }
                    }
                }
                break;

            default:
                break;
        }

        return new Moto(estilo,Finalidade,Valor,Situacao,Velocidade,x);
    }

}
