package com.example.icaro.newmotohelp.Especialista;

/**
 * Created by HOME on 28/05/2017.
 */

public class Custom {

    public String MotoCustom(String Finalidade, String Valor, String Situacao, String Velocidade)
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
                            x = "4-2.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "4-1.png";
                        }
                    }
                    else if (Situacao == "SemGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "4-2.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "4-1.png";
                        }
                    }
                }

                else if (Valor == "Acima23")
                {
                    if (Situacao == "ComGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "3-2.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "5-2.png";
                        }
                    }
                    else if (Situacao == "SemGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "3-2.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "5-2.png";
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
                            x = "4-2.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "4-1.png";
                        }
                    }
                    else if (Situacao == "SemGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "4-2.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "4-1.png";
                        }
                    }
                }

                else if (Valor == "Acima23")
                {
                    if (Situacao == "ComGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "3-2.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "5-2.png";
                        }
                    }
                    else if (Situacao == "SemGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "3-2.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "5-2.png";
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
