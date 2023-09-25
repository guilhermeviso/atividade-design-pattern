package org.patternfactory;

public class IcmsFactory {
    public CalculoPorRegiao getIcmsPorEstado (String nomeEstado){

        if (nomeEstado.equalsIgnoreCase("ICMS_SP")){
            return new IcmsSP();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_MG")){
            return new IcmsMG();
        } else {
            return null;
        }
    }
}
