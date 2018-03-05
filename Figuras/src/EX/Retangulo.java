package EX;

public class Retangulo extends Poligono implements Diagonal{

	public Retangulo(double base, double altura) {
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
		return (getBase() * 2) + (getAltura() * 2);
	}

	@Override
	public double CDiagonal() {
		// TODO Auto-generated method stub
		return Math.sqrt((Math.pow(getAltura(), getAltura()) + Math.pow(getBase(), getBase())));
	}

}
