package com.company;


import java.util.*;

public enum Cars {
    LADA("Lada", 300, Model.GRANTA.getName(), 1000000, Colour.GRAY.getName()),
    TOYOTA("Toyota", 200, Model.FILDER.getName(), 1500000, Colour.BLACK.getName()),
    CHEVROLET("Chevrolet", 198, Model.LACETTI.getName(), 850000, Colour.RED.getName()),
    OPEL("Opel", 301, Model.ZAFIRA.getName(), 1250000, Colour.BLUE.getName()),
    FERRARI("Ferrari,", 450, Model.ENZO.getName(), 10000000, Colour.WHITE.getName());

    private String model;
    private int maxSpeed;
    private String mark;
    private final int price;
    private String colour;

    Cars(String model, int maxSpeed, String mark, int price, String colour) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.mark = mark;
        this.price = price;
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public static List<Cars> asList(){
        ArrayList<Cars> list = new ArrayList<Cars>();
        Collections.addAll(list, values());
        return list;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", mark='" + mark + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
