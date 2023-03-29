/*Nim			:13020210054
Nama			:Rifdah Salsabila
Hari/Tanggal	:Rabu, 29 Maret 2023*/
 
import java.util.Scanner;

public class 0054 {
    public static void main(String[] args) {
        final double KmPerMil = 1.609;
        final int MeterPerKilometer = 1000;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mil: ");
        double mil = scanner.nextDouble();

        double Km = mil * KmPerMil;
        double meter = Km * MeterPerKilometer;

        System.out.println(mil + " mil = " + meter + " meter.");
    }
}