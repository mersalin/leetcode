class Solution {
  Map<Integer, Boolean> memo = new HashMap<>();
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    int n = prerequisites.length;
    if (n <= 0) {
      return true;
    }

    Map < Integer,
    Set < Integer >> neighbours = new HashMap < >();
    for (int[] courses: prerequisites) {
      int course = courses[1];
      if (!neighbours.containsKey(course)) {
        neighbours.put(course, new HashSet<>());
      }
      neighbours.get(course).add(courses[0]);
    }

    // neighbours.forEach((k,v) -> {
    //   System.out.print(k);
    //   System.out.println("->");
    //   v.forEach(System.out::println);
    //   System.out.println("-----");
    // });
    
    Set < Integer > path = new HashSet < >();
    for (int[] courses: prerequisites) {
      if (hasCycle(neighbours, path, courses[0])) {
        return false;
      }
    }
    return true;
  }

  private boolean hasCycle(Map < Integer, Set < Integer >> neighbours, Set < Integer > path, int kid) {
    // path.forEach(System.out::println);
    if (memo.containsKey(kid)) {
      return memo.get(kid);
    }
    if (path.contains(kid)) {
      return true;
    }
    if (!neighbours.containsKey(kid)) {
      return false;
    }
    

    path.add(kid);
    for (int neighbour: neighbours.get(kid)) {
      boolean cycle = hasCycle(neighbours, path, neighbour);
      memo.put(kid, cycle);
      if (cycle) {
        return true;
      }
    }
    path.remove(kid);
    return false;
  }
}