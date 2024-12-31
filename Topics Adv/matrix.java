public class matrix {
    public static void main(String args[]){
        //One dimension Matrix
        int a[]={10,20,30,40};
        for(int i=0;i<a.length;i++)
            
            System.out.println(a[i]);
        
        System.out.println("Two Dimension Matrix"); 
        int b[][]={
            {1,2},
            {3,4}
        };
        
        System.out.println(b[0][0]);
        System.out.println(b[0][1]);
        System.out.println(b[1][0]);
        System.out.println(b[1][1]);
    }
}
