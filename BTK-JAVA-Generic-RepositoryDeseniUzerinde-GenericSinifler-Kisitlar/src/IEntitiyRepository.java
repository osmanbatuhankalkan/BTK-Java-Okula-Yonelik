//GENERİCLER sadece classlar içindeğil interfaceler içinde kullanılabilir.
public interface IEntitiyRepository<T extends IEntity > {//Generic kısıtları kullanırken implemente ettirmiyor extends yazdırıyor.

    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
