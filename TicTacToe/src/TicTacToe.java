import java.util.Scanner;

public class TicTacToe {
	
	public static void main(String[] args) {
		//fix player printing out twice, make a draw case 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Welcome to TicTacToe! Type 'help' for directions on how to play. Otherwise, type 0 to continue. ");
		String help = scan.nextLine();
		
		String[][] helpBoard = {{"1", " | ","2","  | ", "3"},
				  {"--|----|---"},
					{"4", " | ","5","  | ", "6"},
				  {"--|----|---"},
					{"7", " | ","8","  | ", "9"}};
		
		if(help.equals("help")) {
			System.out.println();
			System.out.println("- - - This is a guide to TicTacToe.java - - -");
			System.out.println("This is a two player game and your turns will alternate after every move.");
			System.out.println("You must place your 'x' or 'o' in a box that is blank.");
			System.out.println("You must pick a number 1-9 to place your 'x' or 'o'.");
			System.out.println("This is how the numbers 1-9 correspond to the box on the board.");
			
			System.out.println();
			
			for(int i = 0; i < helpBoard.length; i++) {
				for(int j = 0; j < helpBoard[i].length; j++) {
					
					System.out.print(helpBoard[i][j]);
					
				}
				
				System.out.println();
			}
			System.out.println();
			
			System.out.println("You can win by matching 3 'x's or 'o's vertically, horizontally, or diagonally");
			System.out.println("Now you are ready to play. Have fun and goodluck!");
		}
		
		System.out.println();
		
		boolean gameIsntOver = true;
		
		//Makes board
		String[][] board = {{" ", " | "," ","  | ", " "},
						  {"--|----|---"},
							{" ", " | "," ","  | ", " "},
						  {"--|----|---"},
							{" ", " | "," ","  | ", " "}};
		
		//Prints out board
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				
				System.out.print(board[i][j]);
				
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		int count = 0;
		
		while(gameIsntOver) {
		
		//Takes user input for where he wants to place x			
			System.out.print("Player 'x' pick a number 1-9: ");
			int x = scan.nextInt();
			
			//x can't go in o
		    if ("o".equals(board[0][0]) && x == 1) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("o".equals(board[0][2]) && x == 2) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	 
		    }
		    if ("o".equals(board[0][4]) && x == 3) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("o".equals(board[2][0]) && x == 4) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("o".equals(board[2][2]) && x == 5) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("o".equals(board[2][4]) && x == 6) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("o".equals(board[4][0]) && x == 7) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("o".equals(board[4][2]) && x == 8) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("o".equals(board[4][4]) && x == 9) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    
		    //x can't go in x
		    if ("x".equals(board[0][0]) && x == 1) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("x".equals(board[0][2]) && x == 2) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("x".equals(board[0][4]) && x == 3) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("x".equals(board[2][0]) && x == 4) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("x".equals(board[2][2]) && x == 5) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("x".equals(board[2][4]) && x == 6) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("x".equals(board[4][0]) && x == 7) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("x".equals(board[4][2]) && x == 8) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("x".equals(board[4][4]) && x == 9) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
	
		System.out.println();
		count++;
		
		if(x > 9 || x < 1) { 
			System.out.print("Make sure to pick a number 1-9: ");
			x = scan.nextInt();
			System.out.println();
		}
		
		//Translates user input onto board 
		if(x == 1) {
			
			board[0][0] = "x";
			
		}
		
		if(x == 2) {
			
			board[0][2] = "x";
			
		}
		
		if(x == 3) {
			
			board[0][4] = "x";
			
		}
		
		if(x == 4) {
			
			board[2][0] = "x";
			
		}

		
		if(x == 5) {
			
			board[2][2] = "x";
			
		}
		
		
		if(x == 6) {
			
			board[2][4] = "x";
			
		}
		
		
		if(x == 7) {
			
			board[4][0] = "x";
			
		}
		
		if(x == 8) {
			
			board[4][2] = "x";
			
		}
		

		if(x == 9) {
			
			board[4][4] = "x";
			
		}
		
		//Prints new board
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				
				System.out.print(board[i][j]);
				
				
			}
			
