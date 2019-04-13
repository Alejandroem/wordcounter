public class BeginningInCapsWithVocalsWordCounter extends WordCounter {


    public BeginningInCapsWithVocalsWordCounter(String text) {
        super(text);
    }

    @Override
    public Integer count(){
        Integer result = 0;
        /*
        for (String word : words) {
            if (isCap(word.charAt(0))) {
                String lowerCaseWord= word.toLowerCase();
                if(isVocal(lowerCaseWord.charAt(0))){
                    result++;
                }
            }
        }*/
        return result;
    }

    private Boolean isCap(char character){
        Integer code = (int)character;
        return code >= 65 && code <= 90;
    }

    private boolean isVocal(Character c){

        return "aeiou".indexOf(c) >= 0;
    }

    protected Boolean isValid(String word) {
        return null;
    }
}
