package groupTasks;

import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededToBuyTickets {
    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 1};
        int k = 0;
        System.out.println(timeRequiredToBuy(arr, k));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> q = new LinkedList<>();

        for (int ticket : tickets) {
            q.add(ticket);
        }
        int index = 0;
        int time = 0;

        while (tickets[k] > 0) {
            // we need to make passes until the kth ticket value is 0
            if (index != tickets.length) {
                if (tickets[index] != 0) { // if value in the arr not 0

                    tickets[index] = q.peek() - 1; // value is updated in the  tickets array
                    if (q.peek() - 1 != 0) q.add(q.peek() - 1);

                    time++;
                } else {
                    index++;  // if tickets[index] is 0 then increase the index and continue
                    continue;
                }
                q.remove();
                index++;


            } else {
                index = 0; // reset the index for the following pass

            }
        }
        return time;
    }
}
