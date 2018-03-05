package EX;

public class Cilindro extends Circulo implements Solidos{
	double altura;
	public Cilindro(double raio, double altura) {
		super(raio);
		this.altura = altura;
	}
	@Override
	public double volume(){
		return ((getAltura() * super.pi) * (Math.pow(getRaio(), 3)));
	}
	
	protected double getAltura() {
		return altura;
	}
	protected void setAltura(double altura) {
		this.altura = altura;
	}
}
