//package com.example.java.model;
package exercise.files.ch10.Ej10_02.model;

public enum OliveName {
    KALAMATA("Kalamata"), LIGURIAN("Ligurian");

    private String name;

    OliveName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
