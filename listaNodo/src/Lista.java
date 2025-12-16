public class Lista {
    // Riferimento al primo nodo della lista
    Nodo root;
    // Costruttore add
    public void add (String s) {
        root = null;
    }
    // Costruttore
    public void addHead(Nodo n) {
        // Aggiunge un nodo in testa alla lista
        if (this.root == null) {
            // La lista è vuota
            this.root = n;
        } else {
            // La lista non è vuota
            n.setNext(this.root);
            this.root = n;
        }
    }
    // Costruttore
    public void addTail(Nodo n) {
        // Aggiunge un nodo in coda alla lista
        if (this.root == null) {
            // La lista è vuota
            this.root = n;
        // La lista non è vuota
        } else {
            // Scorro la lista fino alla fine
            Nodo current = this.root;
            // Finché il nodo successivo non è null
            while (current.getNext() != null) {
                // Passo al nodo successivo
                current = current.getNext();
            }
            // Ora current è l'ultimo nodo della lista
            current.setNext(n);
        }
    }
    // Parte remove
    public void remove (String s) {
        
    }
    public boolean exists (String s) {
        return true;
    }
    // Metodo per rappresentare la lista come stringa
    public String toString() {
        // Scorro la lista e costruisco la stringa
        String s = "La lista contiene:\n";
        Nodo current = this.root;
        // Finché current non è null
        while (current != null) {
            // Aggiungo il valore del nodo corrente alla stringa
            s += current.getValore() + "\n";
            // Passo al nodo successivo
            current = current.getNext();
    }
    // Aggiungo la fine della lista
        return s + "Fine della lista.";
    }
}
