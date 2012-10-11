package ast;

public class StmtNode extends Node {
    String name;
    ExprNode value;

    public StmtNode(String s, ExprNode e) {
	this.name=s;
	this.value=e;
    }  


}