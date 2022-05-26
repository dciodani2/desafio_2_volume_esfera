package bin.br.com.deciodani.git;
import java.util.Scanner;

public class desafio_2_volume_esfera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 //TODO: Complete os espaços em branco com uma possível solução para o desafio 
		double pi = 3.14159;
		System.out.println("Valor Raio Esfera = ");
		double R = sc.nextDouble();
		double volume = (  4.0/3       ) * pi * (Math.pow(R, 3.0));
		System.out.printf("VOLUME = %.3f%n",  volume       );
		sc.close();
	}

}
