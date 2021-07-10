package HomeWork_6.dto;


import java.util.Comparator;

public class Animal  implements Comparable<Animal> {

    private int age;
    private String nick;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
            this.age = age;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
       this.age= age;
    }

    public Animal(String nick, int age) {
        this.nick = nick;
        this.age = age;
    }




    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }


    @Override
    public int compareTo(Animal o) {
        return 1;
    }
}
