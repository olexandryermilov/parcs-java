import java.util.ArrayList;

import parcs.*;

public class DFS implements AM {
    private boolean isPrime(int x) {
        if (x == 2) return true;
        if (x % 2 == 0) return false;
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public void run(AMInfo info) {
        Node n = (Node) info.parent.readObject();
        System.out.println("[" + n.getL() + " " + n.getR() + "] Build started.");

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = n.getL(); i <= n.getR(); i++) {
            if (isPrime(i)) res.add(i);
        }
        System.out.println("[" + n.getL() + " " + n.getR() + "] Build finished.");
        info.parent.write(res);
    }
}
