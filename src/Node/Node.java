package Node;

/**
 * Created by Катя on 12.02.2017.
 */
public class Node {
    Student data;
    Node left;
    Node right;

    public Node(Student data) {
        this.data = data;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
