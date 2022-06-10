package uz.pdp.datarestjpatasks.repository;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestjpatasks.entity.Currency;
import uz.pdp.datarestjpatasks.entity.Output;
import uz.pdp.datarestjpatasks.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();
    Timestamp getDate();
    Warehouse getWarehouse();
    Currency getCurrency();
}
