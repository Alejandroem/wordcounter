public class UniqueWordCounter extends WordCounter{
    private ArrayList<String> differentWords;

    public void Count(){
        this.differentWords = new ArrayList<String>();

        for (String word: words) {
            String lowerCaseWord= word.toLowerCase();
            if(!this.differentWords.contains(lowerCaseWord)){
                this.differentWords.add(lowerCaseWord);
            }
        }
        result = this.differentWords.size();
    }

}

