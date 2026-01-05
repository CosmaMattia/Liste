// Classe Nodo per lista bidirezionale
// Ogni nodo contiene un valore (qui una String) e due riferimenti:
// - next: al nodo successivo
// - prev: al nodo precedente
public class Nodo {

    // Valore contenuto nel nodo
    private String valore;
    
    // Riferimento al nodo successivo
    private Nodo next;
    
    // Riferimento al nodo precedente
    private Nodo prev;

    // Costruttore: crea un nodo con il valore passato
    // next e prev vengono inizializzati a null
    public Nodo(String valore) {
        this.valore = valore;
        this.next = null;
        this.prev = null;
    }

    // METODI GETTER E SETTER

    // Restituisce il nodo successivo
    public Nodo getNext() {
        return next;
    }

    // Imposta il nodo successivo
    public void setNext(Nodo next) {
        this.next = next;
    }

    // Restituisce il nodo precedente
    public Nodo getPrev() {
        return prev;
    }

    // Imposta il nodo precedente
    public void setPrev(Nodo prev) {
        this.prev = prev;
    }

    // Restituisce il valore del nodo
    public String getValore() {
        return valore;
    }

    // Modifica il valore del nodo
    public void setValore(String valore) {
        this.valore = valore;
    }
}
