import java.util.ArrayList;
import java.util.List;

class LC412_FIZZBUZZ_EASY {
    
    public List<String> fizzBuzz(int n) {
        
        int i =1;
        List<String> ans = new ArrayList<>();
        
        boolean check = false;
        while(i<=n)
        {   
            String temp = "";
            if(i%3==0)
            {   temp = "Fizz";
            }
            if(i%5==0)
            {   temp += "Buzz";
            }
            if(temp.isEmpty())
                temp = Integer.toString(i);
            
            ans.add(temp);
            i++;
        }   

        return ans;

    }

}
