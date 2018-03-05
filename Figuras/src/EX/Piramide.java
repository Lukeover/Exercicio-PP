package EX;

public class Piramide extends Triangulo implements Solidos{
	double largura;
	public Piramide(double base, double altura, double l2, double l3, double largura) {
		super(base, altura, l2, l3);
		this.largura = largura;
	}
	@Override
	public double volume(){
		return (getBase() * getAltura() * getLargura() * (1/3));
	}
	protected double getLargura() {
		return largura;
	}
	protected void setLargura(double largura) {
		this.largura = largura;
	}
}
