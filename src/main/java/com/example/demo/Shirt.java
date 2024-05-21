package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonAppend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@JsonPropertyOrder({"shirtColor","shirtSize","shirtId"})
@JsonAppend(attrs = {
    @JsonAppend.Attr(value = "version")
})
@JsonFilter("customFilter")
public class Shirt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer shirtId;
    private  Integer shirtSize;
    private String shirtColor;

    

}
