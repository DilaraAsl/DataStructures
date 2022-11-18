import java.util.ArrayList;
import java.util.Arrays;

public class NoOfPeopleOnTheBus {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        System.out.println(countPassengers(list));

    }
    public static int countPassengers(ArrayList<int[]> stops) {
        int counter=0;
        for (int i = 0; i <stops.size() ; i++) {

               counter+= stops.get(i)[0]-stops.get(i)[1];

            }


       return counter;
    }
}
