class Usingarthematictask{
    public static void main(String args[]){
        //Simple interest calculator
        int p=500000;
        int I=7;
        int Y=5;
        int SI=(p*I*Y)/100;
        System.out.println("Interest of your amount - " + SI);
        System.out.println("Total amount you have - "+  (SI+p));
        //Fahrenheit to celsius
        int f=36;
        double c=(f-32)*5/9;
        System.out.println("Fehrenheit to celsius - "+c);
        //celsius to fahrenheit
        int celsius=0;
        double fahrenheit=(celsius*9/5) + 32;
        System.out.println("celsius to Fehrenheit- "+fahrenheit);
        //Age calculator 
        int currentyear=2025;
        int DateofBirth=2005;
        System.out.println("Your age -" +(currentyear-DateofBirth));
        // salary calculator
        double  yearlysalary=500000;
        double monthly= yearlysalary/12;
        double weekly=monthly/4;
        double day= weekly/7;
        double hour= day/8;
        double min= hour/60;
        System.out.println("Your yearly salary is - " + yearlysalary);
        System.out.println("Your monthly salary is - " + monthly);
        System.out.println("Your weekly salary is - " + weekly);
        System.out.println("Your per day salary is - " + day);
        System.out.println("Your per hour salary is - " + hour);
        System.out.println("Your mintues salary is - " + min);
        // Swap the number
        int x=10;
        int y=20;
        int z;
         System.out.println("Before swapping");
         System.out.println("X =" +x);
          System.out.println("Y ="+y);
        z=x;   //x=10 z=10
        x=y;    //y=20 x=20
        y=z;    //z=10 y10
        System.out.println("After swapping");
        System.out.println("X =" +x);
        System.out.println("Y ="+y);
        // miles to kilo meter
        double miles=2;
        double km=miles*1.609;
        System.out.println("Miles to Kilometer - " +km);
        //kilometer to miles
        double kilometer=2;
        double m=kilometer/1.609;
        System.out.println("Kilometer to Miles - " +m);
    }
}