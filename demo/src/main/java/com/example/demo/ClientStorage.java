package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientStorage {

    private final List<Client> clientList = new ArrayList<>();

    public ClientStorage() {
        clientList.add(new Client("1","Zbigniew",  100));
        clientList.add(new Client("2","Marian", 200));
        clientList.add(new Client("3","Michał", 300));
        clientList.add(new Client("4","Kamil", 400));
        clientList.add(new Client("5","Filip", 500));
    }

    public Client getById(String id) {
        return clientList.
                stream()
                .filter(storage -> storage.getId().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Client> getClientList() {
        return clientList;
    }
}
