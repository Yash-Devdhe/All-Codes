class Solution {

    /**
     * Swaps two integers and returns them as an array.
     *
     * @param a the first integer
     * @param b the second integer
     * @return an array with the two integers swapped
     */

    public int[] swap(int a, int b) {
        a = a^b;
        b = b^a;
        a = a^b;

        return new int[]{a,b};
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int a = 10;
        int b = 20;

        int[] result = obj.swap(a, b);

        System.out.println("a = " + result[0]);
        System.out.println("b = " + result[1]);
    }
}