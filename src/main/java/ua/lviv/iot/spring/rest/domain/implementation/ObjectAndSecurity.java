package ua.lviv.iot.spring.rest.domain.implementation;


import ua.lviv.iot.spring.rest.domain.IGeneralModel;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "object_and_security", schema = "laboratorna5")
public class ObjectAndSecurity implements IGeneralModel {
    private Integer id;
    private String location;

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
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectAndSecurity objectAndSecurity = (ObjectAndSecurity) o;
        return id.equals(objectAndSecurity.id) &&
                location.equals(objectAndSecurity.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, location);
    }

    @Override
    public String toString() {
        return "ObjectAndSecurity{" +
                "id=" + id +
                ", location='" + location + '\'' +
                '}';
    }
}
