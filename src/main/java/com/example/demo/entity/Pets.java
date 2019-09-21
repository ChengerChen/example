package com.example.demo.entity;

public class Pets {
    public String name;
    public String kind;

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }
}
