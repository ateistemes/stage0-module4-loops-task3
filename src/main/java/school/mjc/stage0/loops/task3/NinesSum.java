package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int l) {
        int res = 0;
        int n = 9;
        for( int i = 0; i < l; i++){
            res+= n;
            n*=10;
            n+=9;
        }
        System.out.println(res);

    }
}
