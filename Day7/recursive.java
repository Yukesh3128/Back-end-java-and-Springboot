class recursive{
    static int sum(int y){
        if (y==1){
            return 1;
        }
        else{
            return y*sum(y-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}