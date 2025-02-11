import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input nama pemesan
        System.out.print("Masukkan nama pemesan: ");
        String namaPemesan = scanner.nextLine();

        //Pilihan jenis Tiket
        System.out.println("\nPilih jenis tiket yang diinginkan:");
        System.out.println("1. CAT8");
        System.out.println("2. CAT1");
        System.out.println("3. Festival");
        System.out.println("4. VIP");
        System.out.println("5. VVIP (UNLIMITED EXPERIENCE)");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = scanner.nextInt();

        //Menyimpan objek tiket yang dipilih oleh pengguna.
        TiketKonser tiket = null;

        //Switch case untuk pilhan tiket sesuai dengan yang diinputkan
        switch (pilihan) {
            case 1:
                tiket = new CAT8();
                break;
            case 2:
                tiket = new CAT1();
                break;
            case 3:
                tiket = new Festival();
                break;
            case 4:
                tiket = new VIP();
                break;
            case 5:
                tiket = new VVIP();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
        }
        //Menyimpan objek pemesanan tiket yang dipilih oleh pengguna
        PemesananTiket pesanan = new PemesananTiket(namaPemesan, tiket);
        pesanan.tampilkanDetailPesanan();//Memanggil objek nota pemesanan
    }
    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan kode pesanan atau kode booking
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String generateKodeBooking() {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int length = 8;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }
    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan waktu terkini
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}
