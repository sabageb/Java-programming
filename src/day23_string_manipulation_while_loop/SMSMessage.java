package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message ="sender: [Saba] From Number<(310) 344-9004> Message:{Hello, lets code some java}";

        int start = message.indexOf("[");
        int end =message.indexOf("]");
        System.out.println(message.substring(start+1, end));
        String sender = message.substring(start+1,end);
        System.out.println("sender = " + sender);
       
        String mobile = message.substring( message.indexOf("<")+1, message.indexOf(">") );
        System.out.println("mobile = " + mobile);
//String text="Hello, lets code some java ";

String text=message.substring( message.indexOf("{")+1,message.indexOf("}"));
        System.out.println("text = " + text);


        // this will cut the empity space after fikret or before fikret
        System.out.println(" Fikret    ".trim());

        sender=sender.trim();

        if(sender.equals("Saim")) {
    System.out.println("message from saim about homework");
}else {
    System.out.println("someone else message");
}




    }
}
