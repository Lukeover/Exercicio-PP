package EX;

public class Esfera extends Circulo implements Solidos{

	public Esfera(double raio) {
		super(raio);
	}
	@Override
	public double volume(){
		return ((4/3) * super.pi * (Math.pow(getRaio(), 3)));
	}
}
