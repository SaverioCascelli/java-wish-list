package org.lessons.java.christmas;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> wishList = new ArrayList<>();

        boolean end = false;

        while (!end) {
            System.out.println("Inserisci un desiderio: ");
            wishList.add(scan.nextLine());

            System.out.println("hai aggiungo " + wishList.size() + " desideri.");

            System.out.println("vuoi aggiungere un altro desiderio? y n");
            end = scan.nextLine().equalsIgnoreCase("n");
        }
//        Collections.sort(wishList);
//        System.out.println(wishList);


        ChristmasLetter letter = new ChristmasLetter("Pino", "via platani", wishList);
        System.out.println(letter.contaDesideri());
        System.out.println(letter.desideriUnici());

//        try {
//            letter.send();
//        } catch (ChristmasWishlistExeption e) {
//            System.out.println(e.getMessage());
//        }
        scan.close();
    }
}
