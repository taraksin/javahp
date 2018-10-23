package jogo;

import java.util.HashSet;

public class engineGame {

    //[linha], [coluna]  ,
    int ram;
    double Ram;
    boolean verifica;
    String[][] perguntas = {
        //Perguntas Linha 0
        {   
            "Qual é a casa de Gregório Goyle?",                               //1//
            "Qual desses feitiços desarma o inimigo?",                        //2//
            "Que animal o professor Lupin se transforma?",                    //3//
            "Qual o nome da irmã do Rony Weasley?",                           //4//
            "Qual Weasley é o irmão mais velho?",                             //5//
            "Quem matou Bellatrix Lestrange?",                                //6//
            "Com quem Bellatrix foi presa em Azkaban?",                       //7//
            "Qual dessas horcruxes Régulo Black pegou?",                      //8//
            "Do que é feito o núcleo da varinha de Harry e Voldemort?",       //9//
            "Quando acontece priori incantatem?",                             //10//
            "Qual o efeito do feitiço Cruciatus?",                            //11//
            "Qual é o nome do avô por parte de mãe do Lord Voldemort?",       //12//
            "Qual era o nome verdadeiro da fantasma da Torre Corvinal?",      //13//
            "Qual é o nome completo de Harry Potter?",                        //14//
            "Qual destes alunos de Hogwarts têm sangue-puro?",                //15//
            "O que significa AD?",                                            //16//
            "Qual Horcrux foi a segunda a ser destruída?",                    //17//
            "Em que andar fica o corredor proibido?",                         //18//
            "Qual destes ingredientes NÃO vai numa poção Polissuco?",         //19//
            "Qual é a forma do bicho papão de Parvati Patil?"                 //20//
        },
        //numero da resposta Linha 1
        {"B", "A", "C", "C", "D", "B", "A", "D", "D", "A", "C", "B", "D", "C", "B", "A", "C", "B", "D", "A"},
        //1//
        //Repostas apartir da Linha 2
        //A
        {"Grifinória", "Experlliarmus", "Cachorro", "Hermione Grenger"
          , "Carlinhos Weasley", "Ninfadora Tonks", "Bartolomeu Crouch Junior"
          , "O anel dos Gaunt", "Fibra de coração de dragão"
          , "Quando lançam feitiços simultaneos", "Cortes", "Vold Gaunt"
          , "Helena Trind", "Harry Severo Potter", "Hermione Granger, Harry Potter e Rony Weasley"
          , "Armada de Dumbledore", "O medalhão", "No segundo andar", "Hemeróbio", "Múmia"},
        //B
        {"Sonserina", "Lumus", "Lobo","Ninfadora Tonks" 
          , "Percy Weasley", "Molly Weasley", "Régulo Black", "A taça de Hufflepuff"
          , "Escama de dragão", "Quando são feitiços semelhantes", "Morte", "Servolo Gaunt"
          , "Helena Corvinal","Harry Potter", "Gina Weasley, Rony Weasley e Draco Malfoy"
          , "Alvo Dumbledore", "A taça", "No terceiro andar", "Sanguessuga", "Mão decepada"},
        //C
        {"Lufa-Lufa", "Alohomora", "Lobisomem","Gina Weasley"    
          , "Rony Weasley ", "Hermione Granger" , "Pedro Pettigrew"
          , "O Diadema de Ranveclaw", "Pelo de unicórnio", "Quando a varinha muda de dono", "Tortura"
          , "Tom Gaunt", "Helena Minerva", "Harry Tiago Potter"
          , "Luna Lovegood, Neville Longbottom e Harry Potter", "Aliados de Dumbledore"
          , "O anel", "No quarto andar", "Descurainia", "Fantasma"},
        //D
        {"Corvinal", "Wingardium Leviosa", "Rato", "Nora Weasley"    
          , "Gui Weasley", "Gina Weasley", "Severo Snape"
          , "O medalhão de Slytherin", "Pena de fênix", "Quando duas varinhas vêm da mesma madeira", "Azaração"
          , "Servolo Sonserino", "Helena Ravenclaw", "Harry Dursley Tiago Potter"
          , "Rony Weasley, Harry Potter e Draco Malfoy", "Armada de Draco", "O diadema"
          , "No quinto andar", "Agapanto", "Caixa surpresa"}
    };
    
    HashSet<Integer> con_per = new HashSet<>();

    public int randomic() {
        verifica = false;
        while (!verifica) {
            Ram = Math.random() * perguntas[0].length;
            ram = (int) Ram;
            if (!con_per.contains(ram)) {
                verifica = true;
            }
            if (perguntas[0].length == con_per.size()) {
                // acabou as perguntas retorna 10 para travar o btn
                return 999;
            }
        }
        con_per.add(ram);
        System.out.println(con_per);
        System.out.println("Ram:"+ram);
        return ram;
    }
}
