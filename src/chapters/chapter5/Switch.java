package chapters.chapter5;

public class Switch {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "ձմեռային";
                break;
            case 3:
            case 4:
            case 5:
                season = "գարնանային";
                break;
            case 6:
            case 7:
            case 8:
                season = "ամառային";
                break;
            case 9:
            case 10:
            case 11:
                season = "աշնանային";
                break;
            default:
                season = "գոյություն չունեցող";
        }
        System.out.println("Ապրիլը " + season + " ամիս է");
    }
}

