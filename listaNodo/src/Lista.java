// Classe Lista bidirezionale
// Gestisce una lista di nodi dove ogni nodo ha riferimento a next e prev
public class Lista {

    // Riferimento al primo nodo della lista
    private Nodo root;
    
    // Riferimento all'ultimo nodo della lista (utile per stampa indietro)
    private Nodo tail;

    // Costruttore della lista (inizialmente vuota)
    public Lista() {
        this.root = null;
        this.tail = null;
    }

    // AGGIUNTA IN TESTA
    public void addHead(Nodo n) {
        if (this.root == null) {
            // Lista vuota: root e tail puntano allo stesso nodo
            this.root = this.tail = n;
        } else {
            n.setNext(this.root);  // nodo successivo = vecchio root
            this.root.setPrev(n);  // vecchio root prev = nuovo nodo
            this.root = n;         // aggiorno root
        }
    }

    // AGGIUNTA IN CODA
    public void addTail(Nodo n) {
        if (this.tail == null) {
            // Lista vuota: root e tail puntano allo stesso nodo
            this.root = this.tail = n;
        } else {
            this.tail.setNext(n);  // vecchio tail next = nuovo nodo
            n.setPrev(this.tail);  // nuovo nodo prev = vecchio tail
            this.tail = n;         // aggiorno tail
        }
    }

    // RIMOZIONE DI UN NODO PER VALORE
    public void remove(String valore) {
        Nodo current = root;

        while (current != null) {
            if (current.getValore().equals(valore)) {

                if (current == root) {
                    root = current.getNext();
                    if (root != null) root.setPrev(null);
                    else tail = null; // lista diventata vuota
                } else if (current == tail) {
                    tail = current.getPrev();
                    tail.setNext(null);
                } else {
                    current.getPrev().setNext(current.getNext());
                    current.getNext().setPrev(current.getPrev());
                }

                System.out.println("Elemento '" + valore + "' rimosso.");
                return;
            }
            current = current.getNext();
        }

        System.out.println("Elemento '" + valore + "' non trovato.");
    }

    // RICERCA DI UN VALORE
    public boolean exists(String valore) {
        Nodo current = root;
        while (current != null) {
            if (current.getValore().equals(valore)) return true;
            current = current.getNext();
        }
        return false;
    }

    // STAMPA LA LISTA IN AVANTI
    public String printForward() {
        String s = "Lista avanti:\n";
        Nodo current = root;
        while (current != null) {
            s += current.getValore() + "\n";
            current = current.getNext();
        }
        s += "Fine lista.\n";
        return s;
    }

    // STAMPA LA LISTA ALL’INDIETRO
    public String printBackward() {
        String s = "Lista indietro:\n";
        Nodo current = tail;
        while (current != null) {
            s += current.getValore() + "\n";
            current = current.getPrev();
        }
        s += "Fine lista.\n";
        return s;
    }
}
