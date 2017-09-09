package module5.dataBase;

import module5.room.Room;

import java.util.ArrayList;
import java.util.List;

/**
 * here is our Database
 */
public class DataBase {

    private List<Room> dataBase = new ArrayList<>();

    public void setDataBase(List<Room> dataBase) {
        this.dataBase = dataBase;
    }

    public List<Room> getDataBase() {
        return dataBase;
    }

    @Override
    public String toString() {
        return "dataBase{" +
                "dataBase=" + dataBase +
                '}';
    }
}
