class Main {
    static int fact(int n){
        if(n==0) return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int rows = 4;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j <= i; j++) {
                int val = fact(i) / (fact(j) * fact(i - j));//NcR
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
