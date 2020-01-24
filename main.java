import java.util.*;
import java.io.*;

// DRIVER CODE

public class main {
	// priorityqueue: saves all names in ABC order
	public static PriorityQueue<String> names = new PriorityQueue<String>();

	// saves all users' credit card numbers
	public static HashMap<String, Integer> numbers = new HashMap<String, Integer>();

	// saves all users' balances
	public static HashMap<String, Integer> balances = new HashMap<String, Integer>();

	// saves all users' limits
	public static HashMap<String, Integer> limits = new HashMap<String, Integer>();
	
	public static void main(String args[]) throws IOException {
		Scanner in = null;
		FileReader fr = null;
		BufferedReader br = null;
		String input;

		// reads file
		if (args.length == 0) {
			in = new Scanner(System.in);
			while (in != null && in.hasNext()) {
				input = in.nextLine();
				checkCase(input);
			}
		} else if (args[0].contains(".txt")) {
			// read from text file
			String fn = args[0];
			fr = new FileReader(fn);
			br = new BufferedReader(fr);
			while (br.readLine() != null && br != null) {
				input = br.readLine();
				checkCase(input);
			}
		} else {
			// check for each conditions
			for (int i = 0; i < args.length; i++) {
				if (args[i] == "Add") {
					// add, name, amount, number
					String organized = args[i] + " " + args[i+1] + " " + args[i+2] + " " + args[i+3];
					checkCase(organized);
				} else if (args[i] == "Credit" || args[i] == "Charge") {
					// charge/credit, name, amount
					String organized = args[i] + " " + args[i+1] + " " + args[i+2];
					checkCase(organized);
				} 
			}

		}

		printDisplay();
	}
}

// METHODS

public static void checkCase(String inL) {
	String arr[] = parseInput(inL);

	// switches based on action 
	switch (inarr[0]) {
		case "Add":
			// Luhn Test
			boolean isValid = validateCard(arr[3]);
			if (!isValid) {
				arr[3] = "ERROR";
			}

			// adds new account
			addAccount(arr);
			break;

		case "Charge":
			int charge = Integer.parseInt(arr[2]);
			chargeAmout(arr[1], charge);
			break;

		case "Credit":
			int credit = Integer.parseInt(arr[2]);
			creditAmount(arr[1],credit);
			break;

	}
}

public static String[] parseInput(String input) {
	boolean finish = input.contains("END") || input.contains("end") || input.contains("End")
	if (finish) {
		System.out.println("OUTPUT:");
		printDisplay();
		System.exit(0);
	}

	String[] output = new String[4];

	// Action
	int space = input.indexOf(" ");
	String pt1 = input.substring(0,space);

	// Name
	input = input.replaceFirst(" ","");
	int space2 = input.indexOf(" ");
	String pt2 = input.substring(space,space2);

	// Amount
	int len = input.length();
	int dollarSign = input.indexOf('$');
	String pt3 = input.substring(dollarSign+1,len);

	output[0] = pt1;
	output[1] = pt2;
	output[2] = pt3;

	// If we're "adding", we also need to include credit card number
	if (pt1.contains("Add")) {
		output[3] = input.substring(space2+1,dollarSign-2);
	} else {
		output[3] = "NULL";
	}

	return output;
}

public static void printDisplay() {
	// SAMPLE
	// Lisa: $-93
	// Quincy: error
	// Tom: $500
	for (int i = 0; i < names.size(); i++) {
		String name = names.poll();
		String balance;
		String cardNum = numbers.get(name);
		if (cardNum == "ERROR") {
			balance = "Error";
			System.out.println(name + ": " + balance);
		} else {
			balance = Integer.toString(getBalance(name));
			System.out.println(name + ": " + "$" + balance)

		}

	}
}

public static void addAccount(String[] input) {
	String newName = input[1];
	names.add(newName);
	balances.put(newName,0);
	int newLimit = Integer.parseInt(input[2]);
	limits.put(newName, b);
	String newNumber = input[3];
	numbers.put(newName,newNumber);
}

public static void creditAmount(String name, int credit) {
	// subtracts value from existing value in Hashmap
	balances.put(name, balances.get(name) - credit);
}

public static void chargeAmout(String name, int charge) {
	int needed = balances.get(name) + charge;

	// accounts for the charge being greater than the limit in person's account
	if (needed > limits.get(name)) {

	} else {
		balances.put(name,x);
	}
}

public static int getBalance(String name) {
	int balance = balances.get(name);
	return balance;
}

public static boolean validateCard(String number) {
		int sum = 0
		boolean other = false;

		for (int i = number.length() - 1; i>= 0; i--) {
			int x = Integer.parseInt(number.substring(i, i + 1));
			if (other) {
				x *= 2;
				if (x > 9) {
					x = (x % 10) + 1;
				}
			}
			sum += x;
			other = !other;
		}
		return (sum % 10 == 0);
}
