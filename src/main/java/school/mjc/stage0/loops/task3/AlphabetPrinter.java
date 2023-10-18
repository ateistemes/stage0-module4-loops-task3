package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        for( int i = 0; i <26;i++ ){
            char c = (char)(i + 'a');
            System.out.println(c);
        }
    }
}
