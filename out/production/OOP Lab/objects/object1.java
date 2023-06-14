package objects;

public class object1 {
    int start = 0;
    int end = 0;
    public static void Main(String[] args) {
        object1 obj = new object1();
        obj.start = 0;
        obj.end = 1000;
        for (int i = obj.start; i < obj.end; i++) {
            if (i % 2 == 0) {
                System.out.println(i+" ");
            }
        }
        System.out.println("\n\n");
        for (int i = obj.start; i < obj.end; i++) {
            if (i % 2 != 0) {
                System.out.println(i+" ");
            }   
        }
        // System.out.println("\n\n");
        // for (int i = obj.start; i < obj.end; i++) {
        //     if (i % 2 = 0) {
        //         System.out.println(i+" ");
        //     }
        // }
    } 
}       