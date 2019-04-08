public class MoreThanOneCharWordCounter extends WordCounter {


    @Override
    public Integer count(String text) {
        String[] words = this.prepareInputForWordCounting(text);
        Integer result = 0;
        for (String word : words) {
            if(word.trim().length()>2){
                result++;
            }
        }
        return result;
    }
}

