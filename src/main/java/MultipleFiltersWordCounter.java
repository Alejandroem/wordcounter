import java.util.ArrayList;
import java.util.List;

public class WordCounterWithMultipleFilters extends WordCounter{

    public WordCounterWithMultipleFilters(String text) {
        super(text);
    }

    List<WordCounter> wordCounters = new ArrayList<WordCounter>();
    public void add(WordCounter wordCounter){
        wordCounters.add(wordCounter);
    }

    @Override
    public Integer count(){
        Integer result = 0;
        for (String word : getWords()) {
            if (isValid(word)){
                result++;
            }
        }
        return result;
    }

    protected Boolean isValid(String word) {
        for (WordCounter counter:
             this.wordCounters) {
           if (!counter.isValid(word)){
               return  false;
           }
        }
        return true;
    }
}
