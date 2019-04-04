import java.util.ArrayList;

public class WordCounter {

    public WordCounter(){
    }

    public Integer countDifferentWords(String text){
        return this.countDifferentWords(this.prepareInputForCounting(text));
    }

    private String[] prepareInputForCounting(String text){
        String temporalText = this.cleanInput(text);
        return temporalText.split(" ");
    }

    private Integer countDifferentWords(String[] words){
        ArrayList<String> differentWords = new ArrayList<String>();
        for (String word: words) {
            String lowerCaseWord= word.toLowerCase();
            if(!differentWords.contains(lowerCaseWord)){
                differentWords.add(lowerCaseWord);
            }
        }
        return differentWords.size();
    }


    private String cleanInput(String input){
        String regexToSearch = "/[-!$%^&*()_+|~=`{}\\[\\]:\";'<>?,.\\/]/";
        return input.replace(regexToSearch, " ");
    }

    public static void main(String[] args){
        String text = "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500";
        WordCounter wordCounter = new WordCounter();
        wordCounter.countDifferentWords(text);
        System.out.println("The number of words is: "+ wordCounter.countDifferentWords());
    }

}
