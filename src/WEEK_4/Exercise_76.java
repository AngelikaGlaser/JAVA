package WEEK_4;

public class Exercise_76 {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.addMeal("Hamburger");
        menu.addMeal("Fish 'n' Chips");
        menu.addMeal("Sauerkraut");
        menu.printMeals();
        menu.clearMenu();
        menu.printMeals();
    }
}
