package collections.queues;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

    public static void main(String[] args) {
        // (head) <-0000000000000 <- (tail)
        // Queue is a FIFO structure
        // ArrayBlockingQueue has fixed size
        Queue<Integer> tickets = new ArrayBlockingQueue<>(3);

        ///////////////////// add ////////////////////////
        tickets.add(10);
        tickets.add(20);
        tickets.add(30);

        try {
            tickets.add(40);
        } catch (IllegalStateException e) {
            System.out.println("Queue limit reached. Can't add more");
        }


        for (Integer ticket : tickets)
            System.out.println(ticket);

        ///////////////////// remove ////////////////////////
        // Items will be removed from the head.
        System.out.println(tickets.remove());

        ///////////////////// element ////////////////////////
        System.out.println("HEAD of queue is at " + tickets.element());

        // There are a set of special methods which return certain values
        // offer() : Like add(), returns false in case it cannot add
        // poll() : Like remove(), returns null if queue is empty
        // peek() : Like element(), returns null if queue does not have items

        Queue<String> peoples = new ArrayBlockingQueue<>(2);
        System.out.println("Peek when no elements are present " + peoples.peek());

        peoples.offer("Alex");
        peoples.offer("Dylan");
        System.out.println(peoples.offer("Smith")); // returns false

        for (String people : peoples)
            System.out.println(people);

        peoples.poll();
        peoples.poll();
        peoples.poll(); // Again no exceptions.
    }
}
