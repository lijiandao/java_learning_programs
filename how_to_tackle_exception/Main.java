
import round.Round;
import round.Round_ex_custom;

public class Main {
    public static void main(String[] args) {
        Round r = new Round(-1);
        System.out.println(r.getArea());
        Round_ex_custom r2 = new Round_ex_custom(-1);
        System.out.println(r2.getArea());
    }    
}
