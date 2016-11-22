package fr.operateurs.console;

import java.math.BigDecimal;
import java.util.Scanner;

public class OperateursApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir	le	premier	nombre… ");
		String nb1 = sc.nextLine();
		System.out.println("Vous avez saisi : " + nb1);
		System.out.println("Veuillez saisir	le	second	nombre… ");
		String nb2 = sc.nextLine();
		System.out.println("Vous avez saisi : " + nb2);
		System.out.println(new BigDecimal(nb1).add(new BigDecimal(nb2)));
		System.out.println(new BigDecimal(nb1).subtract(new BigDecimal(nb2)));
		System.out.println(new BigDecimal(nb1).multiply(new BigDecimal(nb2)));
		System.out.println(new BigDecimal(nb1).divide(new BigDecimal(nb2),1));
		//System.out.println(new BigDecimal(nb1).subtract(new BigDecimal(nb2)));
		sc.close();

	}

}
