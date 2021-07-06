package com.spot4sport.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Court {

    private @Id
    @GeneratedValue
    Long id;
    private String name;
    private String playgrounds;
    private String address;
    //TODO Add location(probably should be a class)

    public Court() {
    }

    public Court(String name, String playgrounds, String address) {
        this.name = name;
        this.playgrounds = playgrounds;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPlaygrounds() {
        return playgrounds;
    }

    public String getAddress() {
        return address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlaygrounds(String description) {
        this.playgrounds = description;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Court)) return false;
        Court court = (Court) o;
        return getId().equals(court.getId()) &&
              getName().equals(court.getName()) &&
              getPlaygrounds().equals(court.getPlaygrounds()) &&
              getAddress().equals(court.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPlaygrounds(), getAddress());
    }

    @Override
    public String toString() {
        return "Court{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", playgrounds='" + playgrounds + '\'' +
              ", address='" + address + '\'' +
              '}';
    }
}
