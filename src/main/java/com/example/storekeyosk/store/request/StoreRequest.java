package com.example.storekeyosk.store.request;

import com.example.storekeyosk.store.domain.Store;

public record StoreRequest(String name, String address, int openTime, int closeTime) {
    public Store toStore(){
        return new Store(name, address, openTime, closeTime);
    }
}
