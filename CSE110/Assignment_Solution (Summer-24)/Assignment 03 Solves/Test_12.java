import java.util.*;
    class one {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount the customer need to pay(Taka)");
        int need_to_pay = sc.nextInt();
        System.out.println("Enter the amount, customer gave(Taka)");
        int the_amount = sc.nextInt();
        int money_available = (the_amount - need_to_pay);
        if (money_available > 0) {
            System.out.println("The returned amount is " + money_available + " taka.");
            System.out.println("100 taka note: " + money_available / 100);
            money_available %= 100;
            System.out.println("50 taka note: " + money_available / 50);
            money_available %= 50;
            System.out.println("20 taka note: " + money_available / 20);
            money_available %= 20;
            System.out.println("10 taka note: " + money_available / 10);
            money_available %= 10;
            System.out.println("5 taka coin: " + money_available / 5);
            money_available %= 5;
            System.out.println("2 taka coin: " + money_available / 2);
            money_available %= 2;
            System.out.println("1 taka coin: " + money_available);
        } else if (need_to_pay == the_amount) {
            System.out.println("The returned amount is 0 taka");
        } else {
            System.out.println("Please pay " + (-money_available) + " taka more.");
        }
    }
    
}
