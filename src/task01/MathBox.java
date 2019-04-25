package task01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>Задание 1. Написать класс MathBox, реализующий следующий функционал:</p>
 *
 * <p>Конструктор на вход получает массив Number. Элементы не могут повторяться.
 * Элементы массива внутри объекта раскладываются в подходящую коллекцию (выбрать самостоятельно).</p>
 *
 * <p>Существует метод summator, возвращающий сумму всех элементов коллекции.
 * Существует метод splitter, выполняющий поочередное деление всех хранящихся в объекте
 * элементов на делитель, являющийся аргументом метода. Хранящиеся в объекте данные
 * полностью заменяются результатами деления.
 * Необходимо правильно переопределить методы toString, hashCode, equals, чтобы можно
 * было использовать MathBox для вывода данных на экран и хранение объектов этого класса
 * в коллекциях (например, hashMap). Выполнение контракта обязательно!
 * Создать метод, который получает на вход Integer и если такое значение есть в коллекции,
 * удаляет его.</p>
 */

/**
 * <p>Class MathBox</p>
 */
public class MathBox {
    public Number number[];
    public ArrayList<Number> MathBox;

    /**
     * <p>The input constructor receives an array of Number. Items cannot be repeated.
     * Elements of the array inside the object are decomposed into a suitable collection</p>
     */
    public ArrayList<Number> MathBox(Number number[]) {
        if (number == null) {
            return MathBox = new ArrayList(0);
        } else {
            int size = number.length;
            ArrayList<Number> arrayList = new ArrayList(size);
            for (int indx = 0; indx < size; indx++) {
                arrayList.add(number[indx]);
            }
            return MathBox = arrayList;
        }
    }

    /**
     * <p>Return the sum of all the items in the collection</p>
     * @return Sum it is sum all the items in the collection
     */
    public Number summator() {
        Number sum = 0;
        for (Number nmb : this.MathBox) {
            sum = sumNumbers(sum, nmb);
        }
        return sum;
    }

    /**
     * <p>Sum Numbers two value。It made for coordination of different type</p>
     * @param nmbA Something values A
     * @param nmbB Something values B
     * @return Sum (first + second) values
     */
    public static Number sumNumbers(Number nmbA, Number nmbB) {
        if (nmbA instanceof Double || nmbB instanceof Double) {
            return nmbA.doubleValue() + nmbB.doubleValue();
        } else if (nmbA instanceof Float || nmbB instanceof Float) {
            return nmbA.floatValue() + nmbB.floatValue();
        } else if (nmbA instanceof Long || nmbB instanceof Long) {
            return nmbA.longValue() + nmbB.longValue();
        } else if (nmbA instanceof Integer || nmbB instanceof Integer) {
            return nmbA.intValue() + nmbB.intValue();
        } else if (nmbA instanceof Short || nmbB instanceof Short) {
            return nmbA.shortValue() + nmbB.shortValue();
        } else {
            return nmbA.byteValue() + nmbB.byteValue();
        }
    }

    /**
     * <p>Splitter makes the sequential division of all keeps in the object
     * elements per divider that are the value argument.
     * Data kept in the object completely replaced by the results of the division</p>
     * @param divide divider
     * @return Object completely replaced by the results of the division
     */
    public ArrayList<Number> splitter(Number divide) {
        ArrayList resObj = new ArrayList();
        for (Number nmb : this.MathBox) {
            resObj.add(divNumbers(nmb, divide));
        }
        return this.MathBox = resObj;
    }


    /**
     * <p>Divide Numbers two value A/B. It made for coordination of different type</p>
     * @param nmbA Something values A
     * @param nmbB Something values B
     * @return divide (first / second) values
     */
    public static Number divNumbers(Number nmbA, Number nmbB) {
        if (nmbA instanceof Double || nmbB instanceof Double) {
            return nmbA.doubleValue() / nmbB.doubleValue();
        } else if (nmbA instanceof Float || nmbB instanceof Float) {
            return nmbA.floatValue() / nmbB.floatValue();
        } else if (nmbA instanceof Long || nmbB instanceof Long) {
            return nmbA.longValue() / nmbB.longValue();
        } else if (nmbA instanceof Integer || nmbB instanceof Integer) {
            return nmbA.intValue() / nmbB.intValue();
        } else if (nmbA instanceof Short || nmbB instanceof Short) {
            return nmbA.shortValue() / nmbB.shortValue();
        } else {
            return nmbA.byteValue() / nmbB.byteValue();
        }
    }

    /**
     * <p>Method search duplicated elements in the object</p>
     * @param number Arrays values
     * @return if the repeated element (true) else false
     */
    private boolean duplicElem(final Number[] number) {
        Set<Number> checkElem = new HashSet<>();
        for (Number i : number) {
            if (checkElem.contains(i)) return true;
            checkElem.add(i);
        }
        return false;
    }

    /**
     * <p>Override toString</p>
     * @return MathBox.toString() String
     */
    @Override
    public String toString() {
        return MathBox.toString();
    }

    /**
     * <p>Returns a hash code value for the object. This method is
     * supported for the benefit of hash tables such as those provided by</p>
     * @return MathBox.hashCode()
     */
    @Override
    public int hashCode() {
        return MathBox.hashCode();
    }

    /**
     * <p>Indicates whether some other object is "equal to" this one</p>
     * @param obj
     * @return equals(obj)
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * <p>The method receives an integer as an input, and if such a value is
     * in the collection, it deletes it</p>
     * @param input Input Integer values
     * @return MathBox Collection mathbox without input comparing values Integer
     */
    public ArrayList<Number> deleteIntegerValue(Integer input) {
        this.MathBox.removeIf(n -> (n == input));
        return this.MathBox;
    }
}
