import edu.princeton.cs.algs4.StdIn;

public class MainClass {
    public static void main(String[] args) {

        int n = StdIn.readInt();
        QuickFind qf = new QuickFind(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(qf.connected(p, q)) {
                qf.union(p,q);
            }
        }
    }

}
