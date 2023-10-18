package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        if( t < 0)t*=-1;
        String a = Integer.toString(t);
        int res = 0;
        for( int i = a.length()-1; i >= 0; i--){
            res += a.charAt(i) - '0';
        }
        System.out.println(res);

    }
}
