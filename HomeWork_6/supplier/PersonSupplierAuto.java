package HomeWork_6.supplier;

import HomeWork_6.dto.Person;

import java.util.function.Supplier;

import static HomeWork_6.filling.Filling.namesPerson;
import static HomeWork_6.filling.Filling.passwordPerson;

public class PersonSupplierAuto implements Supplier<Person> {
    @Override
    public Person get() {
        return
                new Person(namesPerson(), passwordPerson());
    }
}
