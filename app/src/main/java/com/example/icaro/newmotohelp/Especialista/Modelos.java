package com.example.icaro.newmotohelp.Especialista;

/**
 * Created by HOME on 28/05/2017.
 */

public class Modelos {

    public String ModeloSelecionado(String valor)
    {
        String x = "";

        switch (valor)
        {
            case "1-1.png":
                x = "HONDA CB 500F";
                break;

            case "1-2.png":
                x = "HONDA CB TWISTER";
                break;

            case "1-3.png":
                x = "HONDA CG TITAN 160";
                break;

            case "1-4.png":
                x = "HONDA CG TITAN 125 FAN";
                break;

            case "1-5.png":
                x = "HONDA CRF 1000L AFRICAN";
                break;

            case "1-6.png":
                x = "HONDA NC750X";
                break;

            case "1-7.png":
                x = "HONDA CRF 230F";
                break;

            case "1-8.png":
                x = "HONDA CRF 150F";
                break;

            case "1-9.png":
                x = "HONDA XRE 300";
                break;

            case "1-10.png":
                x = "HONDA XRE 190";
                break;

            case "1-12.png":
                x = "HONDA SH 300I";
                break;

            case "1-13.png":
                x = "HONDA PCX";
                break;

            case "2-1.png":
                x = "KAWASAKI NINJA 300";
                break;

            case "2-2.png":
                x = "KAWASAKI Z 1000 ABS";
                break;

            case "3-1.png":
                x = "HARLEY DAVIDSON 1200 CUSTOM CB";
                break;

            case "3-2.png":
                x = "HARLEY DAVIDSON IRON 883";
                break;

            case "4-1.png":
                x = "DAFRA HORIZON 250";
                break;

            case "4-2.png":
                x = "DAFRA HORIZON 150";
                break;

            case "5-1.png":
                x = "YAMAHA T-MAX 530CC";
                break;

            case "5-2.png":
                x = "YAMAHA MIDNIGHT STAR 950";
                break;

            case "5-3.png":
                x = "YAMAHA MT-03";
                break;

            default:
                break;
        }

        return x;
    }

}
