package BinaryTree;

import Node.*;

/**
 * Created by Катя on 12.02.2017.
 */
public class BinaryTree1 {
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

    public Node searchFemale5Married (Node current, int academicYear, String gender, String marital){
        if (current!=null){
            searchFemale5Married(current.getLeft(), academicYear,gender,marital);
            if (current.getData().getAcademicYear()==academicYear &&
                    current.getData().getGender().equals(gender)&&
                    current.getData().getMaritalStatus().equals(marital)) {
                System.out.println(current.getData().toString());
            }
            searchFemale5Married(current.getRight(), academicYear,gender,marital);
        }
        return current;
    }

    public Node getRoot() {
        return root;
    }
}
