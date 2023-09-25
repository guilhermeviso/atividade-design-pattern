package java.patternfactory;

import java.math.BigDecimal;
import java.model.Orcamento;

public class IcmsMG implements CalculoPorRegiao{

    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.18"));
    }
}
