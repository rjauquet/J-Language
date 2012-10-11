package ast;

/**
 * class <code>IntNumNode</code>
 * Leaf node that stores an integer number
 * @author <a href="mailto:l.capra@cs.ucl.ac.uk">Licia Capra</a>
 * @version 1.0
 */
public class IntNumNode extends ExprNode {
    public Integer value;

    public IntNumNode(Integer i) {
	this.left=null;
	this.right=null;
	value = i;
    }
    
    public Object accept(Visitor v) {
	return v.visit(this);
    }

}