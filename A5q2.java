// All the banks operating in India are controlled by RBI. RBI has set a well
// defined guideline (e.g. minimum interest rate, minimum balance allowed, maximum
// withdrawal limit etc) which all banks must follow. For example, suppose RBI has set
// minimum interest rate applicable to a saving bank account to be 4% annually; however,
// banks are free to use 4% interest rate or to set any rates above it.

// Write a program to implement bank functionality in the above scenario. Note: Create few
// classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI,
// PNB etc). Assume and implement required member variables and functions in each class.

//ishita mittal
//19105121

import java.util.Scanner;

class A5q2 { //Tester code

    public static void main(String args[]) {

    SBI sbi = new SBI();
    ICICI icici = new ICICI();
    sbi.P=10.433;
    sbi.r=7.42;
    sbi.n=5;
    sbi.t=7;
    Double sbiInt=sbi.setInterestRate();
    System.out.println("SBI interest rate: "+sbiInt);
    int iciciWL= icici.setWithdrawalLimit();
    System.out.println("ICICI withdraw limit: "+iciciWL);

}

}

 class Customer{

      String name, address;
      int age;

  }

  class Account{

      String accType, branchType;

  }

 
  class RBI{ 

      int withLimit,n;
      double A,P,r;
      float t;
      long avg,tot,mb;

      int setWithdrawalLimit() {

          Scanner inp = new Scanner(System.in);
          String actype=inp.nextLine();
          String brtype=inp.nextLine();
          if(actype=="SAVINGS" && brtype=="METRO") {
              withLimit = 5000;
          }
          else {
              withLimit = 4000;
          }

      return withLimit;
      }

      double setInterestRate() {
          A=(P+r)/n*t;
          return A;

      }

      long setMAB() {
          mb=(avg*tot)/31;
          return mb;
      }

  }

  class SBI extends RBI{ //class SBI which is inheriting from RBI

      double setInterestRate() {

          A=P*(1+r/n)+n*t;
          return A;

      }

      long setMAB() {

          mb=(avg+tot)/30;
          return mb;

      }
    }

  class ICICI extends RBI{  //class icici which is inheriting from RBI

      double setInterestRate() {
          A=(P*r)/n+t;
          return A;
      }

    
      int setWithdrawalLimit() {

          withLimit=7000;
          return withLimit;
      }
  }

public class A5q2 { //class A5q2 which has main method

public static void main(String args[]) {

    SBI sbiObject = new SBI();
    ICICI icici = new ICICI();
    sbiObject.P=10.433;
    sbiObject.r=7.42;
    sbiObject.n=5;
    sbiObject.t=7;
    Double sbiInt=sbi.setInterestRate();
    System.out.println("SBI interest rate is:"+sbiInt);
    int iciciWL= icici.setWithdrawalLimit();
    System.out.println("ICICI withdraw limit is:"+iciciWL);

}
}

  class Customer{
      String name,address;
      int age;
  }

  class Account{
      String accType,branchType;
  }

  class RBI{ // Base class

      int withLimit,n;
      double A,P,r;
      float t;
      long avg,tot,mb;

      int setWithdrawalLimit() {

          Scanner inp = new Scanner(System.in);
          String actype=inp.nextLine();
          String brtype=inp.nextLine();
          if(actype=="SAVINGS" && brtype=="METRO") {
              withLimit = 5000;

          }else {
              withLimit = 4000;
          }
      return withLimit;
      }

      double setInterestRate() {
          A=(P+r)/n*t;
          return A;
      }

      long setMAB() {

          mb=(avg*tot)/31;
          return mb;
      }
  }

  class SBI extends RBI{ // Child class1

      double setInterestRate() {
          A=P*(1+r/n)+n*t;
          return A;
      }

      long setMAB() {
          mb=(avg+tot)/30;
          return mb;

      }
  }

  class ICICI extends RBI{ // Child class2

      double setInterestRate() {
          A=(P*r)/n+t;
          return A;

      }

      int setWithdrawalLimit() {
          withLimit=7000;
          return withLimit;
      }

  }


