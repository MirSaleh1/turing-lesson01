package Task13;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class StudenApp {
    public static void main(String[] args) {

        Student s1  = new Student("Ali",   1, 3.2);
        Student s2  = new Student("Veli",  2, 2.9);
        Student s3  = new Student("Aysel", 3, 3.8);
        Student s4  = new Student("Leyla", 4, 3.1);
        Student s5  = new Student("Rauf",  5, 2.7);
        Student s6  = new Student("Nigar", 6, 3.5);
        Student s7  = new Student("Murad", 7, 3.0);
        Student s8  = new Student("Elvin", 8, 3.9);
        Student s9  = new Student("Tural", 9, 2.8);
        Student s10 = new Student("Orxan",10, 3.4);

        Student [] students={s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
//------------------------------------------------------------------------------ fileOut ve fileInput

        String name="Saleh"+"\n";
        String path = "C:/Users/USER/IdeaProjects/turing-lesson/Task13";


        File file = new File(path );


        try(FileOutputStream write=new FileOutputStream(file,true);
            FileInputStream read=new FileInputStream(file)){

            byte[] data=name.getBytes();


            write.write(data);
            write.flush();

            int i;

            while((i=read.read())!=-1){
                System.out.print((char)i);
            }


        }catch(Exception e){
            e.printStackTrace();
        }
//---------------------------------------------------------------------------------------------fileWriter ve FileReader

        String name1="Abasov"+"\n";
        String path2= "C:/Users/USER/IdeaProjects/turing-lesson/Task";
        File file2 = new File(path2);

        try(FileWriter writer=new FileWriter(file2);
            FileReader reader=new FileReader(file2)){

            writer.write(name1);

            writer.flush();

            int i;

            while((i=reader.read())!=-1){
                System.out.println((char) i);
            }



        }catch(Exception e){
            e.printStackTrace();
        }
//------------------------------------------------------------------- objectOutputStream ve objectInputStream

        String path3="C:/Users/USER/IdeaProjects/turing-lesson/Salam.txt";
        File file3 = new File(path3);

        try(ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(file3))){

            objectOutputStream.writeObject(s1);
            objectOutputStream.close();

            try(ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(file3))){
                Object obj;
            while(true){
                try {

                    obj=objectInputStream.readObject();
                    Student student = (Student) obj;

                    System.out.println(student.toString());

                }catch(EOFException e){

                    break;
                }
            } }catch(Exception e){
                e.printStackTrace();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    //--------------------------------------------------------------------- customClass ile toplu yazdirma

        String path4="C:/Users/USER/IdeaProjects/turing-lesson/HelloWorld.txt";
        File file4 = new File(path4);

        try {

            FileOutputStream deliver=new FileOutputStream(file4,true);
            ObjectOutputStream transfer;


                if(file4.exists() && file4.length()>0){
                    transfer=new AppendableObjectOutputStream(deliver);
                }
                else {
                    transfer=new ObjectOutputStream(deliver);
                }

                for(Student student : students){
                    transfer.writeObject(student);
                }
                transfer.close();

        }catch(Exception e){
            e.printStackTrace();
        }

        try(ObjectInputStream read=new ObjectInputStream(new FileInputStream(file4))){

            while(true) {

                try {

                    Student student = (Student) read.readObject();
                    System.out.println(student.toString());

                } catch (Exception e) {

                    break;
                }
            }
        }catch(Exception e){

            e.printStackTrace();
        }



    }
}