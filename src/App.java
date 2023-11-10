import java.util.ArrayList;
import java.util.Scanner;

import model.Controlado;
import model.Generico;
import model.Lote;

public class App {
    public static void main(String[] args) throws Exception {
        int opcao = 0;
        Scanner e = new Scanner(System.in);
        ArrayList<Generico> listaGenericos = new ArrayList<>();
        ArrayList<Controlado> listaControlados = new ArrayList<>();
        do {
            try {
                System.out.println("Digite uma opção:"+
                "\n1 - Cadastrar Medicamento Genérico"+
                "\n2 - Cadastrar Medicamento Controlado"+
                "\n3 - Listar Medicamento Genérico"+
                "\n4 - Listar Medicamento Controlado"+
                "\n10 - SAIR"
                );
                opcao = e.nextInt();
                if(opcao==1){
                    Generico obj = new Generico();
                    System.out.println("Digite o id do medicamento?");
                    obj.setId(e.nextInt());
                    System.out.println("Digite a descrição do medicamento:");
                    obj.setDescricao(e.next());
                    System.out.println("Digite o valor:");
                    obj.setValor(e.nextFloat());
                    Lote objLote = new Lote();
                    System.out.println("---- Digite os lotes deste medicamento:");
                    do {
                        System.out.println("Digite o número:");
                        objLote.setNumero(e.next());
                        System.out.println("Digite a validade:");
                        objLote.setDataValidade(e.next());
                        System.out.println("Digite a quantidade:");
                        objLote.setQtde(e.nextInt());
                        obj.adicionarLote(objLote);
                        System.out.println("Deseja cadastrar outro lote?[s/n]");
                    } while (e.next().equalsIgnoreCase("s"));
                    listaGenericos.add(obj);
                }else if(opcao==2){
                    Controlado obj = new Controlado();
                    System.out.println("Digite o id do medicamento?");
                    obj.setId(e.nextInt());
                    System.out.println("Digite a descrição do medicamento:");
                    obj.setDescricao(e.next());
                    System.out.println("Digite o médico:");
                    obj.setMedico(e.next());
                    listaControlados.add(obj);//insert
                }else if(opcao==3){
                    System.out.println("##########  LISTA GENÉRICOS #######");
                    for (Generico g : listaGenericos) {
                        System.out.println(g.getId() + ":"+g.getDescricao());
                    }
                }else if(opcao==4){
                    System.out.println("##########  LISTA CONTROLADOS #######");
                    for (Controlado c : listaControlados) {
                        System.out.println(c.getId() + ":"+c.getDescricao());
                    }
                }else if(opcao==10){
                    System.exit(0);
                }else{
                    System.out.println("Opção inválida!");
                }
            } catch (Exception erro) {
                System.out.println("Erro:"+erro.getMessage());
                e.next();
            }
        } while (opcao!=10);
    }
}
