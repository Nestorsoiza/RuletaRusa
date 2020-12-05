package game;

public class Revolver {
	private int posicionBalaActual;
	private int posicionBala;
	
	public boolean disparar() {
		boolean exito = false;
		if (posicionBalaActual == posicionBala) {
			exito = true;
		}
		siguienteBala();
		return exito;
	}

	public void siguienteBala() {
		if (posicionBalaActual == 6) {
			posicionBalaActual = 1;
		} else {
			posicionBalaActual ++;
		}
		
	}

	@Override
	public String toString() {
		return "Revolver [posicionBalaActual = " + posicionBalaActual 
				+ ", posicionBala = " + posicionBala + "]";
	}
		
}


