class Solution {
    public List<List<Integer>> combinationSum(int[] a, int t) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(a,t,0,new ArrayList<>(),res);
        return res;
    }

    public void backtrack(int a[],int t,int i, List<Integer>list,List<List<Integer>> res)
    {   
        if(t==0)
        {
            res.add(new ArrayList(list));
            return;
        }
        if(i==a.length)
            return;
        if(a[i]<=t)
        {
            list.add(a[i]);
            backtrack(a,t-a[i],i,list,res);
            list.remove(list.size()-1);
        }
        backtrack(a,t,i+1,list,res);
    }
}