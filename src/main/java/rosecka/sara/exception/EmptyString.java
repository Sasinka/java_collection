package rosecka.sara.exception;

public class EmptyString  extends Exception{
    public EmptyString (String e){
        super(e+" is Not possible input, please repeate your input.");
    }
}
