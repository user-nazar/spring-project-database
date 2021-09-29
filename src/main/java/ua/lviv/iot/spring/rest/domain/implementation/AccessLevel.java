package ua.lviv.iot.spring.rest.domain.implementation;


import ua.lviv.iot.spring.rest.domain.IGeneralModel;

import javax.persistence.*;

@Entity
@Table(name = "access_level", schema = "laboratorna5")
public class AccessLevel implements IGeneralModel {
    private Integer id;
    private double rangeSensor;
    private double resolution;

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
    @Column(name = "rangeSensor")
    public double getRangeSensor() {
        return rangeSensor;
    }

    public void setRangeSensor(double rangeSensor) {
        this.rangeSensor = rangeSensor;
    }

    @Basic
    @Column(name = "resolution")
    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }


    @Override
    public String toString() {
        return "AccessLevel{" +
                "id=" + id +
                ", range_sensor='" + rangeSensor + '\'' +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}
