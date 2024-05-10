//Class berisi informasi pemesan tiket
class PemesananTiket {
  private String namaPemesan;
  private TiketKonser tiket;
  private String kodePesanan;
  private String tanggalPesanan;

  public PemesananTiket(String namaPemesan, TiketKonser tiket) {
      this.namaPemesan = namaPemesan;
      this.tiket = tiket;
      this.kodePesanan = Main.generateKodeBooking();
      this.tanggalPesanan = Main.getCurrentDate();
  }
  //Output nota pemesanan
  public void tampilkanDetailPesanan() {
      System.out.println("\n---- Detail Pesanan ----");
      System.out.println("Nama Pemesan: " + namaPemesan);
      System.out.println("Kode Pesanan: " + kodePesanan);
      System.out.println("Tanggal Pesanan: " + tanggalPesanan);
      System.out.println("Nama Tiket: " + tiket.getNamaTiket());
      System.out.println("Harga Tiket: " +  "Rp. " + tiket.getHarga());
  }
}
