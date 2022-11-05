
public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        try{
            if(args[0].equals("faktorijel")){
                System.out.println(Matematika.faktorijel(Integer.parseInt(args[1])));
            }
            else{
                System.out.println(Matematika.sinus(Integer.parseInt(args[1])));
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }
}