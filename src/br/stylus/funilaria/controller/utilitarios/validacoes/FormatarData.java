package br.stylus.funilaria.controller.utilitarios.validacoes;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class FormatarData {
    
    public static SimpleDateFormat DataFormat(String data) {
        
         
         SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
         date.format(data);
         
          return  date;
        
    }
    
}
