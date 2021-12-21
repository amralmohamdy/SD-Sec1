package adapter;

import java.math.BigDecimal;

    public class Adapter {    
        public static void main(String[] args) {
            Divider div = new Divider();
            div.divide(BigDecimal.ONE, BigDecimal.ONE);
            //AudioPlayer audioPlayer = new AudioPlayer();
            //audioPlayer.play("mp3", "beyond the horizon.mp3");
            //audioPlayer.play("mp4", "alone.mp4");
            //audioPlayer.play("vlc","far far away.vlc");
            //audioPlayer.play("avi","mind me.avi");
            
        }    
    }
