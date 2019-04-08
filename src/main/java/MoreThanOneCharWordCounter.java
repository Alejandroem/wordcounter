public class MoreThanOneCharWordCounter() extends WordCounter{
    public void Count(){
        for(String word:words){
            if(word.lenght>=2){
                result++;
            }
        }
    }
}

