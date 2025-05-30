package inheritance2.program;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Tax payer #"+ i +" data:");
            System.out.print("Individual or company (i/c)? ");
            char question = sc.next().toLowerCase().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (question == 'i'){
                System.out.print("Health expenditures: ");
                double healthcareCosts = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthcareCosts));
            }else {
                System.out.print("Number of employees: ");
                int employeesNumber = sc.nextInt();
                list.add(new Company(name, anualIncome, employeesNumber));
            }
        }

        sc.close();
    }
}
