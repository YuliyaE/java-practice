package by.yuliya.java.thread.callcenter;

import java.util.concurrent.locks.ReentrantLock;

public class Client extends Thread {

    private long id;
    private CallCenter callCenter;
    private Operator operator;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public long getId() {
        return id;
    }

    public Client(CallCenter callCenter) {
        this.id = IdGenerator.generateId();
        this.callCenter = callCenter;
    }

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println("Calling... ");
            operator = callCenter.callOperator(this);
            while (operator == null) {
                System.out.println("No free operators");
                operator = callCenter.repeatCall(this);
            }
            System.out.println("The operator " + operator.getId() + " is serving the client №" + this.getId());
            operator.serveClient();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (operator != null) {
                callCenter.finishCall(operator);
                System.out.println("Client " + this.getId() + " has finished");
            }
            lock.unlock();
        }
    }

}

