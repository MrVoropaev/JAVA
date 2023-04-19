/**
 * Пакет Interfaces содержит интерфейсы для задания поведения клиентов
 *. 
 * 
 * @see Classes.Actor
 */
package Interfaces;

import Classes.Actor;

/**
 * Интерфейс iActorBehaviour определяет основное поведение для клиентов, связанных с заказом еды. 
 * 
 * @see Classes.Actor
 */
public interface iActorBehaviour {
    /**
     * Устанавливает флаг возможности заказа для клиента.  
     * 
     * @param makeOrder флаг возможности заказа
     */
    void setMakeOrder(boolean makeOrder);

    /**
     * Устанавливает флаг возможности получения заказа для клиента. 
     * 
     * @param pickUpOrder флаг возможности получения заказа
     */
    void setTakeOrder(boolean pickUpOrder);

    /**
     * Возвращает флаг возможности заказа для клиента. 
     * 
     * @return true, если актер может сделать заказ, иначе false
     */
    boolean isMakeOrder();

    /**
     * Возвращает флаг возможности получения заказа для клиента.
     * 
     * @return true, если актер может получить заказ, иначе false
     */
    boolean isTakeOrder();

    /**
     * Рассчитывает цену заказа со скидкой для клиента. 
     * 
     * @param price цена заказа без скидки
     */
    void calculatePriceWithDiscount(int price);

    /**
     * Возвращает ссылку на объект Actor, связанный с поведением клиента. 
     * 
     * @return ссылка на объект Actor
     */
    Actor getActor();
}