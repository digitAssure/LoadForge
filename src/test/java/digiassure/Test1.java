package digiassure;

import digiassure.loadforge.LoadForge;
import org.junit.jupiter.api.Test;

public class Test1 {

  @Test
  public void testCmd() throws Exception {

      String[] cmd ={"-f","/home/sapan/workspace/work/Load-Forge/build/install/ldf/bin/Task1.java"};
      LoadForge.main(cmd);

    }

}
