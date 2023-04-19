/**
 * package Classes содержит основные классы для работы с актерами и их поведением.
 */
package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Абстрактный класс Actor представляет основную структуру для хранения информации об актере (клиенте, сотруднике и т.д.) и его поведения.
 * Класс реализует взаимодействие с интерфейсом iActorBehaviour. Каждый экземпляр актера должен создаваться с заданным именем и должен иметь возможность обрабатывать заказы.
 */
public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    /**
     * Создает новый объект Actor с заданным именем.
     * 
     * @param name имя актера
     */
    public Actor(String name) {
        this.name = name;
    }

    // экземпляр класса для обработки возвратов заказов
     public iReturnOrder returnClient;

    /**
     * Возвращает имя .
     * 
     * @return имя 
     */
    public abstract String getName();

}
