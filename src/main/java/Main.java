
public class Main{

    public static void main(String[] args){
        String text = "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500";

        WordCounter uniqueWordCounter = new UniqueWordCounter(text);
        WordCounter beginningInCapsWordCounter = new BeginningInCapsWordCounter(text);
        WordCounter startingWithVocalsWordCounter = new StartingWithVocalsWordCounter(text);
        WordCounter moreThanOneCharWordCounter = new MoreThanOneCharWordCounter(text);

        WordCounter moreThanOneCharInCapsWordCounter = new MoreThanOneCharInCapsWordCounter(text);
        WordCounter moreThanOneCharWithVocalsCounter = new MoreThanOneCharWithVocalsCounter(text);
        WordCounter beginningInCapsWithVocalsWordCounter = new BeginningInCapsWithVocalsWordCounter(text);

        System.out.println("The number of unique words is: "+ uniqueWordCounter.count());
        System.out.println("The number of words beginning with caps is: " + beginningInCapsWordCounter.count());
        System.out.println("The number of words beginning with vowels is: " + startingWithVocalsWordCounter.count());
        System.out.println("The number of words with more than one characters is: " + moreThanOneCharWordCounter.count());

        System.out.println("The number of words with more than one characters and beginning with caps is: " + moreThanOneCharInCapsWordCounter.count());
        System.out.println("The number of words with more than one characters and beginning with vowels is: " + moreThanOneCharWithVocalsCounter.count());
        System.out.println("The number of words beginning with vowels and beginning with caps is: " + beginningInCapsWithVocalsWordCounter.count());

    }
}
