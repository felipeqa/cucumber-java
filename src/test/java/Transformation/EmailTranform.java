package Transformation;

import cucumber.api.Transformer;

public class EmailTranform extends Transformer<String> {

    @Override
    public String transform(String userName) {
        return userName.concat("@teste.com");
    }
}
