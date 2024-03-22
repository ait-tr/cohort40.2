package movieCollection.models;

import movieCollection.Utils;

import java.util.Objects;

public class Movie implements Comparable<Movie> {
    private long id; //Значение поля должно быть больше 0,
    // Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String movieName; //Поле не может быть null, Строка не может быть пустой
    //@Tatjana поменяла имя поля, чтобы не было повтора с name из класса Person
    private MovieGenre genre; //Поле может быть null
    private Person screenwriter;

    private static int counter = 0;

    public Movie(String movieName, MovieGenre genre, Person screenwriter) {
        this.movieName = movieName;
        this.genre = genre;
        this.screenwriter = screenwriter;
        Movie.counter++;
        this.id = 918291822 + Movie.counter; //автоматическая генерация id
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) { // проверка movieName:

        if (movieName.equals(null)) {
            System.out.println("Поле не может быть NULL");
        } else if (movieName.equals("")) {
            System.out.println("Строка не может быть пустой");
        } else {
            this.movieName = movieName;
        }
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public Person getScreenwriter() {
        return screenwriter;
    }

    public void setScreenwriter(Person screenwriter) {
        this.screenwriter = screenwriter;
    }
    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return  "Movie " +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", genre=" + genre +
                ", screenwriter=" + screenwriter +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return getId() == movie.getId() && Objects.equals(getMovieName(), movie.getMovieName())
                && getGenre() == movie.getGenre() && Objects.equals(getScreenwriter(), movie.getScreenwriter());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMovieName(), getGenre(), getScreenwriter());
    }


    @Override
    public int compareTo(Movie o) {// переопределяем метод, приводим результат к int
        return (int)(this.getId() - o.getId());
    }

    public String getCSVLine() {
        return id + ";" +
                movieName + ";" +
                genre.name() + ";" +
                screenwriter.getName() + ";" +
                screenwriter.getGender();
    }

    public Movie(Long id, String movieName, MovieGenre genre, String personName, boolean isPersonMan) throws Exception {
        if (!validateId(id)) {
            throw new Exception("ID is not correct");
        }

        this.movieName = movieName;
        this.genre = genre;
        this.screenwriter = new Person(personName, isPersonMan);
        Movie.counter++;
        this.id = id;
    }

    public static Movie parseFromCSV(String line) {
        // "918291832;Приключения Электроника;ADVENTURE;Евгений Велтистов;true"
        String[] parts = line.split(";");

        if (!Utils.isInt(parts[0])) {
            return null;
        }
        Long id = Long.parseLong(parts[0]);

        if (!Utils.isEnum(parts[2], MovieGenre.class)) {
            return null;
        }
        MovieGenre genre = MovieGenre.valueOf(parts[2]);

        if (!Utils.isBoolean(parts[4])) {
            return null;
        }
        boolean gender = Boolean.parseBoolean(parts[4]);

        try {
            Movie movie = new Movie(
                    id,
                    parts[1],
                    genre,
                    parts[3],
                    gender
            );
            return movie;
        } catch (Exception e) {
            return null;
        }
    }

    public static boolean validateId(Long value) {
        return value > 0;
    }
}

