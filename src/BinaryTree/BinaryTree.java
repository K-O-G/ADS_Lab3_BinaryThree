package BinaryTree;

import Node.*;

/**
 * Created by Катя on 12.02.2017.
 */
public class BinaryTree {
    Node root;

    public boolean add(Student newElement){
        if (root==null){
            root=new Node(newElement);
        }
        else {
            return ins(root,new Node(newElement));
        }
        return true;
    }

//    private Boolean verification (Node current, int id){
//        if (current!=null){
//            verification(current.getLeft(),id);
//            if (current.getData().getStudentIDCard()==id){
//                return false;
//            }
//            verification(current.getRight(),id);
//        }
//        return true;
//    }

    private boolean ins (Node current, Node newElement){
        while (true){
            if (current.getData().getStudentIDCard()>newElement.getData().getStudentIDCard()){
                if (current.getLeft()==null){
                    current.setLeft(newElement);
                    break;
                }
                else current=current.getLeft();
            }
            else if (current.getData().getStudentIDCard()<newElement.getData().getStudentIDCard()){
                if (current.getRight()==null){
                    current.setRight(newElement);
                    break;
                }
                else  current=current.getRight();
            }
            else return false;
        }
        return true;
    }

    public void print (){
        inOrderPrintElement(root);
    }

    private Node inOrderPrintElement (Node current){
        if (current!=null){
            inOrderPrintElement(current.getLeft());
            System.out.println(current.getData().toString());
            inOrderPrintElement(current.getRight());
        }
        return current;

    }



    public Node getRoot() {
        return root;
    }
}
