package uz.pdp.datarestjpatasks.repository;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestjpatasks.entity.Currency;
import uz.pdp.datarestjpatasks.entity.Input;
import uz.pdp.datarestjpatasks.entity.Supplier;
import uz.pdp.datarestjpatasks.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();
    Timestamp getDate();
    Warehouse getWarehouse();
    Supplier getSupplier();
    Currency getCurrency();
    String getFacture_number();
    String getCode();
}
