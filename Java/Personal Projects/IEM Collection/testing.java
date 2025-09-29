// public class testing {
//     public static void main(String[] args) {
//         int[] number = {6,7,8,9,10,12,32,213,89};
//         System.out.println(calcNumber(number, 2,213));
//     }

//     public static int calcNumber(int[] number, int num, int num2) {
//         int big = 0;

//         for (int i = 0; i < number.length; i++) {
//             if (number[i] % num == 0 || number[i] % num2 == 0 && number[i]>big) {
//                 big = number[i];
//             }
//         }
//         return big;
//     }
// }

public class testing {
    public static void main(String[] args) {
        // System.out.println(containsBoth("12345", '2', '5'));
        // System.out.println(containsBoth("hello", 'l', 'e'));
        // System.out.println(containsBoth("1650", '6', '6'));
        // System.out.println(containsBoth("seattle", 's', 'f'));
        // System.out.println(containsBoth("a", 'a', 'c'));
        System.out.println(containsBoth("hello", 'h', 'o'));
    }

    /* TODO */
    // implement the containsBoth() method below

    public static String containsBoth(String s, char c1, char c2) {
        char Result;
        String cond = "";
        for (int i = 0; i < s.length(); i++) {
            Result = s.charAt(0);
            if (Result == c1 || Result == c2) {
                cond = "true";
            } else {
                cond = "false";
            }
        }
        return cond;
    }
}
