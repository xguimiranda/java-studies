package interfaceExercise2.model.service;

public class PaypalService implements OnlinePaymentService{


    @Override
    public double interest(double amount, int mounts) {
        return amount * 0.01 * mounts;
    }

    @Override
    public double paymentFee(double amount) {
        return amount * 0.02;
    }
}
