package Interfaces;

import java.util.List;

import Classes.Actor;

/**
 * Интерфейс iMarketBehaviour определяет поведение (дествия) в магазине. 
 * 
 * @see Classes.Market
 */
public interface iMarketBehaviour {
    /**
     * Принимает клиента.
     * 
     * @param actor клиент, который придет в магазин
     * @see Interfaces.iActorBehaviour
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * Список клиентов кто ушел из магазина. 
     * 
     * @param actors список клиентов, которые уйдут из магазина
     * @see Classes.Actor
     */
    void releaseFromMarket(List<Actor> actors);

    /**
     * Рассчитывает цену заказа со скидкой для списка клиентов. 
     * 
     * @param actors список клиентов, для которых нужно рассчитать цену заказа
     * @see Classes.Actor
     */
    void calculatePriceWithDiscount(List<Actor> actors);

    /**
     * Обновляет состояние. 
     */
    void update();
}