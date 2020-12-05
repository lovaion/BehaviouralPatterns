public interface Visitor {

    void visitTelefono(Phone p);
    void visitCassa(Cassa c);
    void visitPBAukey(PBAukey pbAukey);

}
