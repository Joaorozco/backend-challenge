package com.challengefullstack.demo.Security.Entity;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Getter
@Setter
@Data
@Document(collection = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String documento;
    @NotNull
    private String clave;
}
