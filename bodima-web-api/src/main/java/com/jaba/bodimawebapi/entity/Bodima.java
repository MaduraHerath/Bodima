package com.jaba.bodimawebapi.entity;


import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.*;
import java.io.Serializable;

@Indexed
@Entity
@Table(name = "bodim")

public class Bodima implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Field
    private String owner;
    //    @Column(name = "location")
    @Field
    private String location;
    @Field
    private String address;
    @Field
    private long price;
    @Field
    private String imageLocation;
    @Field
    private String gender;
    @Field
    private boolean status;
    @Field
    private long roomCount;


    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(long roomCount) {
        this.roomCount = roomCount;
    }
}
