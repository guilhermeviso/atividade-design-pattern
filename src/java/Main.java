package java;

import java.math.BigDecimal;
import java.model.Orcamento;
import java.patternfactory.IcmsFactory;

public class Main {
    public static void main (String[] args){
        Orcamento orcamento = new Orcamento(new BigDecimal("800"), "ICMS_MG");
        IcmsFactory icmsFactory = new IcmsFactory();
        BigDecimal resultado = icmsFactory.getIcmsPorEstado("ICMS_MG").calculoPorRegiao(orcamento);

        System.out.println(resultado);
    }
}