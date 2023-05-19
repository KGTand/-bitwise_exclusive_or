package bitwise_exclusive_or;

public class Bitwise_exclusive_or {

    public static void main(String[] args) {
        String text = "Secret";
        String size1 = "";
        String size2 = "";
        String key = "qwerty";
        int i;
        int k;
            System.out.println("Пароль: " + text);
            for (i = 0; i < text.length(); i++) {
                for (k = 0; k < key.length(); k++) {
                    size1 = size1 + (char) (text.charAt(i) ^ (char) key.charAt(k));
                    break;
                }
            }
        System.out.println("Шифруем пароль...");
        System.out.println("Зашифрованный пароль: " + size1);
            System.out.println("Расшифровываем пароль...");
                for (i = 0; i < text.length(); i++) {
                    for (k = 0; k < key.length(); k++) {
                    size2 = size2 + (char) (size1.charAt(i) ^ (char) key.charAt(k));
                    break;
                    }

                }
        System.out.println("Расшифрованный пароль: " + size2);

    }

}
