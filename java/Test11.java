/**
 * @author Tola Lemma
 */
public class Test11 {
    public static int Average(int[] ar){
    int total =0;
    for(int i=0;i<ar.length;i++)
    {
        total +=ar[i];
    }
    return total/ar.length; 
    }
    public static void main(String[] args) {
         Test11 abc=new  Test11();
        int[] b={8,2};
        
        System.out.println(abc.Average(b)+"  is output");
    }
}
