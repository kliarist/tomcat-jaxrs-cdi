package resources;

import beans.product.IProductService;
import beans.product.model.Product;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by ubayrak on 16/12/16.
 */
@Path("hello")
public class HelloResource {

    @Inject
    IProductService productService;

    @GET
    public Product helloGet(){
        return productService.sayHello();
    }
}
