//Class turunan dari tiket konser
class CAT1 extends TiketKonser {
  public CAT1() {
      super("CAT1");
  }

  @Override
  public int getHarga() {
      return 200000;
  }
}
