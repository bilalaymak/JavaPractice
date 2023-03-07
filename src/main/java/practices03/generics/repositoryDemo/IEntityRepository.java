package practices03.generics.repositoryDemo;

public interface IEntityRepository<T extends IEntity > {
    //in generics, we do not implement interfaces, we extend them

    void addEntity(T entity);
    void updateEntity(T entity);
    void deleteEntity(T entity);










}
