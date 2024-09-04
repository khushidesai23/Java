//KHUSHI DESAI
//21BCP264

import java.util.*;
public class matrix 
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers of rows for matrix1: ");
        int r1=sc.nextInt();
        System.out.println("enter numbers of columns for matrix1: ");
        int c1=sc.nextInt();
        int mat1[][]=new int [r1][c1];

        System.out.println("enter numbers of rows for matrix2: ");
        int r2=sc.nextInt();
        System.out.println("enter numbers of columns for matrix2: ");
        int c2=sc.nextInt();
        int mat2[][]=new int [r2][c2];

        if(c1==r2){
        System.out.println("enter the elements of matrix 1: " );
        for(int i=0; i<r1; i++)
        {
            for(int j=0; j<c1; j++)
            mat1[i][j]=sc.nextInt();
        }
        System.out.println("enter the elements of matrix 2: " );
        for(int i=0; i<r2; i++)
        {
            for(int j=0; j<c2; j++)
            mat2[i][j]=sc.nextInt();
        }


        System.out.println("resultant matrix: ");
        int mat3[][]=new int[r1][c2];
        for(int i=0; i<r1; i++)
        { 
            for(int j=0; j<c2; j++)
            { 
               
                for(int k=0; k<r2; k++)
                {
                    mat3[i][j]+=mat1[i][k]*mat2[k][j];
                }
                System.out.print(mat3[i][j]+" ");
               
            }
            System.out.println();
           
        }
        }
       
    else
        System.out.print("c1 & r2 should be same!!"); 
    }
}
//complexity of the program is O(n^3)