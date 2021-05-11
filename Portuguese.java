
/**
 * Esta classe é responsável por armazenar os diálogos em português do tipo String usados ​​no jogo.
 * Nele temos todas as frases e comandos necessários para configurar o enredo de World of Investigation.
 *
 * @author Matheus Gouvêa and Daniel Douglas
 * @version 2021.04.05
 */
public class Portuguese implements InterfaceLang {

    // comandos válidos para o jogador, basta concatenar os comandos com as salas/saídas.
    @Override
    public String[] validCommands() {
        String[] commands = {"ir", "olhar", "inspecionar", "pegar", "largar", "mochila",
            "mapa", "sair", "ajuda"};
        return commands;
    }

    // este método cria e armazena as salas principais em um array.
    @Override
    public String[] rooms() {

        String[] createRooms = new String[21];

        createRooms[0] = "no primeiro andar, no início do corredor";
        createRooms[1] = "no primeiro andar, no meio do corredor";
        createRooms[2] = "no primeiro andar, no final do corredor";
        createRooms[3] = "no segundo andar, no início do corredor";
        createRooms[4] = "no segundo andar, no meio do corredor";
        createRooms[5] = "no segundo andar, no final do corredor";

        createRooms[6] = "no Quarto 1";
        createRooms[7] = "no Quarto 2";
        createRooms[8] = "no Quarto 3";
        createRooms[9] = "no Quarto 4";
        createRooms[10] = "no Quarto 5";
        createRooms[11] = "no Quarto 6";
        createRooms[12] = "no Quarto 7";
        createRooms[13] = "no Quarto 8";
        createRooms[14] = "no Quarto 9";
        createRooms[15] = "no Quarto 10";
        createRooms[16] = "no Quarto 11";
        createRooms[17] = "no Quarto 12";
        createRooms[18] = "no Quarto 13";
        createRooms[19] = "no Quarto 14";

        createRooms[20] = "no Carro da Polícia";

        return createRooms;
    }

    // este método cria e armazena as saídas em um array.
    @Override
    public String[] exits() {

        String[] createExits = new String[21];

        createExits[0] = "quarto 1";
        createExits[1] = "quarto 2";
        createExits[2] = "quarto 3";
        createExits[3] = "quarto 4";
        createExits[4] = "quarto 5";
        createExits[5] = "quarto 6";
        createExits[6] = "quarto 7";
        createExits[7] = "quarto 8";
        createExits[8] = "quarto 9";
        createExits[9] = "quarto 10";
        createExits[10] = "quarto 11";
        createExits[11] = "quarto 12";
        createExits[12] = "quarto 13";
        createExits[13] = "quarto 14";
        createExits[14] = "frente";
        createExits[15] = "atras";
        createExits[16] = "andar de cima";
        createExits[17] = "andar de baixo";
        createExits[18] = "corredor";
        createExits[19] = "viatura";
        createExits[20] = "hotel";

        return createExits;
    }

    // estes são os itens que podem ser encontrados aleatoriamente.
    @Override
    public String[][] items() {
        String[][] itens = new String[13][2];

        itens[0][0] = "cama";
        itens[0][1] = "a mais confortável do mundo";

        itens[1][0] = "laptop";
        itens[1][1] = "poderoso, mas limitado";

        itens[2][0] = "celular";
        itens[2][1] = "iphone top de linha";

        itens[3][0] = "tapete";
        itens[3][1] = "muito macio e aconchegante";

        itens[4][0] = "cortina";
        itens[4][1] = "ajuda a esconder a luz do sol";

        itens[5][0] = "mesa";
        itens[5][1] = "com um resto de comida";

        itens[6][0] = "quadro";
        itens[6][1] = "uma pintura de Vincent Van Gogh";

        itens[7][0] = "cadeira";
        itens[7][1] = "muito bom para a coluna e contribui para a postura";

        itens[8][0] = "ar condicionado";
        itens[8][1] = "ninguém pode viver neste calor";

        itens[9][0] = "estante";
        itens[9][1] = "livros lindos estão aqui";

        itens[10][0] = "tv";
        itens[10][1] = "estamos assistindo a copa de 2022 aqui";

        itens[11][0] = "frigobar";
        itens[11][1] = "uma bebida vai bem, mas o preço é absurdo";

        itens[12][0] = "cofre";
        itens[12][1] = "onde guardamos itens preciosos";

        return itens;

    }

    // a partir de agora temos os diálogos usados em WoI.
    @Override
    public void goGame() {
        System.out.println("Vamos para o jogo!");
        System.out.println("Boa sorte jogador...\n");
    }

