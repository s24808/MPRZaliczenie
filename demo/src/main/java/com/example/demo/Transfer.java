package com.example.demo;

public class Transfer {
    private String id;
    private double Amount;
    private Status status;
    private Client client;

    public Transfer(String id, double amount, Status status, Client client) {
        this.id = id;
        Amount = amount;
        this.status = status;
        this.client = client;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(int i) {
        this.Amount = Amount;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "id='" + id + '\'' +
                ", Amount=" + Amount +
                ", status=" + status +
                ", client=" + client +
                '}';
    }
}
