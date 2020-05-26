import java.io.Serializable;

public class Node implements Serializable {
    private int l;
    private int r;
    private int time;

    public Node(int l, int r) {
        this.l = l;
        this.r = r;
        this.time = 0;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
