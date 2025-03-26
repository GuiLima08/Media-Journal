package Menus;

import Journal.JournalController;

import java.util.Scanner;

public class MainMenu {
    
    private Scanner scanner = new Scanner(System.in);  //TODO: FINAL?
    private JournalController journalController;
    private RegisterMenu registerMenu;
    private RateMenu rateMenu;
    private DisplayMenu displayMenu;
    
    public MainMenu(JournalController journalController) {
        this.journalController = journalController;
        this.registerMenu = new RegisterMenu(journalController, scanner);
        this.rateMenu = new RateMenu(journalController, scanner);
        this.displayMenu = new DisplayMenu(journalController, scanner);
    }

    public void showMenu(){
        int option;

        do{
            System.out.println("1 - Registrar ");
            System.out.println("2 - Avaliar ");
            System.out.println("3 - Ver");
            System.out.println("4 - Encerrar ");

            option = Inputs.Validate.validateInt(scanner);

            switch (option) {
                case 1:
                    registerMenu.registerMiniMenu(journalController);

                    break;

                case 2:
                    rateMenu.rateMiniMenu();
                    break;

                case 3:
                    displayMenu.displayMiniMenu();
                    break;

                case 4:
                    //Instructions here
                    break;
                
                default:
                    break;
            }
            
        }while(option != 4);
        scanner.close();
    }
}



