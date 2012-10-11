package ast;

public class IntNumNode extends ExprNode {
    public Integer value;

    public IntNumNode(Integer i) {
	this.left=null;
	this.right=null;
	value = i;
    }
    

}