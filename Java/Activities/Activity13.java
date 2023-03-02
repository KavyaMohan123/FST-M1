import java.util.*;

public class Activity13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random indexGen = new Random();

        System.out.println("Enter integers please : ");
        System.out.println("(EOF or non-integer to terminate): ");

        while(scan.hasNextInt()) {
            list.add(scan.nextInt());
        }

        Integer[] numbs = list.toArray(new Integer[0]);
        int index = indexGen.nextInt(numbs.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in array at generated index: " + numbs[index]);

        scan.close();
    }
}