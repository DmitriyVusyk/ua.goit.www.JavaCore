package module5.dao;

import module5.dataBase.DataBase;
import module5.room.Room;

import java.util.List;

/**
 * Создать интерфейс dao и его реализацию.
 * Методы выводят название операции и объекта, над которым она произведена.
 * room save(room room)
 * boolean delete(room room)
 * room update(room room)
 * room findById(long id)
 */

public class RoomDAOImpl implements RoomDAO {

    DataBase dataBase;

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public DataBase getDataBase() {
        return dataBase;
    }

    public RoomDAOImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public Room save(Room room) {

        if (room != null) {
            dataBase.getDataBase().add(room);
            System.out.println("room: " + room.toString() + " was saved at dataBase.");
            return room;
        } else
            return  room;
    }

    @Override
    public boolean delete(Room room) {

        if (room != null) {
            dataBase.getDataBase().remove(room);
            System.out.println("room: " + room.toString() + " was deleted. ");
            return true;
        } else

            return false;
    }

    @Override
    public Room update(Room room) {

        if (room == null) {
            throw new NullPointerException();
        }

        int index = dataBase.getDataBase().indexOf(room);
        dataBase.getDataBase().set(index, room);

        System.out.println("room: " + room.toString() + " is updated.");

        return room;
    }

    @Override
    public Room findById(long id) {

        Room roomFromDB;

        for (int i = 0; i < dataBase.getDataBase().size(); i++) {
            long idFromDB = dataBase.getDataBase().get(i).getId();
            if (idFromDB == id) {
                roomFromDB = dataBase.getDataBase().get(i);
                return roomFromDB;
            }
        }

        System.out.println("room with id: " + id + " wasn't found");

        throw new IllegalArgumentException();
    }

    @Override
    public Room[] getAll() {
        List<Room> rooms = dataBase.getDataBase();
        return rooms.toArray(new Room[rooms.size()]);
    }
}
