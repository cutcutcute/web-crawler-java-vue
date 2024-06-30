package exception;

public class BadRequestRunCrawler extends RuntimeException{

    public BadRequestRunCrawler(String message){
        super(message);
    }
}
