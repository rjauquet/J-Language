package ast;

/**
 * class <code>TimesNode</code>
 * Given the expression ` expr1 * expr2', this node stores expr1 in the left subtree and expr2 in the right subtree
 * @author <a href="mailto:l.capra@cs.ucl.ac.uk">Licia Capra</a>
 * @version 1.0
 */
public class TimesNode extends ExprNode {

    public TimesNode(ExprNode left, ExprNode right) {
	this.left=left;
	this.right=right;
    }  


}