class InvalidInputException extends Exception {

    @Override
    public String getMessage() {
        return "the value should not be 8 or the value of b is other than 9";
    }
}

class CannotDivideByZero extends Exception {

    @Override
    public String getMessage() {
        return "Cannot divide by zero exception";
    }
}

class maxInputException extends Exception {

    @Override
    public String getMessage() {
        return "the value of the parameter Cannot be greater than 10000 exception";
    }
}
class maxMultipyInputException extends Exception {

    @Override
    public String getMessage() {
        return "Cannot multipy by Greater than 7000 exception";
    }
}


class customCalculator {
    double add(double a,double b) throws InvalidInputException,maxInputException{
        
        if(a==8 ||b==9){
            throw new InvalidInputException();
        }
        else if(a>10000||b>10000){
            throw new maxInputException();
        }
        return a+b;
    }
    double subtract(double a,double b)throws maxInputException{
        if(a>10000||b>10000){
            throw new maxInputException();
        }
        return a-b;
    }
    double multiply(double a,double b)throws maxInputException,maxMultipyInputException{
        if(a>10000||b>10000){
            throw new maxInputException();
        }
        else if(a>7000||b>7000){
            throw new maxMultipyInputException();
        }
        return a*b;
    }
    double division(double a,double b) throws CannotDivideByZero,maxInputException{
        if(b==0){
            throw new CannotDivideByZero();
        }
        else if(a>10000||b>10000){
            throw new maxInputException();
        }
        return a/b;
    }
}


public class custom_calculator {
    public static void main(String[] args) throws InvalidInputException,CannotDivideByZero,maxMultipyInputException,maxInputException{
        /*
        Exercise : You have to creat ea custom calculator with following operations:
        1) ->Addition
        2)->Substraction
        3) ->Multiplication
        4) ->Division
        Which throws the following Eceptions
        1. invalid input exception ex:9,10
        2. cannot divide by 0 exceptoion
        3.max  input exception if any of the inputs is greater than 1000
        4.max multiplier reached exception -don not allow any multiplicatioj input to be greater than 7000 
         */

        customCalculator c= new customCalculator();
        // c.add(8,9);
        // c.division(2,0);
        c.multiply(7001, 12);
        // c.subtract(100000,30);
        
    }
}
