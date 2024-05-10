//Abstract class sebagai kelas dasar dari semua jenis tiket.
abstract class TiketKonser implements HargaTiket {
    private String namaTiket;

    public TiketKonser(String namaTiket) {
        this.namaTiket = namaTiket;
    }

    public String getNamaTiket() {
        return namaTiket;
    }
}
