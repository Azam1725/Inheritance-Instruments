package Music;

import java.util.Scanner;


public class Driver {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.println("Pilih piano atau gitar?");
        String pilihan = s.nextLine();

        Instruments instruments = new Instruments();
        
        System.out.println("Masukkan nama produk");
        String nama = s.nextLine();
        instruments.nama = nama;

        System.out.println("Masukkan harga");
        double price = s.nextDouble();
        instruments.price = price;
        
        System.out.println("Apakah ada diskon?(y/n)");
        String diskon = s.next();
        double persen=0;
        if(diskon.equalsIgnoreCase("y")) {
            System.out.println("Berapa jumlah diskon?");
            persen=s.nextInt();
        }

            double totaldisc = persen/100*price;
            double hargaAkhir = price-totaldisc;

        if(pilihan.equalsIgnoreCase("piano")) {
        Piano c = new Piano(); 
        c.print();
        System.out.println("Total Diskon: "+persen+"%");
        System.out.println("Harga akhir " +hargaAkhir);
        } else if(pilihan.equalsIgnoreCase("gitar")) {
        System.out.println("Berapa banyak senar");
        int numString = s.nextInt();
        System.out.println("Gitar listrik atau tidak(true / false)");
        boolean isElectric = s.nextBoolean();
        Guitar gitar = new Guitar(nama, price, numString, isElectric);
        System.out.println("Masukkan jumlah senar");
        gitar.print();
        System.out.println("Total Diskon: "+persen+"%");
        System.out.println("Harga akhir " +hargaAkhir);
        } else {
            System.out.println("Input Salah");
        }


        s.close();
    }
}