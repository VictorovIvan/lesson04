package task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
 * <p>Задание 1. Написать класс MathBox, реализующий следующий функционал:</p>
 *
 * <p>Конструктор на вход получает массив Number. Элементы не могут повторяться.
 * Элементы массива внутри объекта раскладываются в подходящую коллекцию (выбрать самостоятельно).</p>
 * <p>Существует метод summator, возвращающий сумму всех элементов коллекции.
 * Существует метод splitter, выполняющий поочередное деление всех хранящихся в объекте
 * элементов на делитель, являющийся аргументом метода. Хранящиеся в объекте данные
 * полностью заменяются результатами деления.
 * Необходимо правильно переопределить методы toString, hashCode, equals, чтобы можно
 * было использовать MathBox для вывода данных на экран и хранение объектов этого класса
 * в коллекциях (например, hashMap). Выполнение контракта обязательно!
 * Создать метод, который получает на вход Integer и если такое значение есть в коллекции,
 * удаляет его.</p>
 *
 * <p>Задание 3. Доработать классы MathBox и ObjectBox таким образом,
 * чтобы MathBox был наследником ObjectBox. Необходимо сделать такую связь,
 * правильно распределить поля и методы. Функциональность в целом должна
 * сохраниться. При попытке положить Object в MathBox должно создаваться исключение.</p>
 */

/**
 * <p>Class MathBox</p>
 */
public class MathBox extends ObjectBox<Number> {
    /**
     *  Constructor of the MathBox
      * @param numbers Arrays of Number
     */
    public MathBox(Number numbers[]) {
        object = new HashSet<>(Arrays.asList(numbers));
    }

    /**
     * <p>Return the sum of all the items in the collection</p>
     *
     * @return Sum it is sum all the items in the collection
     */
    public Number summator() {
        Number sum = 0;
        for (Number nmb : this.object) {
            sum = sumNumbers(sum, nmb);
        }
        return sum;
    }

    /**
     * <p>Sum Numbers two value。It made for coordination of different type</p>
     *
     * @param nmbA Something values A
     * @param nmbB Something values B
     * @return Sum (first + second) values
     */
    private static Number sumNumbers(Number nmbA, Number nmbB) {
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
     *
     * @param divide divider
     * @return Object completely replaced by the results of the division
     */
    public ArrayList<Number> splitter(Number divide) {
        ArrayList resObj = new ArrayList();
        for (Number nmb : this.object) {
            resObj.add(divNumbers(nmb, divide));
        }
        return (ArrayList<Number>) (this.object = resObj);
    }


    /**
     * <p>Divide Numbers two value A/B. It made for coordination of different type</p>
     *
     * @param nmbA Something values A
     * @param nmbB Something values B
     * @return divide (first / second) values
     */
    private static Number divNumbers(Number nmbA, Number nmbB) {
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
     * <p>Override toString</p>
     *
     * @return MathBox.toString() String
     */
    @Override
    public String toString() {
        return "MathBox{" +
                "object=" + object +
                '}';
    }

    /**
     * <p>Returns a hash code value for the object. This method is
     * supported for the benefit of hash tables such as those provided by</p>
     *
     * @return MathBox.hashCode()
     */
    @Override
    public int hashCode() {
        int hash = 0;
        for (Number n : object) {
            hash += n.hashCode();
        }
        return hash;
    }

    /**
     * <p>Indicates whether some other object is "equal to" this one</p>
     *
     * @param obj Input object
     * @return equals(obj) Equals
     */
    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        MathBox objectBox = (MathBox) obj;
        return objectBox.object.containsAll(object) && (objectBox.object.size() == object.size());
    }

    /**
     * <p>The method receives an integer as an input, and if such a value is
     * in the collection, it deletes it</p>
     *
     * @param input Input Integer values
     */
    public void deleteIntegerValue(Integer input) {
        this.object.removeIf(n -> (n.equals(input)));
    }
}
