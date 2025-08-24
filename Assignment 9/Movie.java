/**
Movie Rating System
Create a class Movie with fields: name, genre, and rating.
Use setters and create a method isHit() that returns true if rating ≥ 8.0.
 */

class Movie{

    private String genre;
    private String name;
    private int rating;

  
    public void setMovieDetails(String genre, String name, int rating) {
        this.genre = genre;
        this.name = name;
        this.rating = rating;
    }

    public String isHit(){
            if(rating >= 8)
            return "HIT";
            else
             return "FLOP";   
            
        
    }

    public void setGenre(String gerne) {
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void displayDetails() {
        System.out.println("Movie Genre   : " + genre);
        System.out.println("Movie Name : " + name);
        System.out.println("Movie Rating: " + rating);
    }
}
class Main {
    public static void main(String[] args) {
        Movie m = new Movie();

       
        m.setGenre("comdey");
        m.setName("John Doe");
        m.setRating(8);

        m.displayDetails();
        System.out.println("MOVIE IS : "+m.isHit());
    }
}