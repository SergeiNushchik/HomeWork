package HomeWork_6.supplier;

import HomeWork_6.dto.Animal;
import HomeWork_6.dto.Person;

import java.util.function.Supplier;

import static HomeWork_6.filling.Filling.*;

public class AnimalSupplierAuto implements Supplier<Animal> {
    @Override
    public Animal get() {
        return
                new Animal(nameAnimal(), ageAnimal());
    }
}
