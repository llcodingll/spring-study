package com.example.storekeyosk.store.controller;

import com.example.storekeyosk.store.domain.Store;
import com.example.storekeyosk.store.request.StoreRequest;
import com.example.storekeyosk.store.service.StoreService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stores")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Store createStore(@RequestBody StoreRequest request) {
        return storeService.createStore();
    }

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public Store getAllStores() {
        return storeService.getAllStores();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Store getStoreById(@PathVariable int id) {
        return storeService.getStoreById();
    }

    @PostMapping("/{id}")
    public Store updateStoreById(@PathVariable int id, @RequestBody StoreRequest request) {
        return storeService.updateStoreById();
    }

    @DeleteMapping("/{id}")
    public Store deleteStore(@PathVariable int id) {
        return storeService.deleteStore();
    }
}
