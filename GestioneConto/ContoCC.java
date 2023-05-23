public class ContoCC{
	public double saldo;
	public double versa;
	public double prele;
	public ContoCC(double saldo){
		this.saldo = saldo;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	public double getSaldo(){
		return saldo;
	}
	public void setVersa(double versa){
		this.versa = versa;
	}
	public void setPrele(double prele){
		this.prele = prele;
	}
	public double versamento(){
		saldo = saldo + versa;
		return saldo;
	}
	public boolean prelievo(){
		if(prele <= saldo){
			saldo = saldo - prele;
			return true;
		}
	return false;
	}
}