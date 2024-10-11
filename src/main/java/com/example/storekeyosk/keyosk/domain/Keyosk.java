package com.example.storekeyosk.keyosk.domain;

import com.example.storekeyosk.store.domain.Store;

public class Keyosk {
    private final int id;
    private int keyoskNumber;
    private Store store;

    public Keyosk(int id, int keyoskNumber, Store store) {
        this.id = id;
        this.keyoskNumber = keyoskNumber;
        this.store = store;
    }

    public int getId() {
        return id;
    }

    public int getKeyoskNumber() {
        return keyoskNumber;
    }

    public Store getStore() {
        return store;
    }
}
