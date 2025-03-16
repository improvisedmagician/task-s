import java.util.Scanner;

public class CalString {


    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: "); 

        String input = scanner.nextLine();

        System.out.println("Número de caracteres: " + countCharacters(input)); 

        System.out.println("String em maiúsculo: " + toUpperCase(input)); 

        System.out.println("Número de vogais: " + countVowels(input)); 

        System.out.println("Começa com 'UNI': " + startsWithUNI(input)); 

        System.out.println("Termina com 'RIO': " + endsWithRIO(input)); 

        System.out.println("Número de dígitos: " + countDigits(input)); 

        
        scanner.close();
    }

    public static int countCharacters(String str) { 

        return str.length();
    }

    public static String toUpperCase(String str) { 

        return str.toUpperCase();
    }

    public static int countVowels(String str) { 

        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static boolean startsWithUNI(String str) { 

        return str.toUpperCase().startsWith("UNI");
    }

    public static boolean endsWithRIO(String str) { 

        return str.toUpperCase().endsWith("RIO");
    }

    public static int countDigits(String str) { 

        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
}
