import android.telecom.Call;
import android.telecom.Call.Details;
import androidx.test.runner.AndroidJUnit4;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_callapp_contacts__1178622788 {
   @Test
   public void testCase() throws Exception {
      HashMap var1 = new HashMap();
      Collection var2 = var1.values();
      Iterator var3 = var2.iterator();
      Object var4 = var3.next();
      Call var5 = (Call)var4;
      Details var6 = var5.getDetails();
   }
}
