public class SNode {
    @Override
    public String toString() {
        return "SNode{" +
                "element='" + element + '\'' +
                ", next=" + next +
                '}';
    }

    private String element;
    private SNode next;
    public SNode(String element,SNode next){
        this.element=element;
        this.next=next;
    }
    public String getElement(){
        return element;
    }
    public SNode getNext(){
        return next;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void setNext(SNode next) {
        this.next = next;
    }
}
