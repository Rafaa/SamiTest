package com.sami.models;

import javax.persistence.*;

@Entity
@Table(name = "dhbou3a")
public class Dhba3 {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Integer getDhba3id() {
        return dhba3id;
    }

    public void setDhba3id(Integer dhba3id) {
        this.dhba3id = dhba3id;
    }

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_dhba3")
    private Integer dhba3id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "family_name")
    private String familyName;
}
