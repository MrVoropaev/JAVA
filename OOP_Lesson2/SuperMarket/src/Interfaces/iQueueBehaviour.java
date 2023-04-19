/**
 * Пакет Interfaces содержит интерфейсы для задания поведения клиентов и магазина. 
 * 
 * @see Classes.Actor
 * @see Classes.Market
 */
package Interfaces;

/**
 * Интерфейс iQueueBehaviour определяет основное поведение для очереди. 
 * 
 * @see Classes.Queue
 */
public interface iQueueBehaviour {
    /**
     * Добавляет клиента в очередь. 
     * 
     * @param actor клиент, который будет добавлен в очередь
     * @see Interfaces.iActorBehaviour
     */
    void takeInQueue(iActorBehaviour actor);

    /**
     * Удаляет клиента из очереди. 
     */
    void releaseFromQueue();

    /**
     * Получает заказ из очереди. 
     */
    void takeOrder();

    /**
     * Отдает выполненный заказ из очереди. 
     */
    void giveOrder();
}