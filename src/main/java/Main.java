public class Main{

    public static void main(String[] args){
        String text = "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500";

        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter(text);
        BeginningInCapsWordCounter beginningInCapsWordCounter = new BeginningInCapsWordCounter(text);
        MoreThanOneCharWordCounter moreThanOneCharWordCounter = new MoreThanOneCharWordCounter(text);
        StartingWithVocalsWordCounter startinWithVocalsWordCounter = new StartingWithVocalsWordCounter(text);

        System.out.println("The number of unique words is: "+ uniqueWordCounter.GetCount());
        System.out.println("The number of words beginning with vowels is: " + startinWithVocalsWordCounter.GetCount());
        System.out.println("The number of words with more than one characters is: " + moreThanOneCharWordCounter.GetCount());
        System.out.println("The number of words beginning with caps is: " + beginningInCapsWordCounter.GetCount());

    }
}
