package by.yuliya.java.thread.callcenter;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Operator {

    private long id;
    private Client client;
    private static Logger logger = LogManager.getLogger();
    private Semaphore semaphore = new Semaphore(1);

    public Operator(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Semaphore getSemaphore() {
        return semaphore;
    }

    public void setSemaphore(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void serveClient() {
        try {
            TimeUnit.MILLISECONDS.sleep((int) (Math.random()*7) * 500);
        } catch (InterruptedException e) {
            logger.log(Level.FATAL, "InterruptedException", e);

        }
    }


}
