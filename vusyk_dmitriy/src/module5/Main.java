package module5;

import module5.api.*;
import module5.dao.RoomDAO;
import module5.dao.RoomDAOImpl;
import module5.dataBase.DataBase;
import module5.room.Room;

import java.util.*;

/**
 * В методе класса Main создайте Controller
 * и сделайте 3 запроса с разными параметрами, чтобы найти номера.
 * Также проверьте все методы 3 раза с разными api,
 * чтобы продемонстрировать, как работает программа.
 */

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        API api1 = new BookingComAPI();
        API api2 = new GoogleAPI();
        API api3 = new TripAdvisorAPI();

        Main main = new Main();

        RoomDAOImpl roomDAO = new RoomDAOImpl(new DataBase());

        System.out.println("BookingCom");
        main.print(api1.getRoomDAO().getAll());

        System.out.println("Google");
        main.print(api2.getRoomDAO().getAll());

        System.out.println("TripAdvisor");
        main.print(api3.getRoomDAO().getAll());

        System.out.println("This room is identical in BookingCom and Google: ");
        System.out.println(Arrays.toString(controller.check(api1, api2)));

        System.out.println("Request: price 22, person 2, city \"Lviv\" ");
        controller.requstRooms(22, 2, "Lviv", "Hotel");
        main.print(roomDAO.getAll());


    }

    private void print(Room[] rooms) {
        System.out.println("Database: (" + rooms.length + " lines)");
        Arrays.stream(rooms).forEach(System.out::println);
    }
}
