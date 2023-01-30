import java.util.Scanner;

public class RaffleP {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number of friends: ");

        int numOfFriends = scan.nextInt();

        String friends[] = new String[numOfFriends]; // ARR CREATED BY THE SIZE OF numOfFriends **

        System.out.println("Enter their names: ");

        for (int i = 0; i < numOfFriends; i++) {
            friends[i] = scan.next();
        }

        int rand = (int) Math.random() * 4; // RANDOM NUM BETWEEN 0 - 3 **

        System.out.println("The winner is: " + friends[rand]);
    }
}
