import java.util.*;
 class binomialco{
 static int binomialCoeff(int n, int k) 
    {
     
     
        if (k == 0 || k == n)
            return 1;
         
      
        return binomialCoeff(n - 1, k - 1) + 
                    binomialCoeff(n - 1, k);
    }
     
    
    public static void main(String[] args) 
   {
        int n = 9, k = 3;
        System.out.printf("Value is(%d,%d) is %d ",
                        n, k, binomialCoeff(n, k));
    }
}
 