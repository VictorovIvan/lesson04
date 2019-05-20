import task03.*;

public class Test {
    

    public static void main(String[] args) {
        int lengthArray = 10;
        Integer[] someArray = new Integer[lengthArray];
        MathBox someCollection;
        Number numberSplitter=  2;
        Integer inputInteger = 4;
        Integer someObject = 4;
        ObjectBox<Integer>someObjectBox = new ObjectBox<>();

        for (int index = 0; index < lengthArray; index++) {
            someArray[index]= index;
        }
        
        System.out.println("Задание №1:");
        someCollection = new MathBox(someArray);
        System.out.println(someCollection.toString());
        System.out.println(someCollection.summator());
        System.out.println(someCollection.splitter(numberSplitter).toString());
        someCollection.deleteIntegerValue(inputInteger);
        System.out.println(someCollection.toString());

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
