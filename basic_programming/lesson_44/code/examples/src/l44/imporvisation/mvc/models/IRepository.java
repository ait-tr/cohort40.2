package l44.imporvisation.mvc.models;

public interface IRepository<T> {
    public T get(String id);

    void put(String id, T obj);
}
