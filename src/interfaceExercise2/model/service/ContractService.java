package interfaceExercise2.model.service;

import interfaceExercise2.model.entities.Contract;

public class ContractService {

    OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int mounts){

    }
}
