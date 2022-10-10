
public class Video implements IntVideo{
    private int statusvideo=0;
    
    @Override
    public void putar(){
        if (statusvideo == posisidiam){
            System.out.println("Putar Video! -> Berputar");
        }
        else {
            System.out.println("Pause Video! -> Diam ");
        }
    }

    @Override
    public void pause(){
        if (statusvideo == posisiputar){
            System.out.println("Putar Video! -> Diam");
        }
        else {
            System.out.println("Pause Video! -> Sudah Diam ");
        }
    }
}