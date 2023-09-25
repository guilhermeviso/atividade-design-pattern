package org.patternfactory;

import org.model.Orcamento;

import java.math.BigDecimal;

public interface CalculoPorRegiao {
    public BigDecimal calculoPorRegiao (Orcamento orcamento);
}
