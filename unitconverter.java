import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Converter {
   BufferedReader br;

   public static void main(String[] args) throws Exception {
      Converter converter = new Converter();
      converter.br = 
       new BufferedReader(new InputStreamReader(System.in));

      int choice;
      boolean done = false;
      while (!done) {
         choice = converter.runMenu();
         switch (choice) {
         case 1:
            System.out.println("Convert Gallons To Liters");
            converter.convertGallonsToLtrs();
            break;
         case 2:
            System.out.println("Convert meters To miles");
            converter.convertMetersToMiles();
            break;
         case 3:
            System.out.println("Convert grams To carats");
            converter.convertGramsToCarats();
            break;
         case 4:
            System.out.println("Convert Inches To meters");
            converter.convertInchesToMtrs();
            break;
         case 5:
            System.out.println("Convert liters To Gallons");
            converter.convertLtrsToGallons();
            break;
         case 6:
            System.out.println("Convert grams To kilograms");
            converter.convertGmsTokgs();
            break;
         case 7:
            System.out.println("Convert Carats To Grams");
            converter.convertCaratsToGrams();
            break;
         default:
            System.out.println("Exited");
            done = true;
            break;
         }
      }
   }

   public int runMenu() throws Exception {
      int tableChoice;
      System.out.println("=========================");
      System.out.println("Conversion Table");

      System.out.println("1. Gallons To Liters");
      System.out.println("2. Meters To Miles");
      System.out.println("3. Grams To Carats");
      System.out.println("4. Inches To Meters");
      System.out.println("5. Liters To Gallons");
      System.out.println("6. Grams To kilograms");
      System.out.println("7. Carats To Grams");
      System.out.println("8. Quit");

      System.out.print("Enter choice: ");
      tableChoice = Integer.parseInt(br.readLine());
      while (tableChoice < 1 || tableChoice > 8) {
         System.out.print("Invalid choice, try again: ");
         tableChoice = Integer.parseInt(br.readLine());
      }
      return tableChoice;
   }

   public void convertGallonsToLtrs() throws Exception {
      System.out.print("Enter the Gallon: ");
      int gallon = Integer.parseInt(br.readLine());
      double liters = gallon * 3.7854118;
      System.out.println("Liters: " + liters);
   }

   public void convertMetersToMiles() throws Exception {
      System.out.print("Enter the Meters: ");
      int meter = Integer.parseInt(br.readLine());
      double miles = meter * 0.00062137119;
      System.out.println("Miles: " + miles);
   }

   public void convertGramsToCarats() throws Exception {
      System.out.print("Enter the Gram: ");
      int gram = Integer.parseInt(br.readLine());
      double carats = gram * 5;
      System.out.println("Carats: " + carats);
   }

   public void convertInchesToMtrs() throws Exception {
      System.out.print("Enter the Inches: ");
      int inches = Integer.parseInt(br.readLine());
      double meters = inches * 0.0254;
      System.out.println("Meters:" + meters);
   }

   public void convertLtrsToGallons() throws Exception {
      System.out.print("Enter the Liters: ");
      int liter = Integer.parseInt(br.readLine());
      double gallon = liter * 0.264172052358148;
      System.out.println("Gallons: " + gallon);
   }

   public void convertGmsTokgs() throws Exception {
      System.out.print("Enter the Grams: ");
      int gram = Integer.parseInt(br.readLine());
      double kilogram = gram * 0.001;
      System.out.println("kilogram: " + kilogram);
   }

   public void convertCaratsToGrams() throws Exception {
      System.out.print("Enter the Carat: ");
      int carat = Integer.parseInt(br.readLine());
      double gram = carat * 0.2;
      System.out.println("Gram:" + gram);
   }
}
