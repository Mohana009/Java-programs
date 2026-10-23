class Movie{
    //Instance variables
    String name, director, musicComposer;
    //Instance methods
    void printMovieDetails(){
        System.out.println(name + " directed by " + director);
        System.out.println("Music is composed by " + musicComposer);
    }
    //constructor -> non-parametric
    Movie(){

    }
    //Parametric constructor
    Movie(String n, String d, String mc){
        name = n;
        director = d;
        musicComposer = mc;
    }
}
public class ConstructorExample {
    public static void main(String[] args) {
        Movie favMovie = new Movie("Dalapathy", "Maniratnam", "Ilyraja");
        favMovie.printMovieDetails();
    }
}
