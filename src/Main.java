public class Main {
    public Main(){}
    public static void main(String[] args) {
        Product p = new Product();
//            System.out.println(p.product(2,4));
//            System.out.println(p.product(2,4,5));
//            System.out.println(p.product(2.0,4.0));
        p.product(1, 2);
        p.product(2, 3, 4);
        p.product(1.0, 2.0);
    }
        public static class Product{

       public int product(int x,int y){
           return x*y;
       }
        public int product(int x,int y,int z){
            return x*y*z;
        }
   public double product(double x,double y){
           return x*y;
   }

        }
    }