    @Override
    public void welcome1() {
        System.out.println();
        System.out.println("Bem-vindo ao World of Investigation!");
        System.out.println("Aventure-se como policial e descubra a droga ilegal com seu cachorro.");
        System.out.print("Você começa com ");
    }

    @Override
    public void welcome2() {
        System.out.println(" petiscos e pode encontrar mais nos quartos para o seu cão.");
        System.out.println("Seu cão tem um 'nível de felicidade' que no final do jogo deve ser de pelo menos 10 para você ganhar o jogo.");
        System.out.print("Este nível está atualmente em ");
    }

    @Override
    public void welcome3() {
        System.out.println(" e você pode deixar seu cão mais feliz durante o jogo encontrando petiscos.");
        System.out.println("Cada vez que você se movimenta no jogo, seu cão perde 1 'nível de felicidade'");
        System.out.println("Você pode pegar e largar alguns itens dos quartos!");
        System.out.println("Digite 'ajuda' se precisar de ajuda.");
        System.out.println("Entrando no hotel...");
        System.out.println();
    }

    @Override
    public void invalidCommand() {
        System.out.println("Eu não sei o que você quer dizer...");
    }

    @Override
    public void inspectWhat() {
        System.out.println("Inspecionar o quê??");
    }

    @Override
    public void goWhere() {
        System.out.println("Ir aonde?");
    }

    @Override
    public void noDoor() {
        System.out.println("Não há porta!");
    }

    @Override
    public void yourSnacks() {
        System.out.print("Seus petiscos: ");
    }

    @Override
    public void yourHappinesslvl() {
        System.out.print("Nível de felicidade: ");
    }

    @Override
    public void drugFound1() {
        System.out.print("Droga encontrada em ");
    }

    @Override
    public void drugFound2() {
        System.out.println(". Parabéns!!");
    }

    @Override
    public void snackFound1() {
        System.out.print("Você encontrou ");
    }

    @Override
    public void snackFound2() {
        System.out.println(" petisco(s).");
    }

    @Override
    public void happinessFound1() {
        System.out.print("Seu cão ganhou ");
    }

    @Override
    public void happinessFound2() {
        System.out.println(" nível(es) de felicidade.");
    }

    @Override
    public void gameOver1() {
        System.out.println("Game Over! Seus petiscos acabaram!");
    }

    @Override
    public void gameOver2() {
        System.out.println("Game Over! Infelizmente, a felicidade do seu cão é inferior a 10.");
    }

    @Override
    public void drugNotFound() {
        System.out.println("Droga não encontrada! Continue olhando.");
    }

    @Override
    public void itemNotExist() {
        System.out.println("Este item não existe.");
    }

    @Override
    public void printHelp1() {
        System.out.println("Você é um policial. Você está sozinho com seu cachorro.");
        System.out.println("A viatura é a sua casa, você pode esvaziar sua mochila levando itens dos quartos para o carro.");
        System.out.println("Seu trabalho principal é vasculhar os quartos do hotel com seu cachorro e encontrar a droga ilegal.");
        System.out.println("Só existe uma sala com a droga ilegal.");
        System.out.println();
        System.out.print("Seus petiscos: ");
    }

    @Override
    public void printHelp2() {
        System.out.println("Os comandos são: ");
    }

    @Override
    public void thanksForPlaying() {
        System.out.println("Obrigado por jogar. Até mais.");
    }

    @Override
    public void quit() {
        System.out.println("Deseja sair?");

    }

    // para a classe "room".
    @Override
    public String wordRoomLocation() {
        return "Você está ";
    }

    @Override
    public String wordRoomExit() {
        return "Saídas:";
    }

    // para a classe "item".
    @Override
    public String wordItemSee() {
        return "Você vê um(a) ";
    }

    @Override
    public String wordItemWeight() {
        return "peso: ";
    }

    @Override
    public void takeWhat() {
        System.out.println("Pegar o quê?");
    }

    @Override
    public void takeItem1() {
        System.out.print("Você adicionou o item ");
    }

    @Override
    public void takeItem2() {
        System.out.println(" na sua mochila.");
    }

    @Override
    public void takeBagFull() {
        System.out.println("Sua mochila está cheia!");
    }

    @Override
    public void takeHeavyItem() {
        System.out.println("Este item é muito pesado.");
    }

    @Override
    public void dropWhat() {
        System.out.println("Largar o quê?");
    }

    @Override
    public void dropNotAllowed() {
        System.out.println("Não é permitido largar itens nos corredores.");
    }

    @Override
    public void dropDone() {
        System.out.println(" removido da mochila.");
    }

    @Override
    public void ItemsBackpack() {
        System.out.println("Itens na mochila:");
    }

}
