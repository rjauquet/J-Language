package ast;

/**
 * class <code>AddNode</code>
 * Given the expression ` expr1 + expr2', this node stores expr1 in the left subtree and expr2 in the right subtree
 * @author <a href="mailto:l.capra@cs.ucl.ac.uk">Licia Capra</a>
 * @version 1.0
 */
public class AddNode extends ExprNode {

    public AddNode(ExprNode left, ExprNode right) {
	this.left=left;
	this.right=right;
    }

  

}

