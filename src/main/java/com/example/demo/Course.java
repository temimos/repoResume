package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 2)
    private String fname;

    @NotNull
    @Size(min = 2)
    private String lname;

    @NotNull
    @Size(min = 5)
    private String stAdd;

    @NotNull
    @Size(min = 2)
    private String city;

    @NotNull
    @Min(5)
    private int zipcode;

    @NotNull
    @Min(10)
    private int pnumber;

    @NotNull
    @Size(min = 2)
    private String country;

    @NotNull
    @Size(min = 2)
    private String email;

    public Course()
        {
        this.fname = fname; //title
        this.lname = lname; //instructor;
        this.stAdd = stAdd; //description;
        this.city = city; //credit;
        this.zipcode = zipcode;
        this.pnumber = pnumber;
        this.country = country;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getStAdd() {
        return stAdd;
    }

    public void setStAdd(String stAdd) {
        this.stAdd = stAdd;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getPnumber() {
        return pnumber;
    }

    public void setPnumber(int pnumber) {
        this.pnumber = pnumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


/*
  public Course(@NotNull @Size(min = 4) String fname, @NotNull @Size(min = 3) String lname, @NotNull @Size(min = 10) String stAdd, @NotNull @Min(3) String city) {
        this.fname = fname; //title
        this.lname = lname; //instructor;
        this.stAdd = stAdd; //description;
        this.city = city; //credit;
    }

    public Course() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setfname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getStAddn() {
        return stAdd;
    }

    public void setStAdd(String stAdd) {
        this.stAdd = stAdd;
    }

    public int getCity(String city) {
        return credit;
    }

    public void setCredit(int credit) {
        this.city = city;
    }
}

 */