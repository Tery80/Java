package oOp.book;

public class Main {
    public static void main(String[] args) {
        Book cleanCode = new Book("Robert Martin", "Clean Code", 2008, 464);
        //System.out.println(cleanCode.getBookTitle() +" "+ cleanCode.getAuthor() +" "+ cleanCode.getYear() +"y "+ cleanCode.getPageAmount() +" pages");
        System.out.println(cleanCode);

        Book unitTesting = new Book("Lasse Koskela", "Effective Unit Testing", 2013, 248);
        //System.out.println(unitTesting.getBookTitle() +" "+ unitTesting.getAuthor() +" "+ unitTesting.getYear() +"y "+ unitTesting.getPageAmount() +" pages");
        System.out.println(unitTesting);

        Book headFirstJava = new Book("Kathy Sierra and Bert Bates", "Head First Java", 2008, 688);
        //System.out.println(headFirstJava.getBookTitle() +" "+ headFirstJava.getAuthor() +" "+ headFirstJava.getYear() +"y "+ headFirstJava.getPageAmount() +" pages");
        System.out.println(headFirstJava);

        if (cleanCode.Equals(cleanCode)){
            System.out.println( cleanCode + " it's the same book as " + cleanCode);
        }
        if (cleanCode.equals(unitTesting)){
            System.out.println(cleanCode + " it's the same book as " + unitTesting);
        }else {
            System.out.println(cleanCode + " it's different book as " + unitTesting);
        }
    }
}