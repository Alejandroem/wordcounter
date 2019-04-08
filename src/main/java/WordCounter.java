public abstract class WordCounter {

    public WordCounter(){
    }

    public abstract Integer count(String text);

    public String[] prepareInputForWordCounting(String text){
        return this.splitTextIntoWords(this.removeSymbolsFromText(text));
    }

    public String[] splitTextIntoWords(String text){
        return text.split(" ");
    }

    private String removeSymbolsFromText(String input){
        String regexToSearch = "/[-!$%^&*()_+|~=`{}\\[\\]:\";'<>?,.\\/]/";
        return input.replace(regexToSearch , " ");
    }
}
