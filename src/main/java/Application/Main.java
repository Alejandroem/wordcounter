public static void main(String[] args){
    String text = "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500";
    WordCounter wordCounter = new WordCounter(text);
    System.out.println("The number of words is: "+ wordCounter.countDifferentWords());
}