import java.util.ArrayList;

public abstract class WordCounter {

    private String text;
    public String[] words;
    public result;

    public WordCounter(String text){
        this.text = text;
    }

    public abstract void Count();

    public int GetCount()
    {
        this.words = this.prepareInputForCounting(this.text);
        this.count();
        return result;
    }

    public String[] prepareInputForCounting(String text){
        String temporalText = this.cleanInput(text);
        return temporalText.split(" ");
    }

    private String cleanInput(String input){
        String regexToSearch = "/[-!$%^&*()_+|~=`{}\\[\\]:\";'<>?,.\\/]/";
        return input.replace(regexToSearch, " ");
    }
}
