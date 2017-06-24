package com.example.icaro.newmotohelp.Tipos;

public enum FaixaValor {
    ACIMA_23,
    ATE_23;

    public static FaixaValor getValue(String value){
        for (FaixaValor valueEnum : values()) {
            if (valueEnum.name().equals(value)) {
                return valueEnum;
            }
        }
        return null;
    }
}
