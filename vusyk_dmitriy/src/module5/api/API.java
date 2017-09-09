package module5.api;

import module5.dao.RoomDAO;
import module5.room.Room;

/**
 * Создайте api интерфейс с одним методом
 * room[] findRooms(int price, int persons, String city, String hotel)
 */
public interface API {

    RoomDAO getRoomDAO();

    Room[] findRooms(int price, int persons, String city, String hotel);
}
