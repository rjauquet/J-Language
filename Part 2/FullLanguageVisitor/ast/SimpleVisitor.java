package ast;

/**
 * <code>SimpleVisitor</code>
 * Simple implementation of a Visitor
 * It traverses the tree printing on stdout what it finds in the nodes of the AST
 * The input program is therefore reproduced on stdout without indentation
 *
 * @author <a href="mailto:l.capra@cs.ucl.ac.uk">Licia Capra</a>
 * @version 1.0
 */
public class SimpleVisitor implements Visitor {


    public Object visit (List n) {
	n.left.accept(this);
	if (n.right!=null) n.right.accept(this);
	return null;
    }

    public Object visit (DeclNode n) {
	System.out.println(n.type + " " + n.name + ";");
	return null;
    }

    public Object visit (StmtNode n) {
	System.out.print(n.name + " = ");
	n.value.accept(this);
	System.out.println(";");
	return null;
    }

    public Object visit (AddNode n) {
	n.left.accept(this);
	System.out.print("+");
	n.right.accept(this);
	return null;
    }

     public Object visit (TimesNode n) {
	n.left.accept(this);
	System.out.print("*");
	n.right.accept(this);
	return null;
    }

    public Object visit (IntNumNode n) {
	System.out.print(n.value.intValue());
	return null;
    }

    public Object visit (Node n) {
	n.left.accept(this);
	n.right.accept(this);
	return null;
    }

    public Object visit (ExprNode n) {
	n.left.accept(this);
	n.right.accept(this);
	return null;
    }

}