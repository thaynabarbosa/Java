package modelos;

import java.util.ArrayList;
import java.util.List;

public class ListaPacientes {
    
    private static final List<Pacientes> lista = new ArrayList<>();
    
    public static List<Pacientes> Listar(){
        return lista;
    }
    
    public static void Adicionar(Pacientes pac){
        lista.add(pac);
    }
    
    public static Pacientes getPaciente(int id){
        return lista.get(id);
    }
    
    public static void Atualizar(Pacientes pac,int posPaciente){
        lista.set(posPaciente, pac);
    }
}
