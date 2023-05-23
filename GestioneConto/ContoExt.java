public class ContoExt extends ContoCC{
	public double scoperto = 50;
	public ContoExt(double saldo){
		super(saldo);
	}
	public void setPrele(double prele){
		this.prele = prele;
	}
	public boolean prelievo(){
		if(prele <= (saldo + scoperto)){
			saldo = saldo - prele;
			return true;
		}
	return false;
	}
}