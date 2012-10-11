package ast;


public class AddNode extends ExprNode {

    public AddNode(ExprNode left, ExprNode right) {
	this.left=left;
	this.right=right;
    }

    public Object accept(Visitor v) {
	return v.visit(this);
    }


}

