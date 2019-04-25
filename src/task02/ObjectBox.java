package task02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Задание 2. Создать класс ObjectBox, который будет хранить коллекцию Object.
 * <p>
 * У класса должен быть метод addObject, добавляющий объект в коллекцию.
 * У класса должен быть метод deleteObject, проверяющий наличие объекта в коллекции и при наличии удаляющий его.
 * Должен быть метод dump, выводящий содержимое коллекции в строку.
 */

/**
 * Class ObjectBox
 *
 * @param <T>
 */
public class ObjectBox<T> {
    private T ref;

    public ObjectBox(T ref) {
        this.ref = ref;
    }

    public ArrayList<Number> Object = new ArrayList();

    /**
     * <p>The addObject method that adds an object to the collection.</p>
     *
     * @param obj Input object
     * @return this.ObjectBox Modified collection
     */
    public ArrayList<Number> addObject(Number obj) {
        Object.add(synchNumbers(obj));
        return Object;
    }


    /**
     * Method that checks for an object in the collection,
     * if is,then deletes it.
     *
     * @param obj Input object
     * @return this.ObjectBox Modified collection
     */
    public ArrayList<Number> deleteObject(Number obj) {
        Object.removeIf(n -> (n == obj));
        return this.Object = Object;
    }

    /**
     * Dump that outputs the contents of the collection to a string
     *
     * @return collectToString Content collection to String
     */
    public String dump() {
        String curString = "";
        Iterator<Number> iterator = this.Object.iterator();
        while (iterator.hasNext()) {
            Number nextNumber = iterator.next();
            if(this.Object.size() == 1)
            {
                curString += synchNumbers(nextNumber).toString();
            }
            else{
                curString += synchNumbers(nextNumber).toString() + " ";
            }
        }
        return curString;
    }

    /**
     * <p>Divide Numbers two value A/B. It made for coordination of different type</p>
     *
     * @param nmbA Something values A
     * @return Coordination values
     */
    public static Number synchNumbers(Number nmbA) {
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
                "Object=" + Object +
                '}';
    }
};
