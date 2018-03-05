package EX;

public class Cubo extends Quadrado implements Solidos {
	double comprimento;
	
	public Cubo(double base, double altura, double comprimento) {
		super(base, altura);
		this.comprimento = comprimento;
	}
	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return 12 * getBase();
	}
	@Override
	public double volume(){
		return (getBase() * getAltura() * getComprimento());
	}
	double area1() {
		// TODO Auto-generated method stub
		return (getBase() * getAltura());
	}
	double area() {
		// TODO Auto-generated method stub
		return (area1() * 6);
	}
	
	protected double getComprimento() {
		return comprimento;
	}
	protected void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

}


