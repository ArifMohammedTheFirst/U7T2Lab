import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        // numList empty: []

        numList.add(3);      //numList: [3]

        numList.add(0, 6);  //numList: [6, 3]

        numList.add(2, 7); // numList:[6,3,7]

        numList.add(2, 8); // numList:[6,3,8,7]

        numList.set(3, 9); // numList:[6,3,8,9]

        numList.add(1, 2); // numList:[6,2,3,8,9 ]
        numList.add(1, numList.size());
        System.out.println(numList);

        numList.remove(4);
        System.out.println(numList);

        numList.set((numList.size() - 1), 0);
        System.out.println(numList);

        System.out.println(numList);


    }

}
