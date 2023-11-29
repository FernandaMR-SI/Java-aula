// Fig. 10.12: Invoice.java
// Classe Invoice que implementa Payable.

public class Invoice implements Payable
{
   private String partNumber; 
   private String partDescription;
   private int quantity;
   private double pricePerItem;

   // construtor com quatro argumentos
   public Invoice( String part, String description, int count, 
      double price )
   {
      partNumber = part;
      partDescription = description;
      setQuantity( count ); // valida e armazena a quantidade
      setPricePerItem( price ); // valida e armazena o pre�o por item
   } // fim do construtor Invoice de quatro argumentos

   // configura n�mero de pe�as
   public void setPartNumber( String part )
   {
      partNumber = part;  
   } // fim do m�todo setPartNumber

   // obt�m o n�mero da pe�a
   public String getPartNumber()
   {
      return partNumber;
   } // fim do m�todo getPartNumber

   // configura a descri��o
   public void setPartDescription( String description )
   {
      partDescription = description;
   } // fim do m�todo setPartDescription

   // obt�m a descri��o
   public String getPartDescription()
   {
      return partDescription;
   } // fim do m�todo getPartDescription

   // configura a quantidade
   public void setQuantity( int count )
   {
      quantity = ( count < 0 ) ? 0 : count; // quantidade n�o pode ser negativa
   } // fim do m�todo setQuantity

   // obt�m quantidade
   public int getQuantity()
   {
      return quantity;
   } // fim do m�todo getQuantity

   // configura pre�o por item
   public void setPricePerItem( double price )
   {
      pricePerItem = ( price < 0.0 ) ? 0.0 : price; // valida pre�o
   } // fim do m�todo setPricePerItem

   // obt�m pre�o por item
   public double getPricePerItem()
   {
      return pricePerItem;
   } // fim do m�todo getPricePerItem

   // retorno da representa��o de String do objeto Invoice
   public String toString()
   {
      return String.format( "%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
         "invoice", "part number", getPartNumber(), getPartDescription(), 
         "quantity", getQuantity(), "price per item", getPricePerItem() );
   } // fim do m�todo toString

   // m�todo requerido para executar o contrato com a interface Payable     
   public double getPaymentAmount()                                    
   {                                                                   
      return getQuantity() * getPricePerItem(); // calcula custo total
   } // fim do m�todo getPaymentAmount                                    
} // fim da classe Invoice


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/