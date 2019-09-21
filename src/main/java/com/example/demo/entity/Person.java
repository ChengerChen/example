package com.example.demo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private Integer age;
    private String gender;
    private String name;
    private Map<String, String> map;
    private List<Object> list;
    private Pets pets;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public void setPets(Pets pets) {
        this.pets = pets;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public List<Object> getList() {
        return list;
    }

    public Pets getPets() {
        return pets;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age='" + age + '\'' +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", map=" + map +
                ", list=" + list +
                ", pets=" + pets +
                '}';
    }
}
