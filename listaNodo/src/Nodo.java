public class Nodo {

    private String valore;
    private Nodo next;
    private Nodo prev;

    public Nodo(String valore) {
        this.valore = valore;
        this.next = null;
        this.prev = null;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getPrev() {
        return prev;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }

    public String getValore() {
        return valore;
    }

    public void setValore(String valore) {
        this.valore = valore;
    }
}
