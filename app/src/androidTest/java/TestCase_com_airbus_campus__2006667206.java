import android.content.Context;
import android.support.v4.content.ContextCompat;
import androidx.test.runner.AndroidJUnit4;
import java.io.File;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airbus_campus__2006667206 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      File var1 = ContextCompat.getDataDir((Context)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
