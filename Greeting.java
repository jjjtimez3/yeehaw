import java.util.Scanner;

public class Greeting{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        clyde();
        System.out.println("I've never seen yer face in this here saloon before, pawtner.O_o");
        System.out.println("You must not be from 'wound here.");
        System.out.println("What's yer name?X-X");
        String name = input.nextLine();
        stars();
        int count = 0;
        
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) != ' '){
                count++;
            }
        }
        
        System.out.println("It's a pleasure to meet ya,^.^ " + name + "; welcome to the dusty little town of Outlook. You can call me Cwyde.Xoxo");
        System.out.println("We ain't got muwch here 'sides the desert heat, a few tumbleweeds, and the abondoned miwne... ");
        
        town();
        
        System.out.println("Wait a miwnute O.O... " + name + " has " + count + " lewters in it, don' it?");
        System.out.println("...");
        
        System.out.println("There's this ol' superstition that folk who enter Owutlook with " + count + " letters in their name >.< ");
        System.out.println("are doomed to be dragged into the miwne in the miwddle of the night by flying spirits. >o< ");
        System.out.println("It's just an ol' wives tale, but you'd do well to avoid that cursed location. ");
        
        
    }
    
    public static void stars(){
        for(int i = 0; i < 29; i++){
            System.out.print("*");
        }
        System.out.println("*");
    }
    
    public static void clyde(){
    System.out.println("         ,'-',");
    System.out.println("        :-----:");
    System.out.println("    (''' , - , ''')");
    System.out.println("    \\   ' .  . `  /");
    System.out.println("     \\  '   ^  ? /");
    System.out.println("      \\ `   -  ,'");
    System.out.println("       `j_ _,'f");
    System.out.println("    ,- -`\\ \\  /..");
    System.out.println("   ,-      \\_\\/_/'-");
    System.out.println("  ,                 `,");
    System.out.println(" ,                     ,");     
    System.out.println("      /\\          \\");
    System.out.println("|    /             \\   ',");
    System.out.println(",   f  :           :`,  ,");
    System.out.println("<...\\  ,           : ,- '");
    System.out.println(" \\,,,,\\ ;           : j  '");
    System.out.println(" \\    \\            :/^^^^'");
    System.out.println("  \\    \\            ; ''':");
    System.out.println("    \\   -,         -`.../");
    System.out.println("    '    -   -,`,--`");
    System.out.println("    \\_._'  -- '---:");
    }
    
    public static void town(){
    System.out.println("    ~         ~~          __");
    System.out.println("       _T      .,,.    ~--~ ^^");
    System.out.println(" ^^   // \\                    ~");
    System.out.println("      ][O]    ^^      ,-~ ~");
    System.out.println("   /''-I_I         _II____");
    System.out.println("__/_  /   \\ ______/ ''   /'\\_,__");
    System.out.println("  | II--'''' \\,--:--..,_/,.-{ },");
    System.out.println("; '/__\\,.--';|   |[] .-.| O{ _ }");
    System.out.println(":' |  | []  -|   ''--:.;[,.'\\,/");
    System.out.println("'  |[]|,.--'' '',   ''-,.    |");
    System.out.println("  ..    ..-''    ;       ''. '");
    System.out.println("yeehaw");
}
}
