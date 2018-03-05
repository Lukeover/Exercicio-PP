package EX;

public class Trapesio extends Poligono {
	double l1;
	double basemenor;
	public Trapesio(double base, double altura, double l1, double basemenor) {
		super(base, altura);
		this.l1 = l1;
		this.basemenor = basemenor;
	}
	
	@Override
	double area() {
		return getAltura() * (getBase() + getBasemenor()/2);
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return (getL1() * 2) + getBase() + getBasemenor();
	}
	
	protected double getBasemenor() {
		return basemenor;
	}

	protected void setBasemenor(double basemenor) {
		this.basemenor = basemenor;
	}
	
	protected double getL1() {
		return l1;
	}

	protected void setL1(double l1) {
		this.l1 = l1;
	}

}
