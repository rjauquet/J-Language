package ast;

public class StmtList extends Node {
    StmtNode left;
    StmtList right;

    public StmtList(StmtNode left, StmtList right) {
	this.left=left;
	this.right=right;
    }  


}