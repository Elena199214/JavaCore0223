package BaseJava;

import java.util.regex.Pattern;



public class KataString {
    public static void main(String[] args) {
        KataString string = new KataString();
        // string.parseAndPrintNumber("1000");
//        String[] string1 = new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
//        String[] string2 = new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.", "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?", "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.", "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!", "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич", "Иванов", "Фёдоров", "Лука"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
                "Лука: Я Лука!"};
        System.out.println(printTextPerRole(roles, textLines));


     //   System.out.println(printTextPerRole(string1, string2));
//        System.out.println(isGmailOrOutlook("kata12@gmail.com"));
//        System.out.println(isGmailOrOutlook("@outlook.com"));
    }

    public void parseAndPrintNumber(String str) {
        // int num = Integer.parseInt(str.valueOf(str));
//        System.out.println(Integer.parseInt(str) / 2);
    }

    public static boolean isPalindrome(String text) {
//        if (text.length() == 0 || text.length() == 1) {
//            return true;
//        } else {
            //String str = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            StringBuilder buil = new StringBuilder(text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());

       // return str.equals(buil.reverse().toString());

            return text.replaceAll("[^a-zA-Z0-9]", "").equalsIgnoreCase(new StringBuilder((text.replaceAll("[^a-zA-Z0-9]", ""))).reverse().toString());
        }


    public static boolean isGmailOrOutlook(String email) {
        return Pattern.compile(("(\\w+)+@(gmail.com)||(outlook.com)")).matcher(email).matches();
    }

public static String printTextPerRole(String[] roles, String[] textLines) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < roles.length; i++) {
        if (i > 0) {
            builder.append("\n");
        }
        builder.append(roles[i]).append(":\n");
        for (int j = 0; j < textLines.length; j++) {
            if ((textLines[j].startsWith(roles[i] + ":"))) {
                String str = textLines[j].substring(roles[i].length() + 1);
                builder.append(j + 1).append(")").append(str).append("\n");
            }
        }
    }
    builder.deleteCharAt(builder.length() - 1);
    return builder.toString();
}
}

