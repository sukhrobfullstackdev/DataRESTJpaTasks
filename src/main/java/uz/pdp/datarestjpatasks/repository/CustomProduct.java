package uz.pdp.datarestjpatasks.repository;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestjpatasks.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {
    CustomCategory getCategory();
    CustomAttachment getAttachment();
    String getCode();
    CustomMeasurement getMeasurement();
}
