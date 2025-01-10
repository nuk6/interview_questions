import java.util.*;
/*
Merge intervals - asked in tesco
*/

public class Main {
    public static void solve(List<List<Integer>> intervals) {
      int n = intervals.size();
      int u = intervals.get(0).get(0), v = intervals.get(0).get(1);
      List<List<Integer>> ans = new ArrayList<>();
      for (int i = 1; i < n; ++i) {
        if (intervals.get(i).get(0) <= v) {
          v = Math.max(v, intervals.get(i).get(1));
        } else {
          ans.add(List.of(u,v));
          u = intervals.get(i).get(0);
          v = intervals.get(i).get(1);
        }
      }
      ans.add(List.of(u,v));
      for (var a : ans) {
        System.out.print(((List) a).get(0) + " ");
        System.out.print(((List) a).get(1));
        System.out.print("\n");
      }
    }
  
    public static void main(String[] args) {
      List<List<Integer>> intervals = List.of(List.of(1,2), List.of(3,5), List.of(6, 16));
      solve(intervals);
  }
}
