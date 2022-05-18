package chapters.chapter5;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "ձմեռային";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "գարնանային";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "ամառային";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "աշնանային";
        } else {
            season = "այդպիսի ամիս չկա";
        }
        System.out.println("Ապրիլը համարվում է "
                + season + " ամիս:");
    }
}


