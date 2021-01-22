

public class LinkedList{

Node head;

    //creating new node
public void insert(int data){

  Node node =new Node();   //create object which is new node
  node.data=data;          //assign data to the node
  node.next=null;          //Next address is null

  if(head==null){          //if first element is created then assign head to the first element
    head= node;
}

else{
Node n = head;             // created a temporary Node n reffering to head node ; which is used for traversal from head to end 
 
while(n.next!=null){
    n=n.next;
}
n.next= node;
}

}

public void show(){

    Node node = head;

    while(node.next!=null){
        System.out.println(node.data);
        node=node.next;

    }
    System.out.println(node.data);
    
}

public void insertAtstart(int data){
    Node node =new Node();   //create object which is new node
  node.data=data;          //assign data to the node
  node.next=null;  
  node.next=head;
  head=node;

}

public void insertAt(int index, int data){      //function for inserting node at particular position
    Node node =new Node();   
    node.data=data;         
    node.next=null; 

    if(index==0){
    insertAtstart(data);
    }
    else
    {
    Node n = head;                             //create a temporary traversal node 
    for(int i=0; i<index-1;i++){               //move till the index position
       n=n.next;
    }
     node.next=n.next;                          
    n.next=node;
}
}

public void deleteAt(int index){

    if(index==0){
        head=head.next;
    }
    else{
        Node n = head;  
        Node n1 =null;                          //n1 is the node to be deleted at index value
    for(int i=0; i<index-1;i++){                
       n=n.next;
    }
       n1=n.next;                              //address of the node to be deleted 
       n.next=n1.next;                    // address of index+1 node is assigned in index-1 node
                                         //so node at index value is neglected, as no node will reference to it
      // System.out.println("n1:"+ n1.data );
      n1=null;
    }

}

}

