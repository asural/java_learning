public class Main {

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        int aryLength = 1000;
        int[] ary = new int[aryLength];
        ary[0] = 1;
        System.out.println(ary[0]);

        for (int i = 1; i < aryLength; i++) {
            ary[i] = ary[i - 1] + 2;
            System.out.println(ary[i]);
        }
        System.out.println((System.currentTimeMillis() - begin));
    }

}

