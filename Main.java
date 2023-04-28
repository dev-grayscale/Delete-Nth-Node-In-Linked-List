/**
 * For the following challenge, we'll assume a simple singly liked list like the following:
 *
 * public class Node {
 *   public Node next;
 *   public int data;
 *
 *   public Node(int data) {
 *     this.data = data;
 *   }
 *
 *   @Override
 *   public String toString() {
 *     StringBuilder sb = new StringBuilder();
 *
 *     Node nextNode = next;
 *
 *     sb.append(data);
 *
 *     while (nextNode != null) {
 *       sb.append("->");
 *
 *       sb.append(nextNode.data);
 *
 *       nextNode = nextNode.next;
 *     }
 *
 *     return sb.toString();
 *   }
 * }
 */
public class Main {

  /**
   * Deleting a node from LinkedList is a matter of visiting each node through <i>next relationship</i>
   * until its data matches the provided one, and in the meantime keeping track of the previous node.
   * Once found -> we set the previous node <i>next</i> relationship to point to the <i>next</i> relationship
   * of the current node and pop it out of the chain.
   *
   * Few considerations:
   *
   * <ol>
   *   <li>If provided node is null -> return null</li>
   *   <li>If data is found within the first node -> return the next one as head</li>
   *   <li>If anywhere else, a node with such data is found -> change the next rel and return the head (initial)</li>
   * </ol>
   *
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static Node deleteNode(Node node, int data) {
    if (node == null) {
      return null;
    }

    Node curr = node;

    if (curr.data == data) {
      return node.next;
    }

    while (curr.next != null) {
      if (curr.next.data == data) {
        curr.next = curr.next.next;
        break;
      }

      curr = curr.next;
    }

    return node;
  }
}
