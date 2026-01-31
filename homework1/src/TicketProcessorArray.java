package homework1.src;
import java.util.ArrayList;
import java.util.List;

public class TicketProcessorArray {
    public static void main(String[] args) {
        int runs = 10;
        long total = 0;
        for (int i = 0; i < runs; i++) {
            ArrayList<String> ticketQueue = new ArrayList<>();
            createLongQueue(ticketQueue);
            long start = System.nanoTime();
            while (!ticketQueue.isEmpty()) {
                ticketQueue.remove(ticketQueue.size() - 1);
            }
            long end = System.nanoTime();
            total += (end - start);
        }
        System.out.println("ArrayList average time: " + (total / runs));
    }

    public static void processTicketsArrayList() {

        ArrayList<String> ticketQueue = new ArrayList<>();

        // Uncomment the queue length you want to test with
      createShortQueue(ticketQueue);
   //createLongQueue(ticketQueue);


        while (!ticketQueue.isEmpty()) {
            // grab the first item in the list
            ticketQueue.remove(ticketQueue.size() - 1);

          //  System.out.println("Processing: " + currentTicket);

           // System.out.println("Finished! Remaining in line: " + ticketQueue.size());
          //  System.out.println("---------------------------");
        }
    }

    public static void createShortQueue(List<String> queue) {
        // feel free to change the number of tickets here to test different queue sizes
        for (int i = 1; i <= 50; i++) {
            queue.add("Ticket #" + i);
        }
    }

    public static void createLongQueue(List<String> queue) {
        // feel free to change the number of tickets here to test different queue sizes
        for (int i = 1; i <= 20000; i++) {
            queue.add("Ticket #" + i);
        }
    }
}
