package EX;

public abstract class Poligono extends Figura {
	double base;
	double altura;
	
	public Poligono(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	protected double getBase() {
		return base;
	}
	protected void setBase(double base) {
		this.base = base;
	}
	protected double getAltura() {
		return altura;
	}
	protected void setAltura(double altura) {
		this.altura = altura;
	}
	
}
