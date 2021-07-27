package com.xen.entity;


import lombok.Data;

@Data
public class Student {
    private Integer id;
    private  String name;
    public String test(){
        return "githup commit";
    }
}
