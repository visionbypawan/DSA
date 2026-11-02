import java.util.*;

class Solution {
    public int distinctIntegers(int n) {
        ArrayList<Integer> l = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();

        l.add(n);
        hs.add(n);

        int index = 0;

        while(index < l.size()) {
            int it = l.get(index);
            int i = 1;

            while(i < it) {
                if(it % i == 1 && hs.add(i)) {
                    l.add(i);
                }
                i++;
            }

            index++;
        }

        return hs.size();
    }
}