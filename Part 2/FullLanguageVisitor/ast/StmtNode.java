package ast;

public class StmtNode extends Node {
    public String name;
    public ExprNode value;

    public StmtNode(String s, ExprNode e) {
	this.name=s;
	this.value=e;
    }  
    public Object accept(Visitor v) {
	return v.visit(this);
    }


}