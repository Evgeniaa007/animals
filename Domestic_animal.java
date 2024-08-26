import java.time.LocalDate;

public class Domestic_animal extends Animal{

    public Domestic_animal(String name, LocalDate birthDate) {
        super(name, birthDate);
    }
    
    @Override
    public String toString() {
        return String.format("Домашнее животное. Имя: %s, Дата рождения: %t", getName(), getBirthDate());
    }

}
