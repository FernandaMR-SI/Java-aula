// Fig. 10.13: Employee.java
// Superclasse abstrata Employee implementa Payable.

public abstract class Employee implements Payable
{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;

   // construtor com tr�s argumentos
   public Employee( String first, String last, String ssn )
   {
      firstName = first;
      lastName = last;
      socialSecurityNumber = ssn;
   } // fim do construtor Employee com tr�s argumentos

   // configura o nome 
   public void setFirstName( String first )
   {
      firstName = first;
   } // fim do m�todo setFirstName 

   // retorna o nome
   public String getFirstName()
   {
      return firstName;
   } // fim do m�todo getFirstName

   // configura o sobrenome 
   public void setLastName( String last )
   {
      lastName = last;
   } // fim do m�todo setLastName 

   // retorna o sobrenome
   public String getLastName()
   {
      return lastName;
   } // fim do m�todo getLastName

   // configura o CIC 
   public void setSocialSecurityNumber( String ssn )
   {
      socialSecurityNumber = ssn; // deve validar
   } // fim do m�todo setSocialSecurityNumber

   // retorna o CIC
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } // fim do m�todo getSocialSecurityNumber 

   // retorna a representa��o de String do objeto Employee
   public String toString()
   {
      return String.format( "%s %s\nsocial security number: %s", 
         getFirstName(), getLastName(), getSocialSecurityNumber() );
   } // fim do m�todo toString

   // Nota: N�o implementamos o m�todo getPaymentAmount de Payable aqui, assim ent�o
   // Essa classe deve ser declarada abstrata para evitar um erro de compila��o.
} // fim da classe abstrata Employee 


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