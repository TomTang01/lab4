#  Lab Report 3
The error I choose was from the LinkedList class.
A failure-inducing input would be:
```
@Test
public void testLinkedList(){
    LinkedList list = new LinkedList();
    list.prepend(2);
    list.prepend(1);
    list.append(3);

    assertEquals("1 2 3 ",list.toString());
}
```
