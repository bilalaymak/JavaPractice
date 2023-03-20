package step03.generics.repositoryDemo;

public class ProductDal implements IEntityRepository<Product>{
    @Override
    public void addEntity(Product entity) {

    }

    @Override
    public void updateEntity(Product entity) {

    }

    @Override
    public void deleteEntity(Product entity) {

    }
}

         //"IEntityRepository<Product>" <Product> is "generic constraints"
         //just like <String> in the ArrayList<String> arr = new ArrayList<String>();

