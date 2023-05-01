public class Fabrika {
    public static void main(String[] args){
        Employee fabrika=new Employee("Mehmet Kaya",9800,42,2000);
        fabrika.tax();
        fabrika.bonus();
        fabrika.raiseSalary();

        System.out.println(fabrika.toString());
    }
}
