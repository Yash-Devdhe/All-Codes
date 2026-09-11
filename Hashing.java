import java.util.Scanner;
public class Hashing {
    public static void main(String[] args) {

        int arr[] = {12, 23, 1, 2, 3, 4};

        Scanner sc = new Scanner(System.in);

        // Number Hashing
        int target = sc.nextInt();

        int Hash[] = new int[25];

        for (int i = 0; i < arr.length; i++) {
            Hash[arr[i]] += 1;
        }

        System.out.println(Hash[target]);

        // Character Hashing
        char s[] = {'a', 'b', 'm', 'v'};


        char charTarget = sc.next().charAt(0);
        int HashChar[] = new int[26];

        for (int i = 0; i < s.length; i++) {
            HashChar[s[i] - 'a']++;
        }
        map<int,int> mpp;
        for (int i = 0; i < s.length; i++) {
            mpp[arr[i]]++;
        }

        System.out.println(HashChar[charTarget - 'a']);
        System.out.println(mpp[chartarget]);
    }
}