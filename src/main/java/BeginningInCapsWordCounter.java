public clas BeginningInCapsWordCounter extends WordCounter{

    public void Count(){
        for (String word : words) {
            if (isCap(word.charAt(0))) {
                result++;
            }
        }
    }

    private String isCap(char c){
        return (c=65 && c<=90);
    }

}


