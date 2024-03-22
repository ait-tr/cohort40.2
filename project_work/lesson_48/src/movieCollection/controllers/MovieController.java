package movieCollection.controllers;

import movieCollection.*;
import movieCollection.models.*;

import java.util.*;

public class MovieController {
    private final MovieRepository movieRepo;
    private final CSVFileRepository fileRepo;
    Scanner scanner;

    public MovieController(String filepath) {// конструктор
        this.movieRepo = new MovieRepository();
        this.fileRepo = new CSVFileRepository(filepath);
        this.scanner = new Scanner(System.in);
        this.loadFile();
    }

    public void handleSaveCommand() {
        Collection<Movie> movies = this.movieRepo.getValues();
        this.fileRepo.save(movies);
    }

    private void loadFile() {
        Collection<Movie> movies = this.fileRepo.load();
        for (Movie movie : movies) {
            this.movieRepo.add(movie);
        }
    }

    public Collection<Movie> handleShowCommand() {
        return this.movieRepo.getValues();
    }
}
