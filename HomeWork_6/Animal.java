package HomeWork_6;


public class Animal  {

    int age;
    String nick;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int max = 15;
        int min = 1;
        if ( age >= min && age <= max) {
            this.age = age;
        } else {
            System.out.println("Допустипый возвраст от 1 до 15 лет");
        }

    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        controlInput(age);
    }

    public Animal(String nick, int age) {
        this.nick = nick;
        controlInput(age);
    }


    public void controlInput(int age){
        int max = 15;
        int min = 1;
        if ( age >= min && age <= max) {
            this.age = age;
        } else {
            System.out.println( "Animal " + nick + " Неверно введен возвраст");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }
}
