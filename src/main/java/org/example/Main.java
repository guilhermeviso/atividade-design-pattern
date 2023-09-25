package org.example;

import org.model.Orcamento;
import org.patternfactory.IcmsFactory;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("800"), "ICMS_MG");
        IcmsFactory factory = new IcmsFactory();
        BigDecimal resultado = factory.getIcmsPorEstado("ICMS_MG").calculoPorRegiao(orcamento);

        System.out.println(resultado);
    }
}