public class MoreThanOneCharInCapsWordCounter extends WordCounter  {


    public MoreThanOneCharInCapsWordCounter(String text) {
        super(text);
    }

    @Override
    public Integer count() {
        Integer result = 0;
        /*for (String word : getWords()) {
            if ((word.trim().length()>2) && (isCap(word.charAt(0)))){
                result++;
            }
        }*/
        return result;
    }

    protected Boolean isValid(String word) {
        return null;
    }

}
