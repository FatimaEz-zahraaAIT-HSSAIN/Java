import java.util.LinkedHashSet;

public class removeduplicates{
/**
 * @param args
 */
public static void main(String[] args){
if(args.length < 1){
System.out.println("veuillez fournir une chaine de caracteres");
return;
}
String input = args[0];
LinkedHashSet <Character> uniqueChars =new LinkedHashSet<>();
StringBuilder output = new StringBuilder();

for(char c :input.toCharArray()){
    if(uniqueChars.add(c)){
    output.append(c);
    }
}
System.out.println("Chaine sans doublons: "+output.toString());
}

}