class Solution {
    public int findDuplicate(int[] a) {

        // Floyd's Cycle-Finding algorithm (without modifying array)
        int s=0,f=0;
        do{
            s=a[s];
            f=a[a[f]];
        }while(s!=f);

        s=0;
        while(s!=f){
            s=a[s];
            f=a[f];
        }
        return s;
        // Modifying the array by changing the values to negative
        /*
        int index=0;
        for(int i=0;i<a.length;i++)
        {
            index=Math.abs(a[i]);
            if(a[index]<0)
                return index;
            a[index] = -a[index];
        }
        return -1;
        */
    }
}