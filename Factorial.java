public class Factorial {
    public static void main(String[] args) {
        int fact=5;
        int r,m;
         r=6;m=10;
         if(r<=m)
         {
             int rfact=1;
             int mfact=1;
             int rminm=1;
             for(int i=1;i<fact;i++)
                mfact=mfact*i;
             for(int i=1;i<fact;i++)
                 rfact=rfact*i;
             for(int i=1;i<fact;i++)
                 rminm=(m-r)*i;
         int F= mfact/rfact*rminm;
         System.out.println("F "+F);
         }

    }
}
