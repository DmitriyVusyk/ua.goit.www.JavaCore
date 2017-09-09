package module5.dao;

import module5.dataBase.DataBase;
import module5.room.Room;

/**
 * Создать интерфейс dao и его реализацию.
 * Методы выводят название операции и объекта, над которым она произведена.
 * room save(room room)
 * boolean delete(room room)
 * room update(room room)
 * room findById(long id)
 * <p>
 * room[] getAll() - return array of all rooms that are in our DB array
 */

public interface RoomDAO {

    public DataBase getDataBase();

    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);

    Room[] getAll();

}
