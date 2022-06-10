package uz.pdp.datarestjpatasks.repository;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestjpatasks.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();
    String getName();
    boolean isActive();
    String getPhoneNumber();
}
