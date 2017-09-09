package module5.dataBase;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import module5.room.Room;


/**
 * представим что это сервер BookingCom у него своя личная база данных.
 */
public class BookingComDB extends DataBase {

    private List<Room> bookingComDB = new ArrayList<>();

    {

        setDataBase(bookingComDB);
        bookingComDB.add(new Room(1000, 118, 2, new GregorianCalendar(2017, 1, 16).getTime(),
                "City Hotel", "Kiev"));
        bookingComDB.add(new Room(1001, 67, 2, new GregorianCalendar(2017, 2, 22).getTime(),
                "Hotel 19", "Kharkiv"));
        bookingComDB.add(new Room(1002, 84, 2, new GregorianCalendar(2016, 12, 29).getTime(),
                "Nemo Spa Hotel", "Odessa"));
        bookingComDB.add(new Room(1003, 22, 2, new GregorianCalendar(2017, 2, 12).getTime(),
                "Lviv Central Jam Hotel", "Lviv"));
        bookingComDB.add(new Room(1004, 22, 2, new GregorianCalendar(2017, 3, 2).getTime(),
                "Aristokrat", "Vinnytsya"));
    }

}
