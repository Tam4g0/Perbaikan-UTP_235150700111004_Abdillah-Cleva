//Class turunan dari tiket konser
class Festival extends TiketKonser {
  public Festival() {
      super("Festival");
  }

  @Override
  public int getHarga() {
      return 300000;
  }
}
