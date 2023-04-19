/**
 * package Classes содержит основные классы для работы с клиентами и их поведением.
 */
package Classes;

/**
 * Класс SpecialClient представляет клиента-VIP с уникальным идентификатором.
 * Класс наследует свойства и методы от класса Actor. 
 * 
 * @see Classes.Actor
 */
public class SpecialClient extends Actor{
    private int idVIP;

    /**
     * Создает новый объект SpecialClient с заданным именем и идентификатором VIP.
     * 
     * @param name имя клиента
     * @param idVIP идентификатор VIP клиента
     */
    public SpecialClient(String name, int idVIP){
        super(name);
        this.idVIP = idVIP;
    }

    /**
     * Возвращает имя этого клиента.
     * 
     * @return имя клиента
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Возвращает идентификатор VIP клиента.
     * 
     * @return идентификатор VIP клиента
     */
    public int getIdVIP() {
        return idVIP;
    }

    /**
     * Возвращает флаг возможности заказа этого клиента.
     * 
     * @return true, если у клиента есть возможность заказа, иначе false
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Возвращает флаг возможности получения заказа этим клиентом.
     * 
     * @return true, если клиент может получить заказ, иначе false
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Устанавливает флаг возможности заказа для этого клиента.
     * 
     * @param makeOrder флаг возможности заказа
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }

    /**
     * Устанавливает флаг возможности получения заказа для этого клиента.
     * 
     * @param pickUpOrder флаг возможности получения заказа
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }

    /**
     * Возвращает ссылку на себя.
     * 
     * @return ссылка на объект клиента SpecialClient
     */
    @Override
    public Actor getActor() {
        return this;
    }

    /**
     * Рассчитывает цену клиента со скидкой.
     * 
     * @param price цена клиента без скидки
     * @throws UnsupportedOperationException метод не реализован
     */
    @Override
    public void calculatePriceWithDiscount(int price) {
        throw new UnsupportedOperationException("Unimplemented method 'calculatePriceWithDiscount'");
    }

    
}