class methodoverloading{
    static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
    static String add(String a,String b){
        return a+b;
    }
    public static void main(String[] args) {
        int num1=add(1,1);
        double num2=add(2,2);
        String num3=add("4","2");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

}