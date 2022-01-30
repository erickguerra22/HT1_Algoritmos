
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class RadioControllerTest {

	RadioController radio;
	
	@BeforeEach
	void instance() {
		radio = new RadioController();
	}

	@Test
	void testEncenderApagar() {
		radio.encenderApagar();
		assertEquals(true, radio.isEncendido());
	}

	@Test
	void testGuardarEmisoraActual() {
		String guardada = radio.guardarEmisoraActual(8);
		assertEquals("\nEmisora almacenada en el boton 8 de forma correcta.", guardada);
	}

	@Test
	void testSeleccionarEmisoraGuardada() {
		String emisora = radio.seleccionarEmisoraGuardada(8);
		assertEquals("\nNo se tiene guardada una emisora en esta posicion. Intente otra.", emisora);
	}

	@Test
	void testCambiarSenal() {
		String cambiarSenal = radio.cambiarSenal(false);
		assertEquals("\nSe ha cambiado la senal a AM.", cambiarSenal);
	}

	@Test
	void testGetTipoSenal() {
		boolean senal = radio.getTipoSenal();
		assertEquals(true, senal);
	}

	@Test
	void testSubirEmisora() {
		radio.subirEmisora();
		assertEquals(88.1f, radio.getActualFM());
	}

	@Test
	void testBajarEmisora() {
		radio.bajarEmisora();
		System.out.println(radio.getActualFM());
		assertEquals(107.9f, radio.getActualFM());
	}

	@Test
	void testGetEmisoraActual() {
		float emisora = radio.getEmisoraActual();
		assertEquals(87.9f, emisora);
	}

	@Test
	void testComprobarEncendida() {
		boolean encendida = radio.comprobarEncendida();
		assertEquals(false, encendida);
	}

}
