package HomeWork_6.filling;

public class filling {
    /**
     * Метод производит подбор рандомных значений для заполнения пароля
     * @return пароль
     */
    public static   String passwordPerson() {
        int a = (int) (5+Math.random()*5);
        String pass = "";
        for (int i = 0; i < a; i++) {
            int n = (int)  (Math.random() * 10);
            pass +=  String.valueOf(n);
        }

        return pass;
    }

    /**
     * Метод производит подбор рандомных значений для заполнения псевдонима пользователя
     * @return псевдоним пользователя
     */
    public static String namesPerson() {
        String name = "";
        int a = (int) (3+Math.random()*5);
        for (int i = 0; i < 1; i++) {
            int n = (int) (65 + (Math.random() * 25));
            name = new String(String.valueOf((char)n));
            for (int j = 0; j < a; j++) {
                int s = (int) (97 + (Math.random() * 25));
                name += (char)s;
            }
        }
        return name;
    }

    /**
     * Метод производит подбор рандомных значений для заполнения возраста
     * @return возраст
     */
    public static int  ageAnimal() {
        int age = (int)  (1 +Math.random()*15);
       return age;
    }

    /**
     * Метод производит подбор рандомных значений для заполнения клички
     * @return кличка
     */
    public static String nameAnimal() {
        String name = "";
        int a = (int) (3+Math.random()*5);
        for (int i = 0; i < 1; i++) {
            int n = (int) (65 + (Math.random() * 25));
            name = new String(String.valueOf((char)n));
            for (int j = 0; j < a; j++) {
                int s = (int) (97 + (Math.random() * 25));
                name += (char)s;
            }
        }
        return name;
    }
}
