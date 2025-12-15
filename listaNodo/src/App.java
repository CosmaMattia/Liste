public class App {
    public static void main(String[] args) throws Exception {
        // Creo una nuova lista
        Lista lista = new Lista();
        // Aggiungo alcuni nodi alla lista
        lista.addTail(new Nodo("Mario Rossi"));
        lista.addTail(new Nodo("Giulio Bianchi"));
        lista.addTail(new Nodo("Francesco Verdi"));
        lista.addHead(new Nodo("Anna Neri"));
        // Stampo la lista
        System.out.println(lista.toString());
    }
}


