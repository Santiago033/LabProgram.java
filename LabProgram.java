import java.util.Scanner;

public class LabProgram {

   // Method to count frequency of a word (case insensitive)
   public static int getWordFrequency(String[] wordsList, int listSize, String currWord) {
      int count = 0;

      for (int i = 0; i < listSize; i++) {
         if (wordsList[i].equalsIgnoreCase(currWord)) {
            count++;
         }
      }

      return count;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int numWords = scnr.nextInt(); // number of words
      String[] words = new String[numWords];

      // Read words into array
      for (int i = 0; i < numWords; i++) {
         words[i] = scnr.next();
      }

      // Print each word with its frequency
      for (int i = 0; i < numWords; i++) {
         int freq = getWordFrequency(words, numWords, words[i]);
         System.out.println(words[i] + " " + freq);
      }
   }
}
