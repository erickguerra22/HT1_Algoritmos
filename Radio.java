/*
Clase Radio. La cual simulara la radio del carro. Esta es la interfaz
Autor1: Erick Guerra | 21781
Autor2: Elias Alvarado | 21808
Fecha: 26 de enero del 2022
*/

public interface Radio {
	public void encenderApagar();
  public String guardarEmisoraActual(int numBoton);
  public String seleccionarEmisoraGuardada(int numBoton);public String cambiarSenal(boolean opcion);
  public boolean getTipoSenal();
  public void subirEmisora();
  public void bajarEmisora();
  public float getEmisoraActual();
  public boolean comprobarEncendida();
}