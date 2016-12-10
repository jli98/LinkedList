
public class LinkedList {
	static class Node { //  LinkedList.Node
		int val;
		Node next;
	}
	private Node head;

	public LinkedList() {
		head = null;
	}
	public void addStart(int v) {
 		Node n = new Node();
		n.val = v;
		n.next = head;
		head = n;
	}

	public void addEnd(int v) {
		if (head == null) {
			head = new Node();
			head.val = v;
			head.next = null;
			return;
		}
		Node p;
    for (p = head; p.next != null; p = p.next);
		p.next = new Node();
		p.next.val = v;
		p.next.next = null;
	}
	public void removeStart() {
		head = head.next;
	}

	public void removeEnd() {

	}
	
	public int get(int pos)  {
    Node p = head;
		for (int i = 0; i < pos; i++) {
			p = p.next;
		}
		return p.val;
	}

	public int size() {
		int i = 0;
		for (Node p = head;  p != null; p = p.next) {
			i++;
		}
		return i;
	}

	public static void main(String[] a) {
		LinkedList list1 = new LinkedList();
		for (int i = 0; i < 10; i++)
			list1.addEnd(i);
		list1.removeStart();
		for (int i = 0; i < list1.size(); i++)
			System.out.print(list1.get(i));
	}
}

