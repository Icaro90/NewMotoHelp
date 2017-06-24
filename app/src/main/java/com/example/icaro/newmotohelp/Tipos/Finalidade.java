package com.example.icaro.newmotohelp.Tipos;

public enum Finalidade {
    TRABALHO,
    LAZER,
    OFF_ROAD;

    public static Finalidade getValue(String value){
        for (Finalidade valueEnum : values()) {
            if (valueEnum.name().equals(value)) {
                return valueEnum;
            }
        }
        return null;
    }
}
