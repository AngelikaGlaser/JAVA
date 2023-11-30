package WEEK_8.Ex_10;

public class Exercise_10 {
    public static void main(String[] args) {
        CivilService civilService = new CivilService();
        MilitaryService militaryService = new MilitaryService(200);

        // Testing CivilService
        System.out.println("CivilService - Initial days left: " + civilService.getDaysLeft());
        civilService.work();
        System.out.println("CivilService - Days left after work: " + civilService.getDaysLeft());

        // Testing MilitaryService
        System.out.println("MilitaryService - Initial days left: " + militaryService.getDaysLeft());
        militaryService.work();
        System.out.println("MilitaryService - Days left after work: " + militaryService.getDaysLeft());
    }
}
