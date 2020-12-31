import android.content.ContentProviderOperation;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import java.util.Iterator;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_blackberry_calendar_829570985 {
   @Test
   public void testCase() throws Exception {
      ArrayList var1 = new ArrayList();
      Object var2 = EasyMock.createMock(ArrayList.class);
      Iterator var3 = ((ArrayList)var2).iterator();
      var2 = var3.next();
      ContentProviderOperation var4 = (ContentProviderOperation)var2;
      String var5 = var4.toString();
   }
}
