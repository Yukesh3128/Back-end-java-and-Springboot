class method{
    static void add(){ //Without args,without return
        int a=0;
        int b=5;
        System.out.println(a+b);
    }
    static void sub(int a,int b){ //With args,without return
        System.out.println(a-b);
    }
    static int div(){ //without args,with return
        int a=30;
        int b=2;
        return a/b;
    }
    static int mul(int a, int b){ //with args,with return
        return a*b;
    }
    public static void main(String[] args) {
        add();
        sub(15,5);
        System.out.println(div());
        System.out.println(mul(10,2));
    }
}