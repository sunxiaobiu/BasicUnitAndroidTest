import android.content.Context;
import androidx.core.content.ContextCompat;
import androidx.test.runner.AndroidJUnit4;
import java.io.File;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5D58FD5D28956E451954D6B429A1A6D4A89D382C74E07941DCA0B32CF2256976__1666496438 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      File[] var1 = ContextCompat.getExternalFilesDirs((Context)var0, (String)"android");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
