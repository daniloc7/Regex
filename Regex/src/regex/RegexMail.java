import java.util.regex.*;
import java.util.Scanner;
import java.io.File;

public class RegexMail {
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    
    String fnameEmail = "C:/Users/danil/Documents/InteligenciaComput/2bimestre/_sent_mail/1";
    String fnamePD = "C:/Users/danil/Documents/InteligenciaComput/2bimestre/pontoDecimal.txt";
    String fnameIp = "C:/Users/danil/Documents/InteligenciaComput/2bimestre/ip.txt";
    String fnameUrl = "C:/Users/danil/Documents/InteligenciaComput/2bimestre/url.txt";
    
    String email = "^(.+)@(.+)$";
    String pontoDecimal = "^[0-9]+.[0-9]+$";
    String ip = "^[0-9]{2,3}.[0-9]{2,3}.[0-9]{2,3}.[0-9]{2,3}$";
    String url = "^(http://|https://|www).([a-zA-Z]+).(com|tv|.com.br)";
//    String url = "^(http://|https://|www).([a-zA-Z])+.(com|tv|.com.br)$";
    
    public static void main(String[] args) {
        RegexMail obj = new RegexMail();
//        obj.hasMail();
        obj.checkUrl();
//        obj.checkIp();
//        obj.checkPDecimal();
    }
    
    
    public void hasMail() {
        Pattern pattern = Pattern.compile(email);
        try {
            File myFile = new File(fnameEmail);
            Scanner scan = new Scanner(myFile);
            String txt = "";
            while (scan.hasNextLine()) {
                txt = scan.nextLine();  // le a proxima linha
                System.out.print("Linha: " + txt  );
                Matcher matcher = pattern.matcher(txt);
                if (matcher.find()) {
                   System.out.print(ANSI_YELLOW + " *********** OK" + ANSI_RESET);
                }
                System.out.println();
            }
        } catch (Exception e) 
          {System.exit(0);}       
    }
    
    public void checkUrl() {
        Pattern pattern = Pattern.compile(url);
        try {
            File myFile = new File(fnameUrl);
            Scanner scan = new Scanner(myFile);
            String txt = "";
            while (scan.hasNextLine()) {
                txt = scan.nextLine();  // le a proxima linha
                System.out.print("Linha: " + txt  );
                Matcher matcher = pattern.matcher(txt);
                if (matcher.find()) {
                   System.out.print(ANSI_YELLOW + " *********** OK" + ANSI_RESET);
                }
                System.out.println();
            }
        } catch (Exception e) 
          {System.exit(0);}       
    }
    
    public void checkIp() {
        Pattern pattern = Pattern.compile(ip);
        try {
            File myFile = new File(fnameIp);
            Scanner scan = new Scanner(myFile);
            String txt = "";
            while (scan.hasNextLine()) {
                txt = scan.nextLine();  // le a proxima linha
                System.out.print("Linha: " + txt  );
                Matcher matcher = pattern.matcher(txt);
                if (matcher.find()) {
                   System.out.print(ANSI_YELLOW + " *********** OK" + ANSI_RESET);
                }
                System.out.println();
            }
        } catch (Exception e) 
          {System.exit(0);}       
    }
    
    public void checkPDecimal() {
        Pattern pattern = Pattern.compile(pontoDecimal);
        try {
            File myFile = new File(fnamePD);
            Scanner scan = new Scanner(myFile);
            String txt = "";
            while (scan.hasNextLine()) {
                txt = scan.nextLine();  // le a proxima linha
                System.out.print("Linha: " + txt  );
                Matcher matcher = pattern.matcher(txt);
                if (matcher.find()) {
                   System.out.print(ANSI_YELLOW + " *********** OK" + ANSI_RESET);
                }
                System.out.println();
            }
        } catch (Exception e) 
          {System.exit(0);}       
    }
}