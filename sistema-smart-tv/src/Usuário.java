public class Usuário {
    public static void main(String[] args) throws Exception {
      
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);


    System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Tv LIGADA? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
            System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);
    
            smartTv.desligar();
            System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

    
    }
}
