import java.util.ArrayList;

public class WordCounter {

    private String text;
    private ArrayList<String> differentWords;

    public WordCounter(String text){
        this.text = text;
    }

    public Integer countDifferentWords(){
        String[] words = this.prepareInputForCounting();
        this.differentWords = new ArrayList<String>();

        for (String word: words) {
            String lowerCaseWord= word.toLowerCase();
            if(!this.differentWords.contains(lowerCaseWord)){
                this.differentWords.add(lowerCaseWord);
            }
        }

        return this.differentWords.size();
    }

    private String[] prepareInputForCounting(String text){
        String temporalText = this.cleanInput(text);
        return temporalText.split(" ");
    }

    private String cleanInput(String input){
        String regexToSearch = "/[-!$%^&*()_+|~=`{}\\[\\]:\";'<>?,.\\/]/";
        return input.replace(regexToSearch, " ");
    }

    public static void main(String[] args){
        String text = "Laura guapa laura guapa";
        WordCounter wordCounter = new WordCounter(text);
        System.out.println("The number of words is: "+ wordCounter.countDifferentWords());
    }

}
