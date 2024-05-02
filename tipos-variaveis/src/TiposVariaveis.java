public class TiposVariaveis {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {
        byte idade = 29;
        short ano = 2024;
        int cep = 17600650; //se começar com zero, talvez deva utilizar outro tipo
        long cpf = 12345678900L; //se começar com zero, pode ser que seja necessário outro tipo
        float pi = 3.14F; //tem que colocar F no fim sempre pra evitar erro
        double salarioMinimo = 1345.53; 
        //tipo long deve ser encerrado com L para representar o numero longo
        
        final double VALOR_PI = 3.1418F;
            System.out.println(VALOR_PI);
    }
}
