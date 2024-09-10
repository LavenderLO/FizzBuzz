public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++){
            if (i % 3 == 0 || i % 5 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}


/* The AND operator is the double ampersand &&.
The OR operator is the double pipe ||.
The NOT operator is the exclaimation !.

public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++){
            if (i % 3 == 0 || i % 5 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}

public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (i < 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
 */