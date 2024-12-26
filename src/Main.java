import java.util.Scanner;


public class Main {

    public static String removeConsonantWords(String text, int wordLength) { // для удаления из text всех слов заданной длины wordLength
        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() == wordLength && isConsonant(word.charAt(0))) { // Пропуск слова, если соответствует слово заданной длине и начинается оно с согласной буквы
                continue;
            }
            result.append(word).append(" ");
        }

        return result.toString().trim(); // Возвращаем результат без лишних пробелов
        // trim Возвращает строку, значением которой является эта строка, с удаленными начальными и конечными пробелами.
        //Если этот объект String представляет собой пустую строку или если все кодовые точки в этой строке являются пробелами, то возвращается пустая строка.
    }

    private static boolean isConsonant(char ch) { //для проверки, является ли ch согласной буквой
        char lowerCaseCh = Character.toLowerCase(ch);
        return lowerCaseCh >= 'a' && lowerCaseCh <= 'z' &&
                !(lowerCaseCh == 'a' || lowerCaseCh == 'e' ||
                        lowerCaseCh == 'i' || lowerCaseCh == 'o' ||
                        lowerCaseCh == 'u' || lowerCaseCh == 'y');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод текста
        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        // Ввод длины слов, которые нужно удалить
        System.out.println("Введите длину слов, которые нужно удалить:");
        int wordLength = scanner.nextInt();

        // Удаление слов и вывод результата
        String result = removeConsonantWords(text, wordLength);
        System.out.println("Результат:");
        System.out.println(result);

        scanner.close();
    }
}