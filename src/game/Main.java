package game;

public class Main {

	// El problema que tienes es que hacer un juego no es una ejecucion lineal
	// En principio querras que el jugador decida si apretar el gatillo o rendirse
	// Si no se pasa el control a los jugadores solo sirve para ver a quien le toco la china
	// Eso en consola lo harias con el escaner, pero sinceramente no se que aporta este ejemplo
	// Limitate a coger ejemplos que toquen todo el contenido o estaras perdiendo el tiempo
	public static void main(String[] args) {
		 Juego juego = new Juego(2);
		 while (!juego.finJuego()) {
			juego.rondaV2();
		}
		 System.out.println("El juego ha terminado");
	}

}
