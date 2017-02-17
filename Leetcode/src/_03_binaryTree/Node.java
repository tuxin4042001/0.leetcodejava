package _03_binaryTree;

public class Node {
public int key;
public String name;

public Node leftchild;
public Node rightchild;

public Node(int key, String name){
	this.key = key;
	this.name = name;
}

public String toString(){
	return name + " has a key " + key;
}

}
