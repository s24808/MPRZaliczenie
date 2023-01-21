package com.example.demo;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class TransferService {

    private final ClientStorage clientStorage;
    private final TransferStorage transferStorage;

    public TransferService(ClientStorage clientStorage, TransferStorage transferStorage) {
        this.clientStorage = clientStorage;
        this.transferStorage = transferStorage;
    }

    public Transfer addNew(String id, Status status, double amount, Client client ) {
        return transferStorage.addNewTransfer(new Transfer(id, amount, status, client));
    }


    public List<Transfer> printTransferById(String id) {
        return transferStorage.findById(id);
    }


    public List<Transfer> updateSaldoTransfer(String id, double saldo) {
        List<Transfer> allTransfer = transferStorage.getAllTransfer();

        System.out.println("STATUS BEFORE TRANSFER");
        System.out.println(allTransfer.stream().filter(transferId -> transferId.getId().equals(id)).findFirst());
        System.out.println(saldo);

        System.out.println("STATUS AFTER TRANSFER");
        System.out.println(allTransfer.stream().filter(transferId -> transferId.getId().equals(id)).findFirst());
        System.out.println(saldo-30);

        return allTransfer;
    }

}
