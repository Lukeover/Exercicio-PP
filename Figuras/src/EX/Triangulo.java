package EX;

public class Triangulo extends Poligono {
	double l1;
	double l2;
	double l3;
	public Triangulo(double base, double altura,double l2, double l3) {
		super(base, altura);
		this.l1 = base;
		this.l2 = l2;
		this.l3 = l3;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return ((getBase() * getAltura())/2);
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return getL1() + getL2() + getL3();
	}
	protected double getL1() {
		return l1;
	}

	protected void setL1(double l1) {
		this.l1 = l1;
	}

	protected double getL2() {
		return l2;
	}

	protected void setL2(double l2) {
		this.l2 = l2;
	}

	protected double getL3() {
		return l3;
	}

	protected void setL3(double l3) {
		this.l3 = l3;
	}


}
