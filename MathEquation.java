package calcEngineFinal;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    // mutators
    public void setLeftVal(double newValue){ leftVal = newValue; }
    public void setRightVal(double newValue){ rightVal = newValue; }
    public void setOpCode(char newValue){ opCode = newValue; }
    // accessors
    public double getLeftVal(){ return leftVal; }
    public double getRightVal(){ return rightVal; }
    public char getOpCode(){ return opCode; }
    public double getResult(){ return result; }

    public MathEquation(){}
    public MathEquation(char opCode){
        this.opCode = opCode;
    }
    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
    public void execute(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();
    }
    public void execute(int leftVal, int rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();
        result = (int)result;
    }
    public void execute(){
        switch(opCode){
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result =  rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }
    }
}
