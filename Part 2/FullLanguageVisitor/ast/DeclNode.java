package ast;

public class DeclNode extends Node {
    public String name;
    public String type;
    

    public DeclNode(String s, String type) {
	this.name=s;
	this.type=type;
	this.left=null;
	this.right=null;
    }  
    public Object accept(Visitor v) {
	return v.visit(this);
    }


}