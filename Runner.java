
public class Runner{

public static void main(String[] args) {

    LinkedList list = new LinkedList(); // creating LinkedList object

list.insert(5);    //Using insert function created in another class
list.insert(18);  
list.insert(6);  
list.insertAtstart(12); 
list.insertAt(0,99); 
list.deleteAt(2);
list.show();
}

}