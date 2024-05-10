//Turunan class tiket konser
class VIP extends TiketKonser {
    public VIP() {
        super("VIP");
    }

    @Override
    public int getHarga() {
        return 500000;
    }
}
