class Solution 
{
    public int reverse(int x) 
    {
        long temp=x,r,sum=0;
        while(temp!=0) 
        {
            r=temp%10;
            sum=sum*10+r;
            temp/=10;
        }
        if(sum>=Math.pow(-2,31) && sum<=Math.pow(2,31)-1)
            return (int)sum;
        else
            return 0; 
    }
}