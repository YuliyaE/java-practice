package by.yuliya.java.thread.callcenter;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Runner {
    public static void main(String[] args) {
        Operator operator1 = new Operator(1);
        Operator operator2 = new Operator(2);
        Operator operator3 = new Operator(3);

        ConcurrentLinkedQueue<Operator> operators = new ConcurrentLinkedQueue<Operator>();
        operators.add(operator1);
        operators.add(operator2);
        operators.add(operator3);
        CallCenter callCenter = CallCenter.getInstance(operators);

        Client client = new Client(callCenter);
        Client client2 = new Client(callCenter);
        Client client3 = new Client(callCenter);
        Client client4 = new Client(callCenter);
        client.start();
        client2.start();
        client3.start();
        client4.start();

    }
}
