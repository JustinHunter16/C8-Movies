import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class MovieListAL here.
 *
 * @author (Mr. Kim)
 * @version (2019-11-16)
 */
public class MovieListAL
{
    // instance variables - replace the example below with your own
    private ArrayList<Movie> pool;

    /**
     * Constructor for objects of class MovieListsAL
     */
    public MovieListAL(Movie[] movies)
    {
        pool = new ArrayList<Movie>();
        for(Movie m : movies)
        pool.add(m);
    }

    public ArrayList<Movie> getPool()
    {
        return pool;
    }
    
    /**
     * Given an arraylist of Movies and a studio name, create a new ArrayList of movies
     * by that studio
     */
    public ArrayList<Movie> getByStudio(String studio)
    {
        ArrayList<Movie> qualified = new ArrayList<Movie>();
        for(Movie m : pool)
        {
            if(m.getStudio().equals(studio))
            qualified.add(m);
        }
        return qualified;
    }
    
    
    /** 
     * get the movie with the highest rating within an ArrayList
     */
    public Movie getHighestrating(ArrayList<Movie> movies)
    {
        Movie max = movies.get(0);
        for(Movie m : movies)
        {
            if(m.getRating()>max.getRating())
            max = m;
        }
        return max;
    }
    
    

    
    /**
     * Find the highest movies by studio
     */
    public ArrayList<Movie> findHighestRatedByStudio()
    {
        ArrayList<Movie> highestRated = new ArrayList<Movie>();
        highestRated.add(getHighestrating(getByStudio("Disney")));
        highestRated.add(getHighestrating(getByStudio("Ghibli")));
        highestRated.add(getHighestrating(getByStudio("Indy")));
        return highestRated;
    }

}
