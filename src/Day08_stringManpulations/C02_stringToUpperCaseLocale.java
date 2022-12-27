package Day08_stringManpulations;

import java.util.Locale;

public class C02_stringToUpperCaseLocale {
    public static void main(String[] args) {

        String str="Java Candir";
        System.out.println(str.toLowerCase());
        str= str.toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);
        str="sevgi insanı hayata bağlar";
        str= str.toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);

    }
}
