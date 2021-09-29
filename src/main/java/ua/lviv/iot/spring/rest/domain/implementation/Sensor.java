package ua.lviv.iot.spring.rest.domain.implementation;


import ua.lviv.iot.spring.rest.domain.IGeneralModel;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sensor", schema = "laboratorna5")
public class Sensor implements IGeneralModel {
    private Integer id;
    private Double processingTime;
    private String nameModel;
    private String typeSensor;
    private Integer calibration;
    private String classification;

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
    @Column(name = "processing_time")
    public Double getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(Double processingTime) {
        this.processingTime = processingTime;
    }

    @Basic
    @Column(name = "name_model")
    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    @Basic
    @Column(name = "type_sensor")
    public String getTypeSensor() {
        return typeSensor;
    }

    public void setTypeSensor(String typeSensor) {
        this.typeSensor = typeSensor;
    }

    @Basic
    @Column(name = "calibration")
    public Integer getCalibration() {
        return calibration;
    }

    public void setCalibration(Integer calibration) {
        this.calibration = calibration;
    }

    @Basic
    @Column(name = "classification")
    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sensor sensor = (Sensor) o;
        return id.equals(sensor.id) &&
                processingTime.equals(sensor.processingTime) &&
                nameModel.equals(sensor.nameModel) &&
                typeSensor.equals(sensor.typeSensor) &&
                calibration.equals(sensor.calibration) &&
                classification.equals(sensor.classification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, processingTime, nameModel, typeSensor, calibration, classification);
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", nameModel= '" + nameModel + '\'' +
                ", typeSensor='" + typeSensor + '\'' +
                ", calibration=" + calibration +
                ", classification='" + classification + '\'' +
                '}';
    }
}
