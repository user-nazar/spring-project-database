package ua.lviv.iot.spring.rest.domain.implementation;


import ua.lviv.iot.spring.rest.domain.IGeneralModel;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class SystemControl implements IGeneralModel {
    private Integer id;
    private Integer quantityControlProcessings;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "quantity_control_processings")
    public Integer getQuantityControlProcessings() {
        return quantityControlProcessings;
    }

    public void setQuantityControlProcessings(Integer quantityControlProcessings) {
        this.quantityControlProcessings = quantityControlProcessings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemControl systemControl = (SystemControl) o;
        return id.equals(systemControl.id) &&
                quantityControlProcessings.equals(systemControl.quantityControlProcessings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantityControlProcessings);
    }


    @Override
    public String toString() {
        return "SystemControl{" +
                "id=" + id +
                ", quantity_control_processings='" + quantityControlProcessings +
                '}';
    }
}
