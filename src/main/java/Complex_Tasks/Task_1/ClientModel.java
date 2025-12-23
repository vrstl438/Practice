package Complex_Tasks.Task_1;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@EqualsAndHashCode
public class ClientModel {
    private String name;
    private int countTicket;
    private LocalDate dateReservations;

    public ClientModel(String name, int countTicket, LocalDate dateReservations){
        this.name = name;
        this.countTicket = countTicket;
        this.dateReservations = dateReservations;
    }

    public ClientModel(String name, LocalDate dateReservations){
        this.name = name;
        this.dateReservations = dateReservations;
    }
}
