public class Player implements Playable,Recordable{

    @Override
    public void play(){
        System.out.println("Play");
    };
    @Override
    public void pause(){
        System.out.println("Put on pause");
    };
    @Override
    public void stop(){
        System.out.println("Stop");
    };

    @Override
    public void record(){
        System.out.println("Record");
    };

}

