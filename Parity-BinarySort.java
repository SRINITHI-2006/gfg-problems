import java.util.*;
class TestClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   
        while(t > 0){
             t = t - 1;
            int n = sc.nextInt();
            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();
            for(int i = 0; i < n; i++){
                int num = sc.nextInt();
                int setBits = Integer.bitCount(num);
                if(setBits % 2 == 0)
                    even.add(num);
                else
                    odd.add(num);
            }

            Collections.sort(even);
            Collections.sort(odd);
            for(int x : even)
                System.out.print(x + " ");
            for(int x : odd)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
