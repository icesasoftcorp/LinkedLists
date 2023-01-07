public class Node {
    private int info;
    private Node link; //Linea autoreferenciada de la clase

    public Node () {
     this.info = 0;
     this.link = null;   
    }

    public Node (int info) {
        this.info = info;
        this.link = null;
    }

    public Node(int info, Node link){
        this.info = info;
        this.link = null;
    }

    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    
    public Node getLink() {
        return link;
    }
    public void setLink(Node link) {
        this.link = link;
    }
    
}