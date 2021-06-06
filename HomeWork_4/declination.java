package HomeWork_4;

public class declination {

     public static String  sortHoses(int item){
        String declination = "Ошибка распознаваня ";
            String[] mhoses = {"час", "часа", "часов"};

         int result = item % 10;
             switch (result) {
                 case 1:
                     declination = mhoses[0];
                     break;
                 case 2:
                     declination = mhoses[1];
                     break;
                 case 3:
                     declination = mhoses[1];
                     break;
                 case 4:
                     declination = mhoses[1];
                     break;
                 case 5:
                     declination = mhoses[2];
                     break;
                 case 6:
                     declination = mhoses[2];
                     break;
                 case 7:
                     declination = mhoses[2];
                     break;
                 case 8:
                     declination = mhoses[2];
                     break;
                 case 9:
                     declination = mhoses[2];
                     break;
                 case 0:
                     declination = mhoses[2];
                     break;

             }
             return declination;


     }

    public static String  sortMin(int item){
        String declination = "Ошибка распознаваня ";
         String[] mminss = {"минута", "минут", "минуты"};

        int result = item % 10;
        switch (result){
            case 1:
                declination = mminss[0];
                break;
            case 2:
                declination = mminss[2];
                break;
            case 3:
                declination = mminss[2];
                break;
            case 4:
                declination = mminss[2];
                break;
            case 5:
                declination = mminss[1];
                break;
            case 6:
                declination = mminss[1];
                break;
            case 7:
                declination = mminss[1];
                break;
            case 8:
                declination = mminss[1];
                break;
            case 9:
                declination = mminss[1];
                break;
            case 0:
                declination = mminss[1];
                break;

        }
        return declination;
    }

    public static String  sortSecond(int item){
        String declination = "Ошибка распознаваня ";
        String[] mseconds = {"секунда", "секунды", "секунд"};
        int result = item % 10;
        switch (result){
            case 1:
                declination = mseconds[0];
                break;
            case 2:
                declination = mseconds[1];
                break;
            case 3:
                declination = mseconds[1];
                break;
            case 4:
                declination = mseconds[1];
                break;
            case 5:
                declination = mseconds[2];
                break;
            case 6:
                declination = mseconds[2];
                break;
            case 7:
                declination = mseconds[2];
                break;
            case 8:
                declination = mseconds[2];
                break;
            case 9:
                declination = mseconds[2];
                break;
            case 0:
                declination = mseconds[2];
                break;
        }
        return declination;
    }

    public static String  sortMills(int item){
        String declination = "Ошибка распознаваня ";
        String[] mmills = {"миллисекунда", "миллисекунды", "миллисекунд"};
        int result = item % 10;
        switch (result){
            case 1:
                declination = mmills[0];
                break;
            case 2:
                declination = mmills[1];
                break;
            case 3:
                declination = mmills[1];
                break;
            case 4:
                declination = mmills[1];
                break;
            case 5:
                declination = mmills[2];
                break;
            case 6:
                declination = mmills[2];
                break;
            case 7:
                declination = mmills[2];
                break;
            case 8:
                declination = mmills[2];
                break;
            case 9:
                declination = mmills[2];
                break;
            case 0:
                declination = mmills[2];
                break;
        }
        return declination;
    }
}
