package uz.pdp.datarestjpatasks.repository;

import org.apache.tomcat.jni.Address;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestjpatasks.entity.Attachment;
import uz.pdp.datarestjpatasks.entity.AttachmentContent;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {
    Integer getId();
    byte[] getMainContent();
    Address getAddress();
}
