package com.spot4sport.app.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Person {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private String playgrounds;
    private String address;

    public Person(Long id, String name, String playgrounds, String address) {
        this.id = id;
        this.name = name;
        this.playgrounds = playgrounds;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaygrounds() {
        return playgrounds;
    }

    public void setPlaygrounds(String playgrounds) {
        this.playgrounds = playgrounds;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", playgrounds='" + playgrounds + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != null ? !id.equals(person.id) : person.id != null) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (playgrounds != null ? !playgrounds.equals(person.playgrounds) : person.playgrounds != null) return false;
        return address != null ? address.equals(person.address) : person.address == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (playgrounds != null ? playgrounds.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
