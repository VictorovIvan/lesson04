//import task01.MathBox;
//import task02.ObjectBox;
import task03.*;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int lengthArray = 10;
        Integer[] someArray = new Integer[lengthArray];
        ArrayList<Number> someCollectn;
        Number numberSplitter=  2;
        Integer inputInteger = 4;
        Integer someObject = 4;
        ObjectBox<Integer>someObjectBox = new ObjectBox<>(someObject);

        for (int i = 0; i < lengthArray; i++) {
            someArray[i]= i;
        }

        MathBox mathBoxTest = new MathBox(someObject);
        System.out.println("Задание №1:");
        someCollectn = mathBoxTest.MathBox(someArray);
        System.out.println(someCollectn.toString());
        System.out.println(mathBoxTest.summator());
        someCollectn = mathBoxTest.splitter(numberSplitter);
        System.out.println(someCollectn.toString());
        mathBoxTest.deleteIntegerValue(inputInteger);
        System.out.println(someCollectn.toString());

        System.out.println("Задание №2:");
        someObjectBox.addObject(someObject);
        someObject = 5;
        someObjectBox.addObject(someObject);
        someObject = 3;
        someObjectBox.addObject(someObject);
        System.out.println(someObjectBox.toString());
        someObject = 4;
        someObjectBox.deleteObject(someObject);
        System.out.println(someObjectBox.toString());
        System.out.println(someObjectBox.dump());
    }
}
