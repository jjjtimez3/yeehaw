import java.util.Scanner;

public class Greeting{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        clyde();
        System.out.println("I've never seen yer face in this here saloon before, partner. ( ͡° ͜ʖ ͡°)");
        System.out.println("You must not be from 'round here. ");
        System.out.println("What's yer name?");
        String name = input.nextLine();
        stars();
        int count = 0;
        
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) != ' '){
                count++;
            }
        }
        
        System.out.println("It's a pleasure to meet ya, " + name + "; welcome to the dusty little town of Outlook. You can call me Daddy. (´-ω-`)");
        System.out.println("We ain't got much here 'sides the desert heat, a few tumbleweeds, and the abondoned mine... ");
        
        town();
        
        System.out.println("Wait a minute... " + name + " has " + count + " letters in it, don' it? （・□・；） ");
        System.out.println("...");
        
        System.out.println("There's this ol' superstition that folk who enter Outlook with " + count + " letters in their name ");
        System.out.println("are doomed to be dragged into the mine in the middle of the night by flying spirits. ");
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
