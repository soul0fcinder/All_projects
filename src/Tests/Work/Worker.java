package Tests.Work;

import java.util.Queue;

public class Worker {
    private Queue toDoQueue;
    public Worker (Queue toDoQueue) {
        this.toDoQueue = toDoQueue;
    }
    public void takeTask() {
        Object task = toDoQueue.poll();
        if(task != null) {
            System.out.println("Выполнил задачу: " + task);
        } else System.out.println("Всё выполнил");
    }
}
