package module5;

import module5.api.APIImpl;
import module5.api.API;
import module5.api.BookingComAPI;
import module5.api.GoogleAPI;
import module5.api.TripAdvisorAPI;
import module5.dao.RoomDAO;
import module5.dao.RoomDAOImpl;
import module5.dataBase.DataBase;
import module5.room.Room;

import java.util.*;

/**
 * Создайте класс Controller, в котором есть глобальная переменная api apis[] = new api[3],
 * которая содержит все реализации интерфейса api.
 * Также у Controller есть 2 метода:
 * room[] requstRooms(int price, int persons, String city, String hotel)
 * ищет все номера с запрашиваемыми параметрами.
 * <p>
 * Все методы используют доступные методы api для поиска.
 * Найденные номера формируют новую DB.
 * <p>
 * room[] check(api api1, api api2)
 * <p>
 * Проверить, сколько одинаковых номеров возвращают две разные api.
 * <p>
 * Add to Controller class methods which will do following operations with our DB emulator
 * room save(room room)
 * boolean delete(room room)
 * room update(room room)
 * room findById(long id)
 */

public class Controller {

    API apis[] = new API[3];

    {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    private RoomDAO roomDAO = new RoomDAOImpl( new DataBase());

    public Room[] requstRooms(int price, int persons, String city, String hotel) {

        List<Room> wantedRooms = new ArrayList<>();

        for (API api : apis) {
            Room[] foundedRooms = api.findRooms(price, persons, city, hotel);
            if (foundedRooms.length != 0) {
                wantedRooms.addAll(Arrays.asList(foundedRooms));
            }
        }
        for (Room room : wantedRooms ) {
            roomDAO.save(room);
        }


        return wantedRooms.toArray(new Room[wantedRooms.size()]);
    }

    public Room[] check(API api1, API api2) {

        List<Room> repetitiveRooms = new ArrayList<>();

        Room[] a;
        a = api1.getRoomDAO().getAll();

        List<Room> b = new ArrayList<>();

        Room[] roomsArray = api2.getRoomDAO().getAll();
        Collections.addAll(b, roomsArray);

        for (Room room : a) {
            if (b.contains(room)) {
                repetitiveRooms.add(room);
            }
        }

        return repetitiveRooms.toArray(new Room[repetitiveRooms.size()]);
    }

    public Room save(Room room, APIImpl api){
        return api.getRoomDAO().save(room);
    }

    public boolean delete(Room room, APIImpl api) {
        return api.getRoomDAO().delete(room);
    }

    public Room update(Room room, APIImpl api) {
        return api.getRoomDAO().update(room);
    }

    public Room findById(long id, APIImpl api) {
        return api.getRoomDAO().findById(id);
    }
}
