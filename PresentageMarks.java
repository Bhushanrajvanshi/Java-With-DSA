public class PresentageMarks {
    public static void main(String[] args) {
        double hindi = 75;
        double english = 80;
        double math = 85;
        double science = 90;
        double social = 95;
        double total = hindi + english + math + science + social;
        double percentage = (total / 500) * 100;
        System.out.println("Percentage is: " + percentage + "%");
    }
}
