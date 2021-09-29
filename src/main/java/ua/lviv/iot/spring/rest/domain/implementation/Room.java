package ua.lviv.iot.spring.rest.domain.implementation;


import ua.lviv.iot.spring.rest.domain.IGeneralModel;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "room", schema = "laboratorna5")
public class Room implements IGeneralModel {
    private Integer id;
    private String nameRoom;
    private Double square;

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
    @Column(name = "nameRoom")
    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    @Basic
    @Column(name = "square")
    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return id.equals(room.id) &&
                nameRoom.equals(room.nameRoom) &&
                square.equals(room.square);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameRoom, square);
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name_room='" + nameRoom + '\'' +
                ", square='" + square +
                '}';
    }
}
