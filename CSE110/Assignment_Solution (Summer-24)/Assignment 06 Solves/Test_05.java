mport java.util.*;
class T5{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        int vowel = 0;
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            char m = n.charAt(i);
            if (m == 'a' || m == 'A' || m == 'e' || m == 'E' || m == 'i' || m == 'I' || m == 'o' || m == 'O' || m == 'u'
                    || m == 'U') {
                vowel++;

            } else {
                count++;

            }

        }
        if (vowel > 0 && count > 0 && vowel % 3 == 0 && count % 5 == 0) {
            System.out.println("Aaarr! Me Plunder!!");
        } else {
            System.out.println("Blimey! No Plunder!!");
        }
    }
}
