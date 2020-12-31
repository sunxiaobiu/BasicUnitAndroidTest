import android.content.Context;
import android.provider.Telephony.Threads;
import androidx.test.runner.AndroidJUnit4;
import java.util.Set;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_66B096985FAB3AF9E62C60082B50D2329FF577658FFFCF6486DCB5EE14926CB1_827409565 {
   public static void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Context.class);
      Object var3 = null;
      Threads.getOrCreateThreadId((Context)var2, (Set)var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
