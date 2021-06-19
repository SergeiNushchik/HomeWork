package HomeWork_6.dto;


public class Animal  {

    int age;
    String nick;

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
}
