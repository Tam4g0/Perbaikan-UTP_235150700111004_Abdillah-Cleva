//Turunan kelas TiketKonser
class VVIP extends TiketKonser {
  public VVIP() {
      super("VVIP (UNLIMITED EXPERIENCE)");
  }

  @Override
  public int getHarga() {
      return 1000000;
  }
}
