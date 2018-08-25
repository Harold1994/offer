import java.util.Stack;

public class IsPopOrder {
    public static void main(String[] args) {
        int [] push = {1,2,3,4,5};
        int [] pop = {5,4,3,2,1};
        System.out.println(isPopOrder(push, pop, 5));
    }

    public static boolean isPopOrder(int [] push, int [] pop, int n) {
        Stack<Integer> s = new Stack<Integer>();
        int i = 0;
        int j = 0;
        while(!(i>=n && s.empty() && j<=n)) {
            if (s.empty())
                s.push(push[i++]);
            else if (s.peek() != pop[j])
                s.push(push[i++]);
            else if (s.peek() == pop[j]){
                   s.pop();
                   j++;
            }
        }
        System.out.println(i);
        return j==n;
    }
}
