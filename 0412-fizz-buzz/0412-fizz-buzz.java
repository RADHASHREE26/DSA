class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int n1=i+1;
            if(n1%3==0 && n1%5==0)
            {
                al.add("FizzBuzz");
            }
            else if(n1%3==0)
                al.add("Fizz");
            else if(n1%5==0)
                al.add("Buzz");
            else
                al.add(Integer.toString(n1));
        }
        
        return al;
        
    }
}

/*

List<String> ans=new ArrayList<>();
        for(int i=1;i<n;i++)
        {
            ans.add(3*i-1,"Fizz");
            ans.add(5*i-1,"Fizz");
        }
        return ans;
        
        */