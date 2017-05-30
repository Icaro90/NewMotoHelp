package com.example.icaro.newmotohelp.Especialista;

/**
 * Created by HOME on 28/05/2017.
 */

public class TrailOff {

    public String MotoTrailOff(String Finalidade, String Valor, String Situacao, String Velocidade)
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
                            x = "1-10.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "1-9.png";
                        }
                    }
                    else if (Situacao == "SemGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "1-10.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "1-9.png";
                        }
                    }
                }

                else if (Valor == "Acima23")
                {
                    if (Situacao == "ComGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "1-6.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "1-5.png";
                        }
                    }
                    else if (Situacao == "SemGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "1-6.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "1-5.png";
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
                            x = "1-10.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "1-9.png";
                        }
                    }
                    else if (Situacao == "SemGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "1-10.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "1-9.png";
                        }
                    }
                }

                else if (Valor == "Acima23")
                {
                    if (Situacao == "ComGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "1-6.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "1-5.png";
                        }
                    }
                    else if (Situacao == "SemGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "1-6.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "1-5.png";
                        }
                    }
                }
                break;

            case "OffHoad":
                if (Valor == "Ate23")
                {
                    if (Situacao == "ComGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "1-8.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "1-7.png";
                        }
                    }
                    else if (Situacao == "SemGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "1-8.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "1-7.png";
                        }
                    }
                }

                else if (Valor == "Acima23")
                {
                    if (Situacao == "ComGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "1-6.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "1-5.png";
                        }
                    }
                    else if (Situacao == "SemGarupa")
                    {
                        if (Velocidade == "Ate80")
                        {
                            x = "1-6.png";
                        }
                        else if (Velocidade == "Acima80")
                        {
                            x = "1-5.png";
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
