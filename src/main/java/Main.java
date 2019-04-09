
public class Main{

    public static void main(String[] args){
        String text = "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500";

        WordCounter uniqueWordCounter = new UniqueWordCounter();
        WordCounter beginningInCapsWordCounter = new BeginningInCapsWordCounter();
        WordCounter startingWithVocalsWordCounter = new StartingWithVocalsWordCounter();
        WordCounter moreThanOneCharWordCounter = new MoreThanOneCharWordCounter();

        System.out.println("The number of unique words is: "+ uniqueWordCounter.count(text));
        System.out.println("The number of words beginning with caps is: " + beginningInCapsWordCounter.count(text));
        System.out.println("The number of words beginning with vowels is: " + startingWithVocalsWordCounter.count(text));
        System.out.println("The number of words with more than one characters is: " + moreThanOneCharWordCounter.count(text));


    }
}
