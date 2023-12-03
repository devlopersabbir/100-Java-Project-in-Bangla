// 1 + 2 + 3... + 10 = ?

class LSum {
    public static void main(String[] a) {
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}