package uz.pdp.datarestjpatasks.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.datarestjpatasks.entity.template.AbstractEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Measurement extends AbstractEntity {}
