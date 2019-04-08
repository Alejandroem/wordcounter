public class StartingWithVocalsWordCounter extends WordCounter{


    @Override
    public Integer count(String text){
        Integer result = 0;
        String[] words = this.prepareInputForWordCounting(text);
        for (String word: words) {
        String lowerCaseWord= word.toLowerCase();
            if(isVocal(lowerCaseWord.charAt(0))){
                result++;
            }
        }
        return result;
    }

    private boolean isVocal(Character c){
        return "aeiou".indexOf(c) > 0;
    }

}
