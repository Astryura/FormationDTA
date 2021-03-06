package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.FichierDaoFactory;
import fr.pizzeria.ihm.IhmUtil;
import fr.pizzeria.ihm.MainMenu;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

		IhmUtil ihmUtil = new IhmUtil(new Scanner(System.in), new FichierDaoFactory());

		MainMenu mainMenu = new MainMenu(ihmUtil);

		mainMenu.displayMenu();

	}
}