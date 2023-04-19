package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnOrder{
    // private List<Actor> queue;
    private List<iActorBehaviour> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    @Override
    public void calculatePriceWithDiscount(List<Actor> actors) {
        for (Actor actor : actors) {
            if (actor instanceof ActionClient) { 
                ActionClient actionClient = (ActionClient) actor; 
                System.out.println(actionClient.getName() + " получил цену " + actionClient.getName());
            } else {
                System.out.println(actor.getName() + " не является ActionClient и не имеет цены со скидкой");
            }
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }

    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }

        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }

    }
    @Override
    public boolean returnOrder(int orderNumber, String reason) {
        // process the return order here
        // ...
        // assuming the return order procedure is completed successfully
        return true;
    }

    @Override
    public float calculateRefund(float initialPrice, String condition) {
        // calculate and return the refund amount
        float refundAmount = 0;

        // assume some calculation logic based on condition
        if (condition.equals("likeNew")) {
            refundAmount = initialPrice * 0.9f;
        } else if (condition.equals("used")) {
            refundAmount = initialPrice * 0.6f;
        } else {
            refundAmount = initialPrice * 0.4f;
        }

        return refundAmount;
    }
}


