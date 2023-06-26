class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int s=flowerbed.length;
        if(s==1){
            if(flowerbed[0]==1 && n==1) return false;
            return true;
        }
        if(flowerbed[0]==0 && flowerbed[1]==0){
            n--;
            flowerbed[0]=1;
        }
        for(int i=1; i<s; i++){
            if(flowerbed[i]==0 && flowerbed[i-1]==0){
                n--;
                flowerbed[i]=1;
            }
            else if(flowerbed[i]==1 && flowerbed[i-1]==1){
                n++;
                flowerbed[i-1]=0;
            }
        }
        if(n<=0) return true;
        return false;
    }
}