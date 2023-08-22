public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.avancarCanal();
        smartTv.avancarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.retornarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(30);
        System.out.println("Canal Atual: " + smartTv.canal);
    }
}
