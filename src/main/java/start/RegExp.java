package start;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    //  .  - любой  символ  a.b  --> asb  aAb ....
    //  \.  --> .
    //  ^  - начало строки  ^hello --> hello my friend
    //  $  - конец строки   $end -->  this is the end
    //  \d -  0,1 ..9 любые цыфры от 0-9
    //  \D - кроме 0,1 ..9 --> A,b ....
    //  a-z   a,b,c,d ... z abcd...z
    //  A-Z   A,B .....
    //  \s    пробелы
    //  \w    A-Za-z0-9_ любые буквы и цифры
    //  \W    все оcтальные символы
    //  + 1 или более символов
    //  {3} {3,8} диапозон
    public static void main(String[] args) {
        String str1 = "123a!brgty";
        String str2 = "a brgty";
        String regExp = "a.b";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str1);
        System.out.println(m.find());
        System.out.println(m.matches());
        System.out.println("==================================");
        Pattern p1 = Pattern.compile("^a.b");
        Matcher m1 = p1.matcher(str2);
        System.out.println(m1.find());
        System.out.println("==================================");
        System.out.println("isDigit -->" +isDigit("123"));
        System.out.println("==================================");
        System.out.println("isPhoneNumber -->" +isPhoneNumber("+972-53-333-33-33"));
        System.out.println("===============================");
        System.out.println("isEmail =>" +isEmail("myemail@gmail.com"));
        System.out.println("isEmail =>" +isEmail("myema.il@gmail.com"));
        System.out.println("isEmail =>" +isEmail("myema..il@gmail.com"));
        System.out.println("===============================");
        System.out.println("isFullName =>" +isFullName("Julia Saveleva"));
    }

    static boolean isDigit(String str) {
        Pattern p = Pattern.compile("\\d+");
//         Pattern p = Pattern.compile("\\d*");
//        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(str);
        return m.matches();
    }
    static boolean isPhoneNumber (String str) {
        String regExp = "^\\+\\d{3}-\\d{2}-\\d{3}-\\d{2}-\\d{2}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }
    static boolean isEmail (String str) {
        String regExp = "^\\w+\\.{0,1}\\w*@\\w+\\.[A-Za-z]{2,}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }

    static boolean isFullName (String str) {
        String regExp = "^[A-Z]{1}[a-z]+\\s{1}[A-Z]{1}[a-z]+$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }
}
