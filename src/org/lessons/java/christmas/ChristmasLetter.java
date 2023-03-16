package org.lessons.java.christmas;

import java.util.List;
import java.util.Random;

public class ChristmasLetter {
    private String name;
    private String address;
    private List<String> wishList;

    public ChristmasLetter(String name, String address, List<String> wishList) {
        this.name = name;
        this.address = address;
        this.wishList = wishList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getWishList() {
        return wishList;
    }

    public void setWishList(List<String> wishList) {
        this.wishList = wishList;
    }

    public void send() throws ChristmasWishlistExeption {
        boolean hasBeenGood = true;
        Random rd = new Random();
        if (this.wishList.size() > 5) {
            throw new ChristmasWishlistExeption("Troppi desideri");
        }
        hasBeenGood = rd.nextBoolean();
        String message;
        if (hasBeenGood) {
            message = toString();
        } else {
            throw new ChristmasWishlistExeption("Non è stato bravo lettera non inviata 😈");
        }
        System.out.println(message);

    }

    @Override
    public String toString() {
        return "ChristmasLetter{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", wishList=" + wishList +
                '}';
    }
}
