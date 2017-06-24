package com.example.icaro.newmotohelp.Especialista;

import com.example.icaro.newmotohelp.Tipos.Estilo;
import com.example.icaro.newmotohelp.Tipos.FaixaValor;
import com.example.icaro.newmotohelp.Tipos.Finalidade;
import com.example.icaro.newmotohelp.Tipos.IMoto;
import com.example.icaro.newmotohelp.Tipos.Tempo;
import com.example.icaro.newmotohelp.Tipos.Velocidade;

public class Naked implements IMoto {

    @Override
    public Moto defineMoto(Estilo estilo, FaixaValor Valor, Finalidade finalidade, Tempo situacao, Velocidade velocidade)
    {
        String x = "";

        switch (finalidade)
        {
            case TRABALHO:
                if (Valor == FaixaValor.ATE_23)
                {
                    if (situacao == Tempo.COM_GARUPA)
                    {
                        if (velocidade == velocidade.ATE_80)
                        {
                            x = "5-3.png";
                        }
                        else if (velocidade == velocidade.ACIMA_80)
                        {
                            x = "5-3.png";
                        }
                    }
                    else if (situacao == Tempo.SEM_GARUPA)
                    {
                        if (velocidade == velocidade.ATE_80)
                        {
                            x = "5-3.png";
                        }
                        else if (velocidade == velocidade.ACIMA_80)
                        {
                            x = "5-3.png";
                        }
                    }
                }

                else if (Valor == FaixaValor.ACIMA_23)
                {
                    if (situacao == Tempo.COM_GARUPA)
                    {
                        if (velocidade == velocidade.ATE_80)
                        {
                            x = "2-2.png";
                        }
                        else if (velocidade == velocidade.ACIMA_80)
                        {
                            x = "2-2.png";
                        }
                    }
                    else if (situacao == Tempo.SEM_GARUPA)
                    {
                        if (velocidade == velocidade.ATE_80)
                        {
                            x = "2-2.png";
                        }
                        else if (velocidade == velocidade.ACIMA_80)
                        {
                            x = "2-2.png";
                        }
                    }
                }
                break;

            case LAZER:
                if (Valor == FaixaValor.ATE_23)
                {
                    if (situacao == Tempo.COM_GARUPA)
                    {
                        if (velocidade == velocidade.ATE_80)
                        {
                            x = "5-3.png";
                        }
                        else if (velocidade == velocidade.ACIMA_80)
                        {
                            x = "5-3.png";
                        }
                    }
                    else if (situacao == Tempo.SEM_GARUPA)
                    {
                        if (velocidade == velocidade.ATE_80)
                        {
                            x = "5-3.png";
                        }
                        else if (velocidade == velocidade.ACIMA_80)
                        {
                            x = "5-3.png";
                        }
                    }
                }

                else if (Valor == FaixaValor.ACIMA_23)
                {
                    if (situacao == Tempo.COM_GARUPA)
                    {
                        if (velocidade == velocidade.ATE_80)
                        {
                            x = "2-2.png";
                        }
                        else if (velocidade == velocidade.ACIMA_80)
                        {
                            x = "2-2.png";
                        }
                    }
                    else if (situacao == Tempo.SEM_GARUPA)
                    {
                        if (velocidade == velocidade.ATE_80)
                        {
                            x = "2-2.png";
                        }
                        else if (velocidade == velocidade.ACIMA_80)
                        {
                            x = "2-2.png";
                        }
                    }
                }
                break;

            default:
                break;
        }

        return new Moto(estilo,finalidade,Valor,situacao,velocidade,x);
    }

}
