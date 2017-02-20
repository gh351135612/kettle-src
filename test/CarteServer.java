import org.pentaho.di.www.Carte;
import org.pentaho.di.www.SlaveServerConfig;

/**
 * @Author chenxl
 * @Date 2017/2/13 18:06
 * @Describle
 */
public class CarteServer {

    public static void main(String[] args) throws Exception {

        SlaveServerConfig config = new SlaveServerConfig("localhost",8080,true);
        Carte.runCarte(config);


    }

}
