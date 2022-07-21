package com.example.comicspringmvc.util;

public class tempEntity {
    private String a, b;

    public tempEntity() {
    }

    public tempEntity(String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "t{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
