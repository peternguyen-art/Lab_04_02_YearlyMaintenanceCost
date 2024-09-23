public class Main {
    public static void main(String[] args) {
        Double spring = 328.88;
        Double summer = 178.02;
        Double fall = 234.59;
        Double winter = 402.75;
        Double sum = 0.0;
        System.out.println("This is program to calculate user's yearly House Maintenance Cost.");
        System.out.println("Cost for Spring Maintenance is: "+spring);
        System.out.println("Cost for Summer Maintenance is: "+summer);
        System.out.println("Cost for Fall Maintenance is: "+fall);
        System.out.println("Cost for Winter Maintenance is: "+winter);
        sum = spring + summer + fall + winter;
        System.out.println("Your yearly Home Maintenance cost is: "+sum);
    }
}