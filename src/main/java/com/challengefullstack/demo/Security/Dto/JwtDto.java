package com.challengefullstack.demo.Security.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JwtDto {
    private String token;
    private String bearer = "Bearer";
}
