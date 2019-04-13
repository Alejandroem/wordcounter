public class MoreThanOneCharWithVocalsCounter extends WordCounter{

    public MoreThanOneCharWithVocalsCounter(String text) {
        super(text);
    }

    @Override
    public Integer count(){
        Integer result = 0;
        for (String word : getWords()) {
            /*
            String lowerCaseWord= word.toLowerCase();
            if ((word.trim().length()>2) && (isVocal(lowerCaseWord.charAt(0)))) {
                result++;
            }*/
        }
        return result;
    }

    protected Boolean isValid(String word) {
        return null;
    }
}
