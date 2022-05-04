public class JvmComprehension {
    public static void main(String[] args) {
        int i = 1;                      // 1) переменная i создается в stack.
        Object o = new Object();        // 2) переменная o (которая создает ссылку на Object)
                                        // создается в stack; в heap'e выделяется память
                                        // под Object;
                                        // также здесь ClassLoader подгружает класс Object.
        Integer ii = 2;                 // 3) переменная ii (которая создает ссылку на Integer)
                                        // создается в stack; в heap'e выделяется память
                                        // под Integer.
        printAll(o, i, ii);             // 4) в момент вызова printAll создается фрейм в Stack
                                        // в котором помещаем переменную o с ссылкой на Object
                                        // и две переменных i и ii.
        System.out.println("finished"); // 7) создается фрейм в Stack, куда передадим
                                         // ссылку на строку String; в heap'e выделяется
                                         // память под String

    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5) переменная uselessVar (которая создает ссылку на Integer)
                                                    // создается в stack; в heap'e выделяется память
                                                    // под Integer; переменную uselessVar не заберет
                                                    // Garbage Collector, поскольку она надежно находится
                                                    // в heap'e и на неё есть ссылка
        System.out.println(o.toString() + i + ii);  // 6) создается фрейм в Stack, куда передадим
                                                    // ссылку на строку String; в heap'e выделяется
                                                     // память под String
    }
}
