import java.util.*;
public class AlphabetTriangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        for(int j=0;j<l.size();j++){
            for(int k=0;k<l.get(j);k++){
                for(int m=0;m<k+1;m++){
                    System.out.print(s.charAt(k));

                }
                System.out.println();
            }
        }

    }
    
}
