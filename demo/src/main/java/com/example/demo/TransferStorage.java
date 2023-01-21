package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class TransferStorage {
    private final List<Transfer> transferList = new ArrayList<>();

    private final ClientStorage clientStorage;

    public TransferStorage(ClientStorage clientStorage) {
        this.clientStorage = clientStorage;
        transferList.add(new Transfer("1", 30, Status.ACCEPTED, new Client("1", "Filip", 2000)));
        transferList.add(new Transfer("2", 30, Status.DECLINED, new Client("2", "Monika", 2000)));
        transferList.add(new Transfer("3", 30, Status.ACCEPTED, new Client("3", "Maciej", 2000)));
        transferList.add(new Transfer("4", 30, Status.DECLINED, new Client("4", "Jan", 2000)));
        transferList.add(new Transfer("5", 30, Status.ACCEPTED, new Client("5", "Adrian", 2000)));

    }

    public List<Transfer> getAllTransfer() {
        return transferList;
    }

    public Transfer addNewTransfer(Transfer transfer) {
        transferList.add(transfer);
        return transfer;
    }

    public List<Transfer> findById(String id) {
        return transferList.stream().filter(i->i.getId().equals(id)).findFirst().stream().toList();
    }
}