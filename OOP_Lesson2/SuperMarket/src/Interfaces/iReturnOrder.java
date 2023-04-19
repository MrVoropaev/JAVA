/**
 * Интерфейс iReturnOrder определяет поведение для возврата заказа. 
 * 
 * @see Classes.Market
 */
public interface iReturnOrder {
    /**
     * Возвращает заказ.
     * 
     * @param orderNumber номер заказа, который будет возвращен
     * @param reason причина возврата заказа
     * @return true, если возврат был успешным, false в противном случае
     */
    boolean returnOrder(int orderNumber, String reason);

    /**
     * Рассчитывает возврат средств за заказ в зависимости от его состояния. 
     * 
     * @param initialPrice начальная стоимость заказа
     * @param condition состояние заказа на момент возврата
     * @return величина возврата в соответствии с условиями
     */
    float calculateRefund(float initialPrice, String condition);
}