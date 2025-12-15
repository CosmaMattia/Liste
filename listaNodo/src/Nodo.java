public class Nodo {
    
    private String valore;
    private Nodo next;
    
    public Nodo(String valore) {
        this.valore = valore;
        this.next = null;
    }
    
    public void setNext(Nodo next) {
        this.next = next;
    }
    public Nodo getNext() {
        return this.next;
    }
    
    public String getValore() {
        return this.valore;
    }
    public void setValore(String valore) {
        this.valore = valore;
    }
}