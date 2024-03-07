import java.time.LocalDate;

import teste.dominio.Bootcamp;
import teste.dominio.Curso;
import teste.dominio.Dev;
import teste.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("Curso em java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(5);

        //Conteudo conteudo = new Curso();
        
        curso2.setTitulo("Curso em typescript");
        curso2.setDescricao("descricao curso typescript");
        curso2.setCargaHoraria(7);

        mentoria.setTitulo("mentoria");
        mentoria.setDescricao("mentoria em java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java");
        bootcamp.setDescricao("Descricao Bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHeitor = new Dev();
        devHeitor.setNome("Heitor");
        devHeitor.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devHeitor.getConteudoInscritos());

        devHeitor.progredir();
        devHeitor.progredir();
        
        System.out.println("Conteudos inscritos " + devHeitor.getConteudoInscritos());
        System.out.println("Conteudos concluidos " + devHeitor.getConteudoConcluidos());
        System.out.println("XP: " + devHeitor.calcularTotalXp());

        Dev devTeste = new Dev();
        devTeste.setNome("teste");
        devTeste.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devTeste.getConteudoInscritos());

        devTeste.progredir();

        System.out.println("Conteudos inscritos " + devHeitor.getConteudoInscritos());
        System.out.println("Conteudos concluidos " + devTeste.getConteudoConcluidos());
        System.out.println("XP: " + devTeste.calcularTotalXp());





    }
}
