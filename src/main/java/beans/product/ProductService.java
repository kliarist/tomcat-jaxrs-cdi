package beans.product;

import javax.enterprise.inject.Default;
import javax.inject.Named;

/**
 * Created by ubayrak on 16/12/16.
 */
@Default
@Named
public class ProductService implements IProductService {
    public String sayHello(){
        return "hello from prduct";
    }
}
