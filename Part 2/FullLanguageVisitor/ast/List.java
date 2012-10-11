package ast;

public class List extends Node {

    public List(Node left, Node right) {
	this.left=left;
	this.right=right;
    }  

    public Object accept(Visitor v) {
	return v.visit(this);
    }

}