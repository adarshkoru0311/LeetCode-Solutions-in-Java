class Solution {
    public int removeDuplicates(int[] a) {
        
        int j=0;
        for(int i=1;i<a.length;i++)
        {
           if(a[j]!=a[i])
           {
            j++;
            a[j]=a[i];

           }
        }
        return j+1;
    }
}