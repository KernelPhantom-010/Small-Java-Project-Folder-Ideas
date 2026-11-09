import javax.sound.midi.SysexMessage;

public class Main{
    public static void main(String[] args) {
            System.out.println("=== Password Checker - Tool ===");
            String publisher = "Made by Fabio Baensch for Learning Purposes\n\n";
            for (int x = 0; x < publisher.length(); x++){
            try {
                System.out.print(publisher.charAt(x));
                System.out.flush();
                Thread.sleep(20);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            }
        if (args.length == 0){
            System.out.print("[+] Invalid option! Option-List:\n");
            System.out.println("    -c  PASSWORD : Check a password strength by number, small char, big char etc.");
            System.out.println("    -cp LENGTH PASSWORD : Create a strong password");
            return;
        }
        String[] allowedOptions = {"-c", "-cp"};
        String optionFound;
        if (args[0].equals(allowedOptions[0])){
            optionFound = "-c";
        }else if (args[0].equals(allowedOptions[1])){
            optionFound = "-cp";
        }
        else{
            System.out.print("[+] Invalid option! Option-List:\n");
            System.out.println("    -c  PASSWORD : Check a password strength by number, small char, big char etc.");
            System.out.println("    -cp LENGTH PASSWORD : Create a strong password");
            return;
        }

        if (optionFound.equals("-c")){
            if (args[1].length() <= 1){
                System.out.print("Password-Length is to small!");
                return;
            }
            System.out.println("Checking password-length of " + args[1]);
            String passwordToCheck = args[1];
            boolean hasCapital = false, hasLower = false, hasNum = false, hasSpecial = false;
            
            for (int y = 0; y < passwordToCheck.length(); y++){
                char cCheck = passwordToCheck.charAt(y); 
                if (Character.isLowerCase(cCheck)){
                    hasLower = true;
                }
                else if (Character.isUpperCase(cCheck)){
                    hasCapital = true;
                }
                else if (Character.isDigit(cCheck)){
                    hasNum = true;
                }else{
                    hasSpecial = true;
                }
            }

            System.out.println("Meets Requirements: ");
            int score = 0;
            if (hasCapital){
                System.out.println("[+] has Uppercase Letter ");
                score += 4;
            }else{
                System.out.println("[-] has no Uppercase Letter");
            }
            if (hasLower){
                System.out.println("[+] has Lowercase Letter");
                score += 4;
            }else{
                System.out.println("[-] has no Lowercase Letter");
            }
            if (hasNum){
                System.out.println("[+] has Number/Digit");
                score += 4;
            }else{
                System.out.println("[-] has no Number/Digit");
            }
            if (hasSpecial){
                System.out.println("[+] has Special Character");
                score += 4;
            }else{
                System.out.println("[-] has no Special Character");
            }

            System.out.println("\n[+] Final Score -> " + String.valueOf(score) + "/16 Points");
            return;
        }
        else if (optionFound.equals("-cp")){
            if (Integer.parseInt(args[1]) <= 4){
                System.out.println("[+] Password Length must be greater than 4!");
                return;
            }
            for (int y = 0; y < Integer.parseInt(args[1]); y++){
                
            }
                String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                String lower = "abcdefghijklmnopqrstuvwxyz";
                String numbers = "0123456789";
                String special = "!@#$%&*?";

                String all = upper + lower + numbers + special;

                String password = "";

               
                password += upper.charAt((int)(Math.random() * upper.length()));
                password += lower.charAt((int)(Math.random() * lower.length()));
                password += numbers.charAt((int)(Math.random() * numbers.length()));
                password += special.charAt((int)(Math.random() * special.length()));
                int length = Integer.parseInt(args[1]);

                for (int y = 4; y < length; y++) {
                    password += all.charAt((int)(Math.random() * all.length()));
                }

                
                char[] chars = password.toCharArray();

                for (int y = 0; y < chars.length; y++) {
                    int randomIndex = (int)(Math.random() * chars.length);

                    char temp = chars[y];
                    chars[y] = chars[randomIndex];
                    chars[randomIndex] = temp;
                }

                password = new String(chars);
                System.out.println("[+] Generated Password: " + password);
                return;
        }else{
            return;
        }
    }
}
