package com.example.icaro.newmotohelp.Especialista;

import com.example.icaro.newmotohelp.Tipos.Estilo;
import com.example.icaro.newmotohelp.Tipos.FaixaValor;
import com.example.icaro.newmotohelp.Tipos.Finalidade;
import com.example.icaro.newmotohelp.Tipos.IMoto;
import com.example.icaro.newmotohelp.Tipos.Tempo;
import com.example.icaro.newmotohelp.Tipos.Velocidade;

public class TrailOff implements IMoto {

    @Override
    public Moto defineMoto(Estilo estilo, FaixaValor valor, Finalidade finalidade, Tempo situacao, Velocidade velocidade)
    {
        String x = "";

        switch (finalidade)
        {
            case TRABALHO:
                if (valor == FaixaValor.ATE_23)
                {
                    if (situacao == Tempo.COM_GARUPA)
                    {
                        if (velocidade == Velocidade.ATE_80)
                        {
                            x = "1-10.png";
                        }
                        else if (velocidade == Velocidade.ACIMA_80)
                        {
                            x = "1-9.png";
                        }
                    }
                    else if (situacao == Tempo.SEM_GARUPA)
                    {
                        if (velocidade == Velocidade.ATE_80)
                        {
                            x = "1-10.png";
                        }
                        else if (velocidade == Velocidade.ACIMA_80)
                        {
                            x = "1-9.png";
                        }
                    }
                }

                else if (valor == FaixaValor.ACIMA_23)
                {
                    if (situacao == Tempo.COM_GARUPA)
                    {
                        if (velocidade == Velocidade.ATE_80)
                        {
                            x = "1-6.png";
                        }
                        else if (velocidade == Velocidade.ACIMA_80)
                        {
                            x = "1-5.png";
                        }
                    }
                    else if (situacao == Tempo.SEM_GARUPA)
                    {
                        if (velocidade == Velocidade.ATE_80)
                        {
                            x = "1-6.png";
                        }
                        else if (velocidade == Velocidade.ACIMA_80)
                        {
                            x = "1-5.png";
                        }
                    }
                }
                break;

            case LAZER:
                if (valor == FaixaValor.ATE_23)
                {
                    if (situacao == Tempo.COM_GARUPA)
                    {
                        if (velocidade == Velocidade.ATE_80)
                        {
                            x = "1-10.png";
                        }
                        else if (velocidade == Velocidade.ACIMA_80)
                        {
                            x = "1-9.png";
                        }
                    }
                    else if (situacao == Tempo.SEM_GARUPA)
                    {
                        if (velocidade == Velocidade.ATE_80)
                        {
                            x = "1-10.png";
                        }
                        else if (velocidade == Velocidade.ACIMA_80)
                        {
                            x = "1-9.png";
                        }
                    }
                }

                else if (valor == FaixaValor.ACIMA_23)
                {
                    if (situacao == Tempo.COM_GARUPA)
                    {
                        if (velocidade == Velocidade.ATE_80)
                        {
                            x = "1-6.png";
                        }
                        else if (velocidade == Velocidade.ACIMA_80)
                        {
                            x = "1-5.png";
                        }
                    }
                    else if (situacao == Tempo.SEM_GARUPA)
                    {
                        if (velocidade == Velocidade.ATE_80)
                        {
                            x = "1-6.png";
                        }
                        else if (velocidade == Velocidade.ACIMA_80)
                        {
                            x = "1-5.png";
                        }
                    }
                }
                break;

            case OFF_ROAD:
                if (valor == FaixaValor.ATE_23)
                {
                    if (situacao == Tempo.COM_GARUPA)
                    {
                        if (velocidade == Velocidade.ATE_80)
                        {
                            x = "1-8.png";
                        }
                        else if (velocidade == Velocidade.ACIMA_80)
                        {
                            x = "1-7.png";
                        }
                    }
                    else if (situacao == Tempo.SEM_GARUPA)
                    {
                        if (velocidade == Velocidade.ATE_80)
                        {
                            x = "1-8.png";
                        }
                        else if (velocidade == Velocidade.ACIMA_80)
                        {
                            x = "1-7.png";
                        }
                    }
                }

                else if (valor == FaixaValor.ACIMA_23)
                {
                    if (situacao == Tempo.COM_GARUPA)
                    {
                        if (velocidade == Velocidade.ATE_80)
                        {
                            x = "1-6.png";
                        }
                        else if (velocidade == Velocidade.ACIMA_80)
                        {
                            x = "1-5.png";
                        }
                    }
                    else if (situacao == Tempo.SEM_GARUPA)
                    {
                        if (velocidade == Velocidade.ATE_80)
                        {
                            x = "1-6.png";
                        }
                        else if (velocidade == Velocidade.ACIMA_80)
                        {
                            x = "1-5.png";
                        }
                    }
                }
                break;

            default:
                break;
        }

        return new Moto(estilo,finalidade,valor,situacao,velocidade,x);
    }

}
