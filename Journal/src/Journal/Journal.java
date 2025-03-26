package Journal;

import Media.Book;
import Media.Movie;
import Media.Series;

import java.util.ArrayList;

public class Journal {
    private ArrayList<Book> bookList;
    private ArrayList<Movie> movieList;
    private ArrayList<Series> seriesList;

    public Journal(){
        this.bookList = new ArrayList<>();
        this.movieList = new ArrayList<>();
        this.seriesList = new ArrayList<>();
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public void addMovie(Movie movie){
        movieList.add(movie);
    }

    public void addSeries(Series series){
        seriesList.add(series);
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public ArrayList<Series> getSeriesList() {
        return seriesList;
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }
}
