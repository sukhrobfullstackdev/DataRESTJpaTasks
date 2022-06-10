package uz.pdp.datarestjpatasks.repository;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestjpatasks.entity.Input;
import uz.pdp.datarestjpatasks.entity.InputProduct;
import uz.pdp.datarestjpatasks.entity.Product;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();

    Product getProduct();

    double getAmount();

    double getPrice();

    Date getExpireDate();

    Input getInput();
}
