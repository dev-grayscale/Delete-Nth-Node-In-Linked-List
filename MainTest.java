import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

  private Node head;

  @BeforeEach
  void setUp() {
    head = new Node(1);
    Node first = new Node(2);
    Node second = new Node(3);
    Node third = new Node(4);
    Node fourth = new Node(5);

    head.next = first;
    first.next = second;
    second.next = third;
    third.next = fourth;
  }

  @Test
  void deleteNodeWithInvalidInput() {
    Assertions.assertEquals(null, Main.deleteNode(null, 10));
    Assertions.assertEquals(null, Main.deleteNode(new Node(21), 21));
  }

  @Test
  void deleteNodeWithData2() {
    Assertions.assertEquals("1->3->4->5", Main.deleteNode(head, 2).toString());
  }

  @Test
  void deleteNodeWithData5() {
    Assertions.assertEquals("1->2->3->4", Main.deleteNode(head, 5).toString());
  }

  @Test
  void deleteNodeWithData1() {
    Assertions.assertEquals("2->3->4->5", Main.deleteNode(head, 1).toString());
  }
}
