package by.yuliya.java.thread.callcenter;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class CallCenter {

    private final ConcurrentLinkedQueue<Operator> operators = new ConcurrentLinkedQueue<Operator>();
    private static ReentrantLock reentrantLock = new ReentrantLock();
    private static Logger logger = LogManager.getLogger();
    private static CallCenter instance;

    public CallCenter(Queue<Operator> operators) {
        this.operators.addAll(operators);
    }

    public Operator callOperator(Client client) {
            for (Operator operator : operators) {
                if (operatorQuest(operator, client)) {
                    return operator;
                }
            }
        return null;
    }

    public Operator repeatCall(Client client) {
        try {
            TimeUnit.MILLISECONDS.sleep((int) (Math.random() * 5) * 500);
            System.out.println("Client " + client.getId() + " repeats call");
        } catch (InterruptedException e) {
            logger.log(Level.FATAL, "InterruptedException", e);
            e.printStackTrace();
        }
        return callOperator(client);
    }
    public static CallCenter getInstance(Queue<Operator> operators) {
        try {
            reentrantLock.lock();
            if (instance == null) {
                instance = new CallCenter(operators);
            }
        } finally {
            reentrantLock.unlock();
        }
        return instance;
    }


    public boolean operatorQuest(Operator operator, Client client) {
        if (operator.getClient() == null) {
            operator.setClient(client);
            operators.remove(operator);
            return true;
        }
        return false;
    }

    public void finishCall(Operator operator) {
        operators.add(operator);
        operator.setClient(null);
    }

}
