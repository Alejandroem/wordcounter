public class MoreThanOneCharWordCounter() extends WordCounter{
    public void Count(){
        for (String word: words) {
        String lowerCaseWord= word.toLowerCase();
            if(isVocal(lowerCaseWord.charAt(0))){
                result++;
            }
        }
    }

    private String isVocal(char c){
        String regexVocals = "/[aeiou]/";
        return c.equals(regexVocals);
    }

}