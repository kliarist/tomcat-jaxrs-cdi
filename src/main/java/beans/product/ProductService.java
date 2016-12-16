package beans.product;

import beans.product.model.Product;

import javax.enterprise.inject.Default;
import javax.inject.Named;

/**
 * Created by ubayrak on 16/12/16.
 */
@Default
@Named
public class ProductService implements IProductService {
    public Product sayHello(){
        return new Product("new Product");
    }
}
