package EX;

public class Losangulo extends Poligono {
	double d1;
	double d2;
	double l1;
	public Losangulo(double base, double altura, double l1) {
		super(base, altura);
		this.d1 = base;
		this.d2 = altura;
		this.l1 = l1;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return (getD1() * getD2());
	}
	
	protected double getD1() {
		return d1;
	}
	protected void setD1(double d1) {
		this.d1 = d1;
	}
	protected double getD2() {
		return d2;
	}
	protected void setD2(double d2) {
		this.d2 = d2;
	}
	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return getL1() * 4;
	}
	protected double getL1() {
		return l1;
	}
	protected void setL1(double l1) {
		this.l1 = l1;
	}

}
