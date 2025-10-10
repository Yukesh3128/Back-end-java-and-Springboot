class operators{
    public static void main(String args[]){
        int num1=10;
        int num2=2;
        //Assignment operator
        System.out.println("Additional - "+(num1+=num2));
        System.out.println("subraction - " +(num1-=num2));
        System.out.println("Multiplication - " +(num1*=num2));
        System.out.println("Division - " +(num1/=num2));
        System.out.println("Modulo - " +(num1%=num2));
        //Relational operator
        int firstNumber=20;
        int secondNumber=30;
        System.out.println("Greater than - "+(firstNumber<secondNumber));
        System.out.println("Greater than or Equal to - " +(firstNumber<=secondNumber));
        System.out.println("less than - " +(firstNumber>secondNumber));
        System.out.println("less than or Equal to - " +(firstNumber>=secondNumber));
        System.out.println("Equal to - " +(firstNumber==secondNumber));
        System.out.println("Not Equal to - " +(firstNumber!=secondNumber));
        //increment and Decrement operator
        int increValue=20;
        int decreValue=30;
        System.out.println("post increment - " +(increValue++));
        System.out.println("pre increment - " +(++increValue));
        System.out.println("post decrement - " +(decreValue--));
        System.out.println("pre decrement - " +(--decreValue));
        // Logical operator
        int logNum1=5;
        int logNum2=10;
        System.out.println("AND(True) - " +(logNum1!=logNum2 && logNum1<logNum2));
        System.out.println("AND(False) - " +(logNum1==logNum2 && logNum1<logNum2));
        System.out.println("OR(True) - " +(logNum1==logNum2 || logNum1<logNum2));
        System.out.println("OR(False) - " +(logNum1==logNum2 || logNum1>logNum2));
        System.out.println("NOT(True) - " + !(logNum1!=logNum2));
        System.out.println("NOT(False) - " + !(logNum1==logNum2));
    }
}