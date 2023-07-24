import java.util.*;
public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        findSol(arr, n);
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void findSol(int[] arr,int n) {
        int count = 0;
        
        for(int i=0;i<n;i++) {
            if(arr[i] == 0) {
                count++;
                arr[i] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(arr);
        for(int i = 0;i<n;i++) {
            if(arr[i] == Integer.MAX_VALUE) {
                arr[i] = 0;
            }
        }
    }
}
