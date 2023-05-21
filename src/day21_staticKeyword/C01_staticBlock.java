package day21_staticKeyword;

public class C01_staticBlock {
    C01_staticBlock(){
        System.out.println("Cons. çalıştı");
    }

    public static void main(String[] args) {
        System.out.println("Main method çalıştı");
        C01_staticBlock car=new C01_staticBlock();
        System.out.println(car);
    }
    static {
        System.out.println("Static block çalıştı");
    }static {
        System.out.println("alttaki static block çalıştı");
    }
}
