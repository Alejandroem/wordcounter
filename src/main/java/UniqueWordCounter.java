import java.util.ArrayList;

public class UniqueWordCounter extends WordCounter{
    private ArrayList<String> differentWords;

    @Override
    public Integer count(String text){
        List<String> differentWords = new ArrayList<String>();
        String[] words = this.prepareInputForWordCounting(text);

        for (String word: words) {
            String lowerCaseWord= word.toLowerCase();
            if(!differentWords.contains(lowerCaseWord)){
                differentWords.add(lowerCaseWord);
            }
        }
        return differentWords.size();
    }
}

