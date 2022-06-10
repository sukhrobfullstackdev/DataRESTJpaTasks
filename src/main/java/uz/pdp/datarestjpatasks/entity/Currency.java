package uz.pdp.datarestjpatasks.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.datarestjpatasks.entity.template.AbstractEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
public class Currency extends AbstractEntity {
    public Currency(String name, boolean isActive) {
        super(name, isActive);
    }

    public Currency(String name) {
        super(name);
    }
}
