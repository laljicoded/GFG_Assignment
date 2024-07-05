package simple.intrest_clc;
public abstract class srcImp implements SIC {
    abstract void hello();

    @Override
    public double intrestRate(String bankName) {
        switch (bankName.toUpperCase()) {
            case "SBI":return 5.0;
            case "KOTAK":return 6.0;
            case "ICICI":return 3.0;
            case "PNB":return 2.0;
            case "YES":return 7.0;
                
            default:return 1.0;
                
        }
    }

    @Override
    public double simpleIntrestClc(String bankName, double p, int t) {

        
            double r = intrestRate(bankName);
            double time = t / 12.0;
            return (p * r * time) / 100;
    }

}
