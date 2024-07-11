package com.example.MovieTicket.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cinema")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int service_id;
    @Column(name = "service_name")
    private String service_name;
    @Column(name = "painted")
    private String painted;
    @Column(name = "price")
    private int price;

    public Service() {

    }

    public Service(String service_name, String painted, int price) {
        this.service_name = service_name;
        this.painted = painted;
        this.price = price;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getPainted() {
        return painted;
    }

    public void setPainted(String painted) {
        this.painted = painted;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Service{" +
                "service_id=" + service_id +
                ", service_name='" + service_name + '\'' +
                ", painted='" + painted + '\'' +
                ", price=" + price +
                '}';
    }
}
