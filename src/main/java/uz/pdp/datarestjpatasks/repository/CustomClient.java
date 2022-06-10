package uz.pdp.datarestjpatasks.repository;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestjpatasks.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();
    String getName();
    String getPhoneNumber();
}
