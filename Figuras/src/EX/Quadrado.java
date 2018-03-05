package EX;

public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(double base, double altura) {
		super(base, altura);
		}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return (getBase() * getAltura());
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return getBase() * 4;
	}

	@Override
	public double CDiagonal() {
		// TODO Auto-generated method stub
		return getAltura() * Math.sqrt(2);
	}

	@Override
	public String toString() {
		return "Quadrado [CDiagonal()=" + CDiagonal() + "]";
	}

}
