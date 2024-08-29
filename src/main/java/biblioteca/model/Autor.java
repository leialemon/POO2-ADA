package biblioteca.model;

import java.util.List;

public class Autor  extends  Pessoa{
    String biografia;
    List<ItemCatalogo> obras;

    public Autor(String nome){
        super(nome);
    }

    public String getBiografia(){
        return this.biografia;
    }

    public void  setBiografia(String biografia){
        this.biografia = biografia;
    }

    public List<ItemCatalogo> getObras(){
        return this.obras;
    }

    public void addObra(ItemCatalogo obra){
        this.obras.add(obra);
    }
}
