package Tests.Work;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int numberTask = 5;
        Queue toDoQueue = new ArrayDeque(numberTask);
        Boss boss = new Boss(toDoQueue);
        Worker worker = new Worker(toDoQueue);
        for (int i = 1; i <= numberTask; i++) {
            boss.giveTask("Задание: " + i);
        }

        System.out.println("Начальник закончил давать работу");
        for (int i = 1; i <= numberTask + 1; i++){
            worker.takeTask();
        }
    }
}
