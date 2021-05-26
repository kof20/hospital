package hospital.service;

public interface FindByNameService<T> {

    T findByName(String name);
}
