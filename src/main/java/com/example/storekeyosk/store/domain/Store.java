package com.example.storekeyosk.store.domain;

import com.example.storekeyosk.keyosk.domain.Keyosk;
import com.example.storekeyosk.store.Utils;

import java.util.List;

public class Store {
    private final int id;
    private String name;
    private String address;
    private int openTime;
    private int closeTime;
    private List<Keyosk> keyosks;

    public Store(String name, String address, int openTime, int closeTime) {
        this.id = Utils.count++;
        this.name = name;
        this.address = address;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getOpenTime() {
        return openTime;
    }

    public int getCloseTime() {
        return closeTime;
    }

    public List<Keyosk> getKeyosks() {
        return keyosks;
    }
}
