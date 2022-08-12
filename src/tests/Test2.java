package tests;

public class Test2 {
    public static void main(String[] args) {
        Integer value = 1;
        increment(value);
        System.out.println(value);
    }

    /*եթե մեթոդին արգումենտներով օբյեկտ ենք տալիս, այն չի աշխատում հենց այդ օբյեկտի հետ,
     այլ իր համար քոփի է անում այդ օբյեկտից ու դրա վրա աշխատեւմ */

    static void increment(Integer value) {
        ++value;
        //System.out.println(value);
    }
}
