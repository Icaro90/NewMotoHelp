package com.example.icaro.newmotohelp.Tipos;

public enum Tempo {
    COM_GARUPA,
    SEM_GARUPA;

    public static Tempo getValue(String value){
        for (Tempo valueEnum : values()) {
            if (valueEnum.name().equals(value)) {
                return valueEnum;
            }
        }
        return null;
    }
}
