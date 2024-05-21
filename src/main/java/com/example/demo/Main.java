package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("customFilter",SimpleBeanPropertyFilter.filterOutAllExcept("shirtSize"));
        
    }
}
