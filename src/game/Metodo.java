package game;

// Pedazo de nombre de clase... por favor!
public class Metodo {
	public static int generaNumeroAleatorio (int minimo, int maximo) {
		int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + 
				(minimo));
		return num;
	}
}
