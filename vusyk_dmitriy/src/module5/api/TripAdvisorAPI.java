package module5.api;

import module5.dao.RoomDAOImpl;
import module5.dataBase.TripAdvisorDB;

/**
 * Создайте 3 реализации api, которые называются:
 * BookingComAPI,
 * TripAdvisorAPI,
 * GoogleAPI.
 * В каждой реализации есть глобальная переменная room[] rooms,
 * которая должна быть инициализована констуктором по умолчанию пятью разными объектами room.
 */

public class TripAdvisorAPI extends APIImpl {

    {
        roomDAO = new RoomDAOImpl(new TripAdvisorDB());
    }
}
