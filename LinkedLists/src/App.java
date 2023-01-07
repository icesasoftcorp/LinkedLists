import java.util.Scanner;

public class App {
    private List lst;
    private int info=11;
    private int initialInfo=0;
    private String menu;
    private Scanner sc;
    public App() {
        this.lst=new List();
        this.sc=new Scanner(System.in);
        this.menu="\nLista enlazadas simples \n"+
        "1. Crear Lista\n"+
        "2. Imprimir Lista\n"+
        "3. Agregar nodos al inicio\n"+
        "4. Agregar nodos al final\n"+
        "5. Buscar nodo\n"+
        "6. Borrar nodo inicial\n"+
        "7. Borrar nodo final\n"+
        "8. Salir\n";
    }

    public void displayMenu(){
        int number = 0;
        do{
            System.out.print("\n"+this.menu);
            number = sc.nextInt();
            switch (number){
                case 1:
                    createList();
                    break;
                case 2:
                    System.out.print(this.lst.print());
                    break;
                case 3:
                    unshiftNode();
                    break;
                case 4:
                    pushNode();
                    break;
                case 5:
                    searchNode();
                    break;
                case 6:
                    shiftNode();
                    break;
                case 7:
                    popNode();
                    break;
            }
        }while(number<8);
    }
    /**
     * Crear la lista
     */
    public void createList(){
        this.lst=new List();
        for(int info=1;info<=10;info++)
            this.lst.push(info);
        System.out.print(this.lst.print());
    }
    /**
     * Agregar nodo al inicio
     */
    public void unshiftNode(){
        this.lst.unshift(initialInfo);
        --initialInfo;
        System.out.print(this.lst.print());
    }
    /**
     * Agregar nodo al final
     */
    public void pushNode(){
        info++;
        this.lst.push(info);
        System.out.print(this.lst.print());
    }
    /**
     * Buscar un nodo en la lista 
     */
    public void searchNode(){
        System.out.print("Ingrese Nodo a buscar\n");
        int txtSearch=sc.nextInt();
        if(this.lst.search(txtSearch)){
            System.out.print("Nodo "+txtSearch+" encontrado\n");
        }else{
            System.out.print("Nodo "+txtSearch+" No Existe\n");
        }
        System.out.print(this.lst.print());
    }
    /**
     * Eliminar primer nodo
     */
    public void shiftNode(){
        if(this.lst.shift()){
            System.out.print("Nodo eliminado\n");
        }else{
            System.out.print("Lista vacia\n");
        }
        System.out.print(this.lst.print());
    }

    /**
     * Eliminar ultimo nodo
     */
    public void popNode(){
        if(this.lst.pop()){
            System.out.print("Nodo eliminado\n");
        }else{
            System.out.print("Lista vacia\n");
        }
        System.out.print(this.lst.print());
    }

    public static void main(String[] args) throws Exception {
        App list=new App();
        list.displayMenu();
    }
}
