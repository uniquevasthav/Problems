//container with most water
class Solution {
    public int maxArea(int[] a) {
        int p1=0,p2=a.length-1,ans=0;
        while(p1<=p2){
            ans=Math.max(ans,Math.min(a[p1],a[p2])*(p2-p1));
            if(a[p1]<a[p2]) p1++;
            else p2--;
        }
        return ans;
    }
}