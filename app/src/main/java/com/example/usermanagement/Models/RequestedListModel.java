package com.example.usermanagement.Models;

public class RequestedListModel {
    String name , stats , address , title;

    public RequestedListModel(String name, String stats, String address, String title) {
        this.name = name;
        this.stats = stats;
        this.address = address;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getStats() {
        return stats;
    }

    public String getAddress() {
        return address;
    }

    public String getTitle() {
        return title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
