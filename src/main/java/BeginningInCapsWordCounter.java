public class BeginningInCapsWordCounter extends WordCounter{

    @Override
    public Integer count(String text){
        Integer result = 0;
        String[] words = this.prepareInputForWordCounting(text);
        for (String word : words) {
            if (isCap(word.charAt(0))) {
                result++;
            }
        }
        return result;
    }

    private Boolean isCap(char character){
        Integer code = (int)character;
        return code >= 65 && code <= 90;
    }

}


