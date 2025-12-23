package Complex_Tasks.Task_1;

import Complex_Tasks.Task_1.Exeception.InvalidReservationException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    private List<ClientModel> reservationContainer = new ArrayList<>();

    public void addReservation(ClientModel client){
        reservationContainer.add(client);
    }

    public void deleteReservation(String name, LocalDate date){
        if (!reservationContainer.removeIf(clientModel -> clientModel.getName().equals(name) && clientModel.getDateReservations().equals(date))){
            throw new InvalidReservationException("Брони на это имя и дату не существует");
        }
    }

    public boolean checkReservationForNameClient(String name){
        return reservationContainer.stream()
                .anyMatch(clientModel -> clientModel.getName().equals(name));
    }

    public boolean checkReservationForDate(LocalDate date){
        return reservationContainer.stream()
                .anyMatch(clientModel -> clientModel.getDateReservations().equals(date));
    }
}