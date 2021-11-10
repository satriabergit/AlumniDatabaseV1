package com.PngEngineering;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> alumniDataList = new ArrayList<>();

        int selectedMenu = 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Pilih menu:");
            System.out.println("1. tambah data alumni");
            System.out.println("2. tampilkan data alumni");
            System.out.println("0. keluar");
            System.out.print("Menu pilihan anda: ");
            selectedMenu = scanner.nextInt();

            switch (selectedMenu) {
                case 1: System.out.print("Masukkan nama alumni: ");
                        String alumniName;
                        do{
                            alumniName = scanner.nextLine();
                        } while (alumniName.strip().isEmpty());

                        alumniDataList.add(alumniName);
                        break;
                case 2: System.out.println("Data alumni: ");
                        int counter = 1;
                        for (String alumniData: alumniDataList) {
                            System.out.println(counter + ". " + alumniData);
                            counter++;
                        }
                        break;
                default:
            }

        } while (selectedMenu != 0);
    }
}
