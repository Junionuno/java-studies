package Exercícios.chatGPT.test;

import java.io.*;

public class exercicio44 {
    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("formulario.txt")){
            int c = 0;
            while ((c = fr.read()) != -1){
                System.out.println((char) c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        File file = new File("pets.txt");
        try (FileWriter fw = new FileWriter(file)){
            fw.write("Nome: " + "Rex\n");
            fw.write("Raça: " + "Bulldog\n");
        }catch (IOException e){
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("formulario.txt"))){
            String line;
            while ((line = br.readLine())!= null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("pets.txt", true))){
            bw.write("Nome: Rex");
            bw.newLine();
            bw.write("Raça: Bulldog");
            bw.newLine();
            bw.write("Idade: 5");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("pets.txt"))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
