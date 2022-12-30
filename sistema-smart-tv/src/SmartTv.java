
public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligaDesliga() {
    ligada = !ligada;
  }

  public void aumentarVolume() {
    volume++;
  }

  public void abaixarVolume() {
    volume--;
  }

  public void maisCanal() {
    canal++;
  }

  public void menosCanal() {
    canal--;
  }

  public void mudarCanal(int novoCanal) {
    canal = novoCanal;
  }
  

}