package ua.lviv.iot.spring.rest.domain.implementation;


import ua.lviv.iot.spring.rest.domain.IGeneralModel;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "system_alert", schema = "laboratorna5")
public class SystemAlert implements IGeneralModel {
    private Integer id;
    private Integer manyNotifications;
    private String textsNotifications;
    private String aboutProcessings;
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
    @Column(name = "many_notifications")
    public Integer getManyNotifications() {
        return manyNotifications;
    }

    public void setManyNotifications(Integer manyNotifications) {
        this.manyNotifications = manyNotifications;
    }

    @Basic
    @Column(name = "texts_notifications")
    public String getTextsNotifications() {
        return textsNotifications;
    }

    public void setTextsNotifications(String textsNotifications) {
        this.textsNotifications = textsNotifications;
    }

    @Basic
    @Column(name = "about_processings")
    public String getAboutProcessings() {
        return aboutProcessings;
    }

    public void setAboutProcessings(String aboutProcessings) {
        this.aboutProcessings = aboutProcessings;
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
        SystemAlert systemAlert = (SystemAlert) o;
        return id.equals(systemAlert.id)
                && manyNotifications.equals(systemAlert.manyNotifications)
                && textsNotifications.equals(systemAlert.textsNotifications)
                && aboutProcessings.equals(systemAlert.aboutProcessings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, manyNotifications, textsNotifications, aboutProcessings);
    }


    @Override
    public String toString() {
        return "SystemAlert{" +
                "id=" + id +
                ", many_notifications='" + manyNotifications +
                ", texts_notifications='" + textsNotifications + '\'' +
                ", about_processings='" + aboutProcessings + '\'' +
                ", system_id='" + systemId +
                '}';
    }
}
