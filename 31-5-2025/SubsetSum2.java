import java.util.Arrays;
public class SubsetSum2
{
public static boolean isSubsetSumTab(int[] arr,int n,int target) {
boolean [][]dp=new boolean[n+1][target+1];
for(int i=0;i<=n;i++) {
dp[i][0]=true;
}
for(int i=1;i<=n;i++) {
for(int j=1;j<=target;j++) {
if(arr[i-1]<=j)  {
dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
}
else
{
dp[i][j]=dp[i-1][j];
}
}
}
return dp[n][target];
}
public static void main(String[] args) {
int[] arr={3,34,4,12,5,2};
int target=37;
int n=arr.length;
boolean result=isSubsetSumTab(arr,n,target);
System.out.println("Subset with given sum exists(tabulation):"+result);
}
}
