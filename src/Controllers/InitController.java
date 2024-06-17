package Controllers;

import Services.InitializationService;

public class InitController {
    private InitializationService initializationService;

    public InitController(InitializationService initializationService) {
        this.initializationService = initializationService;
    }
    public void init(){
        initializationService.init();
    }
}
