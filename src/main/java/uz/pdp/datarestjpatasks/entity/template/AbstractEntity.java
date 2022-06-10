package uz.pdp.datarestjpatasks.entity.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    private boolean isActive = true;

    public AbstractEntity(String name, boolean isActive) {
        this.name = name;
        this.isActive = isActive;
    }

    public AbstractEntity(String name) {
        this.name = name;
    }
}
