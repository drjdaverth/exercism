import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
        this.birthDateTime = birthDate.atTime(0, 0); // Everyone born at midnight!
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
        return birthDateTime.plusSeconds(1000000000);
    }

}
