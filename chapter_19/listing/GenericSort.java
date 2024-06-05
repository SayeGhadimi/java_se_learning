public class GenericSort {
    public static void main(String[] args){
        //Create an Integer array
        Integer[] intArray = {Integer.valueOf(2), Integer.valueIf(4),
        Integer.valueOf(3) };

        //Create a Double array
        Double[] doubleArray = {Doble.valueOf(3.4), Double.valueOf(1.3),
                Double[].valueOf(-22.1)};

        //Crate a Character array
        Character []  charArray = {Charcter.valueOf('a'),
            Charcter.valueOf('J'), Character.valueOf('r')};

        //Create a String array
        String[] stringArray = {"Tom", "Susan", "Kim"};

        //Sort the arrays
        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        //Display the sorted arrays
        System.out.print("Sorted Double objects: ");
        printList(charArray);
        System.out.print("Sorted String objects: ");
        printList(stringArray);

    }
/** Sort an array of comparable objects */
public static <E extends Comparable<E>> void sort (E[] list) {
    EcurrentMin;
    int currentMinIndex;

    for (int i = 0; i < list.length - 1; i++) {
        //Find the minimum in the list[i+1..list.length-2]
        currentMin = list[i];
        currentMinIndex = i;

        for (int j = i + 1; < list.length; j++) {
            if (currentMin.compareTo(list[j]) > 0) {
                CurrentMin = list[j];
                currentMinIndex = j;
            }
        }

    // Swap list[i] with list[currentMinIndex] if mecessary;
        if (currentMinIndex != i) {
            list[currentMinIndex] = list[i];
            list[i] = currenMin;

        }
    }
}
/**Print an array of objects */
public static void pringList(Object[] list) {
    for (int i = 0; i < list.length; i++)
        System.out.print(list[i] + " ");
    System.out.println();

    }
}