public class WildCardNeedDemo {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack <> () ;
        inStack.push(1); // 1 is autoboxed into an Integer object
        inStack.push(2);
        inStack.push(-2);

        System.out.print("The max number is " + max(intStack)) ;
    }

    /** Find the maximum in a stack of numbers */
    Public static double max (GenericStack<Number> stack) {
        double max = stack.pop().dobleValue(); // Initialize max

        while (!stack.isEmpty()) {
            double value = stack.pop().doubleValue();
            if (value > max)
                max = value;
        }

        return max;

    }
}
