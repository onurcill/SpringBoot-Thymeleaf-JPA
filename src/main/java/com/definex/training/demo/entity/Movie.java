package com.definex.training.demo.entity;

//import lombok.*;

import javax.persistence.*;
/**
 * @author OnurCil on 25/09/2019
 * @project demo
 */

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(nullable = false, unique = false)
    private String title;

    @Column(nullable = false)
    private String producer;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
