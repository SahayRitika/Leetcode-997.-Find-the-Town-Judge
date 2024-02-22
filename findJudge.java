class Solution {
    public int findJudge(int n, int[][] trust) {
        Boolean people[]= new Boolean[n+1];
        int count[]= new int[n+1];

        for(int i=0;i<trust.length;i++){
            if(people[trust[i][0]]==null){
                people[trust[i][0]]=true;
            }

            count[trust[i][1]]++;

        }

        for(int i=1;i<=n;i++){
            if(people[i]==null && count[i]==n-1)
            return i;
        }
        return -1;
    }
}
