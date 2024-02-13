package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._04_factory_method.example.framework;

public abstract class Factory {

    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
