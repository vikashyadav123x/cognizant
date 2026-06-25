package DependencyInjectionExample;

public class DependencyInjectionDemo {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        System.out.println(service.getCustomer(1));
        System.out.println(service.getCustomer(99));
    }
}
