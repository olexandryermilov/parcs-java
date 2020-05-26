import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

import parcs.*;

public class Bluck {
    private final static int NODES = 2;

    public static void main(String[] args) throws Exception {
        task curtask = new task();
        curtask.addJarFile("DFS.jar");
        ArrayList<Node> nodes = fromFile(curtask.findFile("input"));

        AMInfo info = new AMInfo(curtask, null);
        for(Node n: nodes) {
            point p = info.createPoint();
            channel c = p.createChannel();
            p.execute("DFS");
            c.write(n);
            System.out.println("Waiting for result...");
            System.out.println("Result: " + c.readLong());
        }
        curtask.end();
    }

    public static ArrayList<Node> fromFile(String filename) throws Exception {
        Scanner sc = new Scanner(new File(filename));
        int l = sc.nextInt();
        int r = sc.nextInt();
        ArrayList<Node> res = new ArrayList<>();
        int _l = l;
        int mod = (r - l) / NODES;
        for (int i = 0; i < NODES; i++) {
            res.add(new Node(_l, _l + mod));
            _l = Math.min(mod + _l, r);
        }
        return res;
    }
}
