package beans.product.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by ubayrak on 16/12/16.
 */
@XmlRootElement(name = "Product")
public class Product implements Serializable {

    public Product() {
    }

    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
