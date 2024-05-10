class Solution {
    public long flowerGame(int n, int m) {
        //T(C(N)==O(1) and S(C(N)==O(1)) as it requires non memory space allocation recursively
        long oddN=(n+1)/2,evenN=n/2;long oddM=(m+1)/2,evenM=m/2;//Odd And Even Flowers Declare
        return oddN*evenM+evenN*oddM;}}//Printing odd and Even Productive Sum
