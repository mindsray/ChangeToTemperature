package com.example.changetotemperature;

public class Body {
    private int number;

    public Body(int number) {
        this.number = number;
    }

    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double tranform_f_to_c(){
        return (number-32)/1.8;
    }

    public int tranform_c_to_f(){
        return (int)((number*1.8)+32);
    }
}
