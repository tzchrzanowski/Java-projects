package calcEngineFinal;

public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;

    // mutators
    public void setLeftVal(double newValue){ this.leftVal = newValue; }
    public void setRightVal(double newValue){ this.rightVal = newValue; }
    public void setResult(double result){ this.result = result; }
    // accessors
    public double getLeftVal(){ return leftVal; }
    public double getRightVal(){ return rightVal; }
    public double getResult(){ return result; }

    public CalculateBase(){}
    public CalculateBase( double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public abstract void calculate();
}
