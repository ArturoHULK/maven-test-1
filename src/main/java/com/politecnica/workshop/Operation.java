package com.politecnica.workshop;

public class Operation {
    public int suma(int a, int b){
        int result =a+b;
        if (result <10)
            throw new RuntimeException();

        return result;
    }
}
