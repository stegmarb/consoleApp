import java.util.List;

public class Counter {
    private Reader reader = new Reader();

    public int countLineNumber(String path) {
        List<String> lines = reader.readLinesFromFile(path);
        return lines.size();
    }

    public int countWordNumber(String path) {
        List<String> lines = reader.readLinesFromFile(path);
        int count = 0;
        for (String line : lines) {
            String[] wordNumberInLine = line.split(" ");
            count = count + wordNumberInLine.length;
        }
        return count;
    }

    public String findLongestWord(String path) {
        List<String> lines = reader.readLinesFromFile(path);
        int longest = 0;
        String longestWord = "";
        for (String line : lines) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.length() > longest) {
                    longestWord = word;
                    longest = word.length();
                }
            }
        }
        return longestWord;
    }
}
