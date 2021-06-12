package HomeWork_6;

public class Person {
    String nick;
    String password;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        controlInput(password);

    }

    public Person(String nick, String password) {
        this.nick = nick;
        controlInput(password);

    }
    public void controlInput(String password){
        int maxlength = 10;
        int minlength = 5;
        if ( password.length() >= minlength && password.length() <= maxlength){
            this.password = password;
        } else {
            this.password = null;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
