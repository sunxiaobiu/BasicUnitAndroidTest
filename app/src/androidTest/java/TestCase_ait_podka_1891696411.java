import android.content.Context;
import android.text.format.Formatter;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ait_podka_1891696411 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      long var1 = 1L;
      Formatter.formatShortFileSize((Context)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
