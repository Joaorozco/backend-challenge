package com.challengefullstack.demo.Dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class dtoBalance {
    private String dia;
    private String monto;
    
    public dtoBalance() {
    
    }
    
    public dtoBalance(String dia, String monto){
        this.dia= dia;
        this.monto = monto;
    }
}
