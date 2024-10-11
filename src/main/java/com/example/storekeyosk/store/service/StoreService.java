package com.example.storekeyosk.store.service;

import com.example.storekeyosk.store.Utils;
import com.example.storekeyosk.store.domain.Store;
import com.example.storekeyosk.store.request.StoreRequest;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    public Store createStore(StoreRequest request) {
        Utils.stores.add(request.toStore());
        return request.toStore();
    }

    public Store getAllStores() {

    }

    public Store getStoreById() {

    }

    public Store updateStoreById() {

    }

    public Store deleteStore() {

    }
}
