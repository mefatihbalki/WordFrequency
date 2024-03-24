import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Metni girin:");
        String input = scanner.nextLine();

        Map<String, Integer> wordFrequency = new HashMap<>();

        // split metodu ile ayırma
        String[] words = input.split("\\s+");

        // frekans hesaplama
        for (String word : words) {

            // Eğer kelime boşsa atla
            if (word.isEmpty()) {
                continue;
            }

            // kelime sayacı
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // en çok kullanılan kelimenin bulunması için yapılan for döngüsü
        String mostFrequentWord = "";
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        // Sonucu ekrana yazdırma
        System.out.println("En çok geçen kelime: " + mostFrequentWord);
        System.out.println("Bu kelime " + maxFrequency + " kez geçiyor.");
    }
}