package com.interview.utils.ibm;


public class Demo {
    public static void main(String[] args) {
       /* int[] arr = {1, 2, 2, 3, 5, 7};
        Set<Integer> set = new HashSet<>();
        Arrays.stream(arr).filter(set::add).forEach(System.out::println);
        OptionalInt max = Arrays.stream(arr).max();
        long count = Arrays.stream(arr).count();
        System.out.println(count);
        System.out.println(max);*/
        foo(true, true);
        foo(false, false);
        foo(true, false);
        foo(false, true);

    }

    public static void foo(boolean a, boolean b) {
        if (a) {
            System.out.println("A"); /* Line 5 */
        } else if (a && b) /* Line 7 */ {
            System.out.println("A && B");
        } else /* Line 11 */ {
            if (!b) {
                System.out.println("notB");
            } else {
                System.out.println("ELSE");
            }
        }
    }
}
