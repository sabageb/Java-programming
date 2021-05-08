package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        //++forward  --backward

        int count = 5;
        while (count >= 0) {
            // System.out.println("--count = " + --count);
            System.out.println("counter = " + count);
            count--;
        }

        System.out.println("Finished the count");
    }
}
/**
    int UnReadSMS =10;
    System.out.println("I have total" +unreadSMS + "\uD83D\uDC8C unread sms");

while (unreadSMS > 0){

        System.out.println("Reading SMS : " + unreadSMS);
        --unreadSMS;
    }
System.out.println("No More unread SMS messeges");

}
}
*/