class day4{
    public static void main(String args[]){
        int num1=10;
        System.out.println("--------------------------------------------------");
        System.out.println("    Even number or Odd number using if...else");
        System.out.println("           -----------------------");
        if(num1%2==0){
            System.out.println(num1 + " is a Even number");
        }
        else{
            System.out.println(num1 +" is a Odd number");
        }
        System.out.println("                                           ");
        System.out.println("    Leap year or Not using if...else");
        System.out.println("           ---------------");
        int year=2025;
        if(year/4==0){
            System.out.println(year +" is not a leap year");
        }
        else{
            System.out.println(year +" is a leap year");
        }
        System.out.println("                                           ");
        System.out.println("    Vote eligblity if...else");
        System.out.println("       ---------------");
        int Age=19;
        if(Age<=18){
            System.out.println(Age +" age is not eligble for vote");
        }
        else{
            System.out.println(Age +" age is eligble for vote");
        }
        System.out.println("                                           ");
        System.out.println("    Biggest three number ladder if..else");
        System.out.println("            ---------------");
        int fNum=10;
        int sNum=30;
        int tNum=93;
        if(fNum>sNum && fNum>tNum){
            System.out.println(fNum +" is a biggest number");
        }
        else if(sNum>fNum && sNum>tNum){
            System.out.println(sNum +" is a biggest number");
        }
        else{
            System.out.println(tNum +" is a biggest number");
        }
    }
}