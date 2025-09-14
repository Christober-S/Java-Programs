    package Casting;

    public class B extends A {
        int a = 20;
        String s = "B";
//        public void show() {
//            System.out.println("In B");
//        }

        public static void main(String[] args) {
            A a = new B();
            a.show();
            System.out.println(a.s);
            System.out.println(a.a);
        }
    }
