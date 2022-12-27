package Day09_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {

        String str="Java ogrenen işsiz kalmaz";
        System.out.println(str.endsWith("kalmaz"));
        System.out.println(str.endsWith("Java ogrenen işsiz kalmaz"));
        System.out.println(str.endsWith(""));
    }
}
