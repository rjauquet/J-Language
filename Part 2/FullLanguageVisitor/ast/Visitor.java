package ast;

/**
 * <code>Visitor</code>
 * Interface than any Visitor should implement
 * There is one method for each node in the AST
 *
 * @author <a href="mailto:l.capra@cs.ucl.ac.uk">Licia Capra</a>
 * @version 1.0
 */
public interface Visitor {
 
    public Object visit (Node n); 

    /* Visit method for declarations and statements */
    public Object visit (StmtNode n); 
    public Object visit (DeclNode n); 
    public Object visit (List n); 


    /* Visit method for expr nodes */
    public Object visit (ExprNode n); 
    public Object visit (AddNode n); 
    public Object visit (TimesNode n); 
    public Object visit (IntNumNode n);
    
}