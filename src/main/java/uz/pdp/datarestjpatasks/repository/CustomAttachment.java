package uz.pdp.datarestjpatasks.repository;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestjpatasks.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();
    String getName();
    long getSize();
    String getContentType();
}
