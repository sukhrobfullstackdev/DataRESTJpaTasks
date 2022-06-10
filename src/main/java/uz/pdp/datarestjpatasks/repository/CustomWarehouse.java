package uz.pdp.datarestjpatasks.repository;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestjpatasks.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    Integer getId();
    String getName();
    boolean isActive();
}
