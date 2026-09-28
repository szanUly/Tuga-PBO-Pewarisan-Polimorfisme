import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean jalan = true;

        System.out.println("=== PROGRAM GEOMETRI OOP ===");

        while (jalan) {
            System.out.println("\nPilih bentuk yang ingin dibuat:");
            System.out.println("1. Bentuk Umum");
            System.out.println("2. Bujur Sangkar");
            System.out.println("3. Lingkaran");
            System.out.println("4. Silinder");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1-5): ");
            int pilihan = input.nextInt();

            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan warna bentuk: ");
                    String warnaBentuk = input.nextLine();
                    Bentuk bentuk = new Bentuk(warnaBentuk);
                    bentuk.printInfo();
                    break;
                case 2:
                    System.out.print("Masukkan panjang sisi bujur sangkar: ");
                    double sisi = input.nextDouble();
                    input.nextLine(); // clear buffer
                    System.out.print("Masukkan warna bujur sangkar: ");
                    String warnaBujur = input.nextLine();
                    BujurSangkar bs = new BujurSangkar(sisi, warnaBujur);
                    bs.printInfo();
                    break;
                case 3:
                    System.out.print("Masukkan radius lingkaran: ");
                    double radius = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan warna lingkaran: ");
                    String warnaLingkaran = input.nextLine();
                    Lingkaran lingkaran = new Lingkaran(radius, warnaLingkaran);
                    lingkaran.printInfo();
                    break;
                case 4:
                    System.out.print("Masukkan tinggi silinder: ");
                    double tinggi = input.nextDouble();
                    System.out.print("Masukkan radius alas silinder: ");
                    double radSilinder = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan warna silinder: ");
                    String warnaSilinder = input.nextLine();
                    Silinder silinder = new Silinder(tinggi, radSilinder, warnaSilinder);
                    silinder.printInfo();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    jalan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        
        input.close();
    }
}