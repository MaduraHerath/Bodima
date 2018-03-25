package com.jaba.bodimawebapi.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "bodim")

public class Bodima implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "owner")
    private String owner;
    @Column(name = "location")
    private String location;
    @Column(name = "address")
    private String address;
    @Column(name = "price")
    private long price;
    @Column(name = "imageLocation")
    private String imageLocation;
    @Column(name ="gender")
    private String gender;
    @Column(name = "status")
    private String status;
    @Column(name = "roomCount")
    private long   roomCount;



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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
