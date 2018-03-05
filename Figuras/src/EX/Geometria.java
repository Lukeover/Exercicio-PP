package EX;

import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		ArrayList<Figura> lista = new ArrayList<>();
		lista.add(new Circulo(3));
		lista.add(new Triangulo(2,4,6,8));
		lista.add(new Losangulo(2,4,6));
		lista.add(new Retangulo(2,4));
		lista.add(new Quadrado(4,4));
		lista.add(new Trapesio(7,3,3,7));
		lista.add(new Cubo(4,4,4));
		lista.add(new Piramide(2,4,6,8,4));
		lista.add(new Cilindro(4,4));
		lista.add(new Esfera(4));
		
		for(Figura fig:lista) {
			System.out.println("Area; " + +fig.area());
			System.out.println("Perimetro; " + fig.perimetro());
			//System.out.println(fig.toString());
			if(fig instanceof Diagonal){
				System.out.println("Diagonal: " + ((Diagonal)fig).CDiagonal());
			}
			if(fig instanceof Solidos){
				System.out.println("Volume: " + ((Solidos)fig).volume());
			}
		
		}
	}

}
