package com.example.icaro.newmotohelp.Especialista;

/**
 * Created by HOME on 28/05/2017.
 */

public class Esportiva {

    public String MotoEsportiva(String Finalidade, String Valor, String Situacao, String Velocidade)
    {
        String x = "";

        switch (Finalidade)
        {
            case "Trabalho":
                if (Valor == "Ate23")
                {
                    if (Situacao == "ComGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "2-1.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "2-1.png";
                        }
                    }
                    else if (Situacao == "SemGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "2-1.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "2-1.png";
                        }
                    }
                }

                else if (Valor == "Acima23")
                {
                    if (Situacao == "ComGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "1-11.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "1-11.png";
                        }
                    }
                    else if (Situacao == "SemGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "1-11.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "1-11.png";
                        }
                    }
                }
                break;

            case "Lazer":
                if (Valor == "Ate23")
                {
                    if (Situacao == "ComGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "2-1.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "2-1.png";
                        }
                    }
                    else if (Situacao == "SemGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "2-1.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "2-1.png";
                        }
                    }
                }

                else if (Valor == "Acima23")
                {
                    if (Situacao == "ComGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "1-11.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "1-11.png";
                        }
                    }
                    else if (Situacao == "SemGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "1-11.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "1-11.png";
                        }
                    }
                }
                break;

            default:
                break;
        }

        return x;
    }

}
