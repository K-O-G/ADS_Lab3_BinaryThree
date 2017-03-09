package BinaryTree;

import Node.*;

/**
 * Created by Катя on 12.02.2017.
 */
public class BinaryTree2 {
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

    public Node searchDelete (Node current, int academicYear, String gender, String marital){
        if (current!=null){
            searchDelete(current.getLeft(),academicYear,gender,marital);
            if (current.getData().getAcademicYear()==academicYear &&
                    current.getData().getGender().equals(gender)&&
                    current.getData().getMaritalStatus().equals(marital)) {
                delete(root, current.getData());
            }
            searchDelete(current.getRight(),academicYear,gender,marital);
        }
        return current;
    }

    private Node delete (Node current, Student student){
        if (current==null){
            return current;
        }
        if (student.getStudentIDCard()<current.getData().getStudentIDCard()){
            current.setLeft(delete(current.getLeft(),student));
        }
        else if (student.getStudentIDCard()>current.getData().getStudentIDCard()){
            current.setRight(delete(current.getRight(),student));
        }
        else if (current.getRight()!=null&&current.getLeft()!=null){
            current.setData(minimum(current.getRight()).getData());
            delete(current.getRight(),current.getData());
        }
        else {
            if (current.getLeft() != null) {
                current = current.getLeft();

            }
            else {
                current = current.getRight();
            }
            print();
            System.out.println();
        }

        return current;
    }


    private Node minimum (Node current){
        if (current.getLeft()==null){
            return current;
        }
        return minimum(current.getLeft());
    }

}
