public class Cola {
    int[] vectorC;
    int fin,frente;
    public Cola(int t){
        vectorC = new int[t];
        fin=-1;
        frente=-1;
        System.out.println("Se ha creado la cola de tamano:"+t);
    }
    public void insertar(int v){
        if(!colaLlena()){
        fin++;    
        vectorC[fin]=v;
        System.out.println("Se ha anadido a la cola:"+v);
        if (fin==0)frente++;
        }
        else System.out.println("Cola llena");
    }
    public int eliminar(){
        int e=-1;
        if(!colaVacia()){
            e=vectorC[frente];
            vectorC[frente]=0;
            for(int i=0;i<fin;i++){
                vectorC[i]=vectorC[i+1];
            }
            fin--;
            if(fin==-1)frente=-1;
        }
        return e;
    }
    public boolean colaVacia(){
        if (frente==-1) return true;
        else return false;
    }
    public boolean colaLlena(){
        if (fin==vectorC.length-1) return true;
        else return false;        
    }
    public void listar(){
        if(!colaVacia()){
            System.out.println("Listado de la cola");            
            for(int i=frente;i<=fin;i++){
                System.out.println(vectorC[i]);
        }
        }
        else System.out.println("La cola esta vacia");            
    }

}
