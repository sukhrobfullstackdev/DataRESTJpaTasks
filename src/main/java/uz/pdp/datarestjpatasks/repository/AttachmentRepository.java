package uz.pdp.datarestjpatasks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarestjpatasks.entity.Attachment;

@RepositoryRestResource(path = "attachment", excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends CrudRepository<Attachment, Integer> {
}
