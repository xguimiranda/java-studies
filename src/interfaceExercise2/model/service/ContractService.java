package interfaceExercise2.model.service;

import interfaceExercise2.model.entities.Contract;
import interfaceExercise2.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int mounts){

        double basicQuota = contract.getTotalValue() / mounts;

        for (int i = 1; i <= mounts; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + fee + interest;

            contract.getList().add(new Installment(dueDate, quota));
        }
    }
}
