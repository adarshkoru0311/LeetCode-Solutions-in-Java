class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        
        int x = a.length;
        for(int i=0;i<x;i++)
        {
            if(i<m)
                continue;
            else
                a[i] = b[i-m];
        }
        for(int i=0;i<x;i++)
        {
            for(int j=i+1;j<x;j++)
            {
                if(a[i]>a[j])
                {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for(int i=0;i<x;i++)
        {
            if(a[i]!=0)
                System.out.print(a[i]+",");
        }
    }
}