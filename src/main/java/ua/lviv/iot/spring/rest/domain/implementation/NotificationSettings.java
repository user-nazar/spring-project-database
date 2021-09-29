package ua.lviv.iot.spring.rest.domain.implementation;


import ua.lviv.iot.spring.rest.domain.IGeneralModel;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "notification_settings", schema = "laboratorna5")
public class NotificationSettings implements IGeneralModel {
    private Integer id;
    private Double controlAccessLevel;
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
    @Column(name = "control_access_level")
    public double getControlAccessLevel() {
        return controlAccessLevel;
    }

    public void setControlAccessLevel(double controlAccessLevel) {
        this.controlAccessLevel = controlAccessLevel;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationSettings notificationSettings = (NotificationSettings) o;
        return id.equals(notificationSettings.id) &&
                controlAccessLevel.equals(notificationSettings.controlAccessLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, controlAccessLevel);
    }

    @Override
    public String toString() {
        return "NotificationSettings{" +
                "id=" + id +
                ", control_access_level='" + controlAccessLevel +
                ", system_id='" + systemId +
                '}';
    }
}
