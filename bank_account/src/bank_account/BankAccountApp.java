package bank_account;

import java.util.Scanner;

import bank_account.util.Colors;

public class BankAccountApp {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {

			int option;

			while (true) {
				System.out.println(Colors.TEXT_YELLOW + Colors.ANSI_BLACK_BACKGROUND
						+ "**************************************************");
				System.out.println("                                                  ");
				System.out.println("             WELCOME TO THE JAVA BANK             ");
				System.out.println("                                                  ");
				System.out.println("**************************************************");
				System.out.println("                                                  ");
				System.out.println("       1 - Create a new account;                  ");
				System.out.println("       2 - List all accounts;                     ");
				System.out.println("       3 - Search account by number;              ");
				System.out.println("       4 - Search account by holder;              ");
				System.out.println("       5 - Update account data;                   ");
				System.out.println("       6 - Delete account;                        ");
				System.out.println("       7 - Withdraw;                              ");
				System.out.println("       8 - Deposit;                               ");
				System.out.println("       9 - Transfer amounts between accounts;     ");
				System.out.println("       0 - Exit.                                  ");
				System.out.println("                                                  ");
				System.out.println("**************************************************");
				System.out.print("\n→ Choose one of the options above: " + Colors.TEXT_RESET);
				option = input.nextInt();

				if (option == 0) {
					System.out.println("\nFinishing the program...");
					System.out.println("\n**************************************************");
					System.out.print(Colors.TEXT_WHITE_BOLD + "     🏦 Java Bank - Your Future Starts Here!      ");
					about();
					input.close();
					System.exit(0);
				}

				switch (option) {
				case 1:
					System.out.println(Colors.TEXT_WHITE_BOLD + "\n\n=== Create a New Account ===\n\n");
					break;
				case 2:
					System.out.println(Colors.TEXT_WHITE_BOLD + "\n\n=== List All Accounts ===\n\n");
					break;
				case 3:
					System.out.println(Colors.TEXT_WHITE_BOLD + "\n\n=== Search Account By Number ===\n\n");
					break;
				case 4:
					System.out.println(Colors.TEXT_WHITE_BOLD + "\n\n=== Search Account By Holder ===\n\n");
					break;
				case 5:
					System.out.println(Colors.TEXT_WHITE_BOLD + "\n\n=== Update Account Data ===\n\n");
					break;
				case 6:
					System.out.println(Colors.TEXT_WHITE_BOLD + "\n\n=== Delete Account ===\n\n");
					break;
				case 7:
					System.out.println(Colors.TEXT_WHITE_BOLD + "\n\n=== Withdraw ===\n\n");
					break;
				case 8:
					System.out.println(Colors.TEXT_WHITE_BOLD + "\n\n=== Deposit ===\n\n");
					break;
				case 9:
					System.out.println(Colors.TEXT_WHITE_BOLD + "\n\n=== Transfer Amounts Between Accounts ===\n\n");
					break;
				default:
					System.out.println(Colors.TEXT_RED_BOLD + "\n→ Invalid option!\n");
					break;
				}
			}

		}

	}

	public static void about() {
		System.out.println("\n**************************************************");
		System.out.println("\n     Project Developed By:\n");
		System.out.println("     → Alan Bruno");
		System.out.println("     → https://www.linkedin.com/in/alanbmrosa/");
		System.out.println("     → https://github.com/alanbrunoscience");
		System.out.println("\n**************************************************");
	}

}
