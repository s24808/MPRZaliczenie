package com.example.demo;

public class Client {

    private String id;
    private String firstname;
    private final double saldo;

    public String getId() {
        return id;
    }

    public Client(String id, String firstname, double saldo) {
        this.id = id;
        this.firstname = firstname;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}