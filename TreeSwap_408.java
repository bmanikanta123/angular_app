import java.util.HashMap;
import java.util.Map;

/**
 * Created by dt212979 on 6/7/2018.
 */
public class TreeSwap_408 {
  public int lengthOfTree = 0;

  public TreeSwap_408() {
  }

  public static void main(String[] args) {
    int tree[] = {1, 2, 3, 4, 5, 6, 0, 0, 0, 12, 13};
    TreeSwap_408 treeSwap_408 = new TreeSwap_408();
    treeSwap_408.lengthOfTree = tree.length;

    System.out.println("Before Swapping:");
    for (int element : tree)
      System.out.print(element + " ");

    treeSwap_408.swap(tree);

    System.out.println("\nAfter Swapping:");
    for (int element : tree)
      System.out.print(element + " ");

    Map<Integer, Integer> eachLevelSumMap = treeSwap_408.sum(tree);
    System.out.println("\nEach Level SUM:" + eachLevelSumMap);
  }


  /**
   * @param tree
   * @return eachLevelSumMap
   * <p>
   * Finding number of levels in a tree and finding sum of each level
   * <p>
   * Map contains level number as key and sum as value
   */
  public Map<Integer, Integer> sum(int[] tree) {
    Map<Integer, Integer> eachLevelSumMap = new HashMap<>();
    int level = 0;
    int index = 0;
    int n = lengthOfTree;
    //finding levels in a tree
    while (n > 1) {
      n = n / 2;
      level++;
    }
    //iterating each level and finding sum of each level
    for (int i = 0; i <= level; i++) {
      int sum = 0;
      int loopTo = index + (int) Math.pow(2, i);
      while (index < loopTo) {
        sum = sum + tree[index];
        index++;
        if (index == (lengthOfTree))
          break;
      }
      eachLevelSumMap.put(i, sum);
    }
    return eachLevelSumMap;
  }

  /**
   * @param tree
   * @return tree
   * <p>
   * swapping each node with its right child starting from root node
   * <p>
   * formula to find children of a node
   * left child:((2*index of node)+1)
   * right child:((2*index of node)+2)
   */
  public int[] swap(int[] tree) {
    int len = tree.length;
    for (int index = 0; index < len; index++) {
      if (((2 * index) + 2) < len) {
        int temp = tree[index];
        tree[index] = tree[((2 * index) + 2)];
        tree[((2 * index) + 2)] = temp;
      }
    }
    return tree;
  }

}
