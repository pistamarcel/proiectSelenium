import java.io.*;

public class JavaErrors {


    public static void main(String[] args) throws IOException {

//        int i = 1;
//        metodaRecursiva(5, i);
//        System.out.println("Sa terminat metoda main");


        try {
            throw new IOException("Am trimis mesajul custom");
        } catch (MyCustomException e) {

            System.out.println("Am intrat in ramura catch");
        }
        System.out.println("S-a terminat metoda main");
    }


    public static void throwsException() {

        throw new ArithmeticException();
    }

    //checked exceptions
    public static void checkedExceptions() throws IOException {




        FileReader file = new FileReader("C:\\Users\\marce\\IdeaProjects\\text.txt");
        BufferedReader fileInput = new BufferedReader(file);

        System.out.println(fileInput.readLine());
        fileInput.close();

    }

    //unchecked exceptions


    //unchecked exceptions
    public static void uncheckedExceptions() {

        //NULLPointerException
//      String cuvant=null;
//      cuvant.length();

        //ArithmeticException

      int a = 10;
      int b = 0;
      int result = a / b;
        System.out.println("Rezultatul este: " + result);}

    public static void metodaRecursiva(int numar, int i){
           if(numar == 0){
               return;
           }else{

               System.out.println("Numarul este " + i);
               i++;
               metodaRecursiva(numar, i);
           }

        int a = 10;
        int b = 0;
        int result = a / b;
        System.out.println("Rezultatul este: " + result);
    }



public static void exmplifyTryCatch (){
        try {
    String cuvant="cuvant random";
    String rezultat= cuvant.toUpperCase();
    System.out.println("Rezultatul este: " + rezultat);

    int a = 10;
    int b = 2;
    int result = a / b;
    System.out.println("Dupa ArithmeticException");

        }catch (NullPointerException | ArithmeticException e)  {
            System.out.println("Am intrat in blocul de catch");

        } finally {
            System.out.println("Am intrat in blocul de finally");
        }
    System.out.println("Sa terminat metoda exmplifyTryCatch");
    }



}
