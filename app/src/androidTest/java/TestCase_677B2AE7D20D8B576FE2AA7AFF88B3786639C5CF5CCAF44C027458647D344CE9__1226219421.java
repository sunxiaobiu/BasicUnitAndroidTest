import android.os.IBinder.DeathRecipient;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_677B2AE7D20D8B576FE2AA7AFF88B3786639C5CF5CCAF44C027458647D344CE9__1226219421 {
   @Test
   public void testCase() throws Exception {
      ArrayList var1 = new ArrayList();
      Iterator var2 = var1.iterator();
      Object var3 = var2.next();
      DeathRecipient var4 = (DeathRecipient)var3;
      var4.binderDied();
   }
}
