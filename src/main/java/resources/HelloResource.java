package resources;

import beans.product.IProductService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by ubayrak on 16/12/16.
 */
@Path("hello")
public class HelloResource {

    @Inject
    IProductService productService;

    @GET
    public String helloGet(){
        return productService.sayHello();
    }
}
