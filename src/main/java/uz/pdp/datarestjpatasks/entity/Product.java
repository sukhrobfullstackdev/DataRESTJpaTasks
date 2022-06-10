package uz.pdp.datarestjpatasks.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.datarestjpatasks.entity.template.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends AbstractEntity {
    @ManyToOne(optional = false)
    private Category category;
    @OneToOne
    private Attachment attachment;
    @Column(nullable = false,unique = true)
    private String code;
    @ManyToOne(optional = false)
    private Measurement measurement;
}
