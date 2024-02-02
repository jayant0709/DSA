import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Sequential_Digits {
    public static void main(String[] args) {
        seq Seq = new seq();
        int low =100;
        int high = 1300;
        List<Integer> result = Seq.sequentialDigits(low, high);
        System.out.println(result);
    }
}

class seq {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> arr=new ArrayList<>();
        for(int i=1;i<10;i++){
            int a=i;
            int b=i+1;
            while(b<10 && a<=high){
                a=a*10+b;
                if(a>=low && a<=high){
                    arr.add(a);
                }
                b++;
            }
        }
        Collections.sort(arr);
        return arr;
    }
}
