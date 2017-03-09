import BinaryTree.*;
import Node.*;

import java.util.Scanner;

/**
 * Created by Катя on 12.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        level3();
    }

    public static void level1(){
        BinaryTree binaryTree = new BinaryTree();
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Input student ID card:");
            Student student = new Student(in.nextInt());
            binaryTree.add(student);
            binaryTree.print();
        }
    }

    public static void level2(){
        Scanner in = new Scanner (System.in);
        BinaryTree1 binaryTree = new BinaryTree1();
        for (int i = 0; i < 10; i++) {
            System.out.print("Input student ID card:");
            Student student = new Student(in.nextInt());
            binaryTree.add(student);
            binaryTree.print();
        }
        System.out.println("\nStudent search\nPlease, input data");

        System.out.print("Academic year:");
        int acY = in.nextInt();
        System.out.print("Gender:");
        String gender = in.next();
        System.out.print("Marital status:");
        String status = in.next();
        binaryTree.searchFemale5Married(binaryTree.getRoot(),acY,gender,status);

    }

    public static void level3(){
        Scanner in = new Scanner (System.in);
        BinaryTree2 binaryTree = new BinaryTree2();
        for (int i = 0; i < 10; i++) {
            System.out.print("Input student ID card:");
            Student student = new Student(in.nextInt());
            binaryTree.add(student);
            binaryTree.print();
        }


        System.out.println("\nStudent search\nPlease, input data");

        System.out.print("Academic year:");
        int acY = in.nextInt();
        System.out.print("Gender:");
        String gender = in.next();
        System.out.print("Marital status:");
        String status = in.next();
        binaryTree.searchFemale5Married(binaryTree.getRoot(),acY,gender,status);

        System.out.println("\nResult after removing fifth-year students – females who got married\n");
        binaryTree.searchDelete(binaryTree.getRoot(),acY,gender,status);
        System.out.println();
        binaryTree.print();

    }
}
