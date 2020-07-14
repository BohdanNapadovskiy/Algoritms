public class QuickFind {
    private int[] id;

    public QuickFind(int n) {
        this.id = new int[n];
        for (int i = 0; i < n; i++)
            this.id[i] = i;
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < this.id.length; i++) {
            if (id[i] == pid)
                id[i] = qid;
        }
    }
}
