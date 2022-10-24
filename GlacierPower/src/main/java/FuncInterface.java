public class FuncInterface<operationable4> {
    public static void main(String[] args) {
//        Operationable operationable = new Operationable() {
//            @Override
//            public int calculate(int a, int b) {
//                return a+b;
//            }
//        }; before lambda
        Operationable operationable;
        operationable = (a, b) -> a + b; //with lambda
        int result = operationable.calculate(10, 10);
        System.out.println(result);

        Operationable2<Integer> operationable2;
        operationable2 = (a, b) -> a > b; //with lambda
        boolean result2 = operationable2.calculated(10, 20);
        System.out.println(result2);

        Operationable3<Integer, String> operationable3;
        operationable3 = (a, b) -> {
            return a + b + " I'll be back";
        }; //with lambda
        String result3 = operationable3.calculates(10, 20);
        System.out.println(result3);
    }

//    Operationable4<Integer> operationable4;
//    operationable4 =(a,b)->
//
//    {
//        System.out.println();
//    }//with lambda
//    operationable4.calculat(10,20);
//}


    @FunctionalInterface
    interface Operationable {
        int calculate(int a, int b);
    }

    //Predicate lambda return something
    interface Operationable2<T> {
        boolean calculated(T t, T t1);
    }

    //Functional lambda return something
    interface Operationable3<T, R> {
        R calculates(T t, T t1);
    }

    //Consumer lambda return void
    interface Operationable4<T> {
        void calculat(T t, T t1);
    }
}

