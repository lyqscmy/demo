package com.example.demo.model;

import java.io.Serializable;

public class City implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    private String state;

    public City(String state) {
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return String.format("%d, %s", id, state);
    }
}

