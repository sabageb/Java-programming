package day24_loops;


public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int second =0;
        //"starting:world
        // video 1:57 second ;print "watching youtube video:1"
        //print "finished watching cat video, lets start another one"
        System.out.println("starting: World`s smallest cat \uD83D\uDC08- BBC");


        int seconds = 0;
        while (seconds<=117){
            System.out.println("Watching \uD83D\uDC08 at seconds: "+seconds);
            seconds++;
            Thread.sleep(1000);
        }
        System.out.println(" Finished watching the cat video \uD83D\uDC08 video");
        System.out.println("lets start another one!");


        }

}
