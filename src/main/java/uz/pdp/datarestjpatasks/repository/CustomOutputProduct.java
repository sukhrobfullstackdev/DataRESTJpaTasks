package uz.pdp.datarestjpatasks.repository;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestjpatasks.entity.Output;
import uz.pdp.datarestjpatasks.entity.OutputProduct;
import uz.pdp.datarestjpatasks.entity.Product;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();

    Product getProduct();

    double getAmount();

    double getPrice();

    Output getOutput();
}
