package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int res = 1;
        if( first == 0 || second == 0){
            if(first < second)first = second;
            res = first;
        }
        else {
            for (int i = 1; i <= first && i <= second; i++) {
                if (first % i == 0 && second % i == 0) {
                    if (i >= res) res = i;
                }
            }
        }
        System.out.println(res);
    }
}
