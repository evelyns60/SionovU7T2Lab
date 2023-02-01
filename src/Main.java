import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        /*
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(5);
        list.add(24);
        System.out.println(list);

        ArrayList<Integer> nums = new ArrayList<Integer>();
        Integer int1 = new Integer(10);
        Integer int2 = new Integer(5);
        Integer int3 = new Integer(24);
        nums.add(int1);
        nums.add(int2);
        nums.add(int3);
        System.out.println(nums);


        Integer num1 = new Integer(5);
        Integer num2 = 10;
        int num3 = 15;

        ArrayList<Integer> numList = new ArrayList<Integer>();

        numList.add(num1);
        numList.add(num2);
        numList.add(num3);

        int sum = num1 + num2 + num3;

        numList.add(sum);

        System.out.println(numList);

        ArrayList<String> letters = new ArrayList<String>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        System.out.println(letters);
        System.out.println(letters.size());
        letters.add(0, "D");
        System.out.println(letters);
        System.out.println(letters.size());
        letters.add(3, "E");
        System.out.println(letters);
        System.out.println(letters.size());
        letters.add(1, "F");
        letters.add(1, "G");
        letters.add(1, "H");
        System.out.println(letters);
        System.out.println(letters.size());
        System.out.println("-------------");
        letters.remove(2);
        System.out.println(letters);
        System.out.println(letters.size());
        letters.remove(3);
        System.out.println(letters);
        System.out.println(letters.size());
        letters.remove(0);
        letters.remove(1);
        System.out.println(letters);
        System.out.println(letters.size());
        System.out.println("-------------");

        */

        ArrayList<Integer> numList = new ArrayList<Integer>();


        numList.add(3);


        numList.add(0, 6);


        numList.add(7);


        numList.add(2, 8);

        numList.set(3, 9);


        numList.add(1, 2);

        numList.add(1, numList.size());

        numList.remove(5);

        numList.set(numList.size() - 1, 0);

        System.out.println(numList);

    }
}
