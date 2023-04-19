/**
 * package Classes содержит основные классы для работы с клиентом и их поведением.
 */
package Classes;

import Interfaces.iReturnOrder;

/**
 * Класс ReturnClient реализует интерфейс iReturnOrder и предоставляет функциональность для обработки возвратов заказов и расчета возвратных сумм.
 * 
 */
public class ReturnClient implements iReturnOrder {

    /**
     * Обрабатывает запрос на возврат заказа и возвращает результат операции.
     * 
     * @param orderNumber номер заказа, который должен быть возвращен.
     * @param reason причина возврата заказа.
     * @return истина, если возврат был обработан удачно, или ложь - в противном случае.
     */
    @Override
    public boolean returnOrder(int orderNumber, String reason) {
        // process the return order here
        return true;
    }

    /**
     * Рассчитывает и возвращает сумму возврата на основе начальной стоимости товара и его состояния.
     * 
     * @param initialPrice начальная стоимость товара.
     * @param condition состояние товара на момент возврата.
     * @return сумма возврата с учетом дополнительной логики расчета на основе состояния товара.
     */
    @Override
    public float calculateRefund(float initialPrice, String condition) {
        float refundAmount = 0;

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
