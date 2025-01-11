package Basic_of_Java;
public class PresentageMarks {
    public static void main(String[] args) {
        double hindi = 47;
        double sanskrit = 59;
        double math = 44;
        double science = 44;
        double social = 49;
        double total = hindi + sanskrit + math + science + social;
        // double percentage = (total / 500) * 100;
        double percentage = total / 5;
        System.out.println("Percentage is: " + percentage + "%");
    }
}
