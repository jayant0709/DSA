class Solution {
    public String getHint(String secret, String guess) {
        int bull=0;
        int cow=0;
        int[] freq1=new int[10];
        int[] freq2=new int[10];
        int len = Math.min(secret.length(), guess.length());
        for(int i=0;i<len;i++){
            if(secret.charAt(i)==guess.charAt(i)) bull++;
            else{
                freq1[secret.charAt(i) - '0']++;
                freq2[guess.charAt(i) - '0']++;
            }
        }
        int sum=0;
        for(int i=0;i<10;i++){
            sum+=Math.min(freq1[i],freq2[i]);
        }
        cow=sum;

        return bull + "A" + cow + "B";
    }
}
public class Bulls_and_Cows {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage
        String secret = "1807";
        String guess = "7810";

        String result = solution.getHint(secret, guess);

        System.out.println("Secret: " + secret);
        System.out.println("Guess: " + guess);
        System.out.println("Result: " + result);
    }
}

