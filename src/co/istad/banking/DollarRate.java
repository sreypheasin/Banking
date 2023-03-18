package co.istad.banking;

import co.istad.util.Interest;

public class DollarRate implements Interest {

    @Override
    public Double calculate(Double amount) {
        return amount*0.06;
    }
}
