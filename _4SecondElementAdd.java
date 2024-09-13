public class _4SecondElementAdd {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int index=0;
        int arr2[]=new int[arr.length+1];
        for(int i=0;i<arr2.length;i++)
        {
            if(i==2)
            {
                arr2[i]=9;
                System.out.println(arr2[i]);
                arr2[++index]=arr[i];
            }
            else
            {
                arr2[index]=arr[i];
                System.out.println(arr2[i]);
                index++;
            }
        }
    }
}
        
        