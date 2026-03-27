package arraysLc;

 

class ArraysSearch {
    
    public static void main(String[] args) {
        
        int a[] = {10,20,30,40};
        int search = 50;
        
        boolean found = false;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==search)
            {
                found = true;
                break;   // important
            }
        }

        if(found)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}