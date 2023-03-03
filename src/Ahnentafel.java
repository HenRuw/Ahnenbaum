import jdk.jfr.ContentType;

public class Ahnentafel {

    private BinaryTree<Person> ahnenbaum;
    public Ahnentafel() {
        ahnenbaum = new BinaryTree();
    }

    public Ahnentafel(BinaryTree<Person> ahnenbaum) {
        this.ahnenbaum = ahnenbaum;
    }

    public BinaryTree<Person> getAhnenbaum() {
        return ahnenbaum;
    }

    public String preOrder(BinaryTree<Person> pTree){
        String out = "";
        if(pTree.getContent() != null){
            out += pTree.getContent().getVorname() + " " + pTree.getContent().getNachname() + " Geschlecht: " + pTree.getContent().getGeschlecht() + "\n";
        }
        if (!pTree.getLeftTree().isEmpty()){
            out += preOrder(pTree.getLeftTree());
        }
        if (!pTree.getRightTree().isEmpty()) {
            out += preOrder(pTree.getRightTree());
        }
        return out;
    }

    public String InOrder(BinaryTree<Person> pTree){
        String out = "";
        if (!pTree.getLeftTree().isEmpty()){
            out += preOrder(pTree.getLeftTree());
        }
        if(pTree.getContent() != null){
            out += pTree.getContent().getVorname() + " " + pTree.getContent().getNachname() + " Geschlecht: " + pTree.getContent().getGeschlecht() + "\n";
        }
        if (!pTree.getRightTree().isEmpty()) {
            out += preOrder(pTree.getRightTree());
        }
        return out;
    }

    public String postOrder(BinaryTree<Person> pTree){
        String out = "";
        if (!pTree.getLeftTree().isEmpty()){
            out += preOrder(pTree.getLeftTree());
        }
        if (!pTree.getRightTree().isEmpty()) {
            out += preOrder(pTree.getRightTree());
        }
        if(pTree.getContent() != null){
            out += pTree.getContent().getVorname() + " " + pTree.getContent().getNachname() + " Geschlecht: " + pTree.getContent().getGeschlecht() + "\n";
        }
        return out;
    }



}
