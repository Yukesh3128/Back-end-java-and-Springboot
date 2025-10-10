class task{
    public static void main(String[] args) {
        int mark1=60;
        int mark2=93;
        int mark3=34;
        int mark4=71;
        int mark5=80;
        int total=mark1+mark2+mark3+mark4+mark5;
        if (mark1>35 && mark2>35 && mark3>35 && mark4>35 && mark5>35) {
            System.out.println("Your are pass all the subject");
            System.out.println("Your mark averager - "+ total/5+ "%");
        }
        else{
            System.out.println("fail in some subject");
        }
    }
}