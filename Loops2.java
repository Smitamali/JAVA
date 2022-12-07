class Loops
{
    public static void main(String arg[])
    {
        int Arr[] = {11,22,33,44};
        int iCnt = 0;

        System.out.println("Traversal of array using do while loop");
        iCnt = 0;
        do
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        }while(iCnt < Arr.length);
    }
}