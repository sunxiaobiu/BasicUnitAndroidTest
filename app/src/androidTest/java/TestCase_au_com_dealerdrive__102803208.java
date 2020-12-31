import android.util.JsonWriter;
import androidx.test.runner.AndroidJUnit4;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_dealerdrive__102803208 {
   @Test
   public void testCase() throws Exception {
      StringWriter var1 = new StringWriter();
      JsonWriter var4 = new JsonWriter(var1);
      HashMap var5 = new HashMap();
      Object var6 = EasyMock.createMock(Map.class);
      var6 = EasyMock.createMock(Map.class);
      Set var7 = ((Map)var6).keySet();
      Iterator var8 = var7.iterator();
      var6 = var8.next();
      String var9 = (String)var6;
      var4 = var4.name(var9);
      double var2 = 1.0D;
      var4.value(var2);
   }
}
