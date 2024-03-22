package movieCollection.models;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MovieRepository {
    private HashMap<Long, Movie> map;

    public MovieRepository() {
        this.map = new HashMap<>();
    }

    public Collection<Movie> getValues() {
        return map.values();
    }

    public void add(Movie movie) {
        map.put(movie.getId(), movie);
    }

    public Movie getById(Long id) {
        return map.get(id);
    }

    public int size() {
        return this.map.size();
    }

    public boolean containsKey(long idValue) {
        return this.map.containsKey(idValue);
    }

    public void remove(long idValue) {
        this.map.remove(idValue);
    }

    public void clear() {
        this.map.clear();
    }

    public Set<Long> getIdSet() {
        return this.map.keySet();
    }
}
