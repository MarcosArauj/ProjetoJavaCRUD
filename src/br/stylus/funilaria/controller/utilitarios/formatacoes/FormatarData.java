package br.stylus.funilaria.controller.utilitarios.formatacoes;

import java.time.LocalDateTime;


public interface FormatarData {
    
     public abstract String dataFormat( LocalDateTime hoje);
    
}
