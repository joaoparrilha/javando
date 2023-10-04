package arquivos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioArquivos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Product> prods = new ArrayList<>();

        System.out.println("Enter file path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);

        String sourceFoldedrStr = path.getParent();

        boolean success = new File(sourceFoldedrStr + "\\out").mkdir();
        System.out.println("Folder created: " + success);

        String targetFileStr = sourceFoldedrStr + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){

                String [] fields = line.split(",");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2]);

                Product prod = new Product(name, price, quantity);
                prods.add(prod);

                line = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){

                for(Product p: prods){
                    bw.write(p.getName() + ", " + String.format("%.2f",p.totalPrice()));
                    bw.newLine();
                }
                System.out.println(targetFileStr + "created!");

            } catch(IOException e){
                System.out.println("Error: writing file: " + e.getMessage());
            }

        }catch (IOException e){
            System.out.println("Error writing file " + e.getMessage());
        }


        sc.close();
    }
}
