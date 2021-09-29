package ua.lviv.iot.spring.rest.domain.implementation;



import ua.lviv.iot.spring.rest.domain.IGeneralModel;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Zone implements IGeneralModel {
    private Integer id;
    private Integer quantityRooms;
    private Double levelRange;


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
    @Column(name = "quantity_rooms")
    public Integer getQuantityRooms() {
        return quantityRooms;
    }

    public void setQuantityRooms(Integer quantityRooms) {
        this.quantityRooms = quantityRooms;
    }

    @Basic
    @Column(name = "range_level")
    public Double getLevelRange() {
        return levelRange;
    }

    public void setLevelRange(Double levelRange) {
        this.levelRange = levelRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zone zone = (Zone) o;
        return id.equals(zone.id) &&
                quantityRooms.equals(zone.quantityRooms) &&
                levelRange.equals(zone.levelRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantityRooms, levelRange);
    }

    @Override
    public String toString() {
        return "Zone{" +
                "id=" + id +
                ", quantity_rooms='" + quantityRooms +
                ", level_range=" + levelRange  +
                '}';
    }
}
