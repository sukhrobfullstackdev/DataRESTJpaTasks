package uz.pdp.datarestjpatasks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarestjpatasks.entity.AttachmentContent;

@RepositoryRestResource(path = "attachmentContent",excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository extends CrudRepository<AttachmentContent,Integer> {

}
