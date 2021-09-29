package ua.lviv.iot.spring.rest.domain.implementation;


import ua.lviv.iot.spring.rest.domain.IGeneralModel;

import javax.persistence.*;

@Entity
public class SensorSettings implements IGeneralModel {
    private Integer id;
    private Double sensorRange;
    private Double sensorResolution;
    private SystemControl systemId;

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
    @Column(name = "sensor_range")
    public Double getSensorRange() {
        return sensorRange;
    }

    public void setSensorRange(Double sensorRange) {
        this.sensorRange = sensorRange;
    }

    @Basic
    @Column(name = "sensor_resolution")
    public Double getSensorResolution() {
        return sensorResolution;
    }

    public void setSensorResolution(Double sensorResolution) {
        this.sensorResolution = sensorResolution;
    }


    @ManyToOne
    @JoinColumn(name = "system_id", referencedColumnName = "id", nullable = false)
    public SystemControl getSystemId() {
        return this.systemId;
    }

    public void setSystemId(SystemControl systemId) {
        this.systemId = systemId;
    }


    @Override
    public String toString() {
        return "SensorSettings{" +
                "id=" + id +
                ", sensor_range='" + sensorRange +
                ", sensor_resolution='" + sensorResolution +
                ", system_id=" + systemId +
                '}';
    }
}
