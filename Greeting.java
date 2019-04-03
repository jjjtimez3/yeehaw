import java.util.Scanner;

public class Greeting{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        clyde();
        System.out.println("Yeah, I'm gonna take my horse to the old town road");
        System.out.println("I'm gonna ride 'til I can't no more");
        System.out.println("I'm gonna take my horse to the old town road");
        String name = input.nextLine();
        stars();
        int count = 0;
        
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) != ' '){
                count++;
            }
        }
        
        System.out.println("I'm gonna ride 'til I can't no more " + name + "; I got the horses in the back");
        System.out.println("Horse tack is attached");
        
        town();
        
        System.out.println("Hat is matte black, " + name + "  Got the boots that's black to match");
        System.out.println("...");
        
        System.out.println("Ridin' on a horse, ha");
        System.out.println("You can whip your Porsche");
        System.out.println("I been in the valley. You ain't been up off the porch, now ");
        
        
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
