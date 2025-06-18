package interfaceExercise2.model.service;

public interface OnlinePaymentService {

    public double paymentFee(double amount);

    public double interest(double amount, int mounts);
}
