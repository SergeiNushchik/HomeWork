package HomeWork_6.dto;

import java.util.Comparator;

public class Person implements Comparable<Person>{
    private String nick;
    private String password;

    /**
     * Метод вывода псевдоним пользователя
     * @return
     */
    public String getNick() {
        return nick;
    }

    /**
     * Метод присваевания псевдоним пользователя
     * @param nick имя животного
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * Метод вывода пароль
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * Метод присваевания пароля
     * @param password пароль
     */
    public void setPassword(String password) {
        this.password =password;


    }

    public Person(String nick, String password) {
        this.nick = nick;
        this.password = password;

    }


    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                '}';
    }



    @Override
    public int compareTo(Person o) {
        return 1;
    }
}
