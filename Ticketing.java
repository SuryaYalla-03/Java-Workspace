import java.util.*;
public class Ticketing {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      System.out.print("a=");
      int a = sc.nextInt();
      System.out.print("b=");
      int b = sc.nextInt();
        MovieTicket movieTicket = new MovieTicket(a, b);
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amount);
    }
}

class MovieTicket {
    private int movieId;
    private int noOfSeats;
    private double costPerTicket;
    public MovieTicket(int movieId, int noOfSeats){
        this.movieId = movieId;
    this.noOfSeats = noOfSeats;
    
    if(movieId == 111){
        this.costPerTicket = 7.0;
    }
    else if (movieId ==112){
        this.costPerTicket = 8.0;
    }
    else if(movieId == 113 ){
        this.costPerTicket = 8.5;
    }
    else{
        this.costPerTicket = 0.0;
    }
    }
    public double calculateTotalAmount(){
        double totalAmount = costPerTicket * noOfSeats;
        totalAmount = totalAmount+ ((totalAmount*2)/100);
        return Math.round(totalAmount);
    }
    public int getMovieId(){
        return movieId;
    }
    public void setMovieId(int movieId){
        this.movieId = movieId;
    }
    public int getNoOfSeats(){
        return noOfSeats;
    }
    public void setNoOfSeats(int noOfSeats){
        this.noOfSeats = noOfSeats;
    }
    public double getCostPerTicket(){
        return costPerTicket;
    } 
    public void setCostPerTicket(double costPerTicket){
        this.costPerTicket = costPerTicket;
    }
}
