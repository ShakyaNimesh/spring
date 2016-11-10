

package springframework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component("Config")
@ComponentScan(basePackageClasses=Bin1.class)
public class config {
    private Bin3 bin3;
    
    @Autowired
    private Bin1 bin1;
    private Bin2 bin2;
    
    @Autowired
    public config(Bin3 bin3){
        System.out.println("This is configuration of Bin3");
        this.bin3=bin3;
    }
    @Autowired
    public void setBin2(Bin2 bin2){
        this.bin2=bin2;
    }
    public String toString(){
        return "bins: " + bin1 + bin2 + bin3;
    }
}
