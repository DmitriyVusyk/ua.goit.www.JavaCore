package module5.api;

import module5.dao.RoomDAO;

import module5.room.Room;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmytrovusyk on 11.03.17.
 */
public abstract class APIImpl implements API{

    protected RoomDAO roomDAO;

    @Override
    public RoomDAO getRoomDAO() {
        return roomDAO;
    }

    public void setRoomDAO(RoomDAO roomDAO) {
        this.roomDAO = roomDAO;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        List<Room> foundedRooms = new ArrayList<>();
        Room room = new Room();

        room.setPrice(price);
        room.setPersons(persons);
        room.setCityName(city);

        Room[] rooms = roomDAO.getAll();

        for (Room iRoom : rooms) {
            if (iRoom.equals(room)) {
                foundedRooms.add(iRoom);
            }
        }
        return foundedRooms.toArray(new Room[foundedRooms.size()]);
    }
    }

