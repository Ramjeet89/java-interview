package com.interview.utils.coding;

public class Main {
    public void myPublic() {
        System.out.println("Public");
    }

    private void myPrivate() {
        System.out.println("Public");
    }

    class Nested {
        public void nestedPublic() {
            myPrivate();
        }
    }
}
