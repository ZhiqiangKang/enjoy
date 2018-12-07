package org.ziyuzile.demo.interview;

public class BinaryTree {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node root = bt.init();
        bt.travel(root);
    }

    private void travel(Node node){
        if (node == null) return;

        System.out.println(node);

        if(node.getLeft() != null){
            travel(node.getLeft());
        }

        if(node.getRight() != null){
            travel(node.getRight());
        }
    }

    private Node init(){
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");

        nodeA.setLeft(nodeB);
        nodeA.setRight(nodeC);
        nodeB.setLeft(nodeD);
        nodeB.setRight(nodeE);
        nodeC.setLeft(nodeF);
        nodeC.setRight(nodeG);
        return nodeA;
    };

    class Node{
        private String id;
        private Node left;
        private Node right;

        public Node() {
        }

        public Node(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        @Override
        public String toString() {
            return "Node{" +
                    "id='" + id + '\'' +
                    '}';
        }
    }
}
