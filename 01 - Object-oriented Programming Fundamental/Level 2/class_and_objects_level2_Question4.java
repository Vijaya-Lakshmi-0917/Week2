import java.util.Scanner;
class MovieTicket {
    String movieName;
    int[] seatNumber;
    int price;

    public void bookATicket(int numberOfTickets, int a) {
        int i = 0;
        seatNumber = new int[numberOfTickets];
        while (i < numberOfTickets) {
            seatNumber[i] = i + a;
            i++;
        }
        price = price * numberOfTickets;
    }

    public void display(int numberOfTickets) {
        System.out.println("Name of the movie is: " + movieName);
        System.out.println("The seat numbers are");
        for (int i = 0; i < numberOfTickets; i++) {
            System.out.println(seatNumber[i]);
        }
        System.out.println("The total price of the tickets are " + price);
    }

    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the movie name.");
        movieTicket.movieName = sc.nextLine();
        System.out.println("Enter the number of tickets");
        int numberOfTickets = sc.nextInt();
        System.out.println("Enter the number of the first seat");
        int a = sc.nextInt();
        movieTicket.price = 300;
        movieTicket.bookATicket(numberOfTickets, a);
        movieTicket.display(numberOfTickets);

    }
}
