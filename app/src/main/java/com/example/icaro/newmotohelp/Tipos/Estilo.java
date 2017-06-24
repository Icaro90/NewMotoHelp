package com.example.icaro.newmotohelp.Tipos;

public enum Estilo {
    STREET,
    NAKED,
    TRAIL,
    SCOOTER,
    ESPORTIVA,
    CUSTOM;

    public static Estilo getValue(String value){
        for (Estilo valueEnum : values()) {
            if (valueEnum.name().equals(value)) {
                return valueEnum;
            }
        }
        return null;
    }
}
