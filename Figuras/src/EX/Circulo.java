package EX;

public class Circulo extends Figura {
	double pi = 3.14159265359;
	double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return pi * Math.pow(raio,2);
	}
	
	protected double getRaio() {
		return raio;
	}

	protected void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return 2 * pi * getRaio();
	}

}
