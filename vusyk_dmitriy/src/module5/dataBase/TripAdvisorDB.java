package module5.dataBase;

import module5.room.Room;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


/**
 * Database from Tripadvisor
 */
public class TripAdvisorDB extends DataBase {

    private List<Room> tripAdvisorDB = new ArrayList<>();

    {
        setDataBase(tripAdvisorDB);
        tripAdvisorDB.add(new Room(10, 74, 2, new GregorianCalendar(2017, 2, 21).getTime(),
                "Staro Hotel", "Kyiv"));
        tripAdvisorDB.add(new Room(20, 58, 2, new GregorianCalendar(2017, 3, 2).getTime(),
                "Nasha Dacha", "Kharkiv"));
        tripAdvisorDB.add(new Room(30, 128, 2, new GregorianCalendar(2016, 12, 27).getTime(),
                "Frederic Koklen", "Odessa"));
        tripAdvisorDB.add(new Room(40, 51, 2, new GregorianCalendar(2017, 1, 4).getTime(),
                "Swiss Hotel", "Lviv"));
        tripAdvisorDB.add(new Room(50, 25, 2, new GregorianCalendar(2017, 3, 6).getTime(),
                "Fenix", "Vinnytsya"));
    }
}
