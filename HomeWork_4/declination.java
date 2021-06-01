package HomeWork_4;

public class declination {
    public static void main(String[] args) {

        long millisecond = 7789001;
        boolean shortFormat = true;


        String result = new String();
        int hose = (int) (millisecond / 3600000);
        int mill1 = (int) (millisecond % 3600000);
        String hoses = String.format("%02d", hose);

        int min = (int) (mill1 / 60000);
        int mill2 = (int) (mill1 % 60000);
        String mins = String.format("%02d", min);

        int second = (int) (mill2 / 1000);
        int mill3 = (int) (mill2 % 1000);
        String seconds = String.format("%02d", second);
        String mills = String.format("%03d", mill3);



        if (shortFormat == true){
            result += hoses + ":" + mins + ":" + seconds + ":" + mills;
            System.out.println(result);

        }else {


        }
    }
}
