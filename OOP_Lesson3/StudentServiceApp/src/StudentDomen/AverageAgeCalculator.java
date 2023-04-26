package StudentDomen;

import java.util.Collection;

public class AverageAgeCalculator<T extends Ageable> {
    private Collection<T> collection;

    public AverageAgeCalculator(Collection<T> collection) {
        this.collection = collection;
    }

    public double calculateAverageAge() {
        int sum = 0;
        for (T obj : collection) {
            sum += obj.getAge();
        }
        return (double) sum / collection.size();
    }

    @Override
    public String toString() {
        return "Средний возраст: " + calculateAverageAge();
    }
}

interface Ageable {
    int getAge();
}
