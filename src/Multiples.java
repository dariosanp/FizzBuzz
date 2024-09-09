public class Multiples {
    public static void main(String[] args) {
        int j = 0;
        int i = 3;
        while (i < 1000){
            if (i % 3 == 0){
                j ++;
                i ++;
            } else if (i % 5 == 0) {
                j++;
                i++;
            } else {
                i++;

            }
        }
        System.out.println(j);

    }
}
