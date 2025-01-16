class MovieTicket{
    String movieName;
    String seatNumber;
    int price;

    public MovieTicket(String movieName, String seatNumber, int price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    public void displayTicket(){
        System.out.println("Movie Name: "+ movieName);
        System.out.println("Seat Number: "+ seatNumber);
        System.out.println("Price: "+ price);
        System.out.println("Status Booked!");
    }

}

public class MovieTicketDetails {
    public static void main(String[] args){
        MovieTicket ticket = new MovieTicket("KGF", "A1", 120);
        ticket.displayTicket();
    }
}
