package dao;

public interface iDao<T> {
    //Metodos abstractos. En el caso de tener atributos deben estar como constantes.
    //El famoso CRUD o ABM

    T guardar(T t);
    T buscar (int id);

    //T eliminar(int id);
    //T actualizar(int id);
}
