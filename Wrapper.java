import java.io.*;

class Wrapper
{
     public static void main(String A[])
     {
        int no = 11;

        Integer iobj = new Integer(no);    //Boxing - Converting premitive to wrapper

        System.out.println(no);
        System.out.println(iobj);

        int x = iobj;                  //Unboxing Coonverting Wrapper tp premitive                 
        System.out.println(x);          
     }
}