package ua.lviv.iot.spring.rest.domain.implementation;


import ua.lviv.iot.spring.rest.domain.IGeneralModel;

import javax.persistence.*;

@Entity
@Table(name = "sensor_notification", schema = "laboratorna5")
public class SensorNotification implements IGeneralModel {
    private Integer id;
    private Double rangeLevel;
    private Double resolutionLevel;
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
    @Column(name = "range_level")
    public Double getRangeLevel() {
        return rangeLevel;
    }

    public void setRangeLevel(Double rangeLevel) {
        this.rangeLevel = rangeLevel;
    }

    @Basic
    @Column(name = "resolution_level")
    public Double getResolutionLevel() {
        return resolutionLevel;
    }

    public void setResolutionLevel(Double resolutionLevel) {
        this.resolutionLevel = resolutionLevel;
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
        return "SensorNotification{" +
                "id=" + id +
                " range_level=" + rangeLevel +
                " resolution_level=" + resolutionLevel +
                ", system_id=" + systemId +
                '}';
    }
}
