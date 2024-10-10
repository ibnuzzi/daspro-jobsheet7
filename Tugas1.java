import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000, totalTiket = 0, totalPenjualan = 0, tiket = 0;
        double diskon = 0, hargaDiskon = 0;
        String namaPelanggan;

         do {
            System.out.print("Masukkan nama pelanggan (ketik selesai untuk keluar): ");
            namaPelanggan = sc.next();
            sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan jumlah tiket: ");
            tiket = sc.nextInt();

            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid (negatif). Masukkan lagi!");
                continue;
            }

            if (tiket > 10) {
                diskon = 0.15;
            } else if (tiket > 4) {
                diskon = 0.1;
            }else {
                diskon = 0;
            }
            hargaDiskon = hargaTiket * diskon;
            totalTiket += tiket;
            totalPenjualan += tiket * (hargaTiket - hargaDiskon);

            System.out.println("Nama Pelanggan " + namaPelanggan);
            System.out.println("Jumlah tiket: " + tiket);
            System.out.println("Mendapatkan diskon: " + diskon + "%");
            System.out.println("Total harga tiket: " + tiket * (hargaTiket - hargaDiskon));
        } while (true);
            System.out.println("Total tiket yang terjual selama satu hari: " + totalTiket);
            System.out.println("Total penjualan tiket selama satu hari: Rp " + totalPenjualan);
        
    }
}
