package fr.pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	static Scanner sc = new Scanner(System.in);	
	
	public static void main(String[] args) {
		String Pizzas[][] = {
				{"PEP","Pépéroni","12.50"},
				{"MAR","Margherita","14.00"},
				{"REI","La Reine","11.50"},
				{"FRO","La 4 fromages","12.00"},
				{"CAN","La cannibale","12.50"},
				{"SAV","La savoyarde","13.00"},
				{"ORI","L’orientale","13.50"},
				{"IND","L’indienne","14.00"}};
		affichageOption();
		String choice = sc.next();
		while(choice.equals("99")!=true){
			switch(choice){
			case "1":
				for(int i=0;i<Pizzas.length;i++){
					for(int j=0;j<3;j++){
						if(Pizzas[i][j]!=""){
						System.out.print(Pizzas[i][j] + " ");
						}
					}
					System.out.println("");
				}
				break;
			case "2":
				System.out.println("Créez votre Pizza");
				System.out.println("Code de la Pizza");
				String code = sc.next();
				System.out.println("Nom de la Pizza");
				String nom = sc.next();
				System.out.println("Prix de la Pizza");
				String prix = sc.next();
				String Etape[][]=new String[(Pizzas.length)+1][3];
				for(int i=0;i<Pizzas.length;i++){
					Etape[i][0] = Pizzas[i][0];
					Etape[i][1] = Pizzas[i][1];
					Etape[i][2] = Pizzas[i][2];
				}
				Etape[Pizzas.length][0] = code;
				Etape[Pizzas.length][1] = nom;
				Etape[Pizzas.length][2] = prix;
				Pizzas=Etape;
				break;
			case "3":
				System.out.println("Modifiez votre Pizza");
				System.out.println("Id de la Pizza");
				int id = sc.nextInt();
				System.out.println("Nouveau Code de la Pizza");
				String codeU = sc.next();
				System.out.println("Nouveau Nom de la Pizza");
				String nomU = sc.next();
				System.out.println("Nouveau Prix de la Pizza");
				String prixU = sc.next();
				Pizzas[id][0]=codeU;
				Pizzas[id][1]=nomU;
				Pizzas[id][2]=prixU;
				break;
			case "4":
				System.out.println("Supprimer votre Pizza");
				System.out.println("Id de la Pizza");
				int idS = sc.nextInt();
				String EtapeS[][]=new String[(Pizzas.length)-1][3];
				for(int i=0;i<Pizzas.length;i++){
					if(i<=idS){
						EtapeS[i][0] = Pizzas[i][0];
						EtapeS[i][1] = Pizzas[i][1];
						EtapeS[i][2] = Pizzas[i][2];
					}
					else{
						EtapeS[i-1][0] = Pizzas[i][0];
						EtapeS[i-1][1] = Pizzas[i][1];
						EtapeS[i-1][2] = Pizzas[i][2];	
					}
				}
				Pizzas=EtapeS;
				break;
			case "99":
				System.out.println("Au revoir");
				break;
			default:
				break;
			}
			affichageOption();
			choice = sc.next();
		} //while(choice.equals("99")!=true);

	}
	public static void affichageOption(){
		System.out.println("*****	Pizzeria	Administration	*****"); 
		System.out.println("1.	Lister	les	pizzas"); 
		System.out.println("2.	Ajouter une	nouvelle	pizza"); 
		System.out.println("3.	Mettre	à	jour	une	pizza"); 
		System.out.println("4.	Supprimer	une	pizza");  
		System.out.println("99.	Sortir"); 
	}

}
