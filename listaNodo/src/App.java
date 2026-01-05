public class App {
    public static void main(String[] args) {

        // Creo una nuova lista bidirezionale
        Lista lista = new Lista();

        // Aggiungo nodi in coda
        lista.addTail(new Nodo("Mario Rossi"));
        lista.addTail(new Nodo("Giulio Bianchi"));
        lista.addTail(new Nodo("Francesco Verdi"));

        // Aggiungo un nodo in testa
        lista.addHead(new Nodo("Anna Neri"));

        // STAMPA LISTA IN AVANTI
        System.out.println(lista.printForward());

        // STAMPA LISTA ALL'INDIETRO
        System.out.println(lista.printBackward());

        // RICERCA DI UN ELEMENTO
        String ricerca1 = "Francesco Verdi";
        System.out.println("Esiste '" + ricerca1 + "'? " + lista.exists(ricerca1));

        String ricerca2 = "Luca Neri";
        System.out.println("Esiste '" + ricerca2 + "'? " + lista.exists(ricerca2));

        // RIMOZIONE DI UN ELEMENTO
        lista.remove("Giulio Bianchi");
        System.out.println("Dopo la rimozione di Giulio Bianchi:");
        System.out.println(lista.printForward());
    }
}

