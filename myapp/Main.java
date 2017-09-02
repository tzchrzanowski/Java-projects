package calcEngineFinal.myapp;

import calcEngineFinal.CalculateHelper;
import calcEngineFinal.InvalidStatementException;
import calcEngineFinal.MathEquation;
import calcEngineFinal.Adder;
import calcEngineFinal.CalculateBase;
import calcEngineFinal.Divider;
import calcEngineFinal.MathEquation;
import calcEngineFinal.Multiplier;
import calcEngineFinal.Subtracter;

public class Main {
    public static void main (String[] args){

        String[] statements = {
                "add 1.0",      // error: incorrect number of values
                 "add xx 25.0",  // error: non numeric data
                "addX 0.0 0.0", // error: invalid command
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "substract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        CalculateHelper helper = new CalculateHelper();
        for ( String statement: statements) {
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch (InvalidStatementException e){
                System.out.println(e.getMessage());
                if( e.getCause() != null )
                    System.out.println(" Original exception: " + e.getCause().getMessage());
            }
        }
    }
}
