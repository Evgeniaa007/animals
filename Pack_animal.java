import java.time.LocalDate;

public class Pack_animal extends Animal {

    public Pack_animal(String name, LocalDate birthDate) {
        super(name, birthDate);
        
    }

    @Override
    public String toString() {
        return String.format("Вьючное животное. Имя: %s, Дата рождения: %t", getName(), getBirthDate());
    }

}