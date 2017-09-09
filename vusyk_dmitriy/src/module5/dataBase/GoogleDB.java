package module5.dataBase;


import module5.room.Room;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by dmytrovusyk on 06.03.17.
 */
public class GoogleDB extends DataBase {

    private List<Room> googleDB = new ArrayList<>();

    {
        setDataBase(googleDB);
        googleDB.add(new Room(1, 97, 2, new GregorianCalendar(2016, 11, 30).getTime(),
                "Podol Plasa", "Kiev"));
        googleDB.add(new Room(2, 30, 2, new GregorianCalendar(2017, 1, 2).getTime(),
                "Ovis Hotel", "Kharkiv"));
        googleDB.add(new Room(3, 39, 2, new GregorianCalendar(2017, 2, 24).getTime(),
                "Aivazovski", "Odessa"));
        googleDB.add(new Room(4, 22, 2, new GregorianCalendar(2016, 12, 18).getTime(),
                "Euro Hotel", "Lviv"));
        googleDB.add(new Room(5, 26, 2, new GregorianCalendar(2017, 3, 6).getTime(),
                "Harvest", "Vinnytsya"));
    }

}
