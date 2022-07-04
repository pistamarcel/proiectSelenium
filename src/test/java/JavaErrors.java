import java.io.*;

public class JavaErrors {
<<<<<<< HEAD
//        throw-ne folosim de el ca sa aruncam explicit o eroare
=======
    //        throw-ne folosim de el ca sa aruncam explicit o eroare
>>>>>>> d03044b (primul commit)
//        trows - atentionare ca o metoda sau constructor arunca eroare/exceptie
//        try -catch -finally -> Handler
    public static void main(String[] args) throws IOException {

//        int i = 1;
//        metodaRecursiva(5, i);
//        System.out.println("Sa terminat metoda main");
<<<<<<< HEAD
        try{
            throw new IOException("Am trimis mesajul custom");
        } catch (MyCustomException e){
=======
        try {
            throw new IOException("Am trimis mesajul custom");
        } catch (MyCustomException e) {
>>>>>>> d03044b (primul commit)
            System.out.println("Am intrat in ramura catch");
        }
        System.out.println("S-a terminat metoda main");
    }
<<<<<<< HEAD
    public static void throwsException(){
=======

    public static void throwsException() {
>>>>>>> d03044b (primul commit)
        throw new ArithmeticException();
    }

    //checked exceptions
    public static void checkedExceptions() throws IOException {

<<<<<<< HEAD
         FileReader file= new FileReader("C:\\Users\\marce\\IdeaProjects\\text.txt");
        BufferedReader fileInput= new BufferedReader(file);
=======
        FileReader file = new FileReader("C:\\Users\\marce\\IdeaProjects\\text.txt");
        BufferedReader fileInput = new BufferedReader(file);
>>>>>>> d03044b (primul commit)
        System.out.println(fileInput.readLine());
        fileInput.close();

    }
<<<<<<< HEAD
    //unchecked exceptions
    public static void uncheckedExceptions(){
=======

    //unchecked exceptions
    public static void uncheckedExceptions() {
>>>>>>> d03044b (primul commit)
        //NULLPointerException
//      String cuvant=null;
//      cuvant.length();

        //ArithmeticException
<<<<<<< HEAD
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
=======
        int a = 10;
        int b = 0;
        int result = a / b;
        System.out.println("Rezultatul este: " + result);
    }

    public static void metodaRecursiva(int numar, int i) {
        if (numar == 0) {
            return;
        } else {

            System.out.println("Numarul este " + i);
            i++;
            metodaRecursiva(numar, i);
        }
>>>>>>> d03044b (primul commit)
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
