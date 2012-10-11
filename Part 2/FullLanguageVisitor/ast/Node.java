package ast;


public abstract class Node  {
    public Node left;
    public Node right;

    public abstract Object accept(Visitor v);

}