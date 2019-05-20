package task02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Задание 2. Создать класс ObjectBox, который будет хранить коллекцию Object.
 * У класса должен быть метод addObject, добавляющий объект в коллекцию.
 * У класса должен быть метод deleteObject, проверяющий наличие объекта в коллекции
 * и при наличии удаляющий его.
 * Должен быть метод dump, выводящий содержимое коллекции в строку.</p>
 */

/**
 * Class ObjectBox
 *
 * @param <T>
 */
public class ObjectBox<T> {
    protected Collection<T> object;

    /**
     * Constructor of the ObjectBox
     */
    public ObjectBox(){
        object = new ArrayList();
    }

    /**
     * <p>The addObject method that adds an object to the collection.</p>
     *
     * @param obj Input object
     * @return this.ObjectBox Modified collection
     */
    public Collection<T> addObject(Number obj) {
        object.add((T) synchNumbers(obj));
        return this.object;
    }

    /**
     * Method that checks for an object in the collection,
     * if is,then deletes it.
     *
     * @param obj Input object
     */
    public void deleteObject(Number obj) {
        object.removeIf(n -> (n == obj));
    }

    /**
     * Dump that outputs the contents of the collection to a string
     *
     * @return collectToString Content collection to String
     */
    public String dump() {
        StringBuilder curString = new StringBuilder();
        Iterator<Number> iterator = (Iterator<Number>) this.object.iterator();
        while (iterator.hasNext()) {
            Number nextNumber = iterator.next();
            if (this.object.size() == 1) {
                curString.append(synchNumbers(nextNumber).toString());
            } else {
                curString.append(synchNumbers(nextNumber).toString()).append(" ");
            }
        }
        return curString.toString();
    }

    /**
     * <p>Divide Numbers two value A/B. It made for coordination of different type</p>
     *
     * @param nmbA Something values A
     * @return Coordination values
     */
    private static Number synchNumbers(Number nmbA) {
        if (nmbA instanceof Double) {
            return nmbA.doubleValue();
        } else if (nmbA instanceof Float) {
            return nmbA.floatValue();
        } else if (nmbA instanceof Long) {
            return nmbA.longValue();
        } else if (nmbA instanceof Integer) {
            return nmbA.intValue();
        } else if (nmbA instanceof Short) {
            return nmbA.shortValue();
        } else {
            return nmbA.byteValue();
        }
    }

    /**
     * Returns a string representation of this collection.
     * @return String a string representation of this collection
     */
    @Override
    public String toString() {
        return "ObjectBox{" +
                "object=" + object +
                '}';
    }
}
