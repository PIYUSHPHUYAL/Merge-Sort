/* Name:Piyush Phuyal
   Student ID:2330536
   Class Group:L4CG2(2022)
   College ID:np03cs4a220258@heraldcollege.edu.np    */

import java.util.ArrayList;
import java.util.Scanner;
public class MergeSort_2330536 {
    private ArrayList<Integer> al;

    public ArrayList<Integer> getAl() {
        return al;
    }
                //For getting Input from user I have implemented scanner function and on different module

    public static ArrayList getInput(ArrayList<Integer > al) {
        Scanner scanner = new Scanner(System.in);
        int strin = scanner.nextInt();

        while(strin != 0){
            al.add(strin);
            strin = scanner.nextInt();
        }
        return al;
    }
                       
    public void getOutput(ArrayList<Integer> al){
        sort(al, 0, this.al.size()-1);
        for(int i:getAl()){
            System.out.print(i+" ");
        }
    }
    
    
    public MergeSort_2330536(ArrayList<Integer> al){
        this.al = al;
    }

                      //Merge the provided objects from array list assigning different variables
    public void merge(ArrayList<Integer> al, int beg, int mid, int end){

        ArrayList<Integer> al2 = new ArrayList<Integer>();

        int left = beg;
        int right = mid+1;

        while(left<=mid && right<=end){
            if(al.get(left)<=al.get(right)){
                al2.add(al.get(left));
                left++;
            }else{
                al2.add(al.get(right));
                right++;
            }
        }

//        any of these while loop executes
        while(left<=mid){
            al2.add(al.get(left));
            left++;
        }

        while(right<=end){
            al2.add(al.get(right));
            right++;
        }

        int i = 0;
        int j = beg;

//        setting up the sorted array

        while(i<al2.size()){
            al.set(j, al2.get(i++));
            j++;
        }
    }
                 //Sort the provided array list
    public void sort(ArrayList<Integer> al, int beg,int end){

//        dividing till the list breaks down into single element
        if(beg<end && (end-beg)>=1){
            int mid = (end + beg)/2;
            sort(al, beg, mid);
            sort(al, mid+1, end);

//          merging sorted array
            merge(al, beg,mid,end);
        }
    }
    
   // Here is the main module for the MergeSort
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        MergeSort_2330536 ms = new MergeSort_2330536(al);
        System.out.println("Enter numbers as much as you want!, type 0 for exit:");
        ms.getInput(al);
        System.out.println("---Sorted Array---From---MergeSort");
        ms.getOutput(al);
    }

}
   
   