			System.out.println();
			
		}
		
		if(count > 4) {
			System.out.println();
			System.out.print("The game was a draw! ");
			gameIsntOver = false;
			break;
			
		}
			System.out.println();
			
			// Logic for if the game is over or not
			if(board[0][0] == "x" && board[0][2] == "x" && board[0][4] == "x") {
				gameIsntOver = false;
				break;
			}
			if(board[2][0] == "x" && board[2][2] == "x" && board[2][4] == "x") {
				gameIsntOver = false;
				break;
			}
			if(board[4][0] == "x" && board[4][2] == "x" && board[4][4] == "x") {
				gameIsntOver = false;
				break;
			}
			if(board[0][0] == "x" && board[2][0] == "x" && board[4][0] == "x") {
				gameIsntOver = false;
				break;
			}
			if(board[0][2] == "x" && board[2][2] == "x" && board[4][2] == "x") {
				gameIsntOver = false;
				break;
			}
			if(board[0][4] == "x" && board[2][4] == "x" && board[4][4] == "x") {
				gameIsntOver = false;
				break;
			}
			if(board[0][0] == "x" && board[2][2] == "x" && board[4][4] == "x") {
				gameIsntOver = false;
				break;
			}
			
			if(board[4][0] == "x" && board[2][2] == "x" && board[0][4] == "x") {
				gameIsntOver = false;
				break;
			}
			
		//Takes user input for where he wants to place o
		System.out.print("Player 'o' pick a number 1-9: ");
			int o = scan.nextInt();
			
			//o can't go in x
		    if ("x".equals(board[0][0]) && o == 1) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("x".equals(board[0][2]) && o == 2) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("x".equals(board[0][4]) && o == 3) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("x".equals(board[2][0]) && o == 4) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("x".equals(board[2][2]) && o == 5) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("x".equals(board[2][4]) && o == 6) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("x".equals(board[4][0]) && o == 7) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("x".equals(board[4][2]) && o == 8) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("x".equals(board[4][4]) && o == 9) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    
		    
			//o can't go in o    
		    if ("o".equals(board[0][0]) && o == 1) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("o".equals(board[0][2]) && o == 2) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("o".equals(board[0][4]) && o == 3) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("o".equals(board[2][0]) && o == 4) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("o".equals(board[2][2]) && o == 5) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("o".equals(board[2][4]) && o == 6) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("o".equals(board[4][0]) && o == 7) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("o".equals(board[4][2]) && o == 8) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
		    if ("o".equals(board[4][4]) && o == 9) {
		    	
		    	System.out.print("Pick a box that is blank: ");
		    	x = scan.nextInt();
		    	
		    }
			
		System.out.println();
		
		if(o > 9 || o < 1) { 
			System.out.print("Make sure to pick a number 1-9: ");
			o = scan.nextInt();
			System.out.println();
		}
		
		//Translates user input onto board 
		if(o == 1) {
			
			board[0][0] = "o";
			
		}
		
		if(o == 2) {
			
			board[0][2] = "o";
			
		}
		
		if(o == 3) {
			
			board[0][4] = "o";
			
		}
		
		if(o == 4) {
			
			board[2][0] = "o";
			
		}

		
		if(o == 5) {
			
			board[2][2] = "o";
			
		}
		
		
		if(o == 6) {
			
			board[2][4] = "o";
			
		}
		
		
		if(o == 7) {
			
			board[4][0] = "o";
			
		}
		
		if(o == 8) {
			
			board[4][2] = "o";
			
		}
		

		if(o == 9) {
			
			board[4][4] = "o";
			
		}
		
		//Prints new board
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				
				System.out.print(board[i][j]);
				
				
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Logic for if the game is over or not
		if(board[0][0] == "o" && board[0][2] == "o" && board[0][4] == "o") {
			gameIsntOver = false;
			break;
		}
		if(board[2][0] == "o" && board[2][2] == "o" && board[2][4] == "o") {
			gameIsntOver = false;
			break;
		}
		if(board[4][0] == "o" && board[4][2] == "o" && board[4][4] == "o") {
			gameIsntOver = false;
			break;
		}
		if(board[0][0] == "o" && board[2][0] == "o" && board[4][0] == "o") {
			gameIsntOver = false;
			break;
		}
		if(board[0][2] == "o" && board[2][2] == "o" && board[4][2] == "o") {
			gameIsntOver = false;
			break;
		}
		if(board[0][4] == "o" && board[2][4] == "o" && board[4][4] == "o") {
			gameIsntOver = false;
			break;
		}
		if(board[0][0] == "o" && board[2][2] == "o" && board[4][4] == "o") {
			gameIsntOver = false;
			break;
		}
		
		if (board[4][0] == "o" && board[2][2] == "o" && board[0][4] == "o") {
		    gameIsntOver = false;
		    break;
		}
		
		
	}
	
		System.out.println("Game is over!");
		
	}
	
}