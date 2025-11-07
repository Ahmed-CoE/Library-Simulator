package LibrarySimulator;
														// Ahmed Wahbi Sendi *446102270*
import java.util.Scanner;
														// Saud Khalifa Almutiri *446105581*
public class LibrarySimulator {
	public static void main(String args[]) { 			// Abdullah Basel Al harbi *446106240*

		Scanner n = new Scanner(System.in);

		// ======= user1 data =======
		int user1CurrentBooks = 0;
		int user1BorrowedBooks = 0;
		int user1TimeChoosingBK = 0;
		int user1ReturnedBooks = 0;
		int user1TimeChoosingRB = 0;
		double user1Fee = 0;

		// ======= user2 =======
		int user2CurrentBooks = 0;
		int user2BorrowedBooks = 0;
		int user2TimeChoosingBK = 0;
		int user2ReturnedBooks = 0;
		int user2TimeChoosingRB = 0;
		double user2Fee = 0;

		// ======= user3 data =======
		int user3CurrentBooks = 0;
		int user3BorrowedBooks = 0;
		int user3TimeChoosingBK = 0;
		int user3ReturnedBooks = 0;
		int user3TimeChoosingRB = 0;
		double user3Fee = 0;

		// ======= admin data =======
		int totalTimeChoosingBK = 0; // total time that users chose Borrow Books
		int totalTimeChoosingRB = 0; // total time that users choose Return Books
		double totalFee = 0; // total Fees for all of the users
		boolean run = true; // the control for main loop

		while (run) {

			// ======= Reset session variables =======
			int userCurrentBooks = 0;
			int userBorrowedBooks = 0;
			int userTimeChoosingBK = 0;
			int userReturnedBooks = 0;
			int userTimeChoosingRB = 0;
			double userFee = 0;
			boolean running = true;

			// ======= Start of program =======
			
			System.out.println("=========== Welcome to Library simulation ===========\n");
			System.out.println("Choose an account:   \n");

			System.out.println(
					" -user1 (ID: 1 , username: a) \n -user2 (ID: 2 , username: b) \n -user3 (ID: 3 , username: c) \n -admin \n -exit");
			System.out.println("=====================================================");
			String choice = n.next();
			String choice1 = "";
			while (running) {

				// ======= User1 Menu =======	
				if (choice.equalsIgnoreCase("user1")) {

					System.out.println("Welcome user1 \n");

					System.out.println(
							" Choose: \n 1. View Books \n 2. Borrow Books \n 3. Return Books \n 4. View Session Summary \n 5. Exit to Main Menu \n **please select an option by entering its number**");

					choice1 = n.next();

					if (choice1.equalsIgnoreCase("1")) {

						System.out.printf("\nYou current: %d book(s) \n \n", user1CurrentBooks);
					}

					else if (choice1.equalsIgnoreCase("2")) {
						user1TimeChoosingBK++;

						if (user1CurrentBooks < 5) {
							System.out.println("You have successfully borrowed a book. \nFee: 0.50\n");
							user1CurrentBooks++;
							userBorrowedBooks++;
							user1BorrowedBooks += userBorrowedBooks;
							user1Fee += 0.5;
							userFee += 0.5;

						}

						else if (user1CurrentBooks == 5) {
							System.out.println("You cannot borrow more than 5 books at once\n");
						}

						else {
							System.out.println("Wrong input\n");
							continue;
						}
					}

					else if (choice1.equalsIgnoreCase("3")) {
						user1TimeChoosingRB++;

						if (user1CurrentBooks > 0) {
							System.out.println("You have successfully returde a book.\n");
							user1CurrentBooks--;
							userReturnedBooks++;
							user1ReturnedBooks += userReturnedBooks;
						}

						else if (user1CurrentBooks <= 0) {

							System.out.println("You don't have any books to return \n ");
						}
					}

					else if (choice1.equalsIgnoreCase("4")) {

						System.out.printf(
								"\nYou borrowed: %d book(s) \nYou returned: %d book(s) \nYou're payment is: %.2f \n \n",
								userBorrowedBooks, userReturnedBooks, userFee);
					}

					else if (choice1.equalsIgnoreCase("5")) {
						break;
					}
				}

				// ======= User2 Menu =======				
				if (choice.equalsIgnoreCase("user2")) {

					System.out.println("Welcome user2 \n");

					System.out.println(
							" Choose: \n 1. View Books \n 2. Borrow Books \n 3. Return Books \n 4. View Session Summary \n 5. Exit to Main Menu \n **please select an option by entering its number**");

					choice1 = n.next();

					if (choice1.equalsIgnoreCase("1")) {

						System.out.printf("\nYou current: %d book(s) \n \n", user2CurrentBooks);
					}

					else if (choice1.equalsIgnoreCase("2")) {
						user2TimeChoosingBK++;

						if (user2CurrentBooks < 5) {
							System.out.println("You have successfully borrowed a book. \nFee: 0.50\n");
							userBorrowedBooks++;
							user2CurrentBooks++;
							user2BorrowedBooks += userBorrowedBooks;
							user2Fee += 0.5;
							userFee += 0.5;
						}

						else if (user2CurrentBooks == 5) {
							System.out.println("You cannot borrow more than 5 books at once\n ");
						}

						else {
							System.out.println("Wrong input \n ");
							continue;
						}

					}

					else if (choice1.equalsIgnoreCase("3")) {
						user2TimeChoosingRB++;

						if (user2CurrentBooks > 0) {
							System.out.println("You have successfully returde a book.\n");
							user2CurrentBooks--;
							userReturnedBooks++;
							user2ReturnedBooks += userReturnedBooks;

						}

						else if (user2CurrentBooks <= 0) {

							System.out.println("You don't have any books to return\n");
						}
					}

					else if (choice1.equalsIgnoreCase("4")) {

						System.out.printf(
								"\nYou borrowed: %d book(s) \nYou returned: %d book(s) \nYou're payment is: %.2f \n \n",
								userBorrowedBooks, userReturnedBooks, userFee);
					}

					else if (choice1.equalsIgnoreCase("5")) {
						break;
					}

				}

				// ======= User3 Menu =======				
				if (choice.equalsIgnoreCase("user3")) {

					System.out.println("Welcome user3 \n");

					System.out.println(
							" Choose: \n 1. View Books \n 2. Borrow Books \n 3. Return Books \n 4. View Session Summary \n 5. Exit to Main Menu \n **please select an option by entering its number**");

					choice1 = n.next();

					if (choice1.equalsIgnoreCase("1")) {

						System.out.printf("\nYou current: %d book(s) \n \n", user3CurrentBooks);
					}

					else if (choice1.equalsIgnoreCase("2")) {
						user3TimeChoosingBK++;
						
						if (user3CurrentBooks < 5) {
							System.out.println("You have successfully borrowed a book. \nFee: 0.50\n");
							userBorrowedBooks++;
							user3CurrentBooks++;
							user3BorrowedBooks += userBorrowedBooks;
							user3Fee += 0.5;
							userFee += 0.5;
						}

						else if (user3CurrentBooks == 5) {
							System.out.println("You cannot borrow more than 5 books\n");
						}

						else {
							System.out.println("Wrong input\n");
							continue;
						}

					}

					else if (choice1.equalsIgnoreCase("3")) {
						user3TimeChoosingRB++;

						if (user3CurrentBooks > 0) {
							System.out.println("You have successfully returde a book.\n");
							user3CurrentBooks--;
							userReturnedBooks++;
							user3ReturnedBooks += userReturnedBooks;

						}

						else if (user3CurrentBooks <= 0) {

							System.out.println("You don't have any books to return\n");
						}
					}

					else if (choice1.equalsIgnoreCase("4")) {

						System.out.printf(
								"\nYou borrowed: %d book(s) \nYou returned: %d book(s) \nYou're payment is: %.2f \n \n",
								userBorrowedBooks, userReturnedBooks, userFee);
					}

					else if (choice1.equalsIgnoreCase("5")) {
						break;
					}

				}

				// ======= Admin Menu =======				
				if (choice.equalsIgnoreCase("admin")) {
					System.out.print("Enter username: "); // username;: COE
					String username = n.next();
					System.out.print("Enter password: "); // password: KSU
					String password = n.next();
					while (running) {
						if (username.equalsIgnoreCase("COE") && password.equals("KSU")) {
							System.out.println("Welcome admin");
							System.out.print(
									"\nChoose: \n 1. View total revenue \n 2. Most frequent Operation \n 3. Exit to main menu \n **please select an option by entering its number** \n ");
							String adminChoice = n.next();

							if (adminChoice.equalsIgnoreCase("1")) {
								totalFee = user1Fee + user2Fee + user3Fee;
								System.out.printf(
										"\ntotal fees collected from all book borrow operations across all users is: %.2f\n",
										totalFee);
							} else if (adminChoice.equalsIgnoreCase("2")) {

								totalTimeChoosingBK = user1TimeChoosingBK + user2TimeChoosingBK + user3TimeChoosingBK;
								totalTimeChoosingRB = user1TimeChoosingRB + user2TimeChoosingRB + user3TimeChoosingRB;

								// if the users choose "Borrow books" more
								if (totalTimeChoosingBK > totalTimeChoosingRB) {
									System.out.println("most commonly performed user operation is: Borrow books\n\n");
								}

								// if the users chose "Return books" more
								else if (totalTimeChoosingBK < totalTimeChoosingRB) {
									System.out.println("most commonly performed user operation is: Return books\n\n");
								}

								// if the two choices are equal
								else
									System.out.println(
											"most commonly performed user operation is: Borrow books and Return books\n\n");
							}

							else if (adminChoice.equalsIgnoreCase("3")) {
								running = false;
							}
						}

						else {
							System.out.println("Invalid username or password. Please try again\n\n");
							running = false;
							}
						}		 
					}
				
							// ======= Exit Menu =======		
				else if (choice.equalsIgnoreCase("exit")) {
					System.out.println("Thank you for using Library simulator, Goodbye!!");
					running = false;
					run = false;
				}

			}

		}
		n.close();
	}
}
