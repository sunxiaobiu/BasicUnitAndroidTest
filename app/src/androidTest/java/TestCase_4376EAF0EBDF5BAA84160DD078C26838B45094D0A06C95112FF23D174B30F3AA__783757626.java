import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_4376EAF0EBDF5BAA84160DD078C26838B45094D0A06C95112FF23D174B30F3AA__783757626 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("connectivity");
      ConnectivityManager var4 = (ConnectivityManager)var3;
      ArrayList var1 = new ArrayList();
      Iterator var5 = var1.iterator();
      Object var7 = var5.next();
      Network var8 = (Network)var7;
      LinkProperties var6 = var4.getLinkProperties(var8);
      List var9 = var6.getLinkAddresses();
   }
}
