package com.example.icaro.newmotohelp.Tipos;

public enum Velocidade {
    ATE_80,
    ACIMA_80;
    public static Velocidade getValue(String value){
        for (Velocidade valueEnum : values()) {
            if (valueEnum.name().equals(value)) {
                return valueEnum;
            }
        }
        return null;
    }
}
