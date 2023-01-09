package Day07_ternary_Switch_Statements;

public class C12_switchCase {
    public static void main(String[] args) {

        char harf='S';

        switch (harf){
            case 'I' :
            case 'i':
                System.out.println("International");
                break;
            case 'S' :
            case 's':
                System.out.println("Software");
                break;
            case 'Q' :
            case 'q':
                System.out.println("Qualification");
                break;
            case 'T' :
            case 't':
                System.out.println("Testing");
                break;
            case 'B' :
            case 'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("Geçersiz harf");

        }
    }
}